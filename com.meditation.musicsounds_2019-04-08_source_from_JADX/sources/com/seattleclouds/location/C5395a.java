package com.seattleclouds.location;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.seattleclouds.location.C5415d.C5416a;
import com.seattleclouds.util.C6608d;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: com.seattleclouds.location.a */
public class C5395a {

    /* renamed from: a */
    public static final Location f19287a = new Location("Code");

    /* renamed from: b */
    private final boolean f19288b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f19289c;

    /* renamed from: d */
    private Activity f19290d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6608d f19291e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Geocoder f19292f;

    static {
        f19287a.setLatitude(1000.0d);
        f19287a.setLongitude(1000.0d);
    }

    public C5395a(Activity activity, C6608d dVar) {
        this(activity, Locale.getDefault(), dVar);
    }

    public C5395a(Activity activity, Locale locale, C6608d dVar) {
        this.f19288b = false;
        this.f19289c = false;
        this.f19290d = activity;
        this.f19291e = dVar;
        this.f19292f = new Geocoder(activity, locale);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Location m27025a(Address address) {
        Location location = new Location("Code");
        location.setLatitude(address.getLatitude());
        location.setLongitude(address.getLongitude());
        return location;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27028a(final Object obj) {
        if (this.f19290d != null) {
            this.f19290d.runOnUiThread(new Runnable() {
                public void run() {
                    C5395a.this.f19291e.mo16855a(obj);
                }
            });
        } else {
            this.f19291e.mo16855a(obj);
        }
    }

    /* renamed from: a */
    public void mo17702a(double d, double d2, boolean z) {
        if (this.f19291e != null) {
            if (!this.f19289c) {
                m27028a((Object) null);
            }
            final double d3 = d;
            final double d4 = d2;
            final boolean z2 = z;
            C53961 r1 = new Runnable(null) {

                /* renamed from: f */
                private String f19298f = null;

                public void run() {
                    try {
                        List fromLocation = C5395a.this.f19292f.getFromLocation(d3, d4, 1);
                        C5395a.this.f19289c = true;
                        if (fromLocation.size() > 0) {
                            String addressLine = ((Address) fromLocation.get(0)).getAddressLine(0);
                            int maxAddressLineIndex = ((Address) fromLocation.get(0)).getMaxAddressLineIndex();
                            for (int i = 1; i <= maxAddressLineIndex; i++) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(addressLine);
                                sb.append(", ");
                                sb.append(((Address) fromLocation.get(0)).getAddressLine(i));
                                addressLine = sb.toString();
                            }
                            this.f19298f = addressLine;
                        }
                        if (fromLocation == null || fromLocation.size() <= 0 || !z2) {
                            C5395a.this.m27028a((Object) this.f19298f);
                            return;
                        }
                        String str = "";
                        if (((Address) fromLocation.get(0)).getLocality() != null) {
                            str = ((Address) fromLocation.get(0)).getLocality();
                        }
                        C5395a.this.m27028a((Object) new C5416a(this.f19298f, str));
                    } catch (IOException unused) {
                        C5395a.this.f19289c = false;
                        C5395a.this.m27028a((Object) null);
                    }
                }
            };
            new Thread(r1).start();
        }
    }

    /* renamed from: a */
    public void mo17703a(Location location) {
        mo17702a(location.getLatitude(), location.getLongitude(), false);
    }

    /* renamed from: a */
    public void mo17704a(Location location, boolean z) {
        mo17702a(location.getLatitude(), location.getLongitude(), z);
    }

    /* renamed from: a */
    public void mo17705a(final String str) {
        if (this.f19291e != null) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        List fromLocationName = C5395a.this.f19292f.getFromLocationName(str, 1);
                        C5395a.this.f19289c = true;
                        if (fromLocationName.size() > 0) {
                            C5395a.this.m27028a((Object) C5395a.this.m27025a((Address) fromLocationName.get(0)));
                        } else {
                            C5395a.this.m27028a((Object) C5395a.f19287a);
                        }
                    } catch (IOException unused) {
                        C5395a.this.f19289c = false;
                        C5395a.this.m27028a((Object) null);
                    }
                }
            }).start();
        }
    }
}

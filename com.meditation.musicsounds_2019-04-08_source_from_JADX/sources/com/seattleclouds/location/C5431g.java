package com.seattleclouds.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.seattleclouds.location.g */
public class C5431g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19381a = "g";

    /* renamed from: i */
    private static int f19382i = 120000;

    /* renamed from: b */
    private LocationManager f19383b;

    /* renamed from: c */
    private Context f19384c;

    /* renamed from: d */
    private C5435d f19385d;

    /* renamed from: e */
    private LocationListener f19386e;

    /* renamed from: f */
    private String f19387f;

    /* renamed from: g */
    private long f19388g = 0;

    /* renamed from: h */
    private float f19389h = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Location f19390j = null;

    /* renamed from: k */
    private boolean f19391k = false;

    /* renamed from: l */
    private boolean f19392l = false;

    /* renamed from: m */
    private boolean f19393m = true;

    /* renamed from: com.seattleclouds.location.g$a */
    public interface C5432a extends LocationListener {
        /* renamed from: a */
        void mo17721a(Location location);
    }

    /* renamed from: com.seattleclouds.location.g$b */
    public static class C5433b extends C5434c implements C5432a {
        public C5433b() {
            super(false);
        }

        public C5433b(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo17721a(Location location) {
            if (this.f19394b) {
                String d = C5431g.f19381a;
                StringBuilder sb = new StringBuilder();
                sb.append("onBestLocationEstimateChanged: ");
                sb.append(location);
                Log.d(d, sb.toString());
            }
        }
    }

    /* renamed from: com.seattleclouds.location.g$c */
    public static class C5434c implements LocationListener {

        /* renamed from: b */
        protected boolean f19394b = false;

        public C5434c(boolean z) {
            this.f19394b = z;
        }

        public void onLocationChanged(Location location) {
            if (this.f19394b) {
                String d = C5431g.f19381a;
                StringBuilder sb = new StringBuilder();
                sb.append("onLocationChanged: ");
                sb.append(location);
                Log.d(d, sb.toString());
            }
        }

        public void onProviderDisabled(String str) {
            if (this.f19394b) {
                String d = C5431g.f19381a;
                StringBuilder sb = new StringBuilder();
                sb.append("onProviderDisabled: provider = ");
                sb.append(str);
                Log.d(d, sb.toString());
            }
        }

        public void onProviderEnabled(String str) {
            if (this.f19394b) {
                String d = C5431g.f19381a;
                StringBuilder sb = new StringBuilder();
                sb.append("onProviderEnabled: provider = ");
                sb.append(str);
                Log.d(d, sb.toString());
            }
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (this.f19394b) {
                String d = C5431g.f19381a;
                StringBuilder sb = new StringBuilder();
                sb.append("onStatusChanged: status = ");
                sb.append(i);
                sb.append(", provider = ");
                sb.append(str);
                Log.d(d, sb.toString());
            }
        }
    }

    /* renamed from: com.seattleclouds.location.g$d */
    private class C5435d implements LocationListener {

        /* renamed from: b */
        private LocationListener f19396b;

        /* renamed from: c */
        private C5432a f19397c;

        public C5435d(LocationListener locationListener) {
            if (locationListener instanceof C5432a) {
                this.f19397c = (C5432a) locationListener;
            }
            this.f19396b = locationListener;
        }

        public void onLocationChanged(Location location) {
            if (this.f19396b != null) {
                this.f19396b.onLocationChanged(location);
                if (this.f19397c != null && C5431g.m27161a(location, C5431g.this.f19390j)) {
                    C5431g.this.f19390j = location;
                    this.f19397c.mo17721a(location);
                }
            }
        }

        public void onProviderDisabled(String str) {
            if (this.f19396b != null) {
                this.f19396b.onProviderDisabled(str);
            }
        }

        public void onProviderEnabled(String str) {
            if (this.f19396b != null) {
                this.f19396b.onProviderEnabled(str);
            }
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (this.f19396b != null) {
                this.f19396b.onStatusChanged(str, i, bundle);
            }
        }
    }

    public C5431g(Context context, LocationListener locationListener) {
        this.f19384c = context;
        this.f19383b = (LocationManager) this.f19384c.getSystemService("location");
        this.f19386e = locationListener;
    }

    /* renamed from: a */
    private void m27159a(Location location) {
        if (location == null) {
            location = new Location(this.f19387f);
        }
        this.f19386e.onLocationChanged(location);
        if (this.f19386e instanceof C5432a) {
            ((C5432a) this.f19386e).mo17721a(location);
        }
    }

    /* renamed from: a */
    private void m27160a(String str) {
    }

    /* renamed from: a */
    public static boolean m27161a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > ((long) m27163c());
        boolean z2 = time < ((long) (-m27163c()));
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean a = m27162a(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && a;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m27162a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    /* renamed from: c */
    public static int m27163c() {
        return f19382i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27165e() {
        /*
            r2 = this;
            r0 = 0
            r2.f19391k = r0
            r2.f19392l = r0
            android.location.LocationManager r0 = r2.f19383b     // Catch:{ Exception -> 0x000f }
            java.lang.String r1 = "gps"
            boolean r0 = r0.isProviderEnabled(r1)     // Catch:{ Exception -> 0x000f }
            r2.f19391k = r0     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            android.location.LocationManager r0 = r2.f19383b     // Catch:{ Exception -> 0x0019 }
            java.lang.String r1 = "network"
            boolean r0 = r0.isProviderEnabled(r1)     // Catch:{ Exception -> 0x0019 }
            r2.f19392l = r0     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.location.C5431g.m27165e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (m27161a(r0, r2.f19390j) != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27166f() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f19387f
            if (r0 == 0) goto L_0x000f
            android.location.LocationManager r0 = r2.f19383b
            java.lang.String r1 = r2.f19387f
            android.location.Location r0 = r0.getLastKnownLocation(r1)
        L_0x000c:
            r2.f19390j = r0
            goto L_0x0032
        L_0x000f:
            boolean r0 = r2.f19392l
            if (r0 == 0) goto L_0x001d
            android.location.LocationManager r0 = r2.f19383b
            java.lang.String r1 = "network"
            android.location.Location r0 = r0.getLastKnownLocation(r1)
            r2.f19390j = r0
        L_0x001d:
            boolean r0 = r2.f19391k
            if (r0 == 0) goto L_0x0032
            android.location.LocationManager r0 = r2.f19383b
            java.lang.String r1 = "gps"
            android.location.Location r0 = r0.getLastKnownLocation(r1)
            android.location.Location r1 = r2.f19390j
            boolean r1 = m27161a(r0, r1)
            if (r1 == 0) goto L_0x0032
            goto L_0x000c
        L_0x0032:
            boolean r0 = r2.f19393m
            if (r0 == 0) goto L_0x003b
            android.location.Location r0 = r2.f19390j
            r2.m27159a(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.location.C5431g.m27166f():void");
    }

    /* renamed from: a */
    public C5431g mo17728a(long j) {
        this.f19388g = j;
        return this;
    }

    /* renamed from: a */
    public C5431g mo17729a(boolean z) {
        this.f19393m = z;
        return this;
    }

    /* renamed from: a */
    public void mo17730a() {
        LocationManager locationManager;
        String str;
        if (this.f19386e != null && this.f19385d == null) {
            this.f19385d = new C5435d(this.f19386e);
            m27165e();
            m27166f();
            if (this.f19385d != null) {
                if (this.f19387f != null) {
                    m27160a("gps");
                    locationManager = this.f19383b;
                    str = this.f19387f;
                } else {
                    if (this.f19392l) {
                        m27160a("network");
                        this.f19383b.requestLocationUpdates("network", this.f19388g, this.f19389h, this.f19385d);
                    }
                    if (this.f19391k) {
                        m27160a("gps");
                        locationManager = this.f19383b;
                        str = "gps";
                    }
                }
                locationManager.requestLocationUpdates(str, this.f19388g, this.f19389h, this.f19385d);
            }
        }
    }

    /* renamed from: b */
    public void mo17731b() {
        if (this.f19383b != null && this.f19385d != null) {
            this.f19383b.removeUpdates(this.f19385d);
            this.f19385d = null;
        }
    }
}

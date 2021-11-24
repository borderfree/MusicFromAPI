package com.seattleclouds.location;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.maps.C4544a;
import com.google.android.gms.maps.C4579b;
import com.google.android.gms.maps.C4580c;
import com.google.android.gms.maps.C4580c.C4581a;
import com.google.android.gms.maps.C4580c.C4582b;
import com.google.android.gms.maps.C4580c.C4583c;
import com.google.android.gms.maps.C4580c.C4584d;
import com.google.android.gms.maps.C4580c.C4585e;
import com.google.android.gms.maps.C4590e;
import com.google.android.gms.maps.C4591f;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.C4602a;
import com.google.android.gms.maps.model.C4603b;
import com.google.android.gms.maps.model.C4604c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.C4600a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBounds.C4601a;
import com.google.android.gms.maps.model.MarkerOptions;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n.C6349a;
import com.seattleclouds.C6352p;
import com.seattleclouds.C6561t;
import com.seattleclouds.C6672y;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.feedback.LocationModel;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6607c;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.location.f */
public class C5420f extends C6672y implements C6349a {

    /* renamed from: a */
    protected C4580c f19353a;

    /* renamed from: ae */
    private double f19354ae;

    /* renamed from: af */
    private double f19355af;

    /* renamed from: ag */
    private float f19356ag;

    /* renamed from: ah */
    private boolean f19357ah;

    /* renamed from: ai */
    private boolean f19358ai = false;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public boolean f19359aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public ArrayList<LocationModel> f19360ak;

    /* renamed from: b */
    protected HashMap<C4604c, LocationModel> f19361b;

    /* renamed from: c */
    private MapView f19362c;

    /* renamed from: d */
    private ImageButton f19363d;

    /* renamed from: e */
    private int f19364e;

    /* renamed from: f */
    private float f19365f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f19366g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public LatLng f19367h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f19368i;

    /* renamed from: a */
    private float m27108a(float f) {
        if (this.f19353a == null) {
            return 14.0f;
        }
        float c = this.f19353a.mo15110c();
        float b = this.f19353a.mo15108b();
        float f2 = ((f / 100.0f) * (b - c)) + c;
        if (f2 < c) {
            f2 = c;
        } else if (f2 > b) {
            f2 = b;
        }
        return f2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LatLngBounds m27111a(List<LocationModel> list) {
        C4601a a = LatLngBounds.m22839a();
        for (LocationModel locationModel : list) {
            a.mo15153a(new LatLng(locationModel.f19981b, locationModel.f19982c));
        }
        return a.mo15154a();
    }

    /* renamed from: a */
    public static FragmentInfo m27112a(ArrayList<LocationModel> arrayList) {
        return m27113a(arrayList, null);
    }

    /* renamed from: a */
    public static FragmentInfo m27113a(ArrayList<LocationModel> arrayList, Map<String, String> map) {
        Bundle bundle = new Bundle();
        C6607c.m31962a(bundle, arrayList);
        if (map == null) {
            C5230aa f = App.f18501c.mo16950f("map");
            if (f != null) {
                map = f.mo17199x();
            }
        }
        if (map != null) {
            bundle.putString("mapType", (String) map.get("mapType"));
            bundle.putString("zoomPercentage", (String) map.get("gmapzoom"));
            bundle.putString("argMapOrientation", (String) map.get("mapOrientation"));
        }
        return new FragmentInfo(C5420f.class.getName(), bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27114a(C4544a aVar) {
        if (this.f19353a != null) {
            this.f19353a.mo15099a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27115a(C4544a aVar, final float f) {
        if (this.f19353a != null) {
            this.f19353a.mo15100a(aVar, new C4581a() {
                /* renamed from: a */
                public void mo15117a() {
                    if (C5420f.this.f19353a != null) {
                        CameraPosition a = C5420f.this.f19353a.mo15096a();
                        if (f != -1.0f && a.f16583b > f) {
                            C5420f.this.m27114a(C4579b.m22784a(f));
                            a = C5420f.this.f19353a.mo15096a();
                        }
                        if (C5420f.this.f19368i == -1.0f) {
                            C5420f.this.f19368i = a.f16583b;
                            C5420f.this.f19367h = a.f16582a;
                        }
                        if (C5420f.this.f19366g > 0) {
                            C5420f.this.f19353a.mo15109b(C4579b.m22785a(new C4600a().mo15139a(C5420f.this.f19353a.mo15096a().f16582a).mo15138a(C5420f.this.f19353a.mo15096a().f16583b).mo15142c((float) C5420f.this.f19366g).mo15140a()));
                        }
                    }
                }

                /* renamed from: b */
                public void mo15118b() {
                    C5420f.this.f19368i = 0.0f;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27116a(C4604c cVar) {
        if (this.f19361b != null) {
            LocationModel locationModel = (LocationModel) this.f19361b.get(cVar);
            if (locationModel != null) {
                String str = locationModel.f19988i;
                if (!C6592al.m31910c(str)) {
                    if (!str.contains(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                        str = App.m25655h(str);
                    }
                    App.m25638b(str, (Fragment) this);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m27122a(LatLng latLng, LatLng latLng2) {
        if (latLng == null || latLng2 == null) {
            return false;
        }
        return Math.abs(latLng.f16590a - latLng2.f16590a) < 1.0E-6d && Math.abs(latLng.f16591b - latLng2.f16591b) < 1.0E-6d;
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m27124as() {
        int i = 2;
        if (this.f19364e == 2) {
            i = 1;
        }
        m27138e(i);
    }

    /* renamed from: at */
    private void m27125at() {
        if (this.f19353a == null && this.f19362c != null) {
            this.f19362c.mo15035a((C4591f) new C4591f() {
                /* renamed from: a */
                public void mo15128a(C4580c cVar) {
                    C5420f.this.f19353a = cVar;
                    if (C5420f.this.mo1318s() != null) {
                        C4590e.m22824a(C5420f.this.mo1318s());
                        C5420f.this.mo1453c();
                    }
                }
            });
        }
    }

    /* renamed from: az */
    private boolean m27126az() {
        if (C0452b.m2065b((Context) mo1318s(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return false;
        }
        this.f19359aj = true;
        C6569aa.m31791a((Fragment) this, 104, "android.permission.ACCESS_FINE_LOCATION", new int[]{C5462k.map_permission_rationale_location, C5462k.map_location_permission_required_toast});
        return true;
    }

    /* renamed from: b */
    private void m27129b(final float f) {
        new Timer().schedule(new TimerTask() {
            public void run() {
                C0367h s = C5420f.this.mo1318s();
                if (s != null) {
                    s.runOnUiThread(new Runnable() {
                        public void run() {
                            C5420f.this.m27132c(f);
                        }
                    });
                }
            }
        }, 1000);
    }

    /* renamed from: c */
    private int m27131c(String str) {
        return (!"normal".equalsIgnoreCase(str) && "satellite".equalsIgnoreCase(str)) ? 2 : 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27132c(float f) {
        try {
            if (this.f19360ak.size() == 1) {
                m27115a(C4579b.m22787a(new LatLng(((LocationModel) this.f19360ak.get(0)).f19981b, ((LocationModel) this.f19360ak.get(0)).f19982c), f), f);
            } else if (this.f19360ak.size() > 0) {
                LatLngBounds a = m27111a((List<LocationModel>) this.f19360ak);
                if (Math.abs(a.f16593b.f16590a - a.f16592a.f16590a) >= 7.0E-4d || Math.abs(a.f16593b.f16591b - a.f16592a.f16591b) >= 7.0E-4d) {
                    m27115a(C4579b.m22788a(a, C6619m.m32014a(mo1318s(), 70.0f)), -1.0f);
                } else {
                    m27115a(C4579b.m22787a(a.mo15148b(), f), f);
                }
                this.f19368i = -1.0f;
            }
        } catch (NullPointerException e) {
            Log.e("MarkerMapFragment", "Could not animate camera", e);
        }
    }

    /* renamed from: d */
    private float m27133d(String str) {
        float f = 75.0f;
        if (TextUtils.isEmpty(str)) {
            return 75.0f;
        }
        try {
            float parseFloat = Float.parseFloat(str);
            f = 0.0f;
            if (parseFloat >= 0.0f) {
                f = parseFloat > 100.0f ? 100.0f : parseFloat;
            }
        } catch (NumberFormatException unused) {
        }
        return f;
    }

    /* renamed from: d */
    private void m27135d() {
        if (!(this.f19353a == null || this.f19364e == this.f19353a.mo15112e())) {
            this.f19353a.mo15098a(this.f19364e);
        }
    }

    /* renamed from: e */
    private int m27136e(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                i = parseInt > 360 ? 360 : parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* renamed from: e */
    private void m27137e() {
        if (this.f19363d != null) {
            this.f19363d.setImageResource(this.f19364e == 2 ? C5457f.ic_map_24dp : C5457f.ic_satellite_24dp);
        }
    }

    /* renamed from: e */
    private void m27138e(int i) {
        this.f19364e = i;
        m27135d();
        m27137e();
    }

    /* renamed from: f */
    private C4602a m27139f(String str) {
        if (C6592al.m31909b(str)) {
            return null;
        }
        Drawable a = C6352p.m30857a().mo19790a(str);
        if (a == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(75, 75, Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        a.setBounds(0, 0, 75, 75);
        a.draw(canvas);
        return C4603b.m22866a(createBitmap);
    }

    /* renamed from: L */
    public void mo1202L() {
        C6561t.m31739b((Fragment) this, (C6349a) this);
        super.mo1202L();
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i == 104) {
            if (!C6569aa.m31801a(strArr, iArr, "android.permission.ACCESS_FINE_LOCATION")) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.map_location_permission_denied).mo1448a(C5420f.this.mo1318s().mo1469g(), "permissionDialog");
                        C5420f.this.f19359aj = false;
                    }
                }, 400);
            } else {
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                this.f19359aj = false;
                m27125at();
            }
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            m27138e(m27131c(m.getString("mapType")));
            this.f19365f = m27133d(m.getString("zoomPercentage"));
            this.f19360ak = C6607c.m31961a(m);
            this.f19366g = m27136e(m.getString("argMapOrientation"));
        }
        if (this.f19360ak == null) {
            this.f19360ak = new ArrayList<>();
        }
        C6561t.m31733a((Fragment) this, (C6349a) this);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f19362c = (MapView) view.findViewById(C5458g.map);
        this.f19363d = (ImageButton) view.findViewById(C5458g.buttonGoogleMapType);
        this.f19363d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5420f.this.m27124as();
            }
        });
        m27137e();
        if (bundle != null) {
            m27138e(bundle.getInt("saveMapType"));
            if (bundle.containsKey("saveLatitude")) {
                this.f19354ae = bundle.getDouble("saveLatitude");
                this.f19355af = bundle.getDouble("saveLongitude");
                this.f19356ag = bundle.getFloat("saveZoomLevel");
                this.f19367h = (LatLng) bundle.getParcelable("saveDefaultPosition");
                this.f19368i = bundle.getFloat("saveDefaultZoomLevel");
                this.f19357ah = bundle.getBoolean("savePosAndZoomAreDefault");
                this.f19358ai = true;
            }
            this.f19359aj = bundle.getBoolean("savePermissionRequested");
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z) {
            return;
        }
        if (!C6569aa.m31796a() || (mo1318s().mo1469g().mo1535a("permissionDialog") == null && !this.f19359aj && !m27126az())) {
            m27125at();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1453c() {
        m27135d();
        this.f19353a.mo15101a((C4582b) new C4582b() {
            /* renamed from: a */
            public View mo15119a(C4604c cVar) {
                return null;
            }

            /* renamed from: b */
            public View mo15120b(C4604c cVar) {
                C0367h s = C5420f.this.mo1318s();
                LinearLayout linearLayout = new LinearLayout(s);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(s);
                textView.setTextColor(-16777216);
                textView.setGravity(17);
                textView.setTypeface(null, 1);
                textView.setText(cVar.mo15177a());
                TextView textView2 = new TextView(s);
                textView2.setTextColor(-7829368);
                textView2.setText(cVar.mo15180b());
                linearLayout.addView(textView);
                linearLayout.addView(textView2);
                return linearLayout;
            }
        });
        this.f19361b = new HashMap<>(this.f19360ak.size());
        Iterator it = this.f19360ak.iterator();
        while (it.hasNext()) {
            LocationModel locationModel = (LocationModel) it.next();
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.mo15156a(new LatLng(locationModel.f19981b, locationModel.f19982c));
            if (!C6592al.m31910c(locationModel.f19980a)) {
                markerOptions.mo15157a(locationModel.f19980a);
            }
            if (!C6592al.m31910c(locationModel.f19991l)) {
                markerOptions.mo15158b(locationModel.f19991l);
            }
            C4604c a = this.f19353a.mo15097a(markerOptions);
            C4602a f = m27139f(locationModel.f19993n);
            if (f != null) {
                a.mo15178a(f);
            }
            this.f19361b.put(a, locationModel);
        }
        try {
            this.f19353a.mo15107a(true);
        } catch (SecurityException e) {
            Log.e("MarkerMapFragment", "Could not enable user location", e);
        }
        this.f19353a.mo15104a((C4585e) new C4585e() {
            /* renamed from: a */
            public boolean mo15123a(C4604c cVar) {
                StringBuilder sb;
                String str;
                Location g = C5420f.this.f19353a.mo15114g();
                if (g == null) {
                    return false;
                }
                LocationModel locationModel = (LocationModel) C5420f.this.f19361b.get(cVar);
                float[] fArr = new float[1];
                Location.distanceBetween(g.getLatitude(), g.getLongitude(), locationModel.f19981b, locationModel.f19982c, fArr);
                if (locationModel.f19992m.equals("meters") || locationModel.f19992m.equals("yards")) {
                    if (locationModel.f19992m.equals("meters")) {
                        sb = new StringBuilder();
                        sb.append(locationModel.f19991l);
                        sb.append("\n");
                        sb.append(C5420f.this.mo1219a(C5462k.map_distance_to_location));
                        sb.append(" ");
                        sb.append(String.format("%.1f", new Object[]{Float.valueOf(fArr[0])}));
                        str = " m";
                    } else {
                        sb = new StringBuilder();
                        sb.append(locationModel.f19991l);
                        sb.append("\n ");
                        sb.append(C5420f.this.mo1219a(C5462k.map_distance_to_location));
                        sb.append(" ");
                        sb.append(String.format("%.1f", new Object[]{Float.valueOf(C5415d.m27091a(fArr[0]))}));
                        str = " yd";
                    }
                    sb.append(str);
                    cVar.mo15179a(sb.toString());
                }
                return false;
            }
        });
        this.f19353a.mo15103a((C4584d) new C4584d() {
            /* renamed from: a */
            public void mo15122a(C4604c cVar) {
                C5420f.this.m27116a(cVar);
            }
        });
        if (this.f19358ai) {
            this.f19358ai = false;
            m27114a(C4579b.m22787a(new LatLng(this.f19354ae, this.f19355af), this.f19356ag));
            if (this.f19357ah) {
                this.f19353a.mo15102a((C4583c) new C4583c() {
                    /* renamed from: a */
                    public void mo15121a(CameraPosition cameraPosition) {
                        if (C5420f.this.f19353a != null) {
                            LatLngBounds latLngBounds = C5420f.this.f19353a.mo15116i().mo15129a().f16616e;
                            if (!latLngBounds.f16593b.equals(latLngBounds.f16592a)) {
                                C5420f.this.f19353a.mo15102a((C4583c) null);
                                LatLngBounds a = C5420f.this.m27111a((List<LocationModel>) C5420f.this.f19360ak);
                                if (!(latLngBounds.mo15147a(a.f16593b) && latLngBounds.mo15147a(a.f16592a))) {
                                    C5420f.this.m27115a(C4579b.m22788a(a, C6619m.m32014a(C5420f.this.mo1318s(), 70.0f)), -1.0f);
                                }
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        m27129b(m27108a(this.f19365f));
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putInt("saveMapType", this.f19364e);
        if (this.f19353a != null) {
            CameraPosition a = this.f19353a.mo15096a();
            bundle.putDouble("saveLatitude", a.f16582a.f16590a);
            bundle.putDouble("saveLongitude", a.f16582a.f16591b);
            bundle.putFloat("saveZoomLevel", a.f16583b);
            bundle.putParcelable("saveDefaultPosition", this.f19367h);
            bundle.putFloat("saveDefaultZoomLevel", this.f19368i);
            bundle.putBoolean("savePosAndZoomAreDefault", m27122a(a.f16582a, this.f19367h) && a.f16583b == this.f19368i);
        }
        bundle.putBoolean("savePermissionRequested", this.f19359aj);
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f19362c = null;
        this.f19353a = null;
        this.f19363d = null;
        super.mo1296i();
    }

    /* renamed from: w_ */
    public boolean mo17583w_() {
        C6607c.m31963b(mo1307m());
        return false;
    }
}

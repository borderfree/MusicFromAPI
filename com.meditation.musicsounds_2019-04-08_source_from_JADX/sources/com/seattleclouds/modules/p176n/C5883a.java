package com.seattleclouds.modules.p176n;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.C4579b;
import com.google.android.gms.maps.C4580c;
import com.google.android.gms.maps.C4580c.C4583c;
import com.google.android.gms.maps.C4580c.C4586f;
import com.google.android.gms.maps.C4590e;
import com.google.android.gms.maps.C4591f;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6672y;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6612h;
import com.seattleclouds.util.HTTPUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.n.a */
public class C5883a extends C6672y {

    /* renamed from: a */
    public static final String f20825a = "a";

    /* renamed from: ae */
    private MenuItem f20826ae;

    /* renamed from: af */
    private LocationManager f20827af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public Location f20828ag = null;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public LatLng f20829ah = null;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public float f20830ai = 15.0f;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public boolean f20831aj;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<HashMap<String, String>> f20832b;

    /* renamed from: c */
    private MapView f20833c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4580c f20834d;

    /* renamed from: e */
    private String f20835e;

    /* renamed from: f */
    private String f20836f;

    /* renamed from: g */
    private String f20837g;

    /* renamed from: h */
    private String f20838h;

    /* renamed from: i */
    private boolean f20839i = false;

    /* renamed from: com.seattleclouds.modules.n.a$a */
    public class C5891a extends AsyncTask<Object, Void, List<HashMap<String, String>>> {

        /* renamed from: a */
        public final String f20848a = C5891a.class.getSimpleName();

        /* renamed from: b */
        InputStream f20849b = null;

        /* renamed from: d */
        private String f20851d = null;

        /* renamed from: e */
        private C6608d f20852e = null;

        /* renamed from: f */
        private HashMap<String, String> f20853f = null;

        public C5891a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<HashMap<String, String>> doInBackground(Object... objArr) {
            this.f20853f = objArr[0];
            this.f20852e = objArr[1];
            if (this.f20853f != null) {
                String str = "";
                String str2 = "";
                String str3 = "";
                try {
                    if (!C6592al.m31909b((String) this.f20853f.get("radius"))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("&radius=");
                        sb.append((String) this.f20853f.get("radius"));
                        str = sb.toString();
                    }
                    if (!C6592al.m31909b((String) this.f20853f.get("keyword"))) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("&keyword=");
                        sb2.append((String) this.f20853f.get("keyword"));
                        sb2.append("&name=");
                        sb2.append((String) this.f20853f.get("keyword"));
                        str2 = sb2.toString();
                    }
                    if (!C6592al.m31909b((String) this.f20853f.get("type"))) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("&types=");
                        sb3.append((String) this.f20853f.get("type"));
                        str3 = sb3.toString();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("https://maps.googleapis.com/maps/api/place/search/json?location=");
                    sb4.append((String) this.f20853f.get("location"));
                    sb4.append("&sensor=");
                    sb4.append((String) this.f20853f.get("sensor"));
                    sb4.append(str);
                    sb4.append(str2);
                    sb4.append(str3);
                    sb4.append("&key=");
                    sb4.append((String) this.f20853f.get("apikey"));
                    String b = HTTPUtil.m31767b(sb4.toString().replace(" ", "%20"));
                    C5894b bVar = new C5894b();
                    JSONObject jSONObject = new JSONObject(b);
                    this.f20851d = jSONObject.getString("status");
                    return bVar.mo18657a(jSONObject);
                } catch (Exception e) {
                    String str4 = this.f20848a;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(e.getMessage());
                    sb5.append("IOException on http request");
                    Log.e(str4, sb5.toString(), e);
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(List<HashMap<String, String>> list) {
            C0367h s;
            Runnable r0;
            if (this.f20851d != null) {
                if (!this.f20851d.equals("OK")) {
                    if (this.f20851d.equals("OVER_QUERY_LIMIT") && C5883a.this.mo1318s() != null) {
                        s = C5883a.this.mo1318s();
                        r0 = new Runnable() {
                            public void run() {
                                Toast.makeText(C5883a.this.mo1318s(), C5883a.this.mo1219a(C5462k.nearbylocations_overquery_limit_error), 1).show();
                            }
                        };
                    } else if (this.f20851d.equals("ZERO_RESULTS") && C5883a.this.mo1318s() != null) {
                        s = C5883a.this.mo1318s();
                        r0 = new Runnable() {
                            public void run() {
                                Toast.makeText(C5883a.this.mo1318s(), C5883a.this.mo1219a(C5462k.nearbylocations_zero_results), 1).show();
                            }
                        };
                    }
                    s.runOnUiThread(r0);
                } else if (!(list == null || this.f20852e == null)) {
                    this.f20852e.mo16855a(list);
                }
                C5883a.this.m28883m(false);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5883a.this.m28883m(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28869a(ArrayList<HashMap<String, String>> arrayList) {
        if (arrayList != null) {
            this.f20834d.mo15111d();
            for (int i = 0; i < this.f20832b.size(); i++) {
                MarkerOptions markerOptions = new MarkerOptions();
                HashMap hashMap = (HashMap) this.f20832b.get(i);
                double parseDouble = Double.parseDouble((String) hashMap.get("lat"));
                double parseDouble2 = Double.parseDouble((String) hashMap.get("lng"));
                String str = (String) hashMap.get("place_name");
                String str2 = (String) hashMap.get("vicinity");
                markerOptions.mo15156a(new LatLng(parseDouble, parseDouble2));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                sb.append(str2);
                markerOptions.mo15157a(sb.toString());
                this.f20834d.mo15097a(markerOptions);
            }
        }
    }

    /* renamed from: a */
    private boolean m28870a(double d, double d2) {
        return m28871a(d, d2, 9.999999747378752E-5d);
    }

    /* renamed from: a */
    private boolean m28871a(double d, double d2, double d3) {
        double abs = Math.abs(d);
        double abs2 = Math.abs(d2);
        double abs3 = Math.abs(d - d2);
        boolean z = true;
        if (d == d2) {
            return true;
        }
        if (d == 0.0d || d2 == 0.0d || abs3 < 1.1754943508222875E-38d) {
            if (abs3 >= d3 * 1.1754943508222875E-38d) {
                z = false;
            }
            return z;
        }
        if (abs3 / Math.min(abs + abs2, 3.4028234663852886E38d) >= d3) {
            z = false;
        }
        return z;
    }

    /* renamed from: aA */
    private boolean m28872aA() {
        if (C0452b.m2065b((Context) mo1318s(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return false;
        }
        this.f20831aj = true;
        C6569aa.m31791a((Fragment) this, 100, "android.permission.ACCESS_FINE_LOCATION", new int[]{C5462k.nearbylocations_permission_rationale_location, C5462k.nearbylocations_location_permission_required_toast});
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m28873as() {
        if (!C6569aa.m31796a() || (mo1318s() != null && mo1318s().mo1469g().mo1535a("permissionDialog") == null && !this.f20831aj && !m28872aA())) {
            m28874at();
        }
    }

    /* renamed from: at */
    private void m28874at() {
        mo1453c();
        m28875az();
        m28869a(this.f20832b);
    }

    /* renamed from: az */
    private void m28875az() {
        Criteria criteria = new Criteria();
        criteria.setPowerRequirement(1);
        this.f20828ag = this.f20827af.getLastKnownLocation(this.f20827af.getBestProvider(criteria, true));
        if (this.f20828ag != null) {
            LatLng latLng = new LatLng(this.f20828ag.getLatitude(), this.f20828ag.getLongitude());
            if (this.f20829ah == null) {
                this.f20829ah = latLng;
            }
        }
        if (this.f20829ah != null) {
            this.f20834d.mo15099a(C4579b.m22787a(this.f20829ah, this.f20830ai));
        }
    }

    /* renamed from: e */
    private int m28881e(int i) {
        if (i > 40000) {
            return 8;
        }
        if (i > 20000) {
            return 9;
        }
        if (i > 9800) {
            return 10;
        }
        if (i > 5000) {
            return 11;
        }
        if (i > 2400) {
            return 12;
        }
        if (i > 1200) {
            return 13;
        }
        if (i > 600) {
            return 14;
        }
        if (i > 300) {
            return 15;
        }
        return (i <= 140 && i > 100) ? 17 : 16;
    }

    /* renamed from: f */
    private void m28882f(final int i) {
        mo1318s().runOnUiThread(new Runnable() {
            public void run() {
                GooglePlayServicesUtil.getErrorDialog(i, C5883a.this.mo1318s(), 0).show();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m28883m(boolean z) {
        if (this.f20839i != z) {
            this.f20839i = z;
            mo20292ay();
        }
    }

    /* renamed from: n */
    private boolean m28884n(boolean z) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mo1318s());
        if (!GooglePlayServicesUtil.isUserRecoverableError(isGooglePlayServicesAvailable)) {
            return true;
        }
        if (z) {
            m28882f(isGooglePlayServicesAvailable);
        }
        return false;
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i == 100) {
            if (!C6569aa.m31801a(strArr, iArr, "android.permission.ACCESS_FINE_LOCATION")) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.nearbylocations_location_permission_denied).mo1448a(C5883a.this.mo1318s().mo1469g(), "permissionDialog");
                        C5883a.this.f20831aj = false;
                    }
                }, 400);
            } else {
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                this.f20831aj = false;
                m28874at();
            }
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20835e = m.getString("PLACES_API_KEY");
            this.f20836f = m.getString("PLACES_RADIUS");
            this.f20837g = m.getString("PLACES_KEYWORDS");
            this.f20838h = m.getString("PLACES_CATEGORIES");
            if (!C6592al.m31909b(this.f20836f)) {
                try {
                    this.f20830ai = (float) m28881e(Integer.parseInt(this.f20836f));
                } catch (Exception e) {
                    Log.e(f20825a, e.getMessage());
                    String str = f20825a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid Radius: ");
                    sb.append(this.f20836f);
                    sb.append(". Default value (500m) will be used!");
                    Log.e(str, sb.toString());
                }
            } else {
                this.f20836f = "500";
            }
        }
        this.f20832b = new ArrayList<>();
        if (bundle != null) {
            this.f20830ai = bundle.getFloat("zoomLevel");
            double d = bundle.getDouble("cameraLat");
            double d2 = bundle.getDouble("cameraLng");
            if (d == -1.0d) {
                this.f20829ah = null;
            } else {
                this.f20829ah = new LatLng(d, d2);
            }
            this.f20832b = (ArrayList) bundle.getSerializable("locations");
        }
        C4590e.m22824a(mo1318s());
        this.f20827af = (LocationManager) mo1318s().getSystemService("location");
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        this.f20826ae.setEnabled(this.f20839i);
        this.f20826ae.setVisible(this.f20839i);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.nearby_locations_menu, menu);
        this.f20826ae = menu.findItem(C5458g.progress);
        this.f20826ae.setActionView(new ProgressBar(mo1318s(), null, 16842871));
        this.f20826ae.expandActionView();
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f20833c = (MapView) view.findViewById(C5458g.map);
        mo20292ay();
        this.f20831aj = false;
        if (bundle != null) {
            this.f20831aj = bundle.getBoolean("keyRotation");
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z) {
            return;
        }
        if (this.f20834d != null) {
            m28873as();
        } else if (m28884n(true)) {
            this.f20833c.mo15035a((C4591f) new C4591f() {
                /* renamed from: a */
                public void mo15128a(C4580c cVar) {
                    C5883a.this.f20834d = cVar;
                    C5883a.this.f20834d.mo15098a(1);
                    C5883a.this.m28873as();
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo18644a(LatLng latLng, LatLng latLng2) {
        return m28870a(latLng.f16590a, latLng2.f16590a) && m28870a(latLng.f16591b, latLng2.f16591b);
    }

    /* renamed from: c */
    public void mo1453c() {
        this.f20834d.mo15102a((C4583c) new C4583c() {
            /* renamed from: a */
            public void mo15121a(CameraPosition cameraPosition) {
                if (!C6612h.m31984a(C5883a.this.mo1318s())) {
                    C5883a.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(C5883a.this.mo1318s(), C5883a.this.mo1219a(C5462k.nearbylocations_connection_error), 1).show();
                        }
                    });
                } else if (C5883a.this.f20829ah == null || !C5883a.this.mo18644a(C5883a.this.f20829ah, cameraPosition.f16582a) || C5883a.this.f20832b.size() == 0) {
                    C5883a.this.f20829ah = cameraPosition.f16582a;
                    C5883a.this.f20830ai = C5883a.this.f20834d.mo15096a().f16583b;
                    if (C5883a.this.mo1318s() != null) {
                        C5883a.this.mo18646e();
                    }
                }
            }
        });
        this.f20834d.mo15105a((C4586f) new C4586f() {
            /* renamed from: a */
            public void mo15124a(Location location) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                C5883a.this.f20828ag = location;
                LatLng latLng = new LatLng(latitude, longitude);
                if (C5883a.this.f20829ah == null || !C5883a.this.mo18644a(latLng, C5883a.this.f20829ah)) {
                    C5883a.this.f20829ah = latLng;
                    if (C5883a.this.mo1318s() != null) {
                        C5883a.this.mo18646e();
                    }
                }
                C5883a.this.f20834d.mo15105a((C4586f) null);
            }
        });
    }

    /* renamed from: d */
    public HashMap<String, String> mo18645d() {
        double d;
        double d2;
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.f20829ah == null) {
            d2 = this.f20828ag.getLatitude();
            d = this.f20828ag.getLongitude();
            this.f20829ah = new LatLng(d2, d);
        } else {
            d2 = this.f20829ah.f16590a;
            d = this.f20829ah.f16591b;
        }
        hashMap.put("apikey", this.f20835e);
        StringBuilder sb = new StringBuilder();
        sb.append(d2);
        sb.append(",");
        sb.append(d);
        hashMap.put("location", sb.toString());
        hashMap.put("sensor", "true");
        hashMap.put("radius", this.f20836f);
        hashMap.put("type", this.f20838h);
        hashMap.put("keyword", this.f20837g);
        return hashMap;
    }

    /* renamed from: e */
    public void mo18646e() {
        if (C6612h.m31984a(mo1318s())) {
            C5891a aVar = new C5891a();
            HashMap d = mo18645d();
            if (d == null) {
                Log.d(f20825a, "args to task are null");
                return;
            }
            aVar.execute(new Object[]{d, new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    C5883a.this.m28883m(false);
                    C5883a.this.f20832b = (ArrayList) obj;
                    C5883a.this.m28869a(C5883a.this.f20832b);
                }
            }});
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        double d;
        String str;
        bundle.putFloat("zoomLevel", this.f20830ai);
        if (this.f20829ah != null) {
            bundle.putDouble("cameraLat", this.f20829ah.f16590a);
            str = "cameraLng";
            d = this.f20829ah.f16591b;
        } else {
            d = -1.0d;
            bundle.putDouble("cameraLat", -1.0d);
            str = "cameraLng";
        }
        bundle.putDouble(str, d);
        bundle.putSerializable("locations", this.f20832b);
        bundle.putBoolean("keyRotation", this.f20831aj);
        super.mo1282e(bundle);
    }
}

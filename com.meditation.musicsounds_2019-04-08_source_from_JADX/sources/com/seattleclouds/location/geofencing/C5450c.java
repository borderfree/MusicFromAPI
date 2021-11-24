package com.seattleclouds.location.geofencing;

import com.google.android.gms.location.C4515b;
import com.google.android.gms.location.C4515b.C4516a;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.location.geofencing.c */
public class C5450c {

    /* renamed from: a */
    private String f19422a;

    /* renamed from: b */
    private String f19423b;

    /* renamed from: c */
    private double f19424c;

    /* renamed from: d */
    private double f19425d;

    /* renamed from: e */
    private float f19426e;

    /* renamed from: f */
    private Date f19427f;

    /* renamed from: g */
    private Date f19428g;

    /* renamed from: h */
    private String f19429h;

    /* renamed from: i */
    private Map<String, Object> f19430i;

    /* renamed from: j */
    private String f19431j;

    /* renamed from: a */
    public static C5450c m27234a(JSONObject jSONObject) {
        C5450c cVar = new C5450c();
        cVar.f19422a = jSONObject.getString("id");
        cVar.f19423b = jSONObject.getString("title");
        JSONObject jSONObject2 = jSONObject.getJSONObject("region");
        cVar.f19424c = jSONObject2.getDouble("latitude");
        cVar.f19425d = jSONObject2.getDouble("longitude");
        cVar.f19426e = (float) jSONObject2.getDouble("radius");
        if (jSONObject.has("startDate") && !jSONObject.isNull("startDate")) {
            cVar.mo17756a(new Date(jSONObject.getLong("startDate")));
        }
        if (jSONObject.has("endDate") && !jSONObject.isNull("endDate")) {
            cVar.mo17758b(new Date(jSONObject.getLong("endDate")));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("action");
        cVar.f19429h = jSONObject3.getString("type");
        if (jSONObject3.has("message")) {
            cVar.f19431j = jSONObject3.getString("message");
        }
        cVar.f19430i = new HashMap();
        if (jSONObject3.has("parameters")) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("parameters");
            Iterator keys = jSONObject4.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                cVar.f19430i.put(str, jSONObject4.get(str));
            }
        }
        if (cVar.f19431j != null) {
            cVar.f19430i.put("message", cVar.f19431j);
        }
        return cVar;
    }

    /* renamed from: a */
    public String mo17755a() {
        return this.f19422a;
    }

    /* renamed from: a */
    public void mo17756a(Date date) {
        this.f19427f = date;
    }

    /* renamed from: b */
    public String mo17757b() {
        return this.f19423b;
    }

    /* renamed from: b */
    public void mo17758b(Date date) {
        this.f19428g = date;
    }

    /* renamed from: c */
    public double mo17759c() {
        return this.f19424c;
    }

    /* renamed from: d */
    public double mo17760d() {
        return this.f19425d;
    }

    /* renamed from: e */
    public float mo17761e() {
        return this.f19426e;
    }

    /* renamed from: f */
    public Date mo17762f() {
        return this.f19427f;
    }

    /* renamed from: g */
    public Date mo17763g() {
        return this.f19428g;
    }

    /* renamed from: h */
    public String mo17764h() {
        return this.f19429h;
    }

    /* renamed from: i */
    public Map<String, Object> mo17765i() {
        return this.f19430i;
    }

    /* renamed from: j */
    public String mo17766j() {
        return this.f19431j;
    }

    /* renamed from: k */
    public boolean mo17767k() {
        if (this.f19424c > 90.0d || this.f19424c < -90.0d || this.f19425d > 180.0d || this.f19425d < -180.0d || this.f19426e < 1.0f || this.f19422a == null || this.f19422a.trim().length() == 0) {
            return false;
        }
        return this.f19427f == null || this.f19428g == null || this.f19427f.before(this.f19428g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C4515b mo17768l() {
        return new C4516a().mo14975a(mo17755a()).mo14977b(1000).mo14973a(1).mo14972a(mo17759c(), mo17760d(), mo17761e()).mo14974a(-1).mo14976a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCGeofence [id=");
        sb.append(this.f19422a);
        sb.append(", title=");
        sb.append(this.f19423b);
        sb.append(", latitude=");
        sb.append(this.f19424c);
        sb.append(", longitude=");
        sb.append(this.f19425d);
        sb.append(", radius=");
        sb.append(this.f19426e);
        sb.append("]");
        return sb.toString();
    }
}

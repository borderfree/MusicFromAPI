package com.seattleclouds.modules.p177o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.e */
public class C5921e {

    /* renamed from: a */
    private String f20932a = "undefined";

    /* renamed from: b */
    private String f20933b = "undefined";

    /* renamed from: c */
    private String f20934c = "undefined";

    /* renamed from: d */
    private String f20935d = "undefined";

    /* renamed from: e */
    private String f20936e = "http://example.com";

    /* renamed from: f */
    private String f20937f = "undefined";

    /* renamed from: g */
    private String f20938g = "undefined";

    /* renamed from: h */
    private String f20939h = "undefined";

    /* renamed from: a */
    public static C5921e m29060a(JSONObject jSONObject) {
        C5921e eVar = new C5921e();
        try {
            eVar.f20932a = jSONObject.getString("address1");
        } catch (JSONException unused) {
        }
        try {
            eVar.f20933b = jSONObject.getString("city");
        } catch (JSONException unused2) {
        }
        try {
            eVar.f20934c = jSONObject.getString("state");
        } catch (JSONException unused3) {
        }
        try {
            eVar.f20935d = jSONObject.getString("zip");
        } catch (JSONException unused4) {
        }
        try {
            eVar.f20936e = jSONObject.getString("webSite");
        } catch (JSONException unused5) {
            eVar.f20936e = "http://example.com";
        }
        try {
            eVar.f20937f = jSONObject.getString("telephone");
        } catch (JSONException unused6) {
        }
        try {
            eVar.f20938g = jSONObject.getString("latitude");
        } catch (JSONException unused7) {
        }
        try {
            eVar.f20939h = jSONObject.getString("longitude");
        } catch (JSONException unused8) {
        }
        return eVar;
    }

    /* renamed from: a */
    public String mo18733a() {
        return this.f20933b;
    }

    /* renamed from: b */
    public String mo18734b() {
        return this.f20932a;
    }

    /* renamed from: c */
    public String mo18735c() {
        return this.f20934c;
    }

    /* renamed from: d */
    public String mo18736d() {
        return this.f20935d;
    }

    /* renamed from: e */
    public String mo18737e() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo18734b());
        sb.append(" ");
        sb.append(mo18733a());
        sb.append(" ");
        sb.append(mo18735c());
        sb.append(" ");
        sb.append(mo18736d());
        return sb.toString();
    }
}

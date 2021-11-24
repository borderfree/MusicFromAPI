package com.seattleclouds.modules.p177o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.d */
public class C5920d {

    /* renamed from: a */
    private String f20929a = "undefined";

    /* renamed from: b */
    private String f20930b = "example@mail.com";

    /* renamed from: c */
    private String f20931c = "undefined";

    /* renamed from: a */
    public static C5920d m29056a(JSONObject jSONObject) {
        C5920d dVar = new C5920d();
        try {
            dVar.mo18731a(jSONObject.getString("companyName"));
        } catch (JSONException unused) {
        }
        try {
            dVar.f20930b = jSONObject.getString("adminEmail");
        } catch (JSONException unused2) {
        }
        try {
            dVar.f20931c = jSONObject.getString("brief");
        } catch (JSONException unused3) {
        }
        return dVar;
    }

    /* renamed from: a */
    public String mo18730a() {
        return this.f20929a;
    }

    /* renamed from: a */
    public void mo18731a(String str) {
        this.f20929a = str;
    }

    /* renamed from: b */
    public String mo18732b() {
        return this.f20931c;
    }
}

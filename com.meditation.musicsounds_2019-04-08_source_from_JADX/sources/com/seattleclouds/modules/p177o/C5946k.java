package com.seattleclouds.modules.p177o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.k */
public class C5946k {

    /* renamed from: a */
    private String f21012a;

    /* renamed from: b */
    private double f21013b;

    /* renamed from: c */
    private boolean f21014c;

    public C5946k() {
        this.f21012a = "undefined";
        this.f21013b = 0.0d;
        this.f21014c = false;
    }

    public C5946k(JSONObject jSONObject) {
        try {
            this.f21012a = jSONObject.getString("title");
        } catch (JSONException unused) {
        }
        try {
            this.f21013b = jSONObject.getDouble("price");
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: a */
    public String mo18790a() {
        return this.f21012a;
    }

    /* renamed from: a */
    public void mo18791a(boolean z) {
        this.f21014c = z;
    }

    /* renamed from: b */
    public double mo18792b() {
        return this.f21013b;
    }

    /* renamed from: c */
    public boolean mo18793c() {
        return this.f21014c;
    }
}

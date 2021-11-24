package com.seattleclouds.modules.p177o;

import com.seattleclouds.p159d.C5329b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.j */
public class C5945j extends C5329b {

    /* renamed from: a */
    private String f21008a;

    /* renamed from: b */
    private int f21009b;

    /* renamed from: c */
    private int f21010c;

    /* renamed from: d */
    private boolean f21011d;

    public C5945j(JSONObject jSONObject) {
        try {
            super.mo17507a(jSONObject.getString("name"));
        } catch (JSONException unused) {
            super.mo17507a("undefined");
        }
        try {
            super.mo17506a(jSONObject.getDouble("charge"));
        } catch (JSONException unused2) {
            super.mo17506a(0.0d);
        }
        try {
            this.f21008a = jSONObject.getString("group");
        } catch (JSONException unused3) {
            this.f21008a = "undefined";
        }
        try {
            this.f21009b = jSONObject.getInt("minItems");
        } catch (JSONException unused4) {
            this.f21009b = 0;
        }
        try {
            this.f21010c = jSONObject.getInt("maxItems");
        } catch (JSONException unused5) {
            this.f21010c = 0;
        }
    }

    /* renamed from: a */
    public int mo18785a() {
        return this.f21009b;
    }

    /* renamed from: a */
    public void mo18786a(boolean z) {
        this.f21011d = z;
    }

    /* renamed from: b */
    public int mo18787b() {
        return this.f21010c;
    }

    /* renamed from: c */
    public String mo18788c() {
        return this.f21008a;
    }

    /* renamed from: d */
    public boolean mo18789d() {
        return this.f21011d;
    }
}

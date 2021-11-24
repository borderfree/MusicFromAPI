package com.seattleclouds.api;

import org.json.JSONObject;

/* renamed from: com.seattleclouds.api.a */
public class C5267a {

    /* renamed from: a */
    private String f18867a;

    /* renamed from: b */
    private String f18868b;

    /* renamed from: c */
    private String f18869c;

    /* renamed from: d */
    private String f18870d;

    /* renamed from: a */
    public static C5267a m26263a(JSONObject jSONObject) {
        C5267a aVar = new C5267a();
        aVar.f18867a = jSONObject.getString("id");
        aVar.f18868b = jSONObject.getString("displayName");
        aVar.f18869c = jSONObject.getString("provider");
        aVar.f18870d = jSONObject.getString("providerAccountId");
        return aVar;
    }

    /* renamed from: a */
    public String mo17289a() {
        return this.f18867a;
    }

    /* renamed from: a */
    public void mo17290a(String str) {
        this.f18867a = str;
    }

    /* renamed from: b */
    public String mo17291b() {
        return this.f18868b;
    }

    /* renamed from: b */
    public void mo17292b(String str) {
        this.f18868b = str;
    }

    /* renamed from: c */
    public JSONObject mo17293c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f18867a);
        jSONObject.put("displayName", this.f18868b);
        jSONObject.put("provider", this.f18869c);
        jSONObject.put("providerAccountId", this.f18870d);
        return jSONObject;
    }

    /* renamed from: c */
    public void mo17294c(String str) {
        this.f18869c = str;
    }

    /* renamed from: d */
    public void mo17295d(String str) {
        this.f18870d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppUser [id=");
        sb.append(this.f18867a);
        sb.append(", displayName=");
        sb.append(this.f18868b);
        sb.append(", provider=");
        sb.append(this.f18869c);
        sb.append(", providerAccountId=");
        sb.append(this.f18870d);
        sb.append("]");
        return sb.toString();
    }
}

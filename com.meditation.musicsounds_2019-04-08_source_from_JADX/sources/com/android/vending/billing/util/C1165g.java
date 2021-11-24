package com.android.vending.billing.util;

import org.json.JSONObject;

/* renamed from: com.android.vending.billing.util.g */
public class C1165g {

    /* renamed from: a */
    String f4194a;

    /* renamed from: b */
    String f4195b;

    /* renamed from: c */
    String f4196c;

    /* renamed from: d */
    String f4197d;

    /* renamed from: e */
    String f4198e;

    /* renamed from: f */
    String f4199f;

    /* renamed from: g */
    String f4200g;

    public C1165g(String str, String str2) {
        this.f4194a = str;
        this.f4200g = str2;
        JSONObject jSONObject = new JSONObject(this.f4200g);
        this.f4195b = jSONObject.optString("productId");
        this.f4196c = jSONObject.optString("type");
        this.f4197d = jSONObject.optString("price");
        this.f4198e = jSONObject.optString("title");
        this.f4199f = jSONObject.optString("description");
    }

    /* renamed from: a */
    public String mo5647a() {
        return this.f4195b;
    }

    /* renamed from: b */
    public String mo5648b() {
        return this.f4196c;
    }

    /* renamed from: c */
    public String mo5649c() {
        return this.f4197d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SkuDetails:");
        sb.append(this.f4200g);
        return sb.toString();
    }
}

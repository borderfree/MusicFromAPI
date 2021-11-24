package com.android.vending.billing.util;

import org.json.JSONObject;

/* renamed from: com.android.vending.billing.util.e */
public class C1163e {

    /* renamed from: a */
    String f4184a;

    /* renamed from: b */
    String f4185b;

    /* renamed from: c */
    String f4186c;

    /* renamed from: d */
    String f4187d;

    /* renamed from: e */
    long f4188e;

    /* renamed from: f */
    int f4189f;

    /* renamed from: g */
    String f4190g;

    /* renamed from: h */
    String f4191h;

    /* renamed from: i */
    String f4192i;

    /* renamed from: j */
    String f4193j;

    public C1163e(String str, String str2, String str3) {
        this.f4184a = str;
        this.f4192i = str2;
        JSONObject jSONObject = new JSONObject(this.f4192i);
        this.f4185b = jSONObject.optString("orderId");
        this.f4186c = jSONObject.optString("packageName");
        this.f4187d = jSONObject.optString("productId");
        this.f4188e = jSONObject.optLong("purchaseTime");
        this.f4189f = jSONObject.optInt("purchaseState");
        this.f4190g = jSONObject.optString("developerPayload");
        this.f4191h = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f4193j = str3;
    }

    /* renamed from: a */
    public String mo5643a() {
        return this.f4184a;
    }

    /* renamed from: b */
    public String mo5644b() {
        return this.f4187d;
    }

    /* renamed from: c */
    public String mo5645c() {
        return this.f4191h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseInfo(type:");
        sb.append(this.f4184a);
        sb.append("):");
        sb.append(this.f4192i);
        return sb.toString();
    }
}

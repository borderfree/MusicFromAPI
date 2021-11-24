package com.facebook.ads.internal.p058a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.g */
public class C1632g {

    /* renamed from: a */
    private final String f5305a;

    /* renamed from: b */
    private final String f5306b;

    /* renamed from: c */
    private final String f5307c;

    /* renamed from: d */
    private final List<String> f5308d;

    /* renamed from: e */
    private final String f5309e;

    /* renamed from: f */
    private final String f5310f;

    private C1632g(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.f5305a = str;
        this.f5306b = str2;
        this.f5307c = str3;
        this.f5308d = list;
        this.f5309e = str4;
        this.f5310f = str5;
    }

    /* renamed from: a */
    public static C1632g m8189a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("package");
        String optString2 = jSONObject.optString("appsite");
        String optString3 = jSONObject.optString("appsite_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("key_hashes");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        C1632g gVar = new C1632g(optString, optString2, optString3, arrayList, jSONObject.optString("market_uri"), jSONObject.optString("fallback_url"));
        return gVar;
    }

    /* renamed from: a */
    public String mo6660a() {
        return this.f5305a;
    }

    /* renamed from: b */
    public String mo6661b() {
        return this.f5306b;
    }

    /* renamed from: c */
    public String mo6662c() {
        return this.f5307c;
    }
}

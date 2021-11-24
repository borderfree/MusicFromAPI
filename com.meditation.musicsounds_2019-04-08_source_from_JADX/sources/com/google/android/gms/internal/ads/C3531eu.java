package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.eu */
public final class C3531eu {

    /* renamed from: a */
    private final List<String> f13895a;

    /* renamed from: b */
    private final String f13896b;

    /* renamed from: c */
    private final String f13897c;

    /* renamed from: d */
    private final String f13898d;

    /* renamed from: e */
    private final boolean f13899e;

    /* renamed from: f */
    private final String f13900f;

    /* renamed from: g */
    private final String f13901g;

    /* renamed from: h */
    private String f13902h;

    /* renamed from: i */
    private final int f13903i;

    /* renamed from: j */
    private final boolean f13904j;

    /* renamed from: k */
    private final JSONObject f13905k;

    public C3531eu(int i, Map<String, String> map) {
        this.f13902h = (String) map.get("url");
        this.f13896b = (String) map.get("base_uri");
        this.f13897c = (String) map.get("post_parameters");
        this.f13899e = m18365b((String) map.get("drt_include"));
        this.f13900f = (String) map.get("request_id");
        this.f13898d = (String) map.get("type");
        this.f13895a = m18366c((String) map.get("errors"));
        this.f13903i = i;
        this.f13901g = (String) map.get("fetched_ad");
        this.f13904j = m18365b((String) map.get("render_test_ad_label"));
        this.f13905k = new JSONObject();
    }

    public C3531eu(JSONObject jSONObject) {
        this.f13902h = jSONObject.optString("url");
        this.f13896b = jSONObject.optString("base_uri");
        this.f13897c = jSONObject.optString("post_parameters");
        this.f13899e = m18365b(jSONObject.optString("drt_include"));
        this.f13900f = jSONObject.optString("request_id");
        this.f13898d = jSONObject.optString("type");
        this.f13895a = m18366c(jSONObject.optString("errors"));
        int i = 1;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.f13903i = i;
        this.f13901g = jSONObject.optString("fetched_ad");
        this.f13904j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f13905k = optJSONObject;
    }

    /* renamed from: b */
    private static boolean m18365b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: c */
    private static List<String> m18366c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    /* renamed from: a */
    public final int mo12884a() {
        return this.f13903i;
    }

    /* renamed from: a */
    public final void mo12885a(String str) {
        this.f13902h = str;
    }

    /* renamed from: b */
    public final List<String> mo12886b() {
        return this.f13895a;
    }

    /* renamed from: c */
    public final String mo12887c() {
        return this.f13896b;
    }

    /* renamed from: d */
    public final String mo12888d() {
        return this.f13897c;
    }

    /* renamed from: e */
    public final String mo12889e() {
        return this.f13902h;
    }

    /* renamed from: f */
    public final String mo12890f() {
        return this.f13898d;
    }

    /* renamed from: g */
    public final boolean mo12891g() {
        return this.f13899e;
    }

    /* renamed from: h */
    public final String mo12892h() {
        return this.f13900f;
    }

    /* renamed from: i */
    public final String mo12893i() {
        return this.f13901g;
    }

    /* renamed from: j */
    public final boolean mo12894j() {
        return this.f13904j;
    }
}

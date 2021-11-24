package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.v */
class C2256v {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f7259a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m10349a(String str) {
        return (JSONObject) f7259a.get(str);
    }

    /* renamed from: a */
    public static void m10350a(String str, JSONObject jSONObject) {
        f7259a.put(str, jSONObject);
    }
}

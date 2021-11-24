package com.facebook.internal;

import com.facebook.FacebookRequestError.Category;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j */
public final class C2225j {

    /* renamed from: g */
    private static C2225j f7178g;

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f7179a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f7180b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f7181c;

    /* renamed from: d */
    private final String f7182d;

    /* renamed from: e */
    private final String f7183e;

    /* renamed from: f */
    private final String f7184f;

    C2225j(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f7179a = map;
        this.f7180b = map2;
        this.f7181c = map3;
        this.f7182d = str;
        this.f7183e = str2;
        this.f7184f = str3;
    }

    /* renamed from: a */
    public static synchronized C2225j m10209a() {
        C2225j jVar;
        synchronized (C2225j.class) {
            if (f7178g == null) {
                f7178g = m10212b();
            }
            jVar = f7178g;
        }
        return jVar;
    }

    /* renamed from: a */
    public static C2225j m10210a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = m10211a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        map2 = m10211a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString("recovery_message", null);
                        map3 = m10211a(optJSONObject);
                    }
                }
            }
        }
        C2225j jVar = new C2225j(map, map2, map3, str, str2, str3);
        return jVar;
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m10211a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static C2225j m10212b() {
        C2225j jVar = new C2225j(null, new FacebookRequestErrorClassification$1(), new FacebookRequestErrorClassification$2(), null, null, null);
        return jVar;
    }

    /* renamed from: a */
    public Category mo7842a(int i, int i2, boolean z) {
        if (z) {
            return Category.TRANSIENT;
        }
        if (this.f7179a != null && this.f7179a.containsKey(Integer.valueOf(i))) {
            Set set = (Set) this.f7179a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return Category.OTHER;
            }
        }
        if (this.f7181c != null && this.f7181c.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.f7181c.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2))) {
                return Category.LOGIN_RECOVERABLE;
            }
        }
        if (this.f7180b != null && this.f7180b.containsKey(Integer.valueOf(i))) {
            Set set3 = (Set) this.f7180b.get(Integer.valueOf(i));
            if (set3 == null || set3.contains(Integer.valueOf(i2))) {
                return Category.TRANSIENT;
            }
        }
        return Category.OTHER;
    }

    /* renamed from: a */
    public String mo7843a(Category category) {
        switch (category) {
            case OTHER:
                return this.f7182d;
            case LOGIN_RECOVERABLE:
                return this.f7184f;
            case TRANSIENT:
                return this.f7183e;
            default:
                return null;
        }
    }
}

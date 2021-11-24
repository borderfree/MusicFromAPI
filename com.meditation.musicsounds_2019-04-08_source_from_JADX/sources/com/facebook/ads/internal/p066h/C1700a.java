package com.facebook.ads.internal.p066h;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.h.a */
public class C1700a {

    /* renamed from: a */
    private final String f5601a;

    /* renamed from: b */
    private final Map<String, String> f5602b;

    /* renamed from: c */
    private final String f5603c;

    public C1700a(String str, Map<String, String> map) {
        this(str, map, false);
    }

    public C1700a(String str, Map<String, String> map, boolean z) {
        this.f5601a = str;
        this.f5602b = map;
        this.f5603c = z ? "1" : "0";
    }

    /* renamed from: a */
    public Map<String, String> mo6876a() {
        HashMap hashMap = new HashMap();
        hashMap.put("stacktrace", this.f5601a);
        hashMap.put("caught_exception", this.f5603c);
        hashMap.putAll(this.f5602b);
        return hashMap;
    }
}

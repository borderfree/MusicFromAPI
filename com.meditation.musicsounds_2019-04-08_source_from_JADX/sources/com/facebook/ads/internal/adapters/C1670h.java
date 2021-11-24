package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.view.C1844a;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.facebook.ads.internal.adapters.h */
public class C1670h {

    /* renamed from: a */
    private static final ConcurrentMap<String, C1844a> f5474a = new ConcurrentHashMap();

    /* renamed from: com.facebook.ads.internal.adapters.h$a */
    public enum C1671a {
        UNSPECIFIED,
        VERTICAL,
        HORIZONTAL;

        /* renamed from: a */
        public static C1671a m8374a(int i) {
            return i == 0 ? UNSPECIFIED : i == 2 ? HORIZONTAL : VERTICAL;
        }
    }

    /* renamed from: a */
    public static C1844a m8372a(String str) {
        return (C1844a) f5474a.get(str);
    }

    /* renamed from: a */
    public static void m8373a(C1844a aVar) {
        for (Entry entry : f5474a.entrySet()) {
            if (entry.getValue() == aVar) {
                f5474a.remove(entry.getKey());
            }
        }
    }
}

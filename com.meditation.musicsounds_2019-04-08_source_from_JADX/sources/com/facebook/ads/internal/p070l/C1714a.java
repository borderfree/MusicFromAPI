package com.facebook.ads.internal.p070l;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.l.a */
public class C1714a {

    /* renamed from: a */
    public static String f5643a;

    /* renamed from: b */
    private String f5644b;

    /* renamed from: c */
    private Map<String, Object> f5645c;

    /* renamed from: d */
    private int f5646d;

    /* renamed from: e */
    private String f5647e;

    /* renamed from: com.facebook.ads.internal.l.a$a */
    public enum C1715a {
        OPEN_STORE(0),
        OPEN_LINK(1),
        XOUT(2),
        OPEN_URL(3),
        SHOW_INTERSTITIAL(4);
        

        /* renamed from: f */
        int f5654f;

        private C1715a(int i) {
            this.f5654f = i;
        }
    }

    public C1714a(String str, Map<String, Object> map, int i, String str2) {
        this.f5644b = str;
        this.f5645c = map;
        this.f5646d = i;
        this.f5647e = str2;
    }

    /* renamed from: a */
    public static C1714a m8599a(long j, C1715a aVar, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("Time", String.valueOf(currentTimeMillis - j));
        hashMap.put("AdAction", String.valueOf(aVar.f5654f));
        return new C1714a("bounceback", hashMap, (int) (currentTimeMillis / 1000), str);
    }

    /* renamed from: a */
    public static C1714a m8600a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        if (th != null) {
            hashMap.put("ex", th.getClass().getSimpleName());
            hashMap.put("ex_msg", th.getMessage());
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String str2 = "error";
        if (str == null) {
            str = f5643a;
        }
        return new C1714a(str2, hashMap, currentTimeMillis, str);
    }
}

package com.facebook.ads.internal.p072o;

import android.text.TextUtils;
import com.facebook.ads.internal.p067i.C1704a;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.ads.internal.o.a */
public class C1722a {

    /* renamed from: a */
    private final String f5658a;

    /* renamed from: b */
    private final double f5659b;

    /* renamed from: c */
    private final double f5660c;

    /* renamed from: d */
    private final String f5661d;

    /* renamed from: e */
    private final Map<String, String> f5662e;

    /* renamed from: f */
    private final C1731e f5663f;

    /* renamed from: g */
    private final C1732f f5664g;

    /* renamed from: h */
    private final boolean f5665h;

    /* renamed from: com.facebook.ads.internal.o.a$a */
    public static class C1723a {

        /* renamed from: a */
        private String f5666a;

        /* renamed from: b */
        private double f5667b;

        /* renamed from: c */
        private String f5668c;

        /* renamed from: d */
        private Map<String, String> f5669d;

        /* renamed from: e */
        private C1731e f5670e;

        /* renamed from: f */
        private C1732f f5671f;

        /* renamed from: g */
        private boolean f5672g;

        /* renamed from: a */
        public C1723a mo6920a(double d) {
            this.f5667b = d;
            return this;
        }

        /* renamed from: a */
        public C1723a mo6921a(C1731e eVar) {
            this.f5670e = eVar;
            return this;
        }

        /* renamed from: a */
        public C1723a mo6922a(C1732f fVar) {
            this.f5671f = fVar;
            return this;
        }

        /* renamed from: a */
        public C1723a mo6923a(String str) {
            this.f5666a = str;
            return this;
        }

        /* renamed from: a */
        public C1723a mo6924a(Map<String, String> map) {
            this.f5669d = map;
            return this;
        }

        /* renamed from: a */
        public C1723a mo6925a(boolean z) {
            this.f5672g = z;
            return this;
        }

        /* renamed from: a */
        public C1722a mo6926a() {
            C1722a aVar = new C1722a(this.f5666a, this.f5667b, this.f5668c, this.f5669d, this.f5670e, this.f5671f, this.f5672g);
            return aVar;
        }

        /* renamed from: b */
        public C1723a mo6927b(String str) {
            this.f5668c = str;
            return this;
        }
    }

    public C1722a(String str, double d, String str2, Map<String, String> map, C1731e eVar, C1732f fVar, boolean z) {
        this.f5658a = str;
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        this.f5659b = currentTimeMillis / 1000.0d;
        this.f5660c = d;
        this.f5661d = str2;
        this.f5663f = eVar;
        this.f5664g = fVar;
        this.f5665h = z;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (mo6916f()) {
            hashMap.put("analog", C1800k.m8915a(C1704a.m8531a()));
        }
        this.f5662e = m8616a(hashMap);
    }

    /* renamed from: a */
    private static Map<String, String> m8616a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo6911a() {
        return this.f5658a;
    }

    /* renamed from: b */
    public double mo6912b() {
        return this.f5659b;
    }

    /* renamed from: c */
    public double mo6913c() {
        return this.f5660c;
    }

    /* renamed from: d */
    public String mo6914d() {
        return this.f5661d;
    }

    /* renamed from: e */
    public Map<String, String> mo6915e() {
        return this.f5662e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo6916f() {
        return this.f5663f == C1731e.IMMEDIATE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo6917g() {
        return !TextUtils.isEmpty(this.f5658a);
    }

    /* renamed from: h */
    public C1731e mo6918h() {
        return this.f5663f;
    }

    /* renamed from: i */
    public C1732f mo6919i() {
        return this.f5664g;
    }
}

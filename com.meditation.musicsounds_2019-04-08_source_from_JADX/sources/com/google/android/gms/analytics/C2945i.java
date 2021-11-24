package com.google.android.gms.analytics;

import com.google.android.gms.internal.measurement.C4271bj;

/* renamed from: com.google.android.gms.analytics.i */
public final class C2945i {
    /* renamed from: a */
    public static String m13786a(int i) {
        return m13787a("cd", i);
    }

    /* renamed from: a */
    private static String m13787a(String str, int i) {
        if (i <= 0) {
            C4271bj.m21063a("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m13788b(int i) {
        return m13787a("cm", i);
    }

    /* renamed from: c */
    public static String m13789c(int i) {
        return m13787a("&pr", i);
    }

    /* renamed from: d */
    public static String m13790d(int i) {
        return m13787a("pr", i);
    }

    /* renamed from: e */
    public static String m13791e(int i) {
        return m13787a("&promo", i);
    }

    /* renamed from: f */
    public static String m13792f(int i) {
        return m13787a("promo", i);
    }

    /* renamed from: g */
    public static String m13793g(int i) {
        return m13787a("pi", i);
    }

    /* renamed from: h */
    public static String m13794h(int i) {
        return m13787a("&il", i);
    }

    /* renamed from: i */
    public static String m13795i(int i) {
        return m13787a("il", i);
    }
}

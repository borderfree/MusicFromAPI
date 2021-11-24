package com.google.android.gms.common.p120a;

/* renamed from: com.google.android.gms.common.a.a */
public abstract class C3013a<T> {

    /* renamed from: c */
    private static final Object f10561c = new Object();

    /* renamed from: d */
    private static C3014a f10562d = null;

    /* renamed from: e */
    private static int f10563e = 0;

    /* renamed from: a */
    protected final String f10564a;

    /* renamed from: b */
    protected final T f10565b;

    /* renamed from: f */
    private T f10566f = null;

    /* renamed from: com.google.android.gms.common.a.a$a */
    private interface C3014a {
    }

    protected C3013a(String str, T t) {
        this.f10564a = str;
        this.f10565b = t;
    }

    /* renamed from: a */
    public static C3013a<Float> m13983a(String str, Float f) {
        return new C3018e(str, f);
    }

    /* renamed from: a */
    public static C3013a<Integer> m13984a(String str, Integer num) {
        return new C3017d(str, num);
    }

    /* renamed from: a */
    public static C3013a<Long> m13985a(String str, Long l) {
        return new C3016c(str, l);
    }

    /* renamed from: a */
    public static C3013a<String> m13986a(String str, String str2) {
        return new C3019f(str, str2);
    }

    /* renamed from: a */
    public static C3013a<Boolean> m13987a(String str, boolean z) {
        return new C3015b(str, Boolean.valueOf(z));
    }
}

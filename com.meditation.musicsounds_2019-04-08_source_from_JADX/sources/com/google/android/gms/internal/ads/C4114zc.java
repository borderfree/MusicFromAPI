package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zc */
final class C4114zc {

    /* renamed from: a */
    private static final Class<?> f15163a = m20403a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f15164b = (m20403a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m20403a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m20404a() {
        return f15163a != null && !f15164b;
    }

    /* renamed from: b */
    static Class<?> m20405b() {
        return f15163a;
    }
}

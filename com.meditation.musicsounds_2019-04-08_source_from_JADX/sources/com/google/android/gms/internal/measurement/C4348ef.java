package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ef */
final class C4348ef {

    /* renamed from: a */
    private static final Class<?> f16057a = m21319a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f16058b = (m21319a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m21319a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m21320a() {
        return f16057a != null && !f16058b;
    }

    /* renamed from: b */
    static Class<?> m21321b() {
        return f16057a;
    }
}

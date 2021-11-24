package com.google.android.gms.internal.ads;

final class aab {

    /* renamed from: a */
    private static final C4137zz<?> f11327a = new aaa();

    /* renamed from: b */
    private static final C4137zz<?> f11328b = m15304c();

    /* renamed from: a */
    static C4137zz<?> m15302a() {
        return f11327a;
    }

    /* renamed from: b */
    static C4137zz<?> m15303b() {
        if (f11328b != null) {
            return f11328b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C4137zz<?> m15304c() {
        try {
            return (C4137zz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

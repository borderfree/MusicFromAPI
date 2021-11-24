package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fe */
final class C4375fe {

    /* renamed from: a */
    private static final C4373fc<?> f16099a = new C4374fd();

    /* renamed from: b */
    private static final C4373fc<?> f16100b = m21529c();

    /* renamed from: a */
    static C4373fc<?> m21527a() {
        return f16099a;
    }

    /* renamed from: b */
    static C4373fc<?> m21528b() {
        if (f16100b != null) {
            return f16100b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C4373fc<?> m21529c() {
        try {
            return (C4373fc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

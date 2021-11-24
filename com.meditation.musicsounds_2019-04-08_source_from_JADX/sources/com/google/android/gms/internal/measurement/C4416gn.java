package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gn */
final class C4416gn {

    /* renamed from: a */
    private static final C4414gl f16171a = m21698c();

    /* renamed from: b */
    private static final C4414gl f16172b = new C4415gm();

    /* renamed from: a */
    static C4414gl m21696a() {
        return f16171a;
    }

    /* renamed from: b */
    static C4414gl m21697b() {
        return f16172b;
    }

    /* renamed from: c */
    private static C4414gl m21698c() {
        try {
            return (C4414gl) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

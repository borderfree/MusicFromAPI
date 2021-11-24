package com.google.android.gms.internal.ads;

final class abi {

    /* renamed from: a */
    private static final abg f11394a = m15462c();

    /* renamed from: b */
    private static final abg f11395b = new abh();

    /* renamed from: a */
    static abg m15460a() {
        return f11394a;
    }

    /* renamed from: b */
    static abg m15461b() {
        return f11395b;
    }

    /* renamed from: c */
    private static abg m15462c() {
        try {
            return (abg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

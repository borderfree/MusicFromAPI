package com.google.android.gms.internal.ads;

final class abw {

    /* renamed from: a */
    private static final abu f11425a = m15553c();

    /* renamed from: b */
    private static final abu f11426b = new abv();

    /* renamed from: a */
    static abu m15551a() {
        return f11425a;
    }

    /* renamed from: b */
    static abu m15552b() {
        return f11426b;
    }

    /* renamed from: c */
    private static abu m15553c() {
        try {
            return (abu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

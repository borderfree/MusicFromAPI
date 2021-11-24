package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ha */
final class C4430ha {

    /* renamed from: a */
    private static final C4427gy f16203a = m21778c();

    /* renamed from: b */
    private static final C4427gy f16204b = new C4428gz();

    /* renamed from: a */
    static C4427gy m21776a() {
        return f16203a;
    }

    /* renamed from: b */
    static C4427gy m21777b() {
        return f16204b;
    }

    /* renamed from: c */
    private static C4427gy m21778c() {
        try {
            return (C4427gy) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

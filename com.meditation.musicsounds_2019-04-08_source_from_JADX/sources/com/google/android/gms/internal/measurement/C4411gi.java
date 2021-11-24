package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gi */
final class C4411gi implements C4418gp {

    /* renamed from: a */
    private C4418gp[] f16166a;

    C4411gi(C4418gp... gpVarArr) {
        this.f16166a = gpVarArr;
    }

    /* renamed from: a */
    public final boolean mo14490a(Class<?> cls) {
        for (C4418gp a : this.f16166a) {
            if (a.mo14490a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C4417go mo14491b(Class<?> cls) {
        C4418gp[] gpVarArr;
        for (C4418gp gpVar : this.f16166a) {
            if (gpVar.mo14490a(cls)) {
                return gpVar.mo14491b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}

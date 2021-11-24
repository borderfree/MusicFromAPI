package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.eo */
final class C4357eo {

    /* renamed from: a */
    private final zztv f16065a;

    /* renamed from: b */
    private final byte[] f16066b;

    private C4357eo(int i) {
        this.f16066b = new byte[i];
        this.f16065a = zztv.m22409a(this.f16066b);
    }

    /* synthetic */ C4357eo(int i, C4351ei eiVar) {
        this(i);
    }

    /* renamed from: a */
    public final zzte mo14334a() {
        if (this.f16065a.mo14917b() == 0) {
            return new zzto(this.f16066b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zztv mo14335b() {
        return this.f16065a;
    }
}

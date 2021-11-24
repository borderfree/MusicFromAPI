package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bv */
final class C4283bv implements C4259ay {

    /* renamed from: a */
    private final /* synthetic */ Runnable f15839a;

    /* renamed from: b */
    private final /* synthetic */ C4280bs f15840b;

    C4283bv(C4280bs bsVar, Runnable runnable) {
        this.f15840b = bsVar;
        this.f15839a = runnable;
    }

    /* renamed from: a */
    public final void mo14135a(Throwable th) {
        this.f15840b.f15831a.post(this.f15839a);
    }
}

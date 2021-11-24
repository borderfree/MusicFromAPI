package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bj */
final class C4653bj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f16801a;

    /* renamed from: b */
    private final /* synthetic */ zzk f16802b;

    /* renamed from: c */
    private final /* synthetic */ C4640ax f16803c;

    C4653bj(C4640ax axVar, zzag zzag, zzk zzk) {
        this.f16803c = axVar;
        this.f16801a = zzag;
        this.f16802b = zzk;
    }

    public final void run() {
        zzag b = this.f16803c.mo15369b(this.f16801a, this.f16802b);
        this.f16803c.f16762a.mo15555l();
        this.f16803c.f16762a.mo15530a(b, this.f16802b);
    }
}

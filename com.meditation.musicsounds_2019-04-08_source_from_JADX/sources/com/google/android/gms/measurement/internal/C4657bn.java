package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bn */
final class C4657bn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzfv f16813a;

    /* renamed from: b */
    private final /* synthetic */ zzk f16814b;

    /* renamed from: c */
    private final /* synthetic */ C4640ax f16815c;

    C4657bn(C4640ax axVar, zzfv zzfv, zzk zzk) {
        this.f16815c = axVar;
        this.f16813a = zzfv;
        this.f16814b = zzk;
    }

    public final void run() {
        this.f16815c.f16762a.mo15555l();
        this.f16815c.f16762a.mo15532a(this.f16813a, this.f16814b);
    }
}

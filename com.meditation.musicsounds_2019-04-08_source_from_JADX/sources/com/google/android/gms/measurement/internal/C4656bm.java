package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bm */
final class C4656bm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzfv f16810a;

    /* renamed from: b */
    private final /* synthetic */ zzk f16811b;

    /* renamed from: c */
    private final /* synthetic */ C4640ax f16812c;

    C4656bm(C4640ax axVar, zzfv zzfv, zzk zzk) {
        this.f16812c = axVar;
        this.f16810a = zzfv;
        this.f16811b = zzk;
    }

    public final void run() {
        this.f16812c.f16762a.mo15555l();
        this.f16812c.f16762a.mo15540b(this.f16810a, this.f16811b);
    }
}

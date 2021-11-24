package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cj */
final class C4680cj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f16885a;

    /* renamed from: b */
    private final /* synthetic */ C4672cb f16886b;

    C4680cj(C4672cb cbVar, boolean z) {
        this.f16886b = cbVar;
        this.f16885a = z;
    }

    public final void run() {
        boolean C = this.f16886b.f16825q.mo15325C();
        boolean B = this.f16886b.f16825q.mo15324B();
        this.f16886b.f16825q.mo15334a(this.f16885a);
        if (B == this.f16885a) {
            this.f16886b.f16825q.mo15253r().mo15855x().mo15859a("Default data collection state already set to", Boolean.valueOf(this.f16885a));
        }
        if (this.f16886b.f16825q.mo15325C() == C || this.f16886b.f16825q.mo15325C() != this.f16886b.f16825q.mo15324B()) {
            this.f16886b.f16825q.mo15253r().mo15851k().mo15860a("Default data collection is different than actual status", Boolean.valueOf(this.f16885a), Boolean.valueOf(C));
        }
        this.f16886b.m23148C();
    }
}

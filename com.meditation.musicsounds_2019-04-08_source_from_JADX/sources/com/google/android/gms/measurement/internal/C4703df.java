package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.df */
final class C4703df implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4758i f16964a;

    /* renamed from: b */
    private final /* synthetic */ C4702de f16965b;

    C4703df(C4702de deVar, C4758i iVar) {
        this.f16965b = deVar;
        this.f16964a = iVar;
    }

    public final void run() {
        synchronized (this.f16965b) {
            this.f16965b.f16962b = false;
            if (!this.f16965b.f16961a.mo15466x()) {
                this.f16965b.f16961a.mo15253r().mo15855x().mo15858a("Connected to service");
                this.f16965b.f16961a.mo15458a(this.f16964a);
            }
        }
    }
}

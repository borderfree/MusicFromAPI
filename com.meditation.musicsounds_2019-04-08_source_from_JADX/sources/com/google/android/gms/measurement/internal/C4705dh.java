package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dh */
final class C4705dh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4758i f16968a;

    /* renamed from: b */
    private final /* synthetic */ C4702de f16969b;

    C4705dh(C4702de deVar, C4758i iVar) {
        this.f16969b = deVar;
        this.f16968a = iVar;
    }

    public final void run() {
        synchronized (this.f16969b) {
            this.f16969b.f16962b = false;
            if (!this.f16969b.f16961a.mo15466x()) {
                this.f16969b.f16961a.mo15253r().mo15854w().mo15858a("Connected to remote service");
                this.f16969b.f16961a.mo15458a(this.f16968a);
            }
        }
    }
}

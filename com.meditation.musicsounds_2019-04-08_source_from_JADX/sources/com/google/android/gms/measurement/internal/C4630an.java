package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.an */
final class C4630an implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4638av f16692a;

    /* renamed from: b */
    private final /* synthetic */ C4767r f16693b;

    C4630an(C4629am amVar, C4638av avVar, C4767r rVar) {
        this.f16692a = avVar;
        this.f16693b = rVar;
    }

    public final void run() {
        if (this.f16692a.mo15339f() == null) {
            this.f16693b.mo15852u_().mo15858a("Install Referrer Reporter is null");
            return;
        }
        C4626aj f = this.f16692a.mo15339f();
        f.f16685a.mo15327E();
        f.mo15290a(f.f16685a.mo15249n().getPackageName());
    }
}

package com.google.android.gms.analytics;

/* renamed from: com.google.android.gms.analytics.q */
final class C2956q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2948l f10413a;

    /* renamed from: b */
    private final /* synthetic */ C2952p f10414b;

    C2956q(C2952p pVar, C2948l lVar) {
        this.f10414b = pVar;
        this.f10413a = lVar;
    }

    public final void run() {
        this.f10413a.mo10637h().mo10617a(this.f10413a);
        for (C2958s a : this.f10414b.f10406c) {
            a.mo10656a(this.f10413a);
        }
        C2952p.m13826b(this.f10413a);
    }
}

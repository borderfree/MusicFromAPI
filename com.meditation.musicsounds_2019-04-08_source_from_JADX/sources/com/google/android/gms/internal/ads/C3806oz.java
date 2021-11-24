package com.google.android.gms.internal.ads;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.oz */
final class C3806oz implements Runnable {

    /* renamed from: a */
    private C3790oj f14630a;

    /* renamed from: b */
    private boolean f14631b = false;

    C3806oz(C3790oj ojVar) {
        this.f14630a = ojVar;
    }

    /* renamed from: c */
    private final void m19362c() {
        C3653jh.f14275a.removeCallbacks(this);
        C3653jh.f14275a.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo13427a() {
        this.f14631b = true;
    }

    /* renamed from: b */
    public final void mo13428b() {
        this.f14631b = false;
        m19362c();
    }

    public final void run() {
        if (!this.f14631b) {
            this.f14630a.mo13377o();
            m19362c();
        }
    }
}

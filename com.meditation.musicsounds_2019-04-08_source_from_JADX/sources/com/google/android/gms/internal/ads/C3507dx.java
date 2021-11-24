package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dx */
final class C3507dx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3623ie f13797a;

    /* renamed from: b */
    private final /* synthetic */ C3506dw f13798b;

    C3507dx(C3506dw dwVar, C3623ie ieVar) {
        this.f13798b = dwVar;
        this.f13797a = ieVar;
    }

    public final void run() {
        this.f13798b.f13791h.zza(this.f13797a);
        if (this.f13798b.f13795l != null) {
            this.f13798b.f13795l.mo12638c();
            this.f13798b.f13795l = null;
        }
    }
}

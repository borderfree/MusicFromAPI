package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cu */
final class C3476cu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3765nl f13709a;

    /* renamed from: b */
    private final /* synthetic */ C3467cl f13710b;

    C3476cu(C3467cl clVar, C3765nl nlVar) {
        this.f13710b = clVar;
        this.f13709a = nlVar;
    }

    public final void run() {
        synchronized (this.f13710b.f13693d) {
            this.f13710b.f13690a = this.f13710b.mo12841a(this.f13710b.f13692c.f13759j, this.f13709a);
            if (this.f13710b.f13690a == null) {
                this.f13710b.m18258a(0, "Could not start the ad request service.");
                C3653jh.f14275a.removeCallbacks(this.f13710b.f13698i);
            }
        }
    }
}

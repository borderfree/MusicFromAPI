package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eb */
final class C3512eb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3506dw f13807a;

    C3512eb(C3506dw dwVar) {
        this.f13807a = dwVar;
    }

    public final void run() {
        if (this.f13807a.f13795l != null) {
            this.f13807a.f13795l.mo12638c();
            this.f13807a.f13795l = null;
        }
    }
}

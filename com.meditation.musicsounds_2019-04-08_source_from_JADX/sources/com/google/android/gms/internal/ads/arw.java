package com.google.android.gms.internal.ads;

final class arw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ aru f13024a;

    arw(aru aru) {
        this.f13024a = aru;
    }

    public final void run() {
        if (this.f13024a.f13022h != null) {
            this.f13024a.f13022h.mo12447i();
            this.f13024a.f13022h.mo12446h();
        }
        this.f13024a.f13022h = null;
    }
}

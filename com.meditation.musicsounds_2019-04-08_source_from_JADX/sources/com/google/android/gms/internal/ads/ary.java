package com.google.android.gms.internal.ads;

final class ary implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ arx f13042a;

    ary(arx arx) {
        this.f13042a = arx;
    }

    public final void run() {
        if (this.f13042a.f13041q != null) {
            this.f13042a.f13041q.mo12447i();
            this.f13042a.f13041q.mo12446h();
            this.f13042a.f13041q.mo12449k();
        }
        this.f13042a.f13041q = null;
    }
}

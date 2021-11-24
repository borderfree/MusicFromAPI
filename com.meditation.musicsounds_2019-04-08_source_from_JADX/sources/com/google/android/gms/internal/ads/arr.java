package com.google.android.gms.internal.ads;

final class arr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ arq f12999a;

    arr(arq arq) {
        this.f12999a = arq;
    }

    public final void run() {
        if (this.f12999a.f12998p != null) {
            this.f12999a.f12998p.mo12447i();
            this.f12999a.f12998p.mo12446h();
            this.f12999a.f12998p.mo12449k();
        }
        this.f12999a.f12998p = null;
    }
}

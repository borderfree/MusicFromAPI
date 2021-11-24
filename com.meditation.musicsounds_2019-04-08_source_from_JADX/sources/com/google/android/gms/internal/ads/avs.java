package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class avs implements Runnable {

    /* renamed from: a */
    private final C3763nj f13198a;

    /* renamed from: b */
    private final Future f13199b;

    avs(C3763nj njVar, Future future) {
        this.f13198a = njVar;
        this.f13199b = future;
    }

    public final void run() {
        C3763nj njVar = this.f13198a;
        Future future = this.f13199b;
        if (njVar.isCancelled()) {
            future.cancel(true);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.el */
final class C3522el implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f13842a;

    C3522el(C3519ei eiVar, Future future) {
        this.f13842a = future;
    }

    public final void run() {
        if (!this.f13842a.isDone()) {
            this.f13842a.cancel(true);
        }
    }
}

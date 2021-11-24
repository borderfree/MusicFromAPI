package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.mv */
final /* synthetic */ class C3748mv implements Runnable {

    /* renamed from: a */
    private final C3751my f14467a;

    /* renamed from: b */
    private final Future f14468b;

    C3748mv(C3751my myVar, Future future) {
        this.f14467a = myVar;
        this.f14468b = future;
    }

    public final void run() {
        C3751my myVar = this.f14467a;
        Future future = this.f14468b;
        if (myVar.isCancelled()) {
            future.cancel(true);
        }
    }
}

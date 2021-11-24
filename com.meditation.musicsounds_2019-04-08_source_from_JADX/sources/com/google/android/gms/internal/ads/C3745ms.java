package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.ms */
final /* synthetic */ class C3745ms implements Runnable {

    /* renamed from: a */
    private final Future f14459a;

    C3745ms(Future future) {
        this.f14459a = future;
    }

    public final void run() {
        Future future = this.f14459a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nb */
final /* synthetic */ class C3755nb implements Runnable {

    /* renamed from: a */
    private final Executor f14478a;

    /* renamed from: b */
    private final Runnable f14479b;

    C3755nb(Executor executor, Runnable runnable) {
        this.f14478a = executor;
        this.f14479b = runnable;
    }

    public final void run() {
        this.f14478a.execute(this.f14479b);
    }
}

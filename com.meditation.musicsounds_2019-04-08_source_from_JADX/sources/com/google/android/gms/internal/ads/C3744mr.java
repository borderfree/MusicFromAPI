package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.mr */
final /* synthetic */ class C3744mr implements Runnable {

    /* renamed from: a */
    private final C3763nj f14458a;

    C3744mr(C3763nj njVar) {
        this.f14458a = njVar;
    }

    public final void run() {
        this.f14458a.mo13295a(new TimeoutException());
    }
}

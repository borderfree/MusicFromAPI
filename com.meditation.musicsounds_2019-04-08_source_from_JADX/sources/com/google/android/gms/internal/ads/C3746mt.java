package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mt */
final /* synthetic */ class C3746mt implements Runnable {

    /* renamed from: a */
    private final C3763nj f14460a;

    /* renamed from: b */
    private final C3751my f14461b;

    /* renamed from: c */
    private final Class f14462c;

    /* renamed from: d */
    private final C3735mi f14463d;

    /* renamed from: e */
    private final Executor f14464e;

    C3746mt(C3763nj njVar, C3751my myVar, Class cls, C3735mi miVar, Executor executor) {
        this.f14460a = njVar;
        this.f14461b = myVar;
        this.f14462c = cls;
        this.f14463d = miVar;
        this.f14464e = executor;
    }

    public final void run() {
        C3740mn.m19202a(this.f14460a, this.f14461b, this.f14462c, this.f14463d, this.f14464e);
    }
}

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3758ne;

/* renamed from: com.google.android.gms.ads.internal.o */
final /* synthetic */ class C2908o implements Runnable {

    /* renamed from: a */
    private final zzay f10044a;

    /* renamed from: b */
    private final Runnable f10045b;

    C2908o(zzay zzay, Runnable runnable) {
        this.f10044a = zzay;
        this.f10045b = runnable;
    }

    public final void run() {
        C3758ne.f14481a.execute(new C2916q(this.f10044a, this.f10045b));
    }
}

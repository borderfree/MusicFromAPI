package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jj */
final class C3655jj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f14286a;

    /* renamed from: b */
    private final /* synthetic */ C3653jh f14287b;

    C3655jj(C3653jh jhVar, Context context) {
        this.f14287b = jhVar;
        this.f14286a = context;
    }

    public final void run() {
        synchronized (this.f14287b.f14276b) {
            this.f14287b.f14278d = C3653jh.m18900d(this.f14286a);
            this.f14287b.f14276b.notifyAll();
        }
    }
}

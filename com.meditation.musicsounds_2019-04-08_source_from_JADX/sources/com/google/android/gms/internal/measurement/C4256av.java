package com.google.android.gms.internal.measurement;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.measurement.av */
final class C4256av implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4255au f15735a;

    C4256av(C4255au auVar) {
        this.f15735a = auVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f15735a.f15732a.mo14848g().mo10647a((Runnable) this);
            return;
        }
        boolean c = this.f15735a.mo14154c();
        this.f15735a.f15734d = 0;
        if (c) {
            this.f15735a.mo14133a();
        }
    }
}

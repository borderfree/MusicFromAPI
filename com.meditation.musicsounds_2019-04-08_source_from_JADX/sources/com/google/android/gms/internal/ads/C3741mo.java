package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.mo */
final /* synthetic */ class C3741mo implements Runnable {

    /* renamed from: a */
    private final C3737mk f14450a;

    /* renamed from: b */
    private final C3751my f14451b;

    C3741mo(C3737mk mkVar, C3751my myVar) {
        this.f14450a = mkVar;
        this.f14451b = myVar;
    }

    public final void run() {
        Throwable e;
        C3737mk mkVar = this.f14450a;
        try {
            mkVar.mo12828a(this.f14451b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            mkVar.mo12829a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            mkVar.mo12829a(e);
        } catch (Exception e4) {
            e = e4;
            mkVar.mo12829a(e);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.mu */
final /* synthetic */ class C3747mu implements Runnable {

    /* renamed from: a */
    private final C3763nj f14465a;

    /* renamed from: b */
    private final C3751my f14466b;

    C3747mu(C3763nj njVar, C3751my myVar) {
        this.f14465a = njVar;
        this.f14466b = myVar;
    }

    public final void run() {
        Throwable e;
        C3763nj njVar = this.f14465a;
        try {
            njVar.mo13296b(this.f14466b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            njVar.mo13295a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            njVar.mo13295a(e);
        } catch (Exception e4) {
            njVar.mo13295a(e4);
        }
    }
}

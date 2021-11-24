package com.google.android.gms.internal.ads;

final class ahc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ auc f12024a;

    /* renamed from: b */
    private final /* synthetic */ agb f12025b;

    ahc(agb agb, auc auc) {
        this.f12025b = agb;
        this.f12024a = auc;
    }

    public final void run() {
        try {
            this.f12025b.f11955c.put(this.f12024a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ai */
final class C3407ai implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3406ah f12091a;

    C3407ai(C3406ah ahVar) {
        this.f12091a = ahVar;
    }

    public final void run() {
        if (this.f12091a.f12021h.get()) {
            C3643iy.m19174c("Timed out waiting for WebView to finish loading.");
            this.f12091a.mo11912b();
        }
    }
}

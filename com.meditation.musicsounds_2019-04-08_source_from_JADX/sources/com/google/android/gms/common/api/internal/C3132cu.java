package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cu */
final class C3132cu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f10839a;

    /* renamed from: b */
    private final /* synthetic */ String f10840b;

    /* renamed from: c */
    private final /* synthetic */ C3131ct f10841c;

    C3132cu(C3131ct ctVar, LifecycleCallback lifecycleCallback, String str) {
        this.f10841c = ctVar;
        this.f10839a = lifecycleCallback;
        this.f10840b = str;
    }

    public final void run() {
        if (this.f10841c.f10837c > 0) {
            this.f10839a.mo10886a(this.f10841c.f10838d != null ? this.f10841c.f10838d.getBundle(this.f10840b) : null);
        }
        if (this.f10841c.f10837c >= 2) {
            this.f10839a.mo10888b();
        }
        if (this.f10841c.f10837c >= 3) {
            this.f10839a.mo10890c();
        }
        if (this.f10841c.f10837c >= 4) {
            this.f10839a.mo10891d();
        }
        if (this.f10841c.f10837c >= 5) {
            this.f10839a.mo10892e();
        }
    }
}

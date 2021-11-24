package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cw */
final class C3134cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f10846a;

    /* renamed from: b */
    private final /* synthetic */ String f10847b;

    /* renamed from: c */
    private final /* synthetic */ C3133cv f10848c;

    C3134cw(C3133cv cvVar, LifecycleCallback lifecycleCallback, String str) {
        this.f10848c = cvVar;
        this.f10846a = lifecycleCallback;
        this.f10847b = str;
    }

    public final void run() {
        if (this.f10848c.f10844c > 0) {
            this.f10846a.mo10886a(this.f10848c.f10845d != null ? this.f10848c.f10845d.getBundle(this.f10847b) : null);
        }
        if (this.f10848c.f10844c >= 2) {
            this.f10846a.mo10888b();
        }
        if (this.f10848c.f10844c >= 3) {
            this.f10846a.mo10890c();
        }
        if (this.f10848c.f10844c >= 4) {
            this.f10846a.mo10891d();
        }
        if (this.f10848c.f10844c >= 5) {
            this.f10846a.mo10892e();
        }
    }
}

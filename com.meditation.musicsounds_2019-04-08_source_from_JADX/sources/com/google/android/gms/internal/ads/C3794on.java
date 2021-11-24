package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.on */
final class C3794on implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f14558a;

    /* renamed from: b */
    private final /* synthetic */ C3790oj f14559b;

    C3794on(C3790oj ojVar, boolean z) {
        this.f14559b = ojVar;
        this.f14558a = z;
    }

    public final void run() {
        this.f14559b.m19288a("windowVisibilityChanged", "isVisible", String.valueOf(this.f14558a));
    }
}

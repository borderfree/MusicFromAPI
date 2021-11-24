package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qp */
final /* synthetic */ class C3850qp implements Runnable {

    /* renamed from: a */
    private final C3848qn f14798a;

    /* renamed from: b */
    private final int f14799b;

    /* renamed from: c */
    private final int f14800c;

    /* renamed from: d */
    private final boolean f14801d;

    /* renamed from: e */
    private final boolean f14802e;

    C3850qp(C3848qn qnVar, int i, int i2, boolean z, boolean z2) {
        this.f14798a = qnVar;
        this.f14799b = i;
        this.f14800c = i2;
        this.f14801d = z;
        this.f14802e = z2;
    }

    public final void run() {
        this.f14798a.mo13594a(this.f14799b, this.f14800c, this.f14801d, this.f14802e);
    }
}

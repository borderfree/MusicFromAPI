package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oc */
final class C3783oc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f14531a;

    /* renamed from: b */
    private final /* synthetic */ int f14532b;

    /* renamed from: c */
    private final /* synthetic */ C3775nv f14533c;

    C3783oc(C3775nv nvVar, int i, int i2) {
        this.f14533c = nvVar;
        this.f14531a = i;
        this.f14532b = i2;
    }

    public final void run() {
        if (this.f14533c.f14518r != null) {
            this.f14533c.f14518r.mo13354a(this.f14531a, this.f14532b);
        }
    }
}

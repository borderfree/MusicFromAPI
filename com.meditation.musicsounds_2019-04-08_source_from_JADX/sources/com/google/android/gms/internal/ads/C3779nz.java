package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nz */
final class C3779nz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f14523a;

    /* renamed from: b */
    private final /* synthetic */ String f14524b;

    /* renamed from: c */
    private final /* synthetic */ C3775nv f14525c;

    C3779nz(C3775nv nvVar, String str, String str2) {
        this.f14525c = nvVar;
        this.f14523a = str;
        this.f14524b = str2;
    }

    public final void run() {
        if (this.f14525c.f14518r != null) {
            this.f14525c.f14518r.mo13355a(this.f14523a, this.f14524b);
        }
    }
}

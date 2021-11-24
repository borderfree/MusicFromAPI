package com.google.android.gms.ads.internal;

/* renamed from: com.google.android.gms.ads.internal.ah */
final /* synthetic */ class C2859ah implements Runnable {

    /* renamed from: a */
    private final zzbl f9943a;

    private C2859ah(zzbl zzbl) {
        this.f9943a = zzbl;
    }

    /* renamed from: a */
    static Runnable m13543a(zzbl zzbl) {
        return new C2859ah(zzbl);
    }

    public final void run() {
        this.f9943a.resume();
    }
}

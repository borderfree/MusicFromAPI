package com.google.android.gms.ads.internal;

/* renamed from: com.google.android.gms.ads.internal.ag */
final /* synthetic */ class C2858ag implements Runnable {

    /* renamed from: a */
    private final zzbl f9942a;

    private C2858ag(zzbl zzbl) {
        this.f9942a = zzbl;
    }

    /* renamed from: a */
    static Runnable m13542a(zzbl zzbl) {
        return new C2858ag(zzbl);
    }

    public final void run() {
        this.f9942a.pause();
    }
}

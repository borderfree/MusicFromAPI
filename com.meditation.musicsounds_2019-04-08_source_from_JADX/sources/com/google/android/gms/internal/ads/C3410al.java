package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.al */
final class C3410al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3622id f12281a;

    /* renamed from: b */
    private final /* synthetic */ C3408aj f12282b;

    C3410al(C3408aj ajVar, C3622id idVar) {
        this.f12282b = ajVar;
        this.f12281a = idVar;
    }

    public final void run() {
        synchronized (this.f12282b.f12162c) {
            C3408aj ajVar = this.f12282b;
            ajVar.f12160a.zzb(this.f12281a);
        }
    }
}

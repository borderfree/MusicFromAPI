package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fp */
final class C3553fp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3623ie f14001a;

    /* renamed from: b */
    private final /* synthetic */ C3551fn f14002b;

    C3553fp(C3551fn fnVar, C3623ie ieVar) {
        this.f14002b = fnVar;
        this.f14001a = ieVar;
    }

    public final void run() {
        C3551fn fnVar = this.f14002b;
        C3622id idVar = new C3622id(this.f14001a, null, null, null, null, null, null, null);
        fnVar.zzb(idVar);
    }
}

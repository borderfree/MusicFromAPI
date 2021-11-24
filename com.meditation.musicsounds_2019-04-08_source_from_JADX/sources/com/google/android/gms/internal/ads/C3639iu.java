package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iu */
final class C3639iu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3638it f14240a;

    C3639iu(C3638it itVar) {
        this.f14240a = itVar;
    }

    public final void run() {
        this.f14240a.f14238b = Thread.currentThread();
        this.f14240a.mo10051a();
    }
}

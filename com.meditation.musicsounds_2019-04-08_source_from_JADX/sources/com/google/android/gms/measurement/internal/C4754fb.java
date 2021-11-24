package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fb */
final class C4754fb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4663bt f17109a;

    /* renamed from: b */
    private final /* synthetic */ C4753fa f17110b;

    C4754fb(C4753fa faVar, C4663bt btVar) {
        this.f17110b = faVar;
        this.f17109a = btVar;
    }

    public final void run() {
        this.f17109a.mo15256u();
        if (C4742eq.m23658a()) {
            this.f17109a.mo15252q().mo15314a((Runnable) this);
            return;
        }
        boolean b = this.f17110b.mo15814b();
        this.f17110b.f17108d = 0;
        if (b) {
            this.f17110b.mo15469a();
        }
    }
}

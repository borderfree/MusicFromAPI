package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cr */
final class C4688cr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4684cn f16902a;

    /* renamed from: b */
    private final /* synthetic */ C4685co f16903b;

    C4688cr(C4685co coVar, C4684cn cnVar) {
        this.f16903b = coVar;
        this.f16902a = cnVar;
    }

    public final void run() {
        this.f16903b.m23214a(this.f16902a, false);
        this.f16903b.f16892a = null;
        this.f16903b.mo15243h().mo15457a((C4684cn) null);
    }
}

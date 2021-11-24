package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m */
final class C4491m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f16353a;

    /* renamed from: b */
    private final /* synthetic */ C4490l f16354b;

    C4491m(C4490l lVar, int i) {
        this.f16354b = lVar;
        this.f16353a = i;
    }

    public final void run() {
        this.f16354b.f16352a.mo14123a(((long) this.f16353a) * 1000);
    }
}

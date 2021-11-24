package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.do */
final class C4712do implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4726eb f16981a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f16982b;

    C4712do(C4708dk dkVar, C4726eb ebVar, Runnable runnable) {
        this.f16981a = ebVar;
        this.f16982b = runnable;
    }

    public final void run() {
        this.f16981a.mo15555l();
        this.f16981a.mo15536a(this.f16982b);
        this.f16981a.mo15554k();
    }
}

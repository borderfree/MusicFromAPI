package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o */
final class C4493o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f16357a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f16358b;

    /* renamed from: c */
    private final /* synthetic */ C4490l f16359c;

    C4493o(C4490l lVar, String str, Runnable runnable) {
        this.f16359c = lVar;
        this.f16357a = str;
        this.f16358b = runnable;
    }

    public final void run() {
        this.f16359c.f16352a.mo14127a(this.f16357a);
        if (this.f16358b != null) {
            this.f16358b.run();
        }
    }
}

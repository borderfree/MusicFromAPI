package com.google.android.gms.internal.measurement;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.measurement.v */
final class C4500v implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ C4499u f16384a;

    C4500v(C4499u uVar) {
        this.f16384a = uVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C4272bk f = this.f16384a.mo14847f();
        if (f != null) {
            f.mo14822e("Job execution failed", th);
        }
    }
}

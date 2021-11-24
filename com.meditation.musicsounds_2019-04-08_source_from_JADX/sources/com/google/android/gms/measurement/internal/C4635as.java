package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3266s;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.as */
final class C4635as implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f16718a;

    /* renamed from: b */
    private final /* synthetic */ C4634ar f16719b;

    public C4635as(C4634ar arVar, String str) {
        this.f16719b = arVar;
        C3266s.m14913a(str);
        this.f16718a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f16719b.mo15253r().mo15852u_().mo15859a(this.f16718a, th);
    }
}

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ch */
final class C4678ch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f16874a;

    /* renamed from: b */
    private final /* synthetic */ String f16875b;

    /* renamed from: c */
    private final /* synthetic */ String f16876c;

    /* renamed from: d */
    private final /* synthetic */ String f16877d;

    /* renamed from: e */
    private final /* synthetic */ C4672cb f16878e;

    C4678ch(C4672cb cbVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f16878e = cbVar;
        this.f16874a = atomicReference;
        this.f16875b = str;
        this.f16876c = str2;
        this.f16877d = str3;
    }

    public final void run() {
        this.f16878e.f16825q.mo15352x().mo15464a(this.f16874a, this.f16875b, this.f16876c, this.f16877d);
    }
}

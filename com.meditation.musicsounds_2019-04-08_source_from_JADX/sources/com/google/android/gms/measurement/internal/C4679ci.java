package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ci */
final class C4679ci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f16879a;

    /* renamed from: b */
    private final /* synthetic */ String f16880b;

    /* renamed from: c */
    private final /* synthetic */ String f16881c;

    /* renamed from: d */
    private final /* synthetic */ String f16882d;

    /* renamed from: e */
    private final /* synthetic */ boolean f16883e;

    /* renamed from: f */
    private final /* synthetic */ C4672cb f16884f;

    C4679ci(C4672cb cbVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f16884f = cbVar;
        this.f16879a = atomicReference;
        this.f16880b = str;
        this.f16881c = str2;
        this.f16882d = str3;
        this.f16883e = z;
    }

    public final void run() {
        this.f16884f.f16825q.mo15352x().mo15465a(this.f16879a, this.f16880b, this.f16881c, this.f16882d, this.f16883e);
    }
}

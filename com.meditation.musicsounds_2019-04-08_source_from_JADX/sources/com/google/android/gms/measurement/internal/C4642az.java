package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.az */
final class C4642az implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f16767a;

    /* renamed from: b */
    private final /* synthetic */ long f16768b;

    /* renamed from: c */
    private final /* synthetic */ C4616a f16769c;

    C4642az(C4616a aVar, String str, long j) {
        this.f16769c = aVar;
        this.f16767a = str;
        this.f16768b = j;
    }

    public final void run() {
        this.f16769c.m22902d(this.f16767a, this.f16768b);
    }
}

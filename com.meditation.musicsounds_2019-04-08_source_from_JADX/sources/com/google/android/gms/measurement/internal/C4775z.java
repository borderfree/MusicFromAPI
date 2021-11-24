package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z */
final class C4775z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f17248a;

    /* renamed from: b */
    private final /* synthetic */ long f17249b;

    /* renamed from: c */
    private final /* synthetic */ C4616a f17250c;

    C4775z(C4616a aVar, String str, long j) {
        this.f17250c = aVar;
        this.f17248a = str;
        this.f17249b = j;
    }

    public final void run() {
        this.f17250c.m22901c(this.f17248a, this.f17249b);
    }
}

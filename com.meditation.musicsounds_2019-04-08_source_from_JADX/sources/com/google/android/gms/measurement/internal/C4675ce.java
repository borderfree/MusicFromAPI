package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ce */
final class C4675ce implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f16865a;

    /* renamed from: b */
    private final /* synthetic */ String f16866b;

    /* renamed from: c */
    private final /* synthetic */ Object f16867c;

    /* renamed from: d */
    private final /* synthetic */ long f16868d;

    /* renamed from: e */
    private final /* synthetic */ C4672cb f16869e;

    C4675ce(C4672cb cbVar, String str, String str2, Object obj, long j) {
        this.f16869e = cbVar;
        this.f16865a = str;
        this.f16866b = str2;
        this.f16867c = obj;
        this.f16868d = j;
    }

    public final void run() {
        this.f16869e.mo15415a(this.f16865a, this.f16866b, this.f16867c, this.f16868d);
    }
}

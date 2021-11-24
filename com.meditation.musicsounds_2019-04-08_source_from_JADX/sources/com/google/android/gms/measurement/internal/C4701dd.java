package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dd */
final class C4701dd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f16957a;

    /* renamed from: b */
    private final /* synthetic */ zzfv f16958b;

    /* renamed from: c */
    private final /* synthetic */ zzk f16959c;

    /* renamed from: d */
    private final /* synthetic */ C4689cs f16960d;

    C4701dd(C4689cs csVar, boolean z, zzfv zzfv, zzk zzk) {
        this.f16960d = csVar;
        this.f16957a = z;
        this.f16958b = zzfv;
        this.f16959c = zzk;
    }

    public final void run() {
        C4758i d = this.f16960d.f16905b;
        if (d == null) {
            this.f16960d.mo15253r().mo15852u_().mo15858a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f16960d.mo15459a(d, this.f16957a ? null : this.f16958b, this.f16959c);
        this.f16960d.m23260I();
    }
}

package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bq */
final class C4660bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f16820a;

    /* renamed from: b */
    private final /* synthetic */ String f16821b;

    /* renamed from: c */
    private final /* synthetic */ String f16822c;

    /* renamed from: d */
    private final /* synthetic */ long f16823d;

    /* renamed from: e */
    private final /* synthetic */ C4640ax f16824e;

    C4660bq(C4640ax axVar, String str, String str2, String str3, long j) {
        this.f16824e = axVar;
        this.f16820a = str;
        this.f16821b = str2;
        this.f16822c = str3;
        this.f16823d = j;
    }

    public final void run() {
        if (this.f16820a == null) {
            this.f16824e.f16762a.mo15557p().mo15351w().mo15446a(this.f16821b, (C4684cn) null);
            return;
        }
        this.f16824e.f16762a.mo15557p().mo15351w().mo15446a(this.f16821b, new C4684cn(this.f16822c, this.f16820a, this.f16823d));
    }
}

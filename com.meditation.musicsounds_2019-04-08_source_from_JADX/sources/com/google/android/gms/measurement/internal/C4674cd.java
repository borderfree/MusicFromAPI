package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cd */
final class C4674cd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f16856a;

    /* renamed from: b */
    private final /* synthetic */ String f16857b;

    /* renamed from: c */
    private final /* synthetic */ long f16858c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f16859d;

    /* renamed from: e */
    private final /* synthetic */ boolean f16860e;

    /* renamed from: f */
    private final /* synthetic */ boolean f16861f;

    /* renamed from: g */
    private final /* synthetic */ boolean f16862g;

    /* renamed from: h */
    private final /* synthetic */ String f16863h;

    /* renamed from: i */
    private final /* synthetic */ C4672cb f16864i;

    C4674cd(C4672cb cbVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f16864i = cbVar;
        this.f16856a = str;
        this.f16857b = str2;
        this.f16858c = j;
        this.f16859d = bundle;
        this.f16860e = z;
        this.f16861f = z2;
        this.f16862g = z3;
        this.f16863h = str3;
    }

    public final void run() {
        this.f16864i.m23152a(this.f16856a, this.f16857b, this.f16858c, this.f16859d, this.f16860e, this.f16861f, this.f16862g, this.f16863h);
    }
}

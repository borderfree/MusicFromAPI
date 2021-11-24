package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.cf */
final class C4676cf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f16870a;

    /* renamed from: b */
    private final /* synthetic */ C4672cb f16871b;

    C4676cf(C4672cb cbVar, ConditionalUserProperty conditionalUserProperty) {
        this.f16871b = cbVar;
        this.f16870a = conditionalUserProperty;
    }

    public final void run() {
        this.f16871b.m23160d(this.f16870a);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.cg */
final class C4677cg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f16872a;

    /* renamed from: b */
    private final /* synthetic */ C4672cb f16873b;

    C4677cg(C4672cb cbVar, ConditionalUserProperty conditionalUserProperty) {
        this.f16873b = cbVar;
        this.f16872a = conditionalUserProperty;
    }

    public final void run() {
        this.f16873b.m23161e(this.f16872a);
    }
}

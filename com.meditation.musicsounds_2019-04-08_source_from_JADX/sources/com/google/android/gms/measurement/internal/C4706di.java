package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.di */
final class C4706di implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4702de f16970a;

    C4706di(C4702de deVar) {
        this.f16970a = deVar;
    }

    public final void run() {
        C4689cs csVar = this.f16970a.f16961a;
        Context n = this.f16970a.f16961a.mo15249n();
        this.f16970a.f16961a.mo15256u();
        csVar.m23266a(new ComponentName(n, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

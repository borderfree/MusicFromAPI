package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.dg */
final class C4704dg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f16966a;

    /* renamed from: b */
    private final /* synthetic */ C4702de f16967b;

    C4704dg(C4702de deVar, ComponentName componentName) {
        this.f16967b = deVar;
        this.f16966a = componentName;
    }

    public final void run() {
        this.f16967b.f16961a.m23266a(this.f16966a);
    }
}

package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.measurement.ac */
final class C4237ac implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f15697a;

    /* renamed from: b */
    private final /* synthetic */ C4235aa f15698b;

    C4237ac(C4235aa aaVar, ComponentName componentName) {
        this.f15698b = aaVar;
        this.f15697a = componentName;
    }

    public final void run() {
        this.f15698b.f15692a.m22374a(this.f15697a);
    }
}

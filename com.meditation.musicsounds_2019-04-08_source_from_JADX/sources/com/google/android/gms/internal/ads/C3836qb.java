package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.qb */
final class C3836qb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f14710a;

    /* renamed from: b */
    private final /* synthetic */ C3606ho f14711b;

    /* renamed from: c */
    private final /* synthetic */ int f14712c;

    /* renamed from: d */
    private final /* synthetic */ C3833pz f14713d;

    C3836qb(C3833pz pzVar, View view, C3606ho hoVar, int i) {
        this.f14713d = pzVar;
        this.f14710a = view;
        this.f14711b = hoVar;
        this.f14712c = i;
    }

    public final void run() {
        this.f14713d.m19450a(this.f14710a, this.f14711b, this.f14712c - 1);
    }
}

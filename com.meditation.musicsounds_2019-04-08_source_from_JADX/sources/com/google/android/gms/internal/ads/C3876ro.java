package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ro */
final class C3876ro implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f14844a;

    /* renamed from: b */
    private final /* synthetic */ C3606ho f14845b;

    /* renamed from: c */
    private final /* synthetic */ int f14846c;

    /* renamed from: d */
    private final /* synthetic */ C3874rm f14847d;

    C3876ro(C3874rm rmVar, View view, C3606ho hoVar, int i) {
        this.f14847d = rmVar;
        this.f14844a = view;
        this.f14845b = hoVar;
        this.f14846c = i;
    }

    public final void run() {
        this.f14847d.m19698a(this.f14844a, this.f14845b, this.f14846c - 1);
    }
}

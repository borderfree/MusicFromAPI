package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: com.google.android.gms.internal.ads.rp */
final class C3877rp implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C3606ho f14848a;

    /* renamed from: b */
    private final /* synthetic */ C3874rm f14849b;

    C3877rp(C3874rm rmVar, C3606ho hoVar) {
        this.f14849b = rmVar;
        this.f14848a = hoVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f14849b.m19698a(view, this.f14848a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

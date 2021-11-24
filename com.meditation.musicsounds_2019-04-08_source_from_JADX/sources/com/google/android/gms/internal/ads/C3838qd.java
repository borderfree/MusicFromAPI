package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: com.google.android.gms.internal.ads.qd */
final class C3838qd implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C3606ho f14714a;

    /* renamed from: b */
    private final /* synthetic */ C3833pz f14715b;

    C3838qd(C3833pz pzVar, C3606ho hoVar) {
        this.f14715b = pzVar;
        this.f14714a = hoVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f14715b.m19450a(view, this.f14714a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

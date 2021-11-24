package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bl */
final class C3440bl implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f13620a;

    /* renamed from: b */
    private final /* synthetic */ C3434bf f13621b;

    C3440bl(C3434bf bfVar, WeakReference weakReference) {
        this.f13621b = bfVar;
        this.f13620a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f13621b.m18196a(this.f13620a, false);
    }
}

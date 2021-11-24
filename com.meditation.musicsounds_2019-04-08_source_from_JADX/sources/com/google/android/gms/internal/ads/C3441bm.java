package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bm */
final class C3441bm implements OnScrollChangedListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f13622a;

    /* renamed from: b */
    private final /* synthetic */ C3434bf f13623b;

    C3441bm(C3434bf bfVar, WeakReference weakReference) {
        this.f13623b = bfVar;
        this.f13622a = weakReference;
    }

    public final void onScrollChanged() {
        this.f13623b.m18196a(this.f13622a, true);
    }
}

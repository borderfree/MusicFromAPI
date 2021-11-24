package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.nu */
abstract class C3774nu {

    /* renamed from: a */
    private final WeakReference<View> f14502a;

    public C3774nu(View view) {
        this.f14502a = new WeakReference<>(view);
    }

    /* renamed from: c */
    private final ViewTreeObserver m19234c() {
        View view = (View) this.f14502a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: a */
    public final void mo13309a() {
        ViewTreeObserver c = m19234c();
        if (c != null) {
            mo13305a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13305a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void mo13310b() {
        ViewTreeObserver c = m19234c();
        if (c != null) {
            mo13306b(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13306b(ViewTreeObserver viewTreeObserver);
}

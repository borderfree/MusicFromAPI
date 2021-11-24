package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.nt */
final class C3773nt extends C3774nu implements OnScrollChangedListener {

    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f14501a;

    public C3773nt(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f14501a = new WeakReference<>(onScrollChangedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13305a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13306b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f14501a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            mo13310b();
        }
    }
}

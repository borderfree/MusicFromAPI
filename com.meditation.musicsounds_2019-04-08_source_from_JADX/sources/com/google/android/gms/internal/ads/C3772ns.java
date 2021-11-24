package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ns */
final class C3772ns extends C3774nu implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f14500a;

    public C3772ns(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f14500a = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13305a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13306b(ViewTreeObserver viewTreeObserver) {
        zzbv.zzem().mo13151a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f14500a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo13310b();
        }
    }
}

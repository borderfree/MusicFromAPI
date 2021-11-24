package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebSettings;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.jv */
public class C3667jv extends C3664js {
    /* renamed from: a */
    public final void mo13150a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public final void mo13151a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo13153a(Context context, WebSettings webSettings) {
        super.mo13153a(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}

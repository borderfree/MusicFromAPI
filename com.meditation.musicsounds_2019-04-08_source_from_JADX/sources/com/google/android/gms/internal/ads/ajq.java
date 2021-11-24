package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class ajq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aji f12224a;

    /* renamed from: b */
    final /* synthetic */ WebView f12225b;

    /* renamed from: c */
    final /* synthetic */ boolean f12226c;

    /* renamed from: d */
    final /* synthetic */ ajo f12227d;

    /* renamed from: e */
    private ValueCallback<String> f12228e = new ajr(this);

    ajq(ajo ajo, aji aji, WebView webView, boolean z) {
        this.f12227d = ajo;
        this.f12224a = aji;
        this.f12225b = webView;
        this.f12226c = z;
    }

    public final void run() {
        if (this.f12225b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f12225b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f12228e);
            } catch (Throwable unused) {
                this.f12228e.onReceiveValue("");
            }
        }
    }
}

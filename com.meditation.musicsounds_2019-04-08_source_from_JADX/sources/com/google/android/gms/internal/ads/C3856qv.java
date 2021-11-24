package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.qv */
public final class C3856qv extends C3857qw {
    public C3856qv(C3832py pyVar, boolean z) {
        super(pyVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo13599a(webView, str, null);
    }
}

package com.p032a.p033a;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.a.a.c */
public final class C1137c extends WebViewClient {
    @SuppressLint({"NewApi"})
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            String host = Uri.parse(str).getHost();
            String host2 = Uri.parse(C1134a.f4062c).getHost();
            return host == null || host2 == null || !host.equals(host2);
        } catch (Exception unused) {
            return true;
        }
    }
}

package com.seattleclouds.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import com.seattleclouds.App;

/* renamed from: com.seattleclouds.util.at */
public class C6602at {
    /* renamed from: a */
    private static int m31949a(Context context) {
        return Double.valueOf(Double.valueOf(Double.valueOf((double) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth()).doubleValue() / Double.valueOf(320.0d).doubleValue()).doubleValue() * 100.0d).intValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(16)
    /* renamed from: a */
    public static void m31950a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        StringBuilder sb = new StringBuilder();
        sb.append("/data/data/");
        sb.append(webView.getContext().getPackageName());
        sb.append("/databases/");
        settings.setDatabasePath(sb.toString());
        settings.setGeolocationEnabled(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setCacheMode(2);
        webView.clearCache(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        if (VERSION.SDK_INT >= 11) {
            settings.setDisplayZoomControls(false);
        }
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        if (App.f18501c.mo16905G()) {
            webView.setInitialScale(m31949a(webView.getContext()));
            settings.setUseWideViewPort(false);
        }
        webView.setVerticalScrollbarOverlay(true);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static void m31951a(WebView webView, String str) {
        if (C6619m.m32019b()) {
            webView.evaluateJavascript(str, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(str);
        webView.loadUrl(sb.toString());
    }
}

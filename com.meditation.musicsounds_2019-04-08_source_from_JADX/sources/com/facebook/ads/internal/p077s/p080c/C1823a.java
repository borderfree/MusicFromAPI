package com.facebook.ads.internal.p077s.p080c;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.facebook.ads.internal.s.c.a */
public abstract class C1823a extends WebView {

    /* renamed from: a */
    private static final String f5961a = "a";

    /* renamed from: b */
    private boolean f5962b;

    public C1823a(Context context) {
        super(context);
        mo7192d();
    }

    /* renamed from: d */
    private void mo7192d() {
        setWebChromeClient(mo7091a());
        setWebViewClient(mo7092b());
        C1824b.m8970b(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (Exception unused) {
                Log.w(f5961a, "Failed to initialize CookieManager.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebChromeClient mo7091a() {
        return new WebChromeClient();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebViewClient mo7092b() {
        return new WebViewClient();
    }

    /* renamed from: c */
    public boolean mo7093c() {
        return this.f5962b;
    }

    public void destroy() {
        this.f5962b = true;
        super.destroy();
    }
}

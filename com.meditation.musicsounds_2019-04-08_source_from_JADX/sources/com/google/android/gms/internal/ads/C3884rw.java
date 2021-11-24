package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rw */
final class C3884rw extends WebViewClient {

    /* renamed from: a */
    private final C3889sa f14905a;

    /* renamed from: b */
    private final C3894sf f14906b;

    /* renamed from: c */
    private final C3891sc f14907c;

    /* renamed from: d */
    private final C3893se f14908d;

    /* renamed from: e */
    private final C3895sg f14909e = new C3895sg();

    C3884rw(C3889sa saVar, C3894sf sfVar, C3891sc scVar, C3893se seVar) {
        this.f14905a = saVar;
        this.f14906b = sfVar;
        this.f14907c = scVar;
        this.f14908d = seVar;
    }

    /* renamed from: a */
    private final boolean m19820a(C3885rx rxVar) {
        return this.f14905a.mo12603c(rxVar);
    }

    /* renamed from: b */
    private final WebResourceResponse m19821b(C3885rx rxVar) {
        return this.f14906b.mo13617d(rxVar);
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String str2 = "Loading resource: ";
            String valueOf = String.valueOf(str);
            C3643iy.m18780a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f14907c.mo12604b(new C3885rx(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            this.f14908d.mo12607a(new C3885rx(str));
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f14909e.mo13663a(i, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f14909e.mo13664a(sslError);
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m19821b(new C3885rx(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return m19821b(new C3885rx(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return m19820a(new C3885rx(webResourceRequest));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return m19820a(new C3885rx(str));
    }
}

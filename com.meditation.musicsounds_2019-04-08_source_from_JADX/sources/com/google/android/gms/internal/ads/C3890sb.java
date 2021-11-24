package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.C3309n;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.sb */
final class C3890sb {
    @GuardedBy("InvokeJavascriptWorkaround.class")

    /* renamed from: a */
    private static Boolean f14917a;

    private C3890sb() {
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m19829a(WebView webView, String str) {
        if (!C3309n.m15075g() || !m19830a(webView)) {
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m19830a(WebView webView) {
        boolean booleanValue;
        synchronized (C3890sb.class) {
            if (f14917a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f14917a = Boolean.valueOf(true);
                } catch (IllegalStateException unused) {
                    f14917a = Boolean.valueOf(false);
                }
            }
            booleanValue = f14917a.booleanValue();
        }
        return booleanValue;
    }
}

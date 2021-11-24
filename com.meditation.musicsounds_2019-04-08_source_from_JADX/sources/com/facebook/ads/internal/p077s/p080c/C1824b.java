package com.facebook.ads.internal.p077s.p080c;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.internal.settings.C1837b;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.s.c.b */
public class C1824b {
    /* renamed from: a */
    public static String m8968a() {
        String b = C1837b.m9007b();
        if (TextUtils.isEmpty(b)) {
            return "https://www.facebook.com/";
        }
        return String.format(Locale.US, "https://www.%s.facebook.com", new Object[]{b});
    }

    /* renamed from: a */
    public static void m8969a(WebView webView) {
        webView.loadUrl("about:blank");
        webView.clearCache(true);
    }

    @TargetApi(21)
    /* renamed from: b */
    public static void m8970b(WebView webView) {
        WebSettings settings = webView.getSettings();
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
            return;
        }
        try {
            WebSettings.class.getMethod("setMixedContentMode", new Class[0]).invoke(settings, new Object[]{Integer.valueOf(0)});
        } catch (Exception unused) {
        }
    }
}

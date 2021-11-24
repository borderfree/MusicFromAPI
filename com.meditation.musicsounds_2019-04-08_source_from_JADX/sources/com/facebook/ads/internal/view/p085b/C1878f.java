package com.facebook.ads.internal.view.p085b;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p077s.p080c.C1823a;
import com.facebook.ads.internal.p077s.p080c.C1824b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.f */
public class C1878f extends C1823a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6180a = "f";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Set<String> f6181b = new HashSet(2);

    /* renamed from: c */
    private C1879a f6182c;

    /* renamed from: d */
    private C1876d f6183d;

    /* renamed from: e */
    private long f6184e = -1;

    /* renamed from: f */
    private long f6185f = -1;

    /* renamed from: g */
    private long f6186g = -1;

    /* renamed from: h */
    private long f6187h = -1;

    /* renamed from: com.facebook.ads.internal.view.b.f$a */
    public interface C1879a {
        /* renamed from: a */
        void mo7146a(int i);

        /* renamed from: a */
        void mo7147a(String str);

        /* renamed from: b */
        void mo7148b(String str);

        /* renamed from: c */
        void mo7149c(String str);
    }

    /* renamed from: com.facebook.ads.internal.view.b.f$b */
    static class C1880b extends WebChromeClient {

        /* renamed from: a */
        private final WeakReference<C1879a> f6188a;

        /* renamed from: b */
        private final WeakReference<C1876d> f6189b;

        C1880b(WeakReference<C1879a> weakReference, WeakReference<C1876d> weakReference2) {
            this.f6188a = weakReference;
            this.f6189b = weakReference2;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == MessageLevel.LOG && this.f6189b.get() != null) {
                ((C1876d) this.f6189b.get()).mo7169a(message);
            }
            return true;
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (this.f6189b.get() != null) {
                ((C1876d) this.f6189b.get()).mo7168a();
            }
            if (this.f6188a.get() != null) {
                ((C1879a) this.f6188a.get()).mo7146a(i);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (this.f6188a.get() != null) {
                ((C1879a) this.f6188a.get()).mo7148b(str);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.f$c */
    static class C1881c extends WebViewClient {

        /* renamed from: a */
        private final WeakReference<C1879a> f6190a;

        /* renamed from: b */
        private final WeakReference<Context> f6191b;

        C1881c(WeakReference<C1879a> weakReference, WeakReference<Context> weakReference2) {
            this.f6190a = weakReference;
            this.f6191b = weakReference2;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f6190a.get() != null) {
                ((C1879a) this.f6190a.get()).mo7149c(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f6190a.get() != null) {
                ((C1879a) this.f6190a.get()).mo7147a(str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            if (!C1878f.f6181b.contains(parse.getScheme()) && this.f6191b.get() != null) {
                try {
                    ((Context) this.f6191b.get()).startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.w(C1878f.f6180a, "Activity not found to handle URI.", e);
                } catch (Exception e2) {
                    Log.e(C1878f.f6180a, "Unknown exception occurred when trying to handle URI.", e2);
                }
            }
            return false;
        }
    }

    static {
        f6181b.add("http");
        f6181b.add("https");
    }

    public C1878f(Context context) {
        super(context);
        m9154f();
    }

    /* renamed from: f */
    private void m9154f() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.f6183d = new C1876d(this);
    }

    /* renamed from: g */
    private void m9155g() {
        if (this.f6185f > -1 && this.f6186g > -1 && this.f6187h > -1) {
            this.f6183d.mo7170a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebChromeClient mo7091a() {
        return new C1880b(new WeakReference(this.f6182c), new WeakReference(this.f6183d));
    }

    /* renamed from: a */
    public void mo7173a(long j) {
        if (this.f6184e < 0) {
            this.f6184e = j;
        }
    }

    /* renamed from: a */
    public void mo7174a(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append(str);
            loadUrl(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebViewClient mo7092b() {
        return new C1881c(new WeakReference(this.f6182c), new WeakReference(getContext()));
    }

    /* renamed from: b */
    public void mo7175b(long j) {
        if (this.f6185f < 0) {
            this.f6185f = j;
        }
        m9155g();
    }

    /* renamed from: c */
    public void mo7176c(long j) {
        if (this.f6187h < 0) {
            this.f6187h = j;
        }
        m9155g();
    }

    public void destroy() {
        this.f6182c = null;
        C1824b.m8969a(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.f6185f;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        return copyBackForwardList.getSize() > 0 ? copyBackForwardList.getItemAtIndex(0).getUrl() : getUrl();
    }

    public long getLoadFinishMs() {
        return this.f6187h;
    }

    public long getResponseEndMs() {
        return this.f6184e;
    }

    public long getScrollReadyMs() {
        return this.f6186g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6186g < 0 && computeVerticalScrollRange() > getHeight()) {
            this.f6186g = System.currentTimeMillis();
            m9155g();
        }
    }

    public void setListener(C1879a aVar) {
        this.f6182c = aVar;
    }
}

package com.facebook.ads.internal.view.p086c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p067i.C1704a;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p080c.C1823a;
import com.facebook.ads.internal.p077s.p080c.C1824b;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.p083t.C1838a.C1839a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.c.a */
public class C1883a extends C1823a {

    /* renamed from: a */
    private static final String f6197a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WeakReference<C1886b> f6198b;

    /* renamed from: c */
    private final AtomicBoolean f6199c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f6200d = new AtomicBoolean(true);

    /* renamed from: e */
    private final Path f6201e = new Path();

    /* renamed from: f */
    private final RectF f6202f = new RectF();

    /* renamed from: g */
    private WeakReference<C1888d> f6203g;

    /* renamed from: h */
    private C1838a f6204h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1806p f6205i = new C1806p();

    /* renamed from: j */
    private C1839a f6206j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6207k = true;

    /* renamed from: l */
    private boolean f6208l;

    /* renamed from: m */
    private float f6209m;

    /* renamed from: com.facebook.ads.internal.view.c.a$a */
    static class C1885a {

        /* renamed from: a */
        private final String f6211a = C1885a.class.getSimpleName();

        /* renamed from: b */
        private final WeakReference<C1883a> f6212b;

        /* renamed from: c */
        private final WeakReference<C1886b> f6213c;

        /* renamed from: d */
        private final WeakReference<C1838a> f6214d;

        /* renamed from: e */
        private final WeakReference<AtomicBoolean> f6215e;

        /* renamed from: f */
        private final WeakReference<AtomicBoolean> f6216f;

        /* renamed from: g */
        private final boolean f6217g;

        C1885a(C1883a aVar, C1886b bVar, C1838a aVar2, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
            this.f6212b = new WeakReference<>(aVar);
            this.f6213c = new WeakReference<>(bVar);
            this.f6214d = new WeakReference<>(aVar2);
            this.f6215e = new WeakReference<>(atomicBoolean);
            this.f6216f = new WeakReference<>(atomicBoolean2);
            this.f6217g = z;
        }

        @JavascriptInterface
        public void alert(String str) {
            Log.e(this.f6211a, str);
        }

        @JavascriptInterface
        public String getAnalogInfo() {
            return C1800k.m8915a(C1704a.m8531a());
        }

        @JavascriptInterface
        public void onMainAssetLoaded() {
            if (this.f6212b.get() != null && this.f6215e.get() != null && this.f6216f.get() != null && this.f6217g && ((AtomicBoolean) this.f6216f.get()).get()) {
                ((AtomicBoolean) this.f6215e.get()).set(true);
                if (((C1883a) this.f6212b.get()).isShown()) {
                    new Handler(Looper.getMainLooper()).post(new C1889e(this.f6214d));
                }
            }
        }

        @JavascriptInterface
        public void onPageInitialized() {
            C1883a aVar = (C1883a) this.f6212b.get();
            if (aVar != null && !aVar.mo7093c()) {
                C1886b bVar = (C1886b) this.f6213c.get();
                if (bVar != null) {
                    bVar.mo7208a();
                }
                if (!this.f6217g && ((C1883a) this.f6212b.get()).isShown()) {
                    new Handler(Looper.getMainLooper()).post(new C1889e(this.f6214d));
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$b */
    public interface C1886b {
        /* renamed from: a */
        void mo7208a();

        /* renamed from: a */
        void mo7209a(int i);

        /* renamed from: a */
        void mo7210a(WebResourceError webResourceError);

        /* renamed from: a */
        void mo7211a(String str, Map<String, String> map);

        /* renamed from: b */
        void mo7212b();
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$c */
    public static class C1887c implements C1886b {
        /* renamed from: a */
        public void mo7208a() {
        }

        /* renamed from: a */
        public void mo7209a(int i) {
        }

        /* renamed from: a */
        public void mo7210a(WebResourceError webResourceError) {
        }

        /* renamed from: a */
        public void mo7211a(String str, Map<String, String> map) {
        }

        /* renamed from: b */
        public void mo7212b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$d */
    public interface C1888d {
        /* renamed from: b */
        void mo7213b();
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$e */
    static class C1889e implements Runnable {

        /* renamed from: a */
        private final WeakReference<C1838a> f6218a;

        C1889e(C1838a aVar) {
            this.f6218a = new WeakReference<>(aVar);
        }

        C1889e(WeakReference<C1838a> weakReference) {
            this.f6218a = weakReference;
        }

        public void run() {
            C1838a aVar = (C1838a) this.f6218a.get();
            if (aVar != null) {
                aVar.mo7106a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$f */
    static class C1890f extends WebChromeClient {
        C1890f() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$g */
    static class C1891g extends WebViewClient {

        /* renamed from: a */
        private final WeakReference<C1886b> f6219a;

        /* renamed from: b */
        private final WeakReference<C1838a> f6220b;

        /* renamed from: c */
        private final WeakReference<C1806p> f6221c;

        /* renamed from: d */
        private final WeakReference<AtomicBoolean> f6222d;

        /* renamed from: e */
        private final WeakReference<C1883a> f6223e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f6224f = false;

        C1891g(WeakReference<C1886b> weakReference, WeakReference<C1838a> weakReference2, WeakReference<C1806p> weakReference3, WeakReference<AtomicBoolean> weakReference4, WeakReference<C1883a> weakReference5) {
            this.f6219a = weakReference;
            this.f6220b = weakReference2;
            this.f6221c = weakReference3;
            this.f6222d = weakReference4;
            this.f6223e = weakReference5;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m9188a(WebResourceError webResourceError) {
            if (this.f6219a.get() != null) {
                ((C1886b) this.f6219a.get()).mo7210a(webResourceError);
            }
        }

        public void onPageFinished(WebView webView, String str) {
            if (!(this.f6223e.get() == null || this.f6222d.get() == null || ((AtomicBoolean) this.f6222d.get()).get())) {
                ((C1883a) this.f6223e.get()).m9171e();
            }
            this.f6224f = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    if (!C1891g.this.f6224f) {
                        C1891g.this.m9188a((WebResourceError) null);
                    }
                }
            }, 2000);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f6224f = true;
            m9188a(webResourceError);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap hashMap = new HashMap();
            if (this.f6220b.get() != null) {
                ((C1838a) this.f6220b.get()).mo7108a((Map<String, String>) hashMap);
            }
            if (this.f6221c.get() != null) {
                hashMap.put("touch", C1800k.m8915a(((C1806p) this.f6221c.get()).mo7071c()));
            }
            if (this.f6219a.get() != null) {
                ((C1886b) this.f6219a.get()).mo7211a(str, hashMap);
            }
            return true;
        }
    }

    public C1883a(Context context, WeakReference<C1886b> weakReference, int i) {
        super(context);
        this.f6208l = C1713a.m8591v(context);
        this.f6198b = weakReference;
        this.f6206j = new C1839a() {
            /* renamed from: a */
            public void mo7113a() {
                if (C1883a.this.f6207k || !C1883a.this.f6205i.mo7070b()) {
                    C1883a.this.f6205i.mo7068a();
                }
                if (C1883a.this.f6198b.get() != null) {
                    ((C1886b) C1883a.this.f6198b.get()).mo7212b();
                }
            }
        };
        this.f6204h = new C1838a(this, i, this.f6206j);
        setWebChromeClient(mo7091a());
        setWebViewClient(mo7092b());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        C1885a aVar = new C1885a(this, (C1886b) weakReference.get(), this.f6204h, this.f6199c, this.f6200d, this.f6208l);
        addJavascriptInterface(aVar, "AdControl");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9171e() {
        this.f6199c.set(true);
        new Handler(Looper.getMainLooper()).post(new C1889e(this.f6204h));
        if (this.f6203g != null && this.f6203g.get() != null) {
            ((C1888d) this.f6203g.get()).mo7213b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebChromeClient mo7091a() {
        return new C1890f();
    }

    /* renamed from: a */
    public void mo7191a(int i, int i2) {
        if (this.f6204h != null) {
            this.f6204h.mo7107a(i);
            this.f6204h.mo7109b(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebViewClient mo7092b() {
        C1891g gVar = new C1891g(this.f6198b, new WeakReference(this.f6204h), new WeakReference(this.f6205i), new WeakReference(this.f6200d), new WeakReference(this));
        return gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo7192d() {
        return !this.f6208l || this.f6199c.get();
    }

    public void destroy() {
        if (this.f6204h != null) {
            this.f6204h.mo7111c();
            this.f6204h = null;
        }
        C1808r.m8940b(this);
        this.f6206j = null;
        this.f6205i = null;
        C1824b.m8969a(this);
        super.destroy();
    }

    public Map<String, String> getTouchData() {
        return this.f6205i.mo7071c();
    }

    public C1806p getTouchDataRecorder() {
        return this.f6205i;
    }

    public C1838a getViewabilityChecker() {
        return this.f6204h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6209m > 0.0f) {
            this.f6202f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f6201e.reset();
            this.f6201e.addRoundRect(this.f6202f, this.f6209m, this.f6209m, Direction.CW);
            canvas.clipPath(this.f6201e);
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6205i.mo7069a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f6198b.get() != null) {
            ((C1886b) this.f6198b.get()).mo7209a(i);
        }
        if (this.f6204h != null) {
            if (i == 0 && mo7192d()) {
                this.f6204h.mo7106a();
            } else if (i == 8) {
                this.f6204h.mo7111c();
            }
        }
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.f6200d.set(z);
    }

    public void setCornerRadius(float f) {
        this.f6209m = f;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z) {
        this.f6207k = z;
    }

    public void setOnAssetsLoadedListener(C1888d dVar) {
        this.f6203g = new WeakReference<>(dVar);
    }

    public void setWaitForAssetsToLoad(boolean z) {
        this.f6208l = z;
    }
}

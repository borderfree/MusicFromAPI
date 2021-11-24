package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ry */
public class C3886ry extends C3883rv {
    @GuardedBy("this")

    /* renamed from: b */
    private boolean f14914b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f14915c;

    public C3886ry(C3872rk rkVar) {
        super(rkVar);
        zzbv.zzeo().mo13057i();
    }

    /* renamed from: a */
    private final synchronized void mo13406a() {
        if (!this.f14915c) {
            this.f14915c = true;
            zzbv.zzeo().mo13058j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public final /* synthetic */ void mo13653J() {
        super.destroy();
    }

    /* renamed from: a */
    public final synchronized void mo12607a(C3885rx rxVar) {
        if (mo13659y()) {
            C3643iy.m18780a("Blank page loaded, 1...");
            mo13660z();
            return;
        }
        super.mo12607a(rxVar);
    }

    public synchronized void destroy() {
        if (!this.f14914b) {
            this.f14914b = true;
            mo13627f(false);
            C3643iy.m18780a("Initiating WebView self destruct sequence in 3...");
            C3643iy.m18780a("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                zzbv.zzeo().mo13047a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo13659y()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C3643iy.m19178e(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3886ry.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* access modifiers changed from: protected */
    @GuardedBy("this")
    /* renamed from: f */
    public void mo13627f(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (!mo13659y()) {
                    mo13627f(true);
                }
                mo13406a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!mo13659y()) {
            super.loadData(str, str2, str3);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo13659y()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadUrl(String str) {
        if (!mo13659y()) {
            super.loadUrl(str);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!mo13659y()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo13659y()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo13659y()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo13659y() && super.onTouchEvent(motionEvent);
    }

    public void stopLoading() {
        if (!mo13659y()) {
            super.stopLoading();
        }
    }

    /* renamed from: y */
    public final synchronized boolean mo13659y() {
        return this.f14914b;
    }

    /* renamed from: z */
    public final synchronized void mo13660z() {
        C3643iy.m18780a("Destroying WebView!");
        mo13406a();
        C3758ne.f14481a.execute(new C3887rz(this));
    }
}

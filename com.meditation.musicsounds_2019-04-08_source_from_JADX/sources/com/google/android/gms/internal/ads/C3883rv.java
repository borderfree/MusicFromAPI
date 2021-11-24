package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzbv;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rv */
public class C3883rv extends WebView implements C3889sa, C3891sc, C3893se, C3894sf {

    /* renamed from: a */
    protected final WebViewClient f14899a;

    /* renamed from: b */
    private final List<C3889sa> f14900b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final List<C3894sf> f14901c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<C3891sc> f14902d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final List<C3893se> f14903e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private final C3872rk f14904f;

    public C3883rv(C3872rk rkVar) {
        super(rkVar);
        this.f14904f = rkVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzbv.zzem().mo13153a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C3643iy.m19173b("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
        this.f14899a = new C3884rw(this, this, this, this);
        super.setWebViewClient(this.f14899a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final C3872rk mo13636I() {
        return this.f14904f;
    }

    /* renamed from: a */
    public void mo12607a(C3885rx rxVar) {
        for (C3893se a : this.f14903e) {
            a.mo12607a(rxVar);
        }
    }

    /* renamed from: a */
    public final void mo13637a(C3889sa saVar) {
        this.f14900b.add(saVar);
    }

    /* renamed from: a */
    public final void mo13638a(C3891sc scVar) {
        this.f14902d.add(scVar);
    }

    /* renamed from: a */
    public final void mo13639a(C3893se seVar) {
        this.f14903e.add(seVar);
    }

    /* renamed from: a */
    public final void mo13640a(C3894sf sfVar) {
        this.f14901c.add(sfVar);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            C3643iy.m18780a("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    /* renamed from: b */
    public final void mo12604b(C3885rx rxVar) {
        for (C3891sc b : this.f14902d) {
            b.mo12604b(rxVar);
        }
    }

    /* renamed from: b */
    public void mo12595b(String str) {
        C3890sb.m19829a(this, str);
    }

    /* renamed from: c */
    public final boolean mo12603c(C3885rx rxVar) {
        for (C3889sa c : this.f14900b) {
            if (c.mo12603c(rxVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final WebResourceResponse mo13617d(C3885rx rxVar) {
        for (C3894sf d : this.f14901c) {
            WebResourceResponse d2 = d.mo13617d(rxVar);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            zzbv.zzeo().mo13047a(e, "CoreWebView.loadUrl");
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }
}

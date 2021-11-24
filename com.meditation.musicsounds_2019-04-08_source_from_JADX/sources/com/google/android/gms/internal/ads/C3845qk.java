package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.common.util.C3310o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.qk */
final class C3845qk extends WebView implements OnGlobalLayoutListener, DownloadListener, C3832py {
    @GuardedBy("this")

    /* renamed from: A */
    private int f14737A;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: B */
    public int f14738B;

    /* renamed from: C */
    private aqx f14739C;

    /* renamed from: D */
    private aqx f14740D;

    /* renamed from: E */
    private aqx f14741E;

    /* renamed from: F */
    private aqy f14742F;

    /* renamed from: G */
    private WeakReference<OnClickListener> f14743G;
    @GuardedBy("this")

    /* renamed from: H */
    private zzd f14744H;
    @GuardedBy("this")

    /* renamed from: I */
    private boolean f14745I;

    /* renamed from: J */
    private C3718ls f14746J;

    /* renamed from: K */
    private int f14747K = -1;

    /* renamed from: L */
    private int f14748L = -1;

    /* renamed from: M */
    private int f14749M = -1;

    /* renamed from: N */
    private int f14750N = -1;

    /* renamed from: O */
    private Map<String, C3817pj> f14751O;

    /* renamed from: P */
    private final WindowManager f14752P;

    /* renamed from: Q */
    private final akv f14753Q;

    /* renamed from: a */
    private final C3872rk f14754a;

    /* renamed from: b */
    private final afm f14755b;

    /* renamed from: c */
    private final zzang f14756c;

    /* renamed from: d */
    private final zzbo f14757d;

    /* renamed from: e */
    private final zzw f14758e;

    /* renamed from: f */
    private final DisplayMetrics f14759f;

    /* renamed from: g */
    private final float f14760g;

    /* renamed from: h */
    private boolean f14761h = false;

    /* renamed from: i */
    private boolean f14762i = false;

    /* renamed from: j */
    private C3833pz f14763j;
    @GuardedBy("this")

    /* renamed from: k */
    private zzd f14764k;
    @GuardedBy("this")

    /* renamed from: l */
    private C3873rl f14765l;
    @GuardedBy("this")

    /* renamed from: m */
    private String f14766m;
    @GuardedBy("this")

    /* renamed from: n */
    private boolean f14767n;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f14768o;
    @GuardedBy("this")

    /* renamed from: p */
    private boolean f14769p;
    @GuardedBy("this")

    /* renamed from: q */
    private boolean f14770q;
    @GuardedBy("this")

    /* renamed from: r */
    private Boolean f14771r;
    @GuardedBy("this")

    /* renamed from: s */
    private int f14772s;
    @GuardedBy("this")

    /* renamed from: t */
    private boolean f14773t = true;
    @GuardedBy("this")

    /* renamed from: u */
    private boolean f14774u = false;
    @GuardedBy("this")

    /* renamed from: v */
    private String f14775v = "";
    @GuardedBy("this")

    /* renamed from: w */
    private C3848qn f14776w;
    @GuardedBy("this")

    /* renamed from: x */
    private boolean f14777x;
    @GuardedBy("this")

    /* renamed from: y */
    private boolean f14778y;
    @GuardedBy("this")

    /* renamed from: z */
    private arz f14779z;

    private C3845qk(C3872rk rkVar, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        super(rkVar);
        this.f14754a = rkVar;
        this.f14765l = rlVar;
        this.f14766m = str;
        this.f14769p = z;
        this.f14772s = -1;
        this.f14755b = afm;
        this.f14756c = zzang;
        this.f14757d = zzbo;
        this.f14758e = zzw;
        this.f14752P = (WindowManager) getContext().getSystemService("window");
        zzbv.zzek();
        this.f14759f = C3653jh.m18861a(this.f14752P);
        this.f14760g = this.f14759f.density;
        this.f14753Q = akv;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C3643iy.m19173b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzbv.zzek().mo13125a((Context) rkVar, zzang.f15360a, settings);
        zzbv.zzem().mo13153a(getContext(), settings);
        setDownloadListener(this);
        m19557M();
        if (C3309n.m15073e()) {
            addJavascriptInterface(C3851qq.m19650a(this), "googleAdsJsInterface");
        }
        if (C3309n.m15069a()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.f14746J = new C3718ls(this.f14754a.mo13601a(), this, this, null);
        m19562R();
        this.f14742F = new aqy(new aqz(true, "make_wv", this.f14766m));
        this.f14742F.mo12315a().mo12320a(aqz);
        this.f14740D = aqs.m16935a(this.f14742F.mo12315a());
        this.f14742F.mo12316a("native:view_create", this.f14740D);
        this.f14741E = null;
        this.f14739C = null;
        zzbv.zzem().mo13157b((Context) rkVar);
        zzbv.zzeo().mo13057i();
    }

    /* renamed from: I */
    private final boolean m19553I() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f14763j.mo13552b() && !this.f14763j.mo13553c()) {
            return false;
        }
        ane.m16645a();
        int b = C3719lt.m19118b(this.f14759f, this.f14759f.widthPixels);
        ane.m16645a();
        int b2 = C3719lt.m19118b(this.f14759f, this.f14759f.heightPixels);
        Activity a = this.f14754a.mo13601a();
        if (a == null || a.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            zzbv.zzek();
            int[] a2 = C3653jh.m18887a(a);
            ane.m16645a();
            int b3 = C3719lt.m19118b(this.f14759f, a2[0]);
            ane.m16645a();
            i = C3719lt.m19118b(this.f14759f, a2[1]);
            i2 = b3;
        }
        if (this.f14748L == b && this.f14747K == b2 && this.f14749M == i2 && this.f14750N == i) {
            return false;
        }
        if (!(this.f14748L == b && this.f14747K == b2)) {
            z = true;
        }
        this.f14748L = b;
        this.f14747K = b2;
        this.f14749M = i2;
        this.f14750N = i;
        new C3726m(this).mo13246a(b, b2, i2, i, this.f14759f.density, this.f14752P.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: J */
    private final synchronized void m19554J() {
        this.f14771r = zzbv.zzeo().mo13051c();
        if (this.f14771r == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m19566a(Boolean.valueOf(true));
            } catch (IllegalStateException unused) {
                m19566a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: K */
    private final synchronized Boolean m19555K() {
        return this.f14771r;
    }

    /* renamed from: L */
    private final void m19556L() {
        aqs.m16936a(this.f14742F.mo12315a(), this.f14740D, "aeh2");
    }

    /* renamed from: M */
    private final synchronized void m19557M() {
        if (!this.f14769p) {
            if (!this.f14765l.mo13607d()) {
                if (VERSION.SDK_INT < 18) {
                    C3643iy.m19172b("Disabling hardware acceleration on an AdView.");
                    m19558N();
                    return;
                }
                C3643iy.m19172b("Enabling hardware acceleration on an AdView.");
                m19559O();
                return;
            }
        }
        C3643iy.m19172b("Enabling hardware acceleration on an overlay.");
        m19559O();
    }

    /* renamed from: N */
    private final synchronized void m19558N() {
        if (!this.f14770q) {
            zzbv.zzem().mo13161c((View) this);
        }
        this.f14770q = true;
    }

    /* renamed from: O */
    private final synchronized void m19559O() {
        if (this.f14770q) {
            zzbv.zzem().mo13158b((View) this);
        }
        this.f14770q = false;
    }

    /* renamed from: P */
    private final synchronized void m19560P() {
        if (!this.f14745I) {
            this.f14745I = true;
            zzbv.zzeo().mo13058j();
        }
    }

    /* renamed from: Q */
    private final synchronized void m19561Q() {
        this.f14751O = null;
    }

    /* renamed from: R */
    private final void m19562R() {
        if (this.f14742F != null) {
            aqz a = this.f14742F.mo12315a();
            if (!(a == null || zzbv.zzeo().mo13049b() == null)) {
                zzbv.zzeo().mo13049b().mo12309a(a);
            }
        }
    }

    /* renamed from: a */
    static C3845qk m19565a(Context context, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        Context context2 = context;
        C3845qk qkVar = new C3845qk(new C3872rk(context), rlVar, str, z, z2, afm, zzang, aqz, zzbo, zzw, akv);
        return qkVar;
    }

    /* renamed from: a */
    private final void m19566a(Boolean bool) {
        synchronized (this) {
            this.f14771r = bool;
        }
        zzbv.zzeo().mo13046a(bool);
    }

    @TargetApi(19)
    /* renamed from: a */
    private final synchronized void m19567a(String str, ValueCallback<String> valueCallback) {
        if (!mo13532y()) {
            evaluateJavascript(str, null);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: c */
    private final synchronized void m19569c(String str) {
        if (!mo13532y()) {
            loadUrl(str);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: d */
    private final synchronized void m19570d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            zzbv.zzeo().mo13047a(e, "AdWebViewImpl.loadUrlUnsafe");
            C3643iy.m19175c("Could not call loadUrl. ", e);
        }
    }

    /* renamed from: e */
    private final void m19571e(String str) {
        if (C3309n.m15075g()) {
            if (m19555K() == null) {
                m19554J();
            }
            if (m19555K().booleanValue()) {
                m19567a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            m19569c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        String str3 = "javascript:";
        String valueOf2 = String.valueOf(str);
        m19569c(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
    }

    /* renamed from: f */
    private final void m19572f(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo12588a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: A */
    public final synchronized boolean mo13474A() {
        return this.f14773t;
    }

    /* renamed from: B */
    public final synchronized boolean mo13475B() {
        return this.f14774u;
    }

    /* renamed from: C */
    public final synchronized boolean mo13476C() {
        return this.f14737A > 0;
    }

    /* renamed from: D */
    public final void mo13477D() {
        this.f14746J.mo13228a();
    }

    /* renamed from: E */
    public final void mo13478E() {
        if (this.f14741E == null) {
            this.f14741E = aqs.m16935a(this.f14742F.mo12315a());
            this.f14742F.mo12316a("native:view_load", this.f14741E);
        }
    }

    /* renamed from: F */
    public final synchronized arz mo13479F() {
        return this.f14779z;
    }

    /* renamed from: G */
    public final void mo13480G() {
        setBackgroundColor(0);
    }

    /* renamed from: H */
    public final void mo13481H() {
        C3643iy.m18780a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: a */
    public final C3795oo mo13406a() {
        return null;
    }

    /* renamed from: a */
    public final void mo13482a(int i) {
        if (i == 0) {
            aqs.m16936a(this.f14742F.mo12315a(), this.f14740D, "aebb2");
        }
        m19556L();
        if (this.f14742F.mo12315a() != null) {
            this.f14742F.mo12315a().mo12322a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f14756c.f15360a);
        mo12588a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo13483a(Context context) {
        this.f14754a.setBaseContext(context);
        this.f14746J.mo13229a(this.f14754a.mo13601a());
    }

    /* renamed from: a */
    public final void mo13578a(zzc zzc) {
        this.f14763j.mo13539a(zzc);
    }

    /* renamed from: a */
    public final synchronized void mo13484a(zzd zzd) {
        this.f14764k = zzd;
    }

    /* renamed from: a */
    public final void mo11994a(aiw aiw) {
        synchronized (this) {
            this.f14777x = aiw.f12142a;
        }
        m19572f(aiw.f12142a);
    }

    /* renamed from: a */
    public final synchronized void mo13485a(arz arz) {
        this.f14779z = arz;
    }

    /* renamed from: a */
    public final synchronized void mo13407a(C3848qn qnVar) {
        if (this.f14776w != null) {
            C3643iy.m19174c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f14776w = qnVar;
        }
    }

    /* renamed from: a */
    public final synchronized void mo13486a(C3873rl rlVar) {
        this.f14765l = rlVar;
        requestLayout();
    }

    /* renamed from: a */
    public final synchronized void mo13487a(String str) {
        if (str == null) {
            str = "";
        }
        this.f14775v = str;
    }

    /* renamed from: a */
    public final void mo13488a(String str, zzv<? super C3832py> zzv) {
        if (this.f14763j != null) {
            this.f14763j.mo13545a(str, zzv);
        }
    }

    /* renamed from: a */
    public final void mo13489a(String str, C3310o<zzv<? super C3832py>> oVar) {
        if (this.f14763j != null) {
            this.f14763j.mo13546a(str, oVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13490a(String str, String str2, String str3) {
        if (!mo13532y()) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12636aB)).booleanValue()) {
                str2 = C3860qz.m19659a(str2, C3860qz.m19658a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: a */
    public final void mo12588a(String str, Map<String, ?> map) {
        try {
            mo12589a(str, zzbv.zzek().mo13124a(map));
        } catch (JSONException unused) {
            C3643iy.m19178e("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public final void mo12589a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        C3643iy.m19172b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        m19571e(sb.toString());
    }

    /* renamed from: a */
    public final void mo13408a(boolean z) {
        this.f14763j.mo13547a(z);
    }

    /* renamed from: a */
    public final void mo13579a(boolean z, int i) {
        this.f14763j.mo13548a(z, i);
    }

    /* renamed from: a */
    public final void mo13580a(boolean z, int i, String str) {
        this.f14763j.mo13549a(z, i, str);
    }

    /* renamed from: a */
    public final void mo13581a(boolean z, int i, String str, String str2) {
        this.f14763j.mo13550a(z, i, str, str2);
    }

    /* renamed from: b */
    public final synchronized C3848qn mo13409b() {
        return this.f14776w;
    }

    /* renamed from: b */
    public final synchronized void mo13491b(zzd zzd) {
        this.f14744H = zzd;
    }

    /* renamed from: b */
    public final void mo12595b(String str) {
        m19571e(str);
    }

    /* renamed from: b */
    public final void mo13492b(String str, zzv<? super C3832py> zzv) {
        if (this.f14763j != null) {
            this.f14763j.mo13551b(str, zzv);
        }
    }

    /* renamed from: b */
    public final void mo12596b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m19571e(sb.toString());
    }

    /* renamed from: b */
    public final synchronized void mo13493b(boolean z) {
        boolean z2 = z != this.f14769p;
        this.f14769p = z;
        m19557M();
        if (z2) {
            new C3726m(this).mo13250c(z ? "expanded" : "default");
        }
    }

    /* renamed from: c */
    public final aqx mo13410c() {
        return this.f14740D;
    }

    /* renamed from: c */
    public final synchronized void mo13494c(boolean z) {
        if (this.f14764k != null) {
            this.f14764k.zza(this.f14763j.mo13552b(), z);
        } else {
            this.f14767n = z;
        }
    }

    /* renamed from: d */
    public final Activity mo13411d() {
        return this.f14754a.mo13601a();
    }

    /* renamed from: d */
    public final synchronized void mo13495d(boolean z) {
        this.f14773t = z;
    }

    public final synchronized void destroy() {
        m19562R();
        this.f14746J.mo13230b();
        if (this.f14764k != null) {
            this.f14764k.close();
            this.f14764k.onDestroy();
            this.f14764k = null;
        }
        this.f14763j.mo13561k();
        if (!this.f14768o) {
            zzbv.zzff();
            C3816pi.m19383a((C3804ox) this);
            m19561Q();
            this.f14768o = true;
            C3643iy.m18780a("Initiating WebView self destruct sequence in 3...");
            C3643iy.m18780a("Loading blank page in WebView, 2...");
            m19570d("about:blank");
        }
    }

    /* renamed from: e */
    public final zzw mo13412e() {
        return this.f14758e;
    }

    /* renamed from: e */
    public final synchronized void mo13497e(boolean z) {
        this.f14737A += z ? 1 : -1;
        if (this.f14737A <= 0 && this.f14764k != null) {
            this.f14764k.zznq();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo13532y()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C3643iy.m19179f(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3845qk.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: f */
    public final void mo13413f() {
        zzd p = mo13517p();
        if (p != null) {
            p.zznp();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.f14768o) {
                    this.f14763j.mo13561k();
                    zzbv.zzff();
                    C3816pi.m19383a((C3804ox) this);
                    m19561Q();
                    m19560P();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final synchronized String mo13414g() {
        return this.f14775v;
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f14743G.get();
    }

    public final synchronized int getRequestedOrientation() {
        return this.f14772s;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: h */
    public final aqy mo13416h() {
        return this.f14742F;
    }

    /* renamed from: i */
    public final zzang mo13417i() {
        return this.f14756c;
    }

    /* renamed from: j */
    public final int mo13418j() {
        return getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo13419k() {
        return getMeasuredWidth();
    }

    /* renamed from: l */
    public final void mo13507l() {
        m19556L();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14756c.f15360a);
        mo12588a("onhide", (Map<String, ?>) hashMap);
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo13532y()) {
            super.loadData(str, str2, str3);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo13532y()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo13532y()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                zzbv.zzeo().mo13047a(e, "AdWebViewImpl.loadUrl");
                C3643iy.m19175c("Could not call loadUrl. ", e);
            }
        } else {
            C3643iy.m19178e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final void mo13511m() {
        if (this.f14739C == null) {
            aqs.m16936a(this.f14742F.mo12315a(), this.f14740D, "aes2");
            this.f14739C = aqs.m16935a(this.f14742F.mo12315a());
            this.f14742F.mo12316a("native:view_show", this.f14739C);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14756c.f15360a);
        mo12588a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: n */
    public final void mo13513n() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzfj().mo13169b()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzfj().mo13166a()));
        hashMap.put("device_volume", String.valueOf(C3671jz.m18983a(getContext())));
        mo12588a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: o */
    public final Context mo13514o() {
        return this.f14754a.mo13602b();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo13532y()) {
            this.f14746J.mo13231c();
        }
        boolean z = this.f14777x;
        if (this.f14763j != null && this.f14763j.mo13553c()) {
            if (!this.f14778y) {
                OnGlobalLayoutListener d = this.f14763j.mo13554d();
                if (d != null) {
                    zzbv.zzfg();
                    C3771nr.m19228a((View) this, d);
                }
                OnScrollChangedListener e = this.f14763j.mo13555e();
                if (e != null) {
                    zzbv.zzfg();
                    C3771nr.m19229a((View) this, e);
                }
                this.f14778y = true;
            }
            m19553I();
            z = true;
        }
        m19572f(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo13532y()) {
                this.f14746J.mo13232d();
            }
            super.onDetachedFromWindow();
            if (this.f14778y && this.f14763j != null && this.f14763j.mo13553c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f14763j.mo13554d();
                if (d != null) {
                    zzbv.zzem().mo13151a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f14763j.mo13555e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f14778y = false;
            }
        }
        m19572f(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzbv.zzek();
            C3653jh.m18873a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C3643iy.m19172b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo13532y()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(this.f14763j == null || this.f14763j.mo13562l() == null)) {
                    this.f14763j.mo13562l().mo10010a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12685ay)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean I = m19553I();
        zzd p = mo13517p();
        if (p != null && I) {
            p.zznn();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d5, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b3 A[SYNTHETIC, Splitter:B:100:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x01d6=Splitter:B:110:0x01d6, B:52:0x00ba=Splitter:B:52:0x00ba} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo13532y()     // Catch:{ all -> 0x01db }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r7.f14769p     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x01d6
            com.google.android.gms.internal.ads.rl r0 = r7.f14765l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.mo13608e()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0021
            goto L_0x01d6
        L_0x0021:
            com.google.android.gms.internal.ads.rl r0 = r7.f14765l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.mo13609f()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.qn r0 = r7.mo13409b()     // Catch:{ all -> 0x01db }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.mo12138e()     // Catch:{ all -> 0x01db }
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01db }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01db }
            float r1 = (float) r9     // Catch:{ all -> 0x01db }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01db }
            float r2 = (float) r8     // Catch:{ all -> 0x01db }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01db }
            if (r9 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            float r9 = (float) r2     // Catch:{ all -> 0x01db }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01db }
            r9 = r2
            goto L_0x0060
        L_0x0058:
            if (r8 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            float r8 = (float) r1     // Catch:{ all -> 0x01db }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01db }
            r8 = r1
        L_0x0060:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01db }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01db }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x006d:
            com.google.android.gms.internal.ads.rl r0 = r7.f14765l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.mo13606c()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00bf
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aqm.f12779cm     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x01db }
            java.lang.Object r0 = r1.mo12297a(r0)     // Catch:{ all -> 0x01db }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01db }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x00ba
            boolean r0 = com.google.android.gms.common.util.C3309n.m15073e()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x008e
            goto L_0x00ba
        L_0x008e:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.ql r1 = new com.google.android.gms.internal.ads.ql     // Catch:{ all -> 0x01db }
            r1.<init>(r7)     // Catch:{ all -> 0x01db }
            r7.mo13488a(r0, r1)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m19571e(r0)     // Catch:{ all -> 0x01db }
            android.util.DisplayMetrics r0 = r7.f14759f     // Catch:{ all -> 0x01db }
            float r0 = r0.density     // Catch:{ all -> 0x01db }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01db }
            int r1 = r7.f14738B     // Catch:{ all -> 0x01db }
            r2 = -1
            if (r1 == r2) goto L_0x00b1
            int r9 = r7.f14738B     // Catch:{ all -> 0x01db }
            float r9 = (float) r9     // Catch:{ all -> 0x01db }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01db }
            goto L_0x00b5
        L_0x00b1:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01db }
        L_0x00b5:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x00ba:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x00bf:
            com.google.android.gms.internal.ads.rl r0 = r7.f14765l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.mo13607d()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00d4
            android.util.DisplayMetrics r8 = r7.f14759f     // Catch:{ all -> 0x01db }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01db }
            android.util.DisplayMetrics r9 = r7.f14759f     // Catch:{ all -> 0x01db }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01db }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x00d4:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01db }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01db }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01db }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01db }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00f4
            if (r0 != r3) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00f5
        L_0x00f4:
            r0 = r8
        L_0x00f5:
            if (r2 == r4) goto L_0x00f9
            if (r2 != r3) goto L_0x00fa
        L_0x00f9:
            r5 = r9
        L_0x00fa:
            com.google.android.gms.internal.ads.rl r2 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r2 = r2.f14814b     // Catch:{ all -> 0x01db }
            r3 = 1
            if (r2 > r0) goto L_0x010a
            com.google.android.gms.internal.ads.rl r2 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r2 = r2.f14813a     // Catch:{ all -> 0x01db }
            if (r2 <= r5) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r2 = 0
            goto L_0x010b
        L_0x010a:
            r2 = 1
        L_0x010b:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12827dh     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.aqk r6 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x01db }
            java.lang.Object r4 = r6.mo12297a(r4)     // Catch:{ all -> 0x01db }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01db }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01db }
            if (r4 == 0) goto L_0x0143
            com.google.android.gms.internal.ads.rl r4 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r4 = r4.f14814b     // Catch:{ all -> 0x01db }
            float r4 = (float) r4     // Catch:{ all -> 0x01db }
            float r6 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r6 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            com.google.android.gms.internal.ads.rl r0 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r0 = r0.f14813a     // Catch:{ all -> 0x01db }
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r4 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01db }
            float r5 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            r0 = 1
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            if (r2 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r0 = r2
        L_0x0144:
            r2 = 8
            if (r0 == 0) goto L_0x01b3
            com.google.android.gms.internal.ads.rl r0 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r0 = r0.f14814b     // Catch:{ all -> 0x01db }
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r4 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.rl r4 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r4 = r4.f14813a     // Catch:{ all -> 0x01db }
            float r4 = (float) r4     // Catch:{ all -> 0x01db }
            float r5 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01db }
            float r8 = (float) r8     // Catch:{ all -> 0x01db }
            float r5 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01db }
            float r9 = (float) r9     // Catch:{ all -> 0x01db }
            float r5 = r7.f14760g     // Catch:{ all -> 0x01db }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01db }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            r6.<init>(r5)     // Catch:{ all -> 0x01db }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01db }
            r6.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01db }
            r6.append(r4)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01db }
            r6.append(r8)     // Catch:{ all -> 0x01db }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01db }
            r6.append(r9)     // Catch:{ all -> 0x01db }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01db }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.C3643iy.m19178e(r8)     // Catch:{ all -> 0x01db }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01db }
            if (r8 == r2) goto L_0x01a1
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01db }
        L_0x01a1:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01db }
            boolean r8 = r7.f14761h     // Catch:{ all -> 0x01db }
            if (r8 != 0) goto L_0x01d4
            com.google.android.gms.internal.ads.akv r8 = r7.f14753Q     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.zzhu$zza$zzb r9 = com.google.android.gms.internal.ads.zzhu.zza.zzb.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01db }
            r8.mo12082a(r9)     // Catch:{ all -> 0x01db }
            r7.f14761h = r3     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x01b3:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01db }
            if (r8 == r2) goto L_0x01bc
            r7.setVisibility(r1)     // Catch:{ all -> 0x01db }
        L_0x01bc:
            boolean r8 = r7.f14762i     // Catch:{ all -> 0x01db }
            if (r8 != 0) goto L_0x01c9
            com.google.android.gms.internal.ads.akv r8 = r7.f14753Q     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.zzhu$zza$zzb r9 = com.google.android.gms.internal.ads.zzhu.zza.zzb.BANNER_SIZE_VALID     // Catch:{ all -> 0x01db }
            r8.mo12082a(r9)     // Catch:{ all -> 0x01db }
            r7.f14762i = r3     // Catch:{ all -> 0x01db }
        L_0x01c9:
            com.google.android.gms.internal.ads.rl r8 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r8 = r8.f14814b     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.rl r9 = r7.f14765l     // Catch:{ all -> 0x01db }
            int r9 = r9.f14813a     // Catch:{ all -> 0x01db }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
        L_0x01d4:
            monitor-exit(r7)
            return
        L_0x01d6:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x01db:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3845qk.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo13532y()) {
            try {
                if (C3309n.m15069a()) {
                    super.onPause();
                }
            } catch (Exception e) {
                C3643iy.m19173b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo13532y()) {
            try {
                if (C3309n.m15069a()) {
                    super.onResume();
                }
            } catch (Exception e) {
                C3643iy.m19173b("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14763j.mo13553c()) {
            synchronized (this) {
                if (this.f14779z != null) {
                    this.f14779z.mo12408a(motionEvent);
                }
            }
        } else if (this.f14755b != null) {
            this.f14755b.mo11852a(motionEvent);
        }
        if (mo13532y()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final synchronized zzd mo13517p() {
        return this.f14764k;
    }

    /* renamed from: q */
    public final synchronized zzd mo13518q() {
        return this.f14744H;
    }

    /* renamed from: r */
    public final synchronized C3873rl mo13519r() {
        return this.f14765l;
    }

    /* renamed from: s */
    public final synchronized String mo13520s() {
        return this.f14766m;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f14743G = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f14772s = i;
        if (this.f14764k != null) {
            this.f14764k.setRequestedOrientation(this.f14772s);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C3833pz) {
            this.f14763j = (C3833pz) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo13532y()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                C3643iy.m19173b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final /* synthetic */ C3867rf mo13527t() {
        return this.f14763j;
    }

    /* renamed from: u */
    public final WebViewClient mo13528u() {
        return this.f14763j;
    }

    /* renamed from: v */
    public final synchronized boolean mo13529v() {
        return this.f14767n;
    }

    /* renamed from: w */
    public final afm mo13530w() {
        return this.f14755b;
    }

    /* renamed from: x */
    public final synchronized boolean mo13531x() {
        return this.f14769p;
    }

    /* renamed from: y */
    public final synchronized boolean mo13532y() {
        return this.f14768o;
    }

    /* renamed from: z */
    public final synchronized void mo13533z() {
        C3643iy.m18780a("Destroying WebView!");
        m19560P();
        C3653jh.f14275a.post(new C3847qm(this));
    }

    public final synchronized void zzcl() {
        this.f14774u = true;
        if (this.f14757d != null) {
            this.f14757d.zzcl();
        }
    }

    public final synchronized void zzcm() {
        this.f14774u = false;
        if (this.f14757d != null) {
            this.f14757d.zzcm();
        }
    }
}

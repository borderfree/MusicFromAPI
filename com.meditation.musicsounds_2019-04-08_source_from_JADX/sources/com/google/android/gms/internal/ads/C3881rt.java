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
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rt */
final class C3881rt extends C3886ry implements OnGlobalLayoutListener, DownloadListener, axr, C3832py {

    /* renamed from: A */
    private WeakReference<OnClickListener> f14863A;
    @GuardedBy("this")

    /* renamed from: B */
    private zzd f14864B;

    /* renamed from: C */
    private C3718ls f14865C;

    /* renamed from: D */
    private int f14866D = -1;

    /* renamed from: E */
    private int f14867E = -1;

    /* renamed from: F */
    private int f14868F = -1;

    /* renamed from: G */
    private int f14869G = -1;

    /* renamed from: H */
    private float f14870H;

    /* renamed from: I */
    private Map<String, C3817pj> f14871I;

    /* renamed from: J */
    private final WindowManager f14872J;

    /* renamed from: b */
    private final afm f14873b;

    /* renamed from: c */
    private final zzang f14874c;

    /* renamed from: d */
    private final zzbo f14875d;

    /* renamed from: e */
    private final zzw f14876e;

    /* renamed from: f */
    private C3874rm f14877f;
    @GuardedBy("this")

    /* renamed from: g */
    private zzd f14878g;
    @GuardedBy("this")

    /* renamed from: h */
    private C3873rl f14879h;
    @GuardedBy("this")

    /* renamed from: i */
    private String f14880i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f14881j;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f14882k;
    @GuardedBy("this")

    /* renamed from: l */
    private boolean f14883l;
    @GuardedBy("this")

    /* renamed from: m */
    private int f14884m;
    @GuardedBy("this")

    /* renamed from: n */
    private boolean f14885n = true;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f14886o = false;
    @GuardedBy("this")

    /* renamed from: p */
    private String f14887p = "";
    @GuardedBy("this")

    /* renamed from: q */
    private C3848qn f14888q;
    @GuardedBy("this")

    /* renamed from: r */
    private boolean f14889r;
    @GuardedBy("this")

    /* renamed from: s */
    private boolean f14890s;
    @GuardedBy("this")

    /* renamed from: t */
    private arz f14891t;
    @GuardedBy("this")

    /* renamed from: u */
    private int f14892u;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: v */
    public int f14893v;

    /* renamed from: w */
    private aqx f14894w;

    /* renamed from: x */
    private aqx f14895x;

    /* renamed from: y */
    private aqx f14896y;

    /* renamed from: z */
    private aqy f14897z;

    private C3881rt(C3872rk rkVar, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        super(rkVar);
        this.f14879h = rlVar;
        this.f14880i = str;
        this.f14882k = z;
        this.f14884m = -1;
        this.f14873b = afm;
        this.f14874c = zzang;
        this.f14875d = zzbo;
        this.f14876e = zzw;
        this.f14872J = (WindowManager) getContext().getSystemService("window");
        this.f14865C = new C3718ls(mo13636I().mo13601a(), this, this, null);
        zzbv.zzek().mo13125a((Context) rkVar, zzang.f15360a, getSettings());
        setDownloadListener(this);
        this.f14870H = mo13636I().getResources().getDisplayMetrics().density;
        m19740M();
        if (C3309n.m15073e()) {
            addJavascriptInterface(C3851qq.m19650a(this), "googleAdsJsInterface");
        }
        m19744Q();
        this.f14897z = new aqy(new aqz(true, "make_wv", this.f14880i));
        this.f14897z.mo12315a().mo12320a(aqz);
        this.f14895x = aqs.m16935a(this.f14897z.mo12315a());
        this.f14897z.mo12316a("native:view_create", this.f14895x);
        this.f14896y = null;
        this.f14894w = null;
        zzbv.zzem().mo13157b((Context) rkVar);
    }

    /* renamed from: K */
    private final boolean m19738K() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f14877f.mo13552b() && !this.f14877f.mo13615c()) {
            return false;
        }
        zzbv.zzek();
        DisplayMetrics a = C3653jh.m18861a(this.f14872J);
        ane.m16645a();
        int b = C3719lt.m19118b(a, a.widthPixels);
        ane.m16645a();
        int b2 = C3719lt.m19118b(a, a.heightPixels);
        Activity a2 = mo13636I().mo13601a();
        if (a2 == null || a2.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            zzbv.zzek();
            int[] a3 = C3653jh.m18887a(a2);
            ane.m16645a();
            i2 = C3719lt.m19118b(a, a3[0]);
            ane.m16645a();
            i = C3719lt.m19118b(a, a3[1]);
        }
        if (this.f14867E == b && this.f14866D == b2 && this.f14868F == i2 && this.f14869G == i) {
            return false;
        }
        if (!(this.f14867E == b && this.f14866D == b2)) {
            z = true;
        }
        this.f14867E = b;
        this.f14866D = b2;
        this.f14868F = i2;
        this.f14869G = i;
        new C3726m(this).mo13246a(b, b2, i2, i, a.density, this.f14872J.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: L */
    private final void m19739L() {
        aqs.m16936a(this.f14897z.mo12315a(), this.f14895x, "aeh2");
    }

    /* renamed from: M */
    private final synchronized void m19740M() {
        if (!this.f14882k) {
            if (!this.f14879h.mo13607d()) {
                if (VERSION.SDK_INT < 18) {
                    C3643iy.m19172b("Disabling hardware acceleration on an AdView.");
                    m19741N();
                    return;
                }
                C3643iy.m19172b("Enabling hardware acceleration on an AdView.");
                m19742O();
                return;
            }
        }
        C3643iy.m19172b("Enabling hardware acceleration on an overlay.");
        m19742O();
    }

    /* renamed from: N */
    private final synchronized void m19741N() {
        if (!this.f14883l) {
            zzbv.zzem().mo13161c((View) this);
        }
        this.f14883l = true;
    }

    /* renamed from: O */
    private final synchronized void m19742O() {
        if (this.f14883l) {
            zzbv.zzem().mo13158b((View) this);
        }
        this.f14883l = false;
    }

    /* renamed from: P */
    private final synchronized void m19743P() {
        this.f14871I = null;
    }

    /* renamed from: Q */
    private final void m19744Q() {
        if (this.f14897z != null) {
            aqz a = this.f14897z.mo12315a();
            if (!(a == null || zzbv.zzeo().mo13049b() == null)) {
                zzbv.zzeo().mo13049b().mo12309a(a);
            }
        }
    }

    /* renamed from: a */
    static C3881rt m19747a(Context context, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        Context context2 = context;
        C3881rt rtVar = new C3881rt(new C3872rk(context), rlVar, str, z, z2, afm, zzang, aqz, zzbo, zzw, akv);
        return rtVar;
    }

    /* renamed from: g */
    private final void m19748g(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        axs.m17626a((axr) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: A */
    public final synchronized boolean mo13474A() {
        return this.f14885n;
    }

    /* renamed from: B */
    public final synchronized boolean mo13475B() {
        return this.f14886o;
    }

    /* renamed from: C */
    public final synchronized boolean mo13476C() {
        return this.f14892u > 0;
    }

    /* renamed from: D */
    public final void mo13477D() {
        this.f14865C.mo13228a();
    }

    /* renamed from: E */
    public final void mo13478E() {
        if (this.f14896y == null) {
            this.f14896y = aqs.m16935a(this.f14897z.mo12315a());
            this.f14897z.mo12316a("native:view_load", this.f14896y);
        }
    }

    /* renamed from: F */
    public final synchronized arz mo13479F() {
        return this.f14891t;
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
            aqs.m16936a(this.f14897z.mo12315a(), this.f14895x, "aebb2");
        }
        m19739L();
        if (this.f14897z.mo12315a() != null) {
            this.f14897z.mo12315a().mo12322a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f14874c.f15360a);
        axs.m17626a((axr) this, "onhide", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo13483a(Context context) {
        mo13636I().setBaseContext(context);
        this.f14865C.mo13229a(mo13636I().mo13601a());
    }

    /* renamed from: a */
    public final void mo13578a(zzc zzc) {
        this.f14877f.mo13610a(zzc);
    }

    /* renamed from: a */
    public final synchronized void mo13484a(zzd zzd) {
        this.f14878g = zzd;
    }

    /* renamed from: a */
    public final void mo11994a(aiw aiw) {
        synchronized (this) {
            this.f14889r = aiw.f12142a;
        }
        m19748g(aiw.f12142a);
    }

    /* renamed from: a */
    public final synchronized void mo13485a(arz arz) {
        this.f14891t = arz;
    }

    /* renamed from: a */
    public final synchronized void mo13407a(C3848qn qnVar) {
        if (this.f14888q != null) {
            C3643iy.m19174c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f14888q = qnVar;
        }
    }

    /* renamed from: a */
    public final synchronized void mo13486a(C3873rl rlVar) {
        this.f14879h = rlVar;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo13626a(C3874rm rmVar) {
        this.f14877f = rmVar;
    }

    /* renamed from: a */
    public final synchronized void mo13487a(String str) {
        if (str == null) {
            str = "";
        }
        this.f14887p = str;
    }

    /* renamed from: a */
    public final void mo13488a(String str, zzv<? super C3832py> zzv) {
        if (this.f14877f != null) {
            this.f14877f.mo12610a(str, zzv);
        }
    }

    /* renamed from: a */
    public final void mo13489a(String str, C3310o<zzv<? super C3832py>> oVar) {
        if (this.f14877f != null) {
            this.f14877f.mo12611a(str, oVar);
        }
    }

    /* renamed from: a */
    public final void mo12593a(String str, String str2) {
        axs.m17625a((axr) this, str, str2);
    }

    /* renamed from: a */
    public final synchronized void mo13490a(String str, String str2, String str3) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12636aB)).booleanValue()) {
            str2 = C3860qz.m19659a(str2, C3860qz.m19658a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    /* renamed from: a */
    public final void mo12588a(String str, Map map) {
        axs.m17626a((axr) this, str, map);
    }

    /* renamed from: a */
    public final void mo12589a(String str, JSONObject jSONObject) {
        axs.m17628b(this, str, jSONObject);
    }

    /* renamed from: a */
    public final void mo13408a(boolean z) {
        this.f14877f.mo13611a(z);
    }

    /* renamed from: a */
    public final void mo13579a(boolean z, int i) {
        this.f14877f.mo13612a(z, i);
    }

    /* renamed from: a */
    public final void mo13580a(boolean z, int i, String str) {
        this.f14877f.mo13613a(z, i, str);
    }

    /* renamed from: a */
    public final void mo13581a(boolean z, int i, String str, String str2) {
        this.f14877f.mo13614a(z, i, str, str2);
    }

    /* renamed from: b */
    public final synchronized C3848qn mo13409b() {
        return this.f14888q;
    }

    /* renamed from: b */
    public final synchronized void mo13491b(zzd zzd) {
        this.f14864B = zzd;
    }

    /* renamed from: b */
    public final synchronized void mo12595b(String str) {
        if (!mo13659y()) {
            super.mo12595b(str);
        } else {
            C3643iy.m19178e("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: b */
    public final void mo13492b(String str, zzv<? super C3832py> zzv) {
        if (this.f14877f != null) {
            this.f14877f.mo12613b(str, zzv);
        }
    }

    /* renamed from: b */
    public final void mo12596b(String str, JSONObject jSONObject) {
        axs.m17627a((axr) this, str, jSONObject);
    }

    /* renamed from: b */
    public final synchronized void mo13493b(boolean z) {
        boolean z2 = z != this.f14882k;
        this.f14882k = z;
        m19740M();
        if (z2) {
            new C3726m(this).mo13250c(z ? "expanded" : "default");
        }
    }

    /* renamed from: c */
    public final aqx mo13410c() {
        return this.f14895x;
    }

    /* renamed from: c */
    public final synchronized void mo13494c(boolean z) {
        if (this.f14878g != null) {
            this.f14878g.zza(this.f14877f.mo13552b(), z);
        } else {
            this.f14881j = z;
        }
    }

    /* renamed from: d */
    public final Activity mo13411d() {
        return mo13636I().mo13601a();
    }

    /* renamed from: d */
    public final synchronized void mo13495d(boolean z) {
        this.f14885n = z;
    }

    /* renamed from: e */
    public final zzw mo13412e() {
        return this.f14876e;
    }

    /* renamed from: e */
    public final synchronized void mo13497e(boolean z) {
        this.f14892u += z ? 1 : -1;
        if (this.f14892u <= 0 && this.f14878g != null) {
            this.f14878g.zznq();
        }
    }

    /* renamed from: f */
    public final void mo13413f() {
        zzd p = mo13517p();
        if (p != null) {
            p.zznp();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final synchronized void mo13627f(boolean z) {
        if (!z) {
            try {
                m19744Q();
                this.f14865C.mo13230b();
                if (this.f14878g != null) {
                    this.f14878g.close();
                    this.f14878g.onDestroy();
                    this.f14878g = null;
                }
            } finally {
            }
        }
        this.f14877f.mo12614k();
        zzbv.zzff();
        C3816pi.m19383a((C3804ox) this);
        m19743P();
    }

    /* renamed from: g */
    public final synchronized String mo13414g() {
        return this.f14887p;
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f14863A.get();
    }

    public final synchronized int getRequestedOrientation() {
        return this.f14884m;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: h */
    public final aqy mo13416h() {
        return this.f14897z;
    }

    /* renamed from: i */
    public final zzang mo13417i() {
        return this.f14874c;
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
        m19739L();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14874c.f15360a);
        axs.m17626a((axr) this, "onhide", (Map) hashMap);
    }

    /* renamed from: m */
    public final void mo13511m() {
        if (this.f14894w == null) {
            aqs.m16936a(this.f14897z.mo12315a(), this.f14895x, "aes2");
            this.f14894w = aqs.m16935a(this.f14897z.mo12315a());
            this.f14897z.mo12316a("native:view_show", this.f14894w);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14874c.f15360a);
        axs.m17626a((axr) this, "onshow", (Map) hashMap);
    }

    /* renamed from: n */
    public final void mo13513n() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzfj().mo13169b()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzfj().mo13166a()));
        hashMap.put("device_volume", String.valueOf(C3671jz.m18983a(getContext())));
        axs.m17626a((axr) this, "volume", (Map) hashMap);
    }

    /* renamed from: o */
    public final Context mo13514o() {
        return mo13636I().mo13602b();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo13659y()) {
            this.f14865C.mo13231c();
        }
        boolean z = this.f14889r;
        if (this.f14877f != null && this.f14877f.mo13615c()) {
            if (!this.f14890s) {
                OnGlobalLayoutListener d = this.f14877f.mo13616d();
                if (d != null) {
                    zzbv.zzfg();
                    C3771nr.m19228a((View) this, d);
                }
                OnScrollChangedListener e = this.f14877f.mo13618e();
                if (e != null) {
                    zzbv.zzfg();
                    C3771nr.m19229a((View) this, e);
                }
                this.f14890s = true;
            }
            m19738K();
            z = true;
        }
        m19748g(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo13659y()) {
                this.f14865C.mo13232d();
            }
            super.onDetachedFromWindow();
            if (this.f14890s && this.f14877f != null && this.f14877f.mo13615c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f14877f.mo13616d();
                if (d != null) {
                    zzbv.zzem().mo13151a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f14877f.mo13618e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f14890s = false;
            }
        }
        m19748g(false);
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
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (!(this.f14877f == null || this.f14877f.mo13619l() == null)) {
                this.f14877f.mo13619l().mo10010a();
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
        boolean K = m19738K();
        zzd p = mo13517p();
        if (p != null && K) {
            p.zznn();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ac A[SYNTHETIC, Splitter:B:97:0x01ac] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:104:0x01c2=Splitter:B:104:0x01c2, B:52:0x00b8=Splitter:B:52:0x00b8} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo13659y()     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r7.f14882k     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x01c2
            com.google.android.gms.internal.ads.rl r0 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.mo13608e()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01c2
        L_0x0021:
            com.google.android.gms.internal.ads.rl r0 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.mo13609f()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.qn r0 = r7.mo13409b()     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.mo12138e()     // Catch:{ all -> 0x01c7 }
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c7 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c7 }
            float r1 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01c7 }
            float r2 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01c7 }
            if (r9 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            float r9 = (float) r2     // Catch:{ all -> 0x01c7 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01c7 }
            r9 = r2
            goto L_0x0060
        L_0x0058:
            if (r8 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            float r8 = (float) r1     // Catch:{ all -> 0x01c7 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01c7 }
            r8 = r1
        L_0x0060:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01c7 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01c7 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x006d:
            com.google.android.gms.internal.ads.rl r0 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.mo13606c()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x00bd
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aqm.f12779cm     // Catch:{ all -> 0x01c7 }
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x01c7 }
            java.lang.Object r0 = r1.mo12297a(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x00b8
            boolean r0 = com.google.android.gms.common.util.C3309n.m15073e()     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x008e
            goto L_0x00b8
        L_0x008e:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.ru r1 = new com.google.android.gms.internal.ads.ru     // Catch:{ all -> 0x01c7 }
            r1.<init>(r7)     // Catch:{ all -> 0x01c7 }
            r7.mo13488a(r0, r1)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo12595b(r0)     // Catch:{ all -> 0x01c7 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c7 }
            int r0 = r7.f14893v     // Catch:{ all -> 0x01c7 }
            r1 = -1
            if (r0 == r1) goto L_0x00af
            int r9 = r7.f14893v     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r0 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01c7 }
            goto L_0x00b3
        L_0x00af:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c7 }
        L_0x00b3:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x00b8:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x00bd:
            com.google.android.gms.internal.ads.rl r0 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.mo13607d()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x00dc
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01c7 }
            r8.<init>()     // Catch:{ all -> 0x01c7 }
            android.view.WindowManager r9 = r7.f14872J     // Catch:{ all -> 0x01c7 }
            android.view.Display r9 = r9.getDefaultDisplay()     // Catch:{ all -> 0x01c7 }
            r9.getMetrics(r8)     // Catch:{ all -> 0x01c7 }
            int r9 = r8.widthPixels     // Catch:{ all -> 0x01c7 }
            int r8 = r8.heightPixels     // Catch:{ all -> 0x01c7 }
            r7.setMeasuredDimension(r9, r8)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x00dc:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01c7 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c7 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01c7 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c7 }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00fc
            if (r0 != r3) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00fd
        L_0x00fc:
            r0 = r8
        L_0x00fd:
            if (r2 == r4) goto L_0x0101
            if (r2 != r3) goto L_0x0102
        L_0x0101:
            r5 = r9
        L_0x0102:
            com.google.android.gms.internal.ads.rl r2 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r2 = r2.f14814b     // Catch:{ all -> 0x01c7 }
            r3 = 1
            if (r2 > r0) goto L_0x0112
            com.google.android.gms.internal.ads.rl r2 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r2 = r2.f14813a     // Catch:{ all -> 0x01c7 }
            if (r2 <= r5) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r2 = 0
            goto L_0x0113
        L_0x0112:
            r2 = 1
        L_0x0113:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12827dh     // Catch:{ all -> 0x01c7 }
            com.google.android.gms.internal.ads.aqk r6 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x01c7 }
            java.lang.Object r4 = r6.mo12297a(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01c7 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x014a
            com.google.android.gms.internal.ads.rl r4 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r4 = r4.f14814b     // Catch:{ all -> 0x01c7 }
            float r4 = (float) r4     // Catch:{ all -> 0x01c7 }
            float r6 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01c7 }
            float r6 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            com.google.android.gms.internal.ads.rl r0 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r0 = r0.f14813a     // Catch:{ all -> 0x01c7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01c7 }
            float r4 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01c7 }
            float r5 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r2 == 0) goto L_0x014a
            r2 = r3
        L_0x014a:
            r0 = 8
            if (r2 == 0) goto L_0x01ac
            com.google.android.gms.internal.ads.rl r2 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r2 = r2.f14814b     // Catch:{ all -> 0x01c7 }
            float r2 = (float) r2     // Catch:{ all -> 0x01c7 }
            float r3 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01c7 }
            com.google.android.gms.internal.ads.rl r3 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r3 = r3.f14813a     // Catch:{ all -> 0x01c7 }
            float r3 = (float) r3     // Catch:{ all -> 0x01c7 }
            float r4 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01c7 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r4 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r4 = r7.f14870H     // Catch:{ all -> 0x01c7 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01c7 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01c7 }
            r5.append(r2)     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01c7 }
            r5.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01c7 }
            r5.append(r8)     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01c7 }
            r5.append(r9)     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01c7 }
            com.google.android.gms.internal.ads.C3643iy.m19178e(r8)     // Catch:{ all -> 0x01c7 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c7 }
            if (r8 == r0) goto L_0x01a7
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01c7 }
        L_0x01a7:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x01ac:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c7 }
            if (r8 == r0) goto L_0x01b5
            r7.setVisibility(r1)     // Catch:{ all -> 0x01c7 }
        L_0x01b5:
            com.google.android.gms.internal.ads.rl r8 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r8 = r8.f14814b     // Catch:{ all -> 0x01c7 }
            com.google.android.gms.internal.ads.rl r9 = r7.f14879h     // Catch:{ all -> 0x01c7 }
            int r9 = r9.f14813a     // Catch:{ all -> 0x01c7 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x01c2:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x01c7:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3881rt.onMeasure(int, int):void");
    }

    public final void onPause() {
        try {
            if (C3309n.m15069a()) {
                super.onPause();
            }
        } catch (Exception e) {
            C3643iy.m19173b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            if (C3309n.m15069a()) {
                super.onResume();
            }
        } catch (Exception e) {
            C3643iy.m19173b("Could not resume webview.", e);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14877f.mo13615c()) {
            synchronized (this) {
                if (this.f14891t != null) {
                    this.f14891t.mo12408a(motionEvent);
                }
            }
        } else if (this.f14873b != null) {
            this.f14873b.mo11852a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final synchronized zzd mo13517p() {
        return this.f14878g;
    }

    /* renamed from: q */
    public final synchronized zzd mo13518q() {
        return this.f14864B;
    }

    /* renamed from: r */
    public final synchronized C3873rl mo13519r() {
        return this.f14879h;
    }

    /* renamed from: s */
    public final synchronized String mo13520s() {
        return this.f14880i;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f14863A = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f14884m = i;
        if (this.f14878g != null) {
            this.f14878g.setRequestedOrientation(this.f14884m);
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            C3643iy.m19173b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ C3867rf mo13527t() {
        return this.f14877f;
    }

    /* renamed from: u */
    public final WebViewClient mo13528u() {
        return this.f14899a;
    }

    /* renamed from: v */
    public final synchronized boolean mo13529v() {
        return this.f14881j;
    }

    /* renamed from: w */
    public final afm mo13530w() {
        return this.f14873b;
    }

    /* renamed from: x */
    public final synchronized boolean mo13531x() {
        return this.f14882k;
    }

    public final synchronized void zzcl() {
        this.f14886o = true;
        if (this.f14875d != null) {
            this.f14875d.zzcl();
        }
    }

    public final synchronized void zzcm() {
        this.f14886o = false;
        if (this.f14875d != null) {
            this.f14875d.zzcm();
        }
    }
}

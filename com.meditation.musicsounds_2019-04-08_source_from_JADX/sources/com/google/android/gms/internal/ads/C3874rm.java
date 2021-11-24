package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.p009v4.view.C0626s;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzad;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rm */
public final class C3874rm extends axv<C3832py> implements C3867rf, C3889sa, C3891sc, C3893se, C3894sf {

    /* renamed from: A */
    private OnAttachStateChangeListener f14816A;

    /* renamed from: a */
    private C3832py f14817a;

    /* renamed from: b */
    private final Object f14818b;

    /* renamed from: c */
    private amh f14819c;

    /* renamed from: d */
    private zzn f14820d;

    /* renamed from: e */
    private C3868rg f14821e;

    /* renamed from: f */
    private C3869rh f14822f;

    /* renamed from: g */
    private zzb f14823g;

    /* renamed from: h */
    private zzd f14824h;

    /* renamed from: i */
    private C3870ri f14825i;

    /* renamed from: j */
    private boolean f14826j;

    /* renamed from: k */
    private zzz f14827k;

    /* renamed from: l */
    private boolean f14828l;

    /* renamed from: m */
    private boolean f14829m;

    /* renamed from: n */
    private OnGlobalLayoutListener f14830n;

    /* renamed from: o */
    private OnScrollChangedListener f14831o;

    /* renamed from: p */
    private boolean f14832p;

    /* renamed from: q */
    private zzt f14833q;

    /* renamed from: r */
    private final C3699l f14834r;

    /* renamed from: s */
    private zzx f14835s;

    /* renamed from: t */
    private C3455c f14836t;

    /* renamed from: u */
    private C3753n f14837u;

    /* renamed from: v */
    private C3871rj f14838v;

    /* renamed from: w */
    private C3606ho f14839w;

    /* renamed from: x */
    private boolean f14840x;

    /* renamed from: y */
    private boolean f14841y;

    /* renamed from: z */
    private int f14842z;

    public C3874rm(C3832py pyVar, boolean z) {
        this(pyVar, z, new C3699l(pyVar, pyVar.mo13514o(), new apx(pyVar.getContext())), null);
    }

    private C3874rm(C3832py pyVar, boolean z, C3699l lVar, C3455c cVar) {
        this.f14818b = new Object();
        this.f14826j = false;
        this.f14817a = pyVar;
        this.f14828l = z;
        this.f14834r = lVar;
        this.f14836t = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19698a(View view, C3606ho hoVar, int i) {
        if (hoVar.mo12983b() && i > 0) {
            hoVar.mo12978a(view);
            if (hoVar.mo12983b()) {
                C3653jh.f14275a.postDelayed(new C3876ro(this, view, hoVar, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m19699a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f14836t != null ? this.f14836t.mo12834a() : false;
        zzbv.zzei();
        Context context = this.f14817a.getContext();
        if (!a) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.f14839w != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzbyl != null) {
                str = adOverlayInfoParcel.zzbyl.url;
            }
            this.f14839w.mo12979a(str);
        }
    }

    /* renamed from: e */
    private final WebResourceResponse m19701e(C3885rx rxVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(rxVar.f14910a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : rxVar.f14912c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzbv.zzek().mo13127a(this.f14817a.getContext(), this.f14817a.mo13417i().f15360a, false, httpURLConnection);
                    C3723lx lxVar = new C3723lx();
                    lxVar.mo13240a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    lxVar.mo13239a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzbv.zzek();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                C3643iy.m19178e("Protocol is null");
                                return null;
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String str = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                C3643iy.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str2 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                C3643iy.m19178e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                                return null;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzbv.zzek();
        return C3653jh.m18862a(httpURLConnection);
    }

    /* renamed from: q */
    private final void m19702q() {
        if (this.f14816A != null) {
            this.f14817a.getView().removeOnAttachStateChangeListener(this.f14816A);
        }
    }

    /* renamed from: r */
    private final void m19703r() {
        if (this.f14821e != null && ((this.f14840x && this.f14842z <= 0) || this.f14841y)) {
            this.f14821e.mo10054a(!this.f14841y);
            this.f14821e = null;
        }
        this.f14817a.mo13478E();
    }

    /* renamed from: a */
    public final zzx mo13535a() {
        return this.f14835s;
    }

    /* renamed from: a */
    public final void mo13536a(int i, int i2) {
        if (this.f14836t != null) {
            this.f14836t.mo12830a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo13537a(int i, int i2, boolean z) {
        this.f14834r.mo13213a(i, i2);
        if (this.f14836t != null) {
            this.f14836t.mo12831a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo13538a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f14818b) {
            this.f14829m = true;
            this.f14817a.mo13477D();
            this.f14830n = onGlobalLayoutListener;
            this.f14831o = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo13610a(zzc zzc) {
        boolean x = this.f14817a.mo13531x();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, (!x || this.f14817a.mo13519r().mo13607d()) ? this.f14819c : null, x ? null : this.f14820d, this.f14833q, this.f14817a.mo13417i());
        m19699a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo13540a(amh amh, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, zzz zzz, zzx zzx, C3753n nVar, C3606ho hoVar) {
        zzb zzb2 = zzb;
        zzd zzd2 = zzd;
        zzz zzz2 = zzz;
        C3753n nVar2 = nVar;
        C3606ho hoVar2 = hoVar;
        zzx zzx2 = zzx == null ? new zzx(this.f14817a.getContext(), hoVar2, null) : zzx;
        this.f14836t = new C3455c(this.f14817a, nVar2);
        this.f14839w = hoVar2;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12640aF)).booleanValue()) {
            mo12610a("/adMetadata", (zzv<? super ReferenceT>) new zza<Object>(zzb2));
        }
        mo12610a("/appEvent", (zzv<? super ReferenceT>) new com.google.android.gms.ads.internal.gmsg.zzc<Object>(zzd2));
        mo12610a("/backButton", zzf.zzblx);
        mo12610a("/refresh", zzf.zzbly);
        mo12610a("/canOpenURLs", zzf.zzblo);
        mo12610a("/canOpenIntents", zzf.zzblp);
        mo12610a("/click", zzf.zzblq);
        mo12610a("/close", zzf.zzblr);
        mo12610a("/customClose", zzf.zzbls);
        mo12610a("/instrument", zzf.zzbmb);
        mo12610a("/delayPageLoaded", zzf.zzbmd);
        mo12610a("/delayPageClosed", zzf.zzbme);
        mo12610a("/getLocationInfo", zzf.zzbmf);
        mo12610a("/httpTrack", zzf.zzblt);
        mo12610a("/log", zzf.zzblu);
        mo12610a("/mraid", (zzv<? super ReferenceT>) new zzac<Object>(zzx2, this.f14836t, nVar2));
        mo12610a("/mraidLoaded", (zzv<? super ReferenceT>) this.f14834r);
        zzad zzad = r1;
        zzx zzx3 = zzx2;
        zzad zzad2 = new zzad(this.f14817a.getContext(), this.f14817a.mo13417i(), this.f14817a.mo13530w(), zzt, amh, zzb, zzd, zzn, zzx2, this.f14836t);
        mo12610a("/open", (zzv<? super ReferenceT>) zzad);
        mo12610a("/precache", (zzv<? super ReferenceT>) new C3821pn<Object>());
        mo12610a("/touch", zzf.zzblw);
        mo12610a("/video", zzf.zzblz);
        mo12610a("/videoMeta", zzf.zzbma);
        if (zzbv.zzfh().mo12999a(this.f14817a.getContext())) {
            mo12610a("/logScionEvent", (zzv<? super ReferenceT>) new zzab<Object>(this.f14817a.getContext()));
        }
        if (zzz2 != null) {
            mo12610a("/setInterstitialProperties", (zzv<? super ReferenceT>) new zzy<Object>(zzz2));
        }
        this.f14819c = amh;
        this.f14820d = zzn;
        this.f14823g = zzb2;
        this.f14824h = zzd;
        this.f14833q = zzt;
        this.f14835s = zzx3;
        this.f14837u = nVar;
        this.f14827k = zzz2;
        this.f14826j = z;
    }

    /* renamed from: a */
    public final void mo13541a(C3868rg rgVar) {
        this.f14821e = rgVar;
    }

    /* renamed from: a */
    public final void mo13542a(C3869rh rhVar) {
        this.f14822f = rhVar;
    }

    /* renamed from: a */
    public final void mo13543a(C3870ri riVar) {
        this.f14825i = riVar;
    }

    /* renamed from: a */
    public final void mo13544a(C3871rj rjVar) {
        this.f14838v = rjVar;
    }

    /* renamed from: a */
    public final void mo12607a(C3885rx rxVar) {
        this.f14840x = true;
        if (this.f14822f != null) {
            this.f14822f.mo12621a();
            this.f14822f = null;
        }
        m19703r();
    }

    /* renamed from: a */
    public final void mo13611a(boolean z) {
        this.f14826j = z;
    }

    /* renamed from: a */
    public final void mo13612a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f14817a.mo13531x() || this.f14817a.mo13519r().mo13607d()) ? this.f14819c : null, this.f14820d, this.f14833q, this.f14817a, z, i, this.f14817a.mo13417i());
        m19699a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo13613a(boolean z, int i, String str) {
        boolean x = this.f14817a.mo13531x();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!x || this.f14817a.mo13519r().mo13607d()) ? this.f14819c : null, x ? null : new C3878rq(this.f14817a, this.f14820d), this.f14823g, this.f14824h, this.f14833q, this.f14817a, z, i, str, this.f14817a.mo13417i());
        m19699a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo13614a(boolean z, int i, String str, String str2) {
        boolean x = this.f14817a.mo13531x();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!x || this.f14817a.mo13519r().mo13607d()) ? this.f14819c : null, x ? null : new C3878rq(this.f14817a, this.f14820d), this.f14823g, this.f14824h, this.f14833q, this.f14817a, z, i, str, str2, this.f14817a.mo13417i());
        m19699a(adOverlayInfoParcel);
    }

    /* renamed from: b */
    public final void mo12604b(C3885rx rxVar) {
        mo12612a(rxVar.f14911b);
    }

    /* renamed from: b */
    public final boolean mo13552b() {
        boolean z;
        synchronized (this.f14818b) {
            z = this.f14828l;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo13615c() {
        boolean z;
        synchronized (this.f14818b) {
            z = this.f14829m;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo12603c(C3885rx rxVar) {
        String str = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(rxVar.f14910a);
        C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        Uri uri = rxVar.f14911b;
        if (mo12612a(uri)) {
            return true;
        }
        if (this.f14826j) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.f14819c != null) {
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12670aj)).booleanValue()) {
                        this.f14819c.onAdClicked();
                        if (this.f14839w != null) {
                            this.f14839w.mo12979a(rxVar.f14910a);
                        }
                        this.f14819c = null;
                    }
                }
                return false;
            }
        }
        if (!this.f14817a.getWebView().willNotDraw()) {
            try {
                afm w = this.f14817a.mo13530w();
                if (w != null && w.mo11853a(uri)) {
                    uri = w.mo11850a(uri, this.f14817a.getContext(), this.f14817a.getView(), this.f14817a.mo13411d());
                }
            } catch (zzcj unused) {
                String str2 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(rxVar.f14910a);
                C3643iy.m19178e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
            if (this.f14835s == null || this.f14835s.zzcy()) {
                zzc zzc = new zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null);
                mo13610a(zzc);
            } else {
                this.f14835s.zzs(rxVar.f14910a);
            }
        } else {
            String str3 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(rxVar.f14910a);
            C3643iy.m19178e(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3));
        }
        return true;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo13616d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f14818b) {
            onGlobalLayoutListener = this.f14830n;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: d */
    public final WebResourceResponse mo13617d(C3885rx rxVar) {
        WebResourceResponse webResourceResponse;
        if (this.f14839w != null) {
            this.f14839w.mo12980a(rxVar.f14910a, rxVar.f14912c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(rxVar.f14910a).getName())) {
            webResourceResponse = null;
        } else {
            mo13564n();
            aqc<String> aqc = this.f14817a.mo13519r().mo13607d() ? aqm.f12618K : this.f14817a.mo13531x() ? aqm.f12617J : aqm.f12616I;
            String str = (String) ane.m16650f().mo12297a(aqc);
            zzbv.zzek();
            webResourceResponse = C3653jh.m18894c(this.f14817a.getContext(), this.f14817a.mo13417i().f15360a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C3615hx.m18682a(rxVar.f14910a, this.f14817a.getContext()).equals(rxVar.f14910a)) {
                return m19701e(rxVar);
            }
            zzhl a = zzhl.m20754a(rxVar.f14910a);
            if (a != null) {
                zzhi a2 = zzbv.zzeq().mo12071a(a);
                if (a2 != null && a2.mo13974a()) {
                    return new WebResourceResponse("", "", a2.mo13975b());
                }
            }
            if (C3723lx.m19149c()) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12722bi)).booleanValue()) {
                    return m19701e(rxVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzbv.zzeo().mo13047a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo13618e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f14818b) {
            onScrollChangedListener = this.f14831o;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo13556f() {
        boolean z;
        synchronized (this.f14818b) {
            z = this.f14832p;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo13557g() {
        C3606ho hoVar = this.f14839w;
        if (hoVar != null) {
            WebView webView = this.f14817a.getWebView();
            if (C0626s.m2883z(webView)) {
                m19698a((View) webView, hoVar, 10);
                return;
            }
            m19702q();
            this.f14816A = new C3877rp(this, hoVar);
            this.f14817a.getView().addOnAttachStateChangeListener(this.f14816A);
        }
    }

    /* renamed from: h */
    public final void mo13558h() {
        synchronized (this.f14818b) {
            this.f14832p = true;
        }
        this.f14842z++;
        m19703r();
    }

    /* renamed from: i */
    public final void mo13559i() {
        this.f14842z--;
        m19703r();
    }

    /* renamed from: j */
    public final void mo13560j() {
        this.f14841y = true;
        m19703r();
    }

    /* renamed from: k */
    public final void mo12614k() {
        if (this.f14839w != null) {
            this.f14839w.mo12986d();
            this.f14839w = null;
        }
        m19702q();
        super.mo12614k();
        synchronized (this.f14818b) {
            this.f14819c = null;
            this.f14820d = null;
            this.f14821e = null;
            this.f14822f = null;
            this.f14823g = null;
            this.f14824h = null;
            this.f14826j = false;
            this.f14828l = false;
            this.f14829m = false;
            this.f14832p = false;
            this.f14833q = null;
            this.f14825i = null;
            if (this.f14836t != null) {
                this.f14836t.mo12833a(true);
                this.f14836t = null;
            }
        }
    }

    /* renamed from: l */
    public final C3871rj mo13619l() {
        return this.f14838v;
    }

    /* renamed from: m */
    public final C3606ho mo13563m() {
        return this.f14839w;
    }

    /* renamed from: n */
    public final void mo13564n() {
        synchronized (this.f14818b) {
            this.f14826j = false;
            this.f14828l = true;
            C3758ne.f14481a.execute(new C3875rn(this));
        }
    }

    /* renamed from: o */
    public final /* synthetic */ Object mo12602o() {
        return this.f14817a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo13620p() {
        this.f14817a.mo13477D();
        com.google.android.gms.ads.internal.overlay.zzd p = this.f14817a.mo13517p();
        if (p != null) {
            p.zznk();
        }
        if (this.f14825i != null) {
            this.f14825i.mo9982a();
            this.f14825i = null;
        }
    }
}

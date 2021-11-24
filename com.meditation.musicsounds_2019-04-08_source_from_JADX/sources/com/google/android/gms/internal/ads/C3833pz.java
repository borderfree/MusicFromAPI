package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p009v4.view.C0626s;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import com.google.android.gms.common.util.C3310o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pz */
public class C3833pz extends WebViewClient implements C3867rf {

    /* renamed from: b */
    private static final String[] f14679b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c */
    private static final String[] f14680c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f14681A;

    /* renamed from: B */
    private boolean f14682B;

    /* renamed from: C */
    private int f14683C;

    /* renamed from: D */
    private OnAttachStateChangeListener f14684D;

    /* renamed from: a */
    protected C3606ho f14685a;

    /* renamed from: d */
    private C3832py f14686d;

    /* renamed from: e */
    private final HashMap<String, List<zzv<? super C3832py>>> f14687e;

    /* renamed from: f */
    private final Object f14688f;

    /* renamed from: g */
    private amh f14689g;

    /* renamed from: h */
    private zzn f14690h;

    /* renamed from: i */
    private C3868rg f14691i;

    /* renamed from: j */
    private C3869rh f14692j;

    /* renamed from: k */
    private zzb f14693k;

    /* renamed from: l */
    private zzd f14694l;

    /* renamed from: m */
    private C3870ri f14695m;

    /* renamed from: n */
    private boolean f14696n;

    /* renamed from: o */
    private zzz f14697o;
    @GuardedBy("mLock")

    /* renamed from: p */
    private boolean f14698p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private boolean f14699q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private OnGlobalLayoutListener f14700r;
    @GuardedBy("mLock")

    /* renamed from: s */
    private OnScrollChangedListener f14701s;
    @GuardedBy("mLock")

    /* renamed from: t */
    private boolean f14702t;

    /* renamed from: u */
    private zzt f14703u;

    /* renamed from: v */
    private final C3699l f14704v;

    /* renamed from: w */
    private zzx f14705w;

    /* renamed from: x */
    private C3455c f14706x;

    /* renamed from: y */
    private C3753n f14707y;

    /* renamed from: z */
    private C3871rj f14708z;

    public C3833pz(C3832py pyVar, boolean z) {
        this(pyVar, z, new C3699l(pyVar, pyVar.mo13514o(), new apx(pyVar.getContext())), null);
    }

    private C3833pz(C3832py pyVar, boolean z, C3699l lVar, C3455c cVar) {
        this.f14687e = new HashMap<>();
        this.f14688f = new Object();
        this.f14696n = false;
        this.f14686d = pyVar;
        this.f14698p = z;
        this.f14704v = lVar;
        this.f14706x = null;
    }

    /* renamed from: a */
    private final void m19448a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12732bs)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            String str5 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString(str5, str4);
                    zzbv.zzek().mo13126a(context, this.f14686d.mo13417i().f15360a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString(str5, str4);
            zzbv.zzek().mo13126a(context, this.f14686d.mo13417i().f15360a, "gmob-apps", bundle, true);
        }
    }

    /* renamed from: a */
    private final void m19449a(Uri uri) {
        String path = uri.getPath();
        List<zzv> list = (List) this.f14687e.get(path);
        if (list != null) {
            zzbv.zzek();
            Map a = C3653jh.m18870a(uri);
            if (C3643iy.m19171a(2)) {
                String str = "Received GMSG: ";
                String valueOf = String.valueOf(path);
                C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                for (String str2 : a.keySet()) {
                    String str3 = (String) a.get(str2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                    sb.append("  ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str3);
                    C3643iy.m18780a(sb.toString());
                }
            }
            for (zzv zza : list) {
                zza.zza(this.f14686d, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        C3643iy.m18780a(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19450a(View view, C3606ho hoVar, int i) {
        if (hoVar.mo12983b() && i > 0) {
            hoVar.mo12978a(view);
            if (hoVar.mo12983b()) {
                C3653jh.f14275a.postDelayed(new C3836qb(this, view, hoVar, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m19451a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f14706x != null ? this.f14706x.mo12834a() : false;
        zzbv.zzei();
        Context context = this.f14686d.getContext();
        if (!a) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.f14685a != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzbyl != null) {
                str = adOverlayInfoParcel.zzbyl.url;
            }
            this.f14685a.mo12979a(str);
        }
    }

    /* renamed from: b */
    private final WebResourceResponse m19453b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzbv.zzek().mo13127a(this.f14686d.getContext(), this.f14686d.mo13417i().f15360a, false, httpURLConnection);
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
                                String str2 = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                C3643iy.m19172b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str3 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                C3643iy.m19178e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
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

    /* renamed from: p */
    private final void m19454p() {
        if (this.f14684D != null) {
            this.f14686d.getView().removeOnAttachStateChangeListener(this.f14684D);
        }
    }

    /* renamed from: q */
    private final void m19455q() {
        if (this.f14691i != null && ((this.f14681A && this.f14683C <= 0) || this.f14682B)) {
            this.f14691i.mo10054a(!this.f14682B);
            this.f14691i = null;
        }
        this.f14686d.mo13478E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo13534a(String str, Map<String, String> map) {
        try {
            String a = C3615hx.m18682a(str, this.f14686d.getContext());
            if (!a.equals(str)) {
                return m19453b(a, map);
            }
            zzhl a2 = zzhl.m20754a(str);
            if (a2 != null) {
                zzhi a3 = zzbv.zzeq().mo12071a(a2);
                if (a3 != null && a3.mo13974a()) {
                    return new WebResourceResponse("", "", a3.mo13975b());
                }
            }
            if (C3723lx.m19149c()) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12722bi)).booleanValue()) {
                    return m19453b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzbv.zzeo().mo13047a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: a */
    public final zzx mo13535a() {
        return this.f14705w;
    }

    /* renamed from: a */
    public final void mo13536a(int i, int i2) {
        if (this.f14706x != null) {
            this.f14706x.mo12830a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo13537a(int i, int i2, boolean z) {
        this.f14704v.mo13213a(i, i2);
        if (this.f14706x != null) {
            this.f14706x.mo12831a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo13538a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f14688f) {
            this.f14699q = true;
            this.f14686d.mo13477D();
            this.f14700r = onGlobalLayoutListener;
            this.f14701s = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo13539a(zzc zzc) {
        boolean x = this.f14686d.mo13531x();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, (!x || this.f14686d.mo13519r().mo13607d()) ? this.f14689g : null, x ? null : this.f14690h, this.f14703u, this.f14686d.mo13417i());
        m19451a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo13540a(amh amh, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, zzz zzz, zzx zzx, C3753n nVar, C3606ho hoVar) {
        zzb zzb2 = zzb;
        zzd zzd2 = zzd;
        zzz zzz2 = zzz;
        C3753n nVar2 = nVar;
        C3606ho hoVar2 = hoVar;
        zzx zzx2 = zzx == null ? new zzx(this.f14686d.getContext(), hoVar2, null) : zzx;
        this.f14706x = new C3455c(this.f14686d, nVar2);
        this.f14685a = hoVar2;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12640aF)).booleanValue()) {
            mo13545a("/adMetadata", (zzv<? super C3832py>) new zza<Object>(zzb2));
        }
        mo13545a("/appEvent", (zzv<? super C3832py>) new com.google.android.gms.ads.internal.gmsg.zzc<Object>(zzd2));
        mo13545a("/backButton", zzf.zzblx);
        mo13545a("/refresh", zzf.zzbly);
        mo13545a("/canOpenURLs", zzf.zzblo);
        mo13545a("/canOpenIntents", zzf.zzblp);
        mo13545a("/click", zzf.zzblq);
        mo13545a("/close", zzf.zzblr);
        mo13545a("/customClose", zzf.zzbls);
        mo13545a("/instrument", zzf.zzbmb);
        mo13545a("/delayPageLoaded", zzf.zzbmd);
        mo13545a("/delayPageClosed", zzf.zzbme);
        mo13545a("/getLocationInfo", zzf.zzbmf);
        mo13545a("/httpTrack", zzf.zzblt);
        mo13545a("/log", zzf.zzblu);
        mo13545a("/mraid", (zzv<? super C3832py>) new zzac<Object>(zzx2, this.f14706x, nVar2));
        mo13545a("/mraidLoaded", (zzv<? super C3832py>) this.f14704v);
        zzad zzad = r1;
        zzx zzx3 = zzx2;
        zzad zzad2 = new zzad(this.f14686d.getContext(), this.f14686d.mo13417i(), this.f14686d.mo13530w(), zzt, amh, zzb, zzd, zzn, zzx2, this.f14706x);
        mo13545a("/open", (zzv<? super C3832py>) zzad);
        mo13545a("/precache", (zzv<? super C3832py>) new C3821pn<Object>());
        mo13545a("/touch", zzf.zzblw);
        mo13545a("/video", zzf.zzblz);
        mo13545a("/videoMeta", zzf.zzbma);
        if (zzbv.zzfh().mo12999a(this.f14686d.getContext())) {
            mo13545a("/logScionEvent", (zzv<? super C3832py>) new zzab<Object>(this.f14686d.getContext()));
        }
        if (zzz2 != null) {
            mo13545a("/setInterstitialProperties", (zzv<? super C3832py>) new zzy<Object>(zzz2));
        }
        this.f14689g = amh;
        this.f14690h = zzn;
        this.f14693k = zzb2;
        this.f14694l = zzd;
        this.f14703u = zzt;
        this.f14705w = zzx3;
        this.f14707y = nVar;
        this.f14697o = zzz2;
        this.f14696n = z;
    }

    /* renamed from: a */
    public final void mo13541a(C3868rg rgVar) {
        this.f14691i = rgVar;
    }

    /* renamed from: a */
    public final void mo13542a(C3869rh rhVar) {
        this.f14692j = rhVar;
    }

    /* renamed from: a */
    public final void mo13543a(C3870ri riVar) {
        this.f14695m = riVar;
    }

    /* renamed from: a */
    public final void mo13544a(C3871rj rjVar) {
        this.f14708z = rjVar;
    }

    /* renamed from: a */
    public final void mo13545a(String str, zzv<? super C3832py> zzv) {
        synchronized (this.f14688f) {
            List list = (List) this.f14687e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f14687e.put(str, list);
            }
            list.add(zzv);
        }
    }

    /* renamed from: a */
    public final void mo13546a(String str, C3310o<zzv<? super C3832py>> oVar) {
        synchronized (this.f14688f) {
            List<zzv> list = (List) this.f14687e.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzv zzv : list) {
                    if (oVar.mo11329a(zzv)) {
                        arrayList.add(zzv);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo13547a(boolean z) {
        this.f14696n = z;
    }

    /* renamed from: a */
    public final void mo13548a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f14686d.mo13531x() || this.f14686d.mo13519r().mo13607d()) ? this.f14689g : null, this.f14690h, this.f14703u, this.f14686d, z, i, this.f14686d.mo13417i());
        m19451a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo13549a(boolean z, int i, String str) {
        boolean x = this.f14686d.mo13531x();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!x || this.f14686d.mo13519r().mo13607d()) ? this.f14689g : null, x ? null : new C3839qe(this.f14686d, this.f14690h), this.f14693k, this.f14694l, this.f14703u, this.f14686d, z, i, str, this.f14686d.mo13417i());
        m19451a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo13550a(boolean z, int i, String str, String str2) {
        boolean x = this.f14686d.mo13531x();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!x || this.f14686d.mo13519r().mo13607d()) ? this.f14689g : null, x ? null : new C3839qe(this.f14686d, this.f14690h), this.f14693k, this.f14694l, this.f14703u, this.f14686d, z, i, str, str2, this.f14686d.mo13417i());
        m19451a(adOverlayInfoParcel);
    }

    /* renamed from: b */
    public final void mo13551b(String str, zzv<? super C3832py> zzv) {
        synchronized (this.f14688f) {
            List list = (List) this.f14687e.get(str);
            if (list != null) {
                list.remove(zzv);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo13552b() {
        boolean z;
        synchronized (this.f14688f) {
            z = this.f14698p;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo13553c() {
        boolean z;
        synchronized (this.f14688f) {
            z = this.f14699q;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo13554d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f14688f) {
            onGlobalLayoutListener = this.f14700r;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo13555e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f14688f) {
            onScrollChangedListener = this.f14701s;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo13556f() {
        boolean z;
        synchronized (this.f14688f) {
            z = this.f14702t;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo13557g() {
        C3606ho hoVar = this.f14685a;
        if (hoVar != null) {
            WebView webView = this.f14686d.getWebView();
            if (C0626s.m2883z(webView)) {
                m19450a((View) webView, hoVar, 10);
                return;
            }
            m19454p();
            this.f14684D = new C3838qd(this, hoVar);
            this.f14686d.getView().addOnAttachStateChangeListener(this.f14684D);
        }
    }

    /* renamed from: h */
    public final void mo13558h() {
        synchronized (this.f14688f) {
            this.f14702t = true;
        }
        this.f14683C++;
        m19455q();
    }

    /* renamed from: i */
    public final void mo13559i() {
        this.f14683C--;
        m19455q();
    }

    /* renamed from: j */
    public final void mo13560j() {
        this.f14682B = true;
        m19455q();
    }

    /* renamed from: k */
    public final void mo13561k() {
        if (this.f14685a != null) {
            this.f14685a.mo12986d();
            this.f14685a = null;
        }
        m19454p();
        synchronized (this.f14688f) {
            this.f14687e.clear();
            this.f14689g = null;
            this.f14690h = null;
            this.f14691i = null;
            this.f14692j = null;
            this.f14693k = null;
            this.f14694l = null;
            this.f14696n = false;
            this.f14698p = false;
            this.f14699q = false;
            this.f14702t = false;
            this.f14703u = null;
            this.f14695m = null;
            if (this.f14706x != null) {
                this.f14706x.mo12833a(true);
                this.f14706x = null;
            }
        }
    }

    /* renamed from: l */
    public final C3871rj mo13562l() {
        return this.f14708z;
    }

    /* renamed from: m */
    public final C3606ho mo13563m() {
        return this.f14685a;
    }

    /* renamed from: n */
    public final void mo13564n() {
        synchronized (this.f14688f) {
            this.f14696n = false;
            this.f14698p = true;
            C3758ne.f14481a.execute(new C3835qa(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo13565o() {
        this.f14686d.mo13477D();
        com.google.android.gms.ads.internal.overlay.zzd p = this.f14686d.mo13517p();
        if (p != null) {
            p.zznk();
        }
        if (this.f14695m != null) {
            this.f14695m.mo9982a();
            this.f14695m = null;
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        C3643iy.m18780a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m19449a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.f14692j == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.f14692j.mo12621a();
        r0.f14692j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        m19455q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f14681A = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f14688f
            monitor-enter(r1)
            com.google.android.gms.internal.ads.py r2 = r0.f14686d     // Catch:{ all -> 0x002b }
            boolean r2 = r2.mo13532y()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.C3643iy.m18780a(r2)     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.py r2 = r0.f14686d     // Catch:{ all -> 0x002b }
            r2.mo13533z()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.f14681A = r1
            com.google.android.gms.internal.ads.rh r1 = r0.f14692j
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.rh r1 = r0.f14692j
            r1.mo12621a()
            r1 = 0
            r0.f14692j = r1
        L_0x0027:
            r0.m19455q()
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3833pz.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f14679b.length) {
                str3 = f14679b[i2];
                m19448a(this.f14686d.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m19448a(this.f14686d.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            m19448a(this.f14686d.getContext(), "ssl_err", (primaryError < 0 || primaryError >= f14680c.length) ? String.valueOf(primaryError) : f14680c[primaryError], zzbv.zzem().mo13148a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo13534a(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
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

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        C3643iy.m18780a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f14696n && webView == this.f14686d.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.f14689g != null) {
                        if (((Boolean) ane.m16650f().mo12297a(aqm.f12670aj)).booleanValue()) {
                            this.f14689g.onAdClicked();
                            if (this.f14685a != null) {
                                this.f14685a.mo12979a(str);
                            }
                            this.f14689g = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f14686d.getWebView().willNotDraw()) {
                try {
                    afm w = this.f14686d.mo13530w();
                    if (w != null && w.mo11853a(parse)) {
                        parse = w.mo11850a(parse, this.f14686d.getContext(), this.f14686d.getView(), this.f14686d.mo13411d());
                    }
                } catch (zzcj unused) {
                    String str3 = "Unable to append parameter to URL: ";
                    String valueOf2 = String.valueOf(str);
                    C3643iy.m19178e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
                if (this.f14705w == null || this.f14705w.zzcy()) {
                    zzc zzc = new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null);
                    mo13539a(zzc);
                } else {
                    this.f14705w.zzs(str);
                }
            } else {
                String str4 = "AdWebView unable to handle URL: ";
                String valueOf3 = String.valueOf(str);
                C3643iy.m19178e(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
            }
        } else {
            m19449a(parse);
        }
        return true;
    }
}

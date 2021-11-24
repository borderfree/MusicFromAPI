package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.zzah;
import com.google.android.gms.ads.internal.gmsg.zzai;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3524en;
import com.google.android.gms.internal.ads.C3548fk;
import com.google.android.gms.internal.ads.C3606ho;
import com.google.android.gms.internal.ads.C3610hs;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3659jn;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C3840qf;
import com.google.android.gms.internal.ads.C3867rf;
import com.google.android.gms.internal.ads.C3870ri;
import com.google.android.gms.internal.ads.C3873rl;
import com.google.android.gms.internal.ads.ait;
import com.google.android.gms.internal.ads.aix;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.bab;
import com.google.android.gms.internal.ads.bac;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzal extends zzi implements zzai, zzz {

    /* renamed from: k */
    private transient boolean f10172k;

    /* renamed from: l */
    private int f10173l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f10174m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f10175n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f10176o;

    /* renamed from: p */
    private C3610hs f10177p;

    /* renamed from: q */
    private String f10178q;

    /* renamed from: r */
    private final String f10179r;

    /* renamed from: s */
    private final C3548fk f10180s;

    public zzal(Context context, zzjn zzjn, String str, bas bas, zzang zzang, zzw zzw) {
        super(context, zzjn, str, bas, zzang, zzw);
        boolean z = false;
        this.f10172k = false;
        if (zzjn != null && "reward_mb".equals(zzjn.f15499a)) {
            z = true;
        }
        this.f10179r = z ? "/Rewarded" : "/Interstitial";
        this.f10180s = z ? new C3548fk(this.f10120e, this.f10283j, new C2879g(this), this, this) : null;
    }

    /* renamed from: a */
    private static C3623ie m13629a(C3623ie ieVar) {
        C3623ie ieVar2 = ieVar;
        try {
            String jSONObject = C3524en.m18351a(ieVar2.f14161b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ieVar2.f14160a.f15261e);
            bab bab = new bab(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            zzaej zzaej = ieVar2.f14161b;
            bac bac = new bac(Collections.singletonList(bab), ((Long) ane.m16650f().mo12297a(aqm.f12689bB)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaej.f15290H, zzaej.f15291I, "", -1, 0, 1, null, 0, -1, -1, false);
            zzaej zzaej2 = new zzaej(ieVar2.f14160a, zzaej.f15307a, zzaej.f15308b, Collections.emptyList(), Collections.emptyList(), zzaej.f15312f, true, zzaej.f15314h, Collections.emptyList(), zzaej.f15316j, zzaej.f15317k, zzaej.f15318l, zzaej.f15319m, zzaej.f15320n, zzaej.f15321o, zzaej.f15322p, null, zzaej.f15324r, zzaej.f15325s, zzaej.f15326t, zzaej.f15327u, zzaej.f15328v, zzaej.f15330x, zzaej.f15331y, zzaej.f15332z, null, Collections.emptyList(), Collections.emptyList(), zzaej.f15286D, zzaej.f15287E, zzaej.f15288F, zzaej.f15289G, zzaej.f15290H, zzaej.f15291I, zzaej.f15292J, null, zzaej.f15294L, zzaej.f15295M, zzaej.f15296N, zzaej.f15297O, 0, zzaej.f15299Q, Collections.emptyList(), zzaej.f15301S, zzaej.f15302T);
            C3623ie ieVar3 = new C3623ie(ieVar2.f14160a, zzaej2, bac, ieVar2.f14163d, ieVar2.f14164e, ieVar2.f14165f, ieVar2.f14166g, null, ieVar2.f14168i, null);
            return ieVar3;
        } catch (JSONException e) {
            C3643iy.m19173b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return ieVar2;
        }
    }

    /* renamed from: a */
    private final void m13630a(Bundle bundle) {
        zzbv.zzek().mo13132b(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, "gmob-apps", bundle, false);
    }

    /* renamed from: b */
    private final boolean m13633b(boolean z) {
        return this.f10180s != null && z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3832py mo10193a(C3623ie ieVar, zzx zzx, C3606ho hoVar) {
        zzbv.zzel();
        C3832py a = C3840qf.m19490a(this.f10120e.zzrt, C3873rl.m19692a(this.f10120e.zzacv), this.f10120e.zzacv.f15499a, false, false, this.f10120e.f10255b, this.f10120e.zzacr, this.f10116a, this, this.f10124i, ieVar.f14168i);
        a.mo13527t().mo13540a(this, this, null, this, this, ((Boolean) ane.m16650f().mo12297a(aqm.f12669ai)).booleanValue(), this, zzx, this, hoVar);
        mo10285a(a);
        a.mo13487a(ieVar.f14160a.f15278v);
        a.mo13488a("/reward", (zzv<? super C3832py>) new zzah<Object>(this));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10194a(zzjj zzjj, C3622id idVar, boolean z) {
        if (this.f10120e.zzfo() && idVar.f14135b != null) {
            zzbv.zzem();
            C3659jn.m18932a(idVar.f14135b);
        }
        return this.f10119d.zzdz();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10116d() {
        C3832py pyVar = this.f10120e.zzacw != null ? this.f10120e.zzacw.f14135b : null;
        C3623ie ieVar = this.f10120e.zzacx;
        if (!(ieVar == null || ieVar.f14161b == null || !ieVar.f14161b.f15299Q || pyVar == null || !zzbv.zzfa().mo13345a(this.f10120e.zzrt))) {
            int i = this.f10120e.zzacr.f15361b;
            int i2 = this.f10120e.zzacr.f15362c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.f10123h = zzbv.zzfa().mo13342a(sb.toString(), pyVar.getWebView(), "", "javascript", mo10121h());
            if (!(this.f10123h == null || pyVar.getView() == null)) {
                zzbv.zzfa().mo13344a(this.f10123h, pyVar.getView());
                zzbv.zzfa().mo13343a(this.f10123h);
            }
        }
        super.mo10116d();
        this.f10172k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo10195i() {
        if (!(this.f10120e.zzrt instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f10120e.zzrt).getWindow();
        if (!(window == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (!(rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public final void mo10124k_() {
        zzdj();
        super.mo10124k_();
    }

    public final void setImmersiveMode(boolean z) {
        C3266s.m14922b("setImmersiveMode must be called on the main UI thread.");
        this.f10176o = z;
    }

    public final void showInterstitial() {
        Bitmap bitmap;
        C3266s.m14922b("showInterstitial must be called on the main UI thread.");
        if (m13633b(this.f10120e.zzacw != null && this.f10120e.zzacw.f14147n)) {
            this.f10180s.mo12908a(this.f10176o);
            return;
        }
        if (zzbv.zzfh().mo13005d(this.f10120e.zzrt)) {
            this.f10178q = zzbv.zzfh().mo13010g(this.f10120e.zzrt);
            String valueOf = String.valueOf(this.f10178q);
            String valueOf2 = String.valueOf(this.f10179r);
            this.f10178q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.f10120e.zzacw == null) {
            C3643iy.m19178e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12731br)).booleanValue()) {
            String packageName = (this.f10120e.zzrt.getApplicationContext() != null ? this.f10120e.zzrt.getApplicationContext() : this.f10120e.zzrt).getPackageName();
            if (!this.f10172k) {
                C3643iy.m19178e("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m13630a(bundle);
            }
            zzbv.zzek();
            if (!C3653jh.m18906g(this.f10120e.zzrt)) {
                C3643iy.m19178e("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                m13630a(bundle2);
            }
        }
        if (!this.f10120e.zzfp()) {
            if (this.f10120e.zzacw.f14147n && this.f10120e.zzacw.f14149p != null) {
                try {
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12651aQ)).booleanValue()) {
                        this.f10120e.zzacw.f14149p.mo12696a(this.f10176o);
                    }
                    this.f10120e.zzacw.f14149p.mo12697b();
                } catch (RemoteException e) {
                    C3643iy.m19175c("Could not show interstitial.", e);
                    zzdj();
                }
            } else if (this.f10120e.zzacw.f14135b == null) {
                C3643iy.m19178e("The interstitial failed to load.");
            } else if (this.f10120e.zzacw.f14135b.mo13531x()) {
                C3643iy.m19178e("The interstitial is already showing.");
            } else {
                this.f10120e.zzacw.f14135b.mo13493b(true);
                this.f10120e.mo10254a(this.f10120e.zzacw.f14135b.getView());
                if (this.f10120e.zzacw.f14144k != null) {
                    this.f10122g.mo11940a(this.f10120e.zzacv, this.f10120e.zzacw);
                }
                if (C3309n.m15070b()) {
                    C3622id idVar = this.f10120e.zzacw;
                    if (idVar.mo13023a()) {
                        new ait(this.f10120e.zzrt, idVar.f14135b.getView()).mo11979a((aix) idVar.f14135b);
                    } else {
                        idVar.f14135b.mo13527t().mo13543a((C3870ri) new C2878f(this, idVar));
                    }
                }
                if (this.f10120e.f10277x) {
                    zzbv.zzek();
                    bitmap = C3653jh.m18907h(this.f10120e.zzrt);
                } else {
                    bitmap = null;
                }
                this.f10173l = zzbv.zzfe().mo13216a(bitmap);
                if (!((Boolean) ane.m16650f().mo12297a(aqm.f12705bR)).booleanValue() || bitmap == null) {
                    zzaq zzaq = new zzaq(this.f10120e.f10277x, mo10195i(), false, 0.0f, -1, this.f10176o, this.f10120e.zzacw.f14126L, this.f10120e.zzacw.f14129O);
                    int requestedOrientation = this.f10120e.zzacw.f14135b.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.f10120e.zzacw.f14141h;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.f10120e.zzacw.f14135b, requestedOrientation, this.f10120e.zzacr, this.f10120e.zzacw.f14115A, zzaq);
                    zzbv.zzei();
                    zzl.zza(this.f10120e.zzrt, adOverlayInfoParcel, true);
                    return;
                }
                new C2901h(this, this.f10173l).mo13086h();
            }
        }
    }

    public final void zza(C3623ie ieVar, aqz aqz) {
        if (ieVar.f14164e != -2) {
            super.zza(ieVar, aqz);
            return;
        }
        if (m13633b(ieVar.f14162c != null)) {
            this.f10180s.mo12910c();
            return;
        }
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12654aT)).booleanValue()) {
            super.zza(ieVar, aqz);
            return;
        }
        boolean z = !ieVar.f14161b.f15313g;
        if (m13596a(ieVar.f14160a.f15259c) && z) {
            this.f10120e.zzacx = m13629a(ieVar);
        }
        super.zza(this.f10120e.zzacx, aqz);
    }

    public final void zza(boolean z, float f) {
        this.f10174m = z;
        this.f10175n = f;
    }

    public final boolean zza(C3622id idVar, C3622id idVar2) {
        if (m13633b(idVar2.f14147n)) {
            return C3548fk.m18401a(idVar, idVar2);
        }
        if (!super.zza(idVar, idVar2)) {
            return false;
        }
        if (!(this.f10120e.zzfo() || this.f10120e.f10276w == null || idVar2.f14144k == null)) {
            this.f10122g.mo11941a(this.f10120e.zzacv, idVar2, this.f10120e.f10276w);
        }
        mo10274b(idVar2, false);
        return true;
    }

    public final boolean zza(zzjj zzjj, aqz aqz) {
        if (this.f10120e.zzacw != null) {
            C3643iy.m19178e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f10177p == null && m13596a(zzjj) && zzbv.zzfh().mo13005d(this.f10120e.zzrt) && !TextUtils.isEmpty(this.f10120e.zzacp)) {
            this.f10177p = new C3610hs(this.f10120e.zzrt, this.f10120e.zzacp);
        }
        return super.zza(zzjj, aqz);
    }

    public final void zzb(zzaig zzaig) {
        if (m13633b(this.f10120e.zzacw != null && this.f10120e.zzacw.f14147n)) {
            mo10111a(this.f10180s.mo12906a(zzaig));
            return;
        }
        if (this.f10120e.zzacw != null) {
            if (this.f10120e.zzacw.f14157x != null) {
                zzbv.zzek();
                C3653jh.m18876a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, this.f10120e.zzacw.f14157x);
            }
            if (this.f10120e.zzacw.f14155v != null) {
                zzaig = this.f10120e.zzacw.f14155v;
            }
        }
        mo10111a(zzaig);
    }

    public final void zzcb() {
        super.zzcb();
        this.f10122g.mo11939a(this.f10120e.zzacw);
        if (this.f10177p != null) {
            this.f10177p.mo12995a(false);
        }
        mo10118g();
    }

    public final void zzcc() {
        recordImpression();
        super.zzcc();
        if (!(this.f10120e.zzacw == null || this.f10120e.zzacw.f14135b == null)) {
            C3867rf t = this.f10120e.zzacw.f14135b.mo13527t();
            if (t != null) {
                t.mo13557g();
            }
        }
        if (!(!zzbv.zzfh().mo13005d(this.f10120e.zzrt) || this.f10120e.zzacw == null || this.f10120e.zzacw.f14135b == null)) {
            zzbv.zzfh().mo13002c(this.f10120e.zzacw.f14135b.getContext(), this.f10178q);
        }
        if (this.f10177p != null) {
            this.f10177p.mo12995a(true);
        }
        if (this.f10123h != null && this.f10120e.zzacw != null && this.f10120e.zzacw.f14135b != null) {
            this.f10120e.zzacw.f14135b.mo12588a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
        }
    }

    public final void zzcz() {
        zzd p = this.f10120e.zzacw.f14135b.mo13517p();
        if (p != null) {
            p.close();
        }
    }

    public final void zzd(boolean z) {
        this.f10120e.f10277x = z;
    }

    public final void zzdj() {
        zzbv.zzfe().mo13218b(Integer.valueOf(this.f10173l));
        if (this.f10120e.zzfo()) {
            this.f10120e.zzfm();
            this.f10120e.zzacw = null;
            this.f10120e.f10277x = false;
            this.f10172k = false;
        }
    }

    public final void zzdk() {
        if (m13633b(this.f10120e.zzacw != null && this.f10120e.zzacw.f14147n)) {
            this.f10180s.mo12914g();
            mo10127o_();
            return;
        }
        if (!(this.f10120e.zzacw == null || this.f10120e.zzacw.f14156w == null)) {
            zzbv.zzek();
            C3653jh.m18876a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, this.f10120e.zzacw.f14156w);
        }
        mo10127o_();
    }

    public final void zzdl() {
        if (m13633b(this.f10120e.zzacw != null && this.f10120e.zzacw.f14147n)) {
            this.f10180s.mo12915h();
        }
        mo10128p_();
    }
}

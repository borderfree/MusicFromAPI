package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3304i;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3402ae;
import com.google.android.gms.internal.ads.C3413an;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3466ck;
import com.google.android.gms.internal.ads.C3549fl;
import com.google.android.gms.internal.ads.C3554fq;
import com.google.android.gms.internal.ads.C3557ft;
import com.google.android.gms.internal.ads.C3566gb;
import com.google.android.gms.internal.ads.C3615hx;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3624if;
import com.google.android.gms.internal.ads.C3633io;
import com.google.android.gms.internal.ads.C3635iq;
import com.google.android.gms.internal.ads.C3640iv;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3719lt;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.C3873rl;
import com.google.android.gms.internal.ads.C4054x;
import com.google.android.gms.internal.ads.ahv;
import com.google.android.gms.internal.ads.akv;
import com.google.android.gms.internal.ads.akw;
import com.google.android.gms.internal.ads.amh;
import com.google.android.gms.internal.ads.amn;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.anh;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aoa;
import com.google.android.gms.internal.ads.aoe;
import com.google.android.gms.internal.ads.aok;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.aqx;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.arf;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzms;
import com.google.android.gms.internal.ads.zzmu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public abstract class zza extends anw implements zzb, zzd, zzt, amh, C3413an, C3466ck, C3633io {

    /* renamed from: a */
    protected aqz f10116a;

    /* renamed from: b */
    protected aqx f10117b;

    /* renamed from: c */
    protected boolean f10118c = false;

    /* renamed from: d */
    protected final zzbl f10119d;

    /* renamed from: e */
    protected final zzbw f10120e;

    /* renamed from: f */
    protected transient zzjj f10121f;

    /* renamed from: g */
    protected final ahv f10122g;

    /* renamed from: h */
    protected C3323b f10123h;

    /* renamed from: i */
    protected final zzw f10124i;

    /* renamed from: j */
    private aqx f10125j;

    /* renamed from: k */
    private final Bundle f10126k = new Bundle();

    /* renamed from: l */
    private boolean f10127l = false;

    zza(zzbw zzbw, zzbl zzbl, zzw zzw) {
        this.f10120e = zzbw;
        this.f10119d = new zzbl(this);
        this.f10124i = zzw;
        zzbv.zzek().mo13133b(this.f10120e.zzrt);
        zzbv.zzek().mo13135c(this.f10120e.zzrt);
        C3640iv.m18774a(this.f10120e.zzrt);
        zzbv.zzfi().mo12609a(this.f10120e.zzrt);
        zzbv.zzeo().mo13044a(this.f10120e.zzrt, this.f10120e.zzacr);
        zzbv.zzeq().mo12073a(this.f10120e.zzrt);
        this.f10122g = zzbv.zzeo().mo13055g();
        zzbv.zzen().mo12026a(this.f10120e.zzrt);
        zzbv.zzfk().mo13224a(this.f10120e.zzrt);
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12780cn)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C2915p(this, new CountDownLatch(((Integer) ane.m16650f().mo12297a(aqm.f12782cp)).intValue()), timer), 0, ((Long) ane.m16650f().mo12297a(aqm.f12781co)).longValue());
        }
    }

    /* renamed from: a */
    private static long mo12919a(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            C3731me.m19173b("", e);
            return -1;
        }
    }

    /* renamed from: a */
    protected static boolean m13596a(zzjj zzjj) {
        Bundle bundle = zzjj.f15493m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo10107a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String b : list) {
            arrayList.add(C3615hx.m18683b(b, this.f10120e.zzrt));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10108a(int i) {
        mo10109a(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10109a(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        C3643iy.m19178e(sb.toString());
        this.f10118c = z;
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12091a(i);
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12547a(i);
            } catch (RemoteException e2) {
                C3643iy.m19177d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10110a(View view) {
        zzbx zzbx = this.f10120e.f10256c;
        if (zzbx != null) {
            zzbx.addView(view, zzbv.zzem().mo13162d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10111a(zzaig zzaig) {
        if (this.f10120e.f10273t != null) {
            String str = "";
            int i = 1;
            if (zzaig != null) {
                try {
                    str = zzaig.f15350a;
                    i = zzaig.f15351b;
                } catch (RemoteException e) {
                    C3643iy.m19177d("#007 Could not call remote method.", e);
                    return;
                }
            }
            C3549fl flVar = new C3549fl(str, i);
            this.f10120e.f10273t.mo12548a((C3554fq) flVar);
            if (this.f10120e.f10274u != null) {
                this.f10120e.f10274u.mo12926a(flVar, this.f10120e.zzacx.f14160a.f15278v);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10112a(boolean z) {
        C3643iy.m18780a("Ad finished loading.");
        this.f10118c = z;
        this.f10127l = true;
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12093c();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12546a();
            } catch (RemoteException e2) {
                C3643iy.m19177d("#007 Could not call remote method.", e2);
            }
        }
        if (this.f10120e.f10260g != null) {
            try {
                this.f10120e.f10260g.mo12100a();
            } catch (RemoteException e3) {
                C3643iy.m19177d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo10113a(C3622id idVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<String> mo10114b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(C3615hx.m18682a(a, this.f10120e.zzrt));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo10115b(zzjj zzjj) {
        if (this.f10120e.f10256c == null) {
            return false;
        }
        ViewParent parent = this.f10120e.f10256c.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return zzbv.zzek().mo13129a(view, view.getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10116d() {
        mo10112a(false);
    }

    public void destroy() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: destroy");
        this.f10119d.cancel();
        this.f10122g.mo11944b(this.f10120e.zzacw);
        zzbw zzbw = this.f10120e;
        if (zzbw.f10256c != null) {
            zzbw.f10256c.zzfs();
        }
        zzbw.f10258e = null;
        zzbw.f10260g = null;
        zzbw.f10259f = null;
        zzbw.f10272s = null;
        zzbw.f10261h = null;
        zzbw.zzg(false);
        if (zzbw.f10256c != null) {
            zzbw.f10256c.removeAllViews();
        }
        zzbw.zzfm();
        zzbw.zzfn();
        zzbw.zzacw = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo10118g() {
        if (this.f10123h != null) {
            zzbv.zzfa().mo13347b(this.f10123h);
            this.f10123h = null;
        }
    }

    public String getAdUnitId() {
        return this.f10120e.zzacp;
    }

    public aos getVideoController() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo10121h() {
        C3623ie ieVar = this.f10120e.zzacx;
        if (ieVar == null) {
            return "javascript";
        }
        if (ieVar.f14161b == null) {
            return "javascript";
        }
        String str = ieVar.f14161b.f15302T;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            C3731me.m19175c("", e);
            return "javascript";
        }
    }

    public final boolean isLoading() {
        return this.f10118c;
    }

    public final boolean isReady() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: isLoaded");
        return this.f10120e.zzact == null && this.f10120e.zzacu == null && this.f10120e.zzacw != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public void mo10124k_() {
        C3643iy.m18780a("Ad closing.");
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12090a();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12551d();
            } catch (RemoteException e2) {
                C3643iy.m19177d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m_ */
    public final void mo10125m_() {
        C3643iy.m18780a("Ad leaving application.");
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12092b();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12552e();
            } catch (RemoteException e2) {
                C3643iy.m19177d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final void mo10126n_() {
        C3643iy.m18780a("Ad opening.");
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12094d();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12549b();
            } catch (RemoteException e2) {
                C3643iy.m19177d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o_ */
    public final void mo10127o_() {
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12550c();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public void onAdClicked() {
        if (this.f10120e.zzacw == null) {
            C3643iy.m19178e("Ad state was null when trying to ping click URLs.");
            return;
        }
        C3643iy.m19172b("Pinging click URLs.");
        if (this.f10120e.zzacy != null) {
            this.f10120e.zzacy.mo13028b();
        }
        if (this.f10120e.zzacw.f14136c != null) {
            zzbv.zzek();
            C3653jh.m18876a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, mo10114b(this.f10120e.zzacw.f14136c));
        }
        if (this.f10120e.f10257d != null) {
            try {
                this.f10120e.f10257d.mo12089a();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        if (this.f10120e.f10259f != null) {
            try {
                this.f10120e.f10259f.mo12108a(str, str2);
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p_ */
    public final void mo10128p_() {
        if (this.f10120e.f10273t != null) {
            try {
                this.f10120e.f10273t.mo12553f();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public void pause() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: pause");
    }

    public void resume() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: resume");
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    public void setManualImpressionsEnabled(boolean z) {
        C3643iy.m19178e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public final void setUserId(String str) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setUserId");
        this.f10120e.zzadr = str;
    }

    public final void stopLoading() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: stopLoading");
        this.f10118c = false;
        this.f10120e.zzg(true);
    }

    public final void zza(C3402ae aeVar, String str) {
        C3643iy.m19178e("#006 Unexpected call to a deprecated method.");
    }

    public final void zza(anh anh) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f10120e.f10257d = anh;
    }

    public final void zza(ank ank) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setAdListener");
        this.f10120e.f10258e = ank;
    }

    public final void zza(aoa aoa) {
        this.f10120e.f10260g = aoa;
    }

    public final void zza(aoe aoe) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f10120e.f10259f = aoe;
    }

    public final void zza(aok aok) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f10120e.f10261h = aok;
    }

    public final void zza(aqx aqx) {
        this.f10116a = new aqz(((Boolean) ane.m16650f().mo12297a(aqm.f12621N)).booleanValue(), "load_ad", this.f10120e.zzacv.f15499a);
        this.f10125j = new aqx(-1, null, null);
        if (aqx == null) {
            this.f10117b = new aqx(-1, null, null);
        } else {
            this.f10117b = new aqx(aqx.mo12312a(), aqx.mo12313b(), aqx.mo12314c());
        }
    }

    public void zza(arf arf) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    public final void zza(C3557ft ftVar) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f10120e.f10274u = ftVar;
    }

    public final void zza(C3566gb gbVar) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f10120e.f10273t = gbVar;
    }

    public final void zza(C3623ie ieVar) {
        if (ieVar.f14161b.f15319m != -1 && !TextUtils.isEmpty(ieVar.f14161b.f15329w)) {
            long a = mo12919a(ieVar.f14161b.f15329w);
            if (a != -1) {
                aqx a2 = this.f10116a.mo12319a(ieVar.f14161b.f15319m + a);
                this.f10116a.mo12324a(a2, "stc");
            }
        }
        this.f10116a.mo12321a(ieVar.f14161b.f15329w);
        this.f10116a.mo12324a(this.f10117b, "arf");
        this.f10125j = this.f10116a.mo12318a();
        this.f10116a.mo12322a("gqi", ieVar.f14161b.f15330x);
        this.f10120e.zzact = null;
        this.f10120e.zzacx = ieVar;
        ieVar.f14168i.mo12081a((akw) new C2857af(this, ieVar));
        ieVar.f14168i.mo12082a(com.google.android.gms.internal.ads.zzhu.zza.zzb.AD_LOADED);
        zza(ieVar, this.f10116a);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(C3623ie ieVar, aqz aqz);

    public void zza(C4054x xVar) {
        C3643iy.m19178e("#006 Unexpected call to a deprecated method.");
    }

    public final void zza(zzjn zzjn) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setAdSize");
        this.f10120e.zzacv = zzjn;
        if (!(this.f10120e.zzacw == null || this.f10120e.zzacw.f14135b == null || this.f10120e.zzadv != 0)) {
            this.f10120e.zzacw.f14135b.mo13486a(C3873rl.m19692a(zzjn));
        }
        if (this.f10120e.f10256c != null) {
            if (this.f10120e.f10256c.getChildCount() > 1) {
                this.f10120e.f10256c.removeView(this.f10120e.f10256c.getNextView());
            }
            this.f10120e.f10256c.setMinimumWidth(zzjn.f15504f);
            this.f10120e.f10256c.setMinimumHeight(zzjn.f15501c);
            this.f10120e.f10256c.requestLayout();
        }
    }

    public final void zza(zzlu zzlu) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f10120e.f10269p = zzlu;
    }

    public final void zza(zzmu zzmu) {
        C3266s.m14922b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f10120e.f10268o = zzmu;
    }

    public final void zza(String str, Bundle bundle) {
        this.f10126k.putAll(bundle);
        if (this.f10127l && this.f10120e.f10260g != null) {
            try {
                this.f10120e.f10260g.mo12100a();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zza(HashSet<C3624if> hashSet) {
        this.f10120e.zza(hashSet);
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(C3622id idVar, C3622id idVar2);

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzjj zzjj, aqz aqz);

    public void zzb(C3622id idVar) {
        akv akv;
        com.google.android.gms.internal.ads.zzhu.zza.zzb zzb;
        this.f10116a.mo12324a(this.f10125j, "awr");
        this.f10120e.zzacu = null;
        if (!(idVar.f14137d == -2 || idVar.f14137d == 3 || this.f10120e.zzfl() == null)) {
            zzbv.zzep().mo13084a(this.f10120e.zzfl());
        }
        if (idVar.f14137d == -1) {
            this.f10118c = false;
            return;
        }
        if (mo10113a(idVar)) {
            C3643iy.m19172b("Ad refresh scheduled.");
        }
        if (idVar.f14137d != -2) {
            if (idVar.f14137d == 3) {
                akv = idVar.f14125K;
                zzb = com.google.android.gms.internal.ads.zzhu.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                akv = idVar.f14125K;
                zzb = com.google.android.gms.internal.ads.zzhu.zza.zzb.AD_FAILED_TO_LOAD;
            }
            akv.mo12082a(zzb);
            mo10108a(idVar.f14137d);
            return;
        }
        if (this.f10120e.zzadt == null) {
            this.f10120e.zzadt = new C3635iq(this.f10120e.zzacp);
        }
        if (this.f10120e.f10256c != null) {
            this.f10120e.f10256c.zzfr().mo13185d(idVar.f14116B);
        }
        this.f10122g.mo11939a(this.f10120e.zzacw);
        if (zza(this.f10120e.zzacw, idVar)) {
            this.f10120e.zzacw = idVar;
            zzbw zzbw = this.f10120e;
            if (zzbw.zzacy != null) {
                if (zzbw.zzacw != null) {
                    zzbw.zzacy.mo13025a(zzbw.zzacw.f14158y);
                    zzbw.zzacy.mo13029b(zzbw.zzacw.f14159z);
                    zzbw.zzacy.mo13030b(zzbw.zzacw.f14147n);
                }
                zzbw.zzacy.mo13027a(zzbw.zzacv.f15502d);
            }
            this.f10116a.mo12322a("is_mraid", this.f10120e.zzacw.mo13023a() ? "1" : "0");
            this.f10116a.mo12322a("is_mediation", this.f10120e.zzacw.f14147n ? "1" : "0");
            if (!(this.f10120e.zzacw.f14135b == null || this.f10120e.zzacw.f14135b.mo13527t() == null)) {
                this.f10116a.mo12322a("is_delay_pl", this.f10120e.zzacw.f14135b.mo13527t().mo13556f() ? "1" : "0");
            }
            this.f10116a.mo12324a(this.f10117b, "ttc");
            if (zzbv.zzeo().mo13049b() != null) {
                zzbv.zzeo().mo13049b().mo12309a(this.f10116a);
            }
            zzbv();
            if (this.f10120e.zzfo()) {
                mo10116d();
            }
        }
        if (idVar.f14124J != null) {
            zzbv.zzek().mo13128a(this.f10120e.zzrt, idVar.f14124J);
        }
    }

    public boolean zzb(zzjj zzjj) {
        String sb;
        C3266s.m14922b("#008 Must be called on the main UI thread.: loadAd");
        zzbv.zzeq().mo12072a();
        this.f10126k.clear();
        this.f10127l = false;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12648aN)).booleanValue()) {
            zzjj = zzjj.mo13978a();
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12649aO)).booleanValue()) {
                zzjj.f15483c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        }
        if (C3304i.m15059c(this.f10120e.zzrt) && zzjj.f15491k != null) {
            zzjj = new amn(zzjj).mo12101a(null).mo12102a();
        }
        if (this.f10120e.zzact == null && this.f10120e.zzacu == null) {
            C3643iy.m19176d("Starting ad request.");
            zza((aqx) null);
            this.f10117b = this.f10116a.mo12318a();
            if (zzjj.f15486f) {
                sb = "This request is sent from a test device.";
            } else {
                ane.m16645a();
                String a = C3719lt.m19109a(this.f10120e.zzrt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 71);
                sb2.append("Use AdRequest.Builder.addTestDevice(\"");
                sb2.append(a);
                sb2.append("\") to get test ads on this device.");
                sb = sb2.toString();
            }
            C3643iy.m19176d(sb);
            this.f10119d.zzf(zzjj);
            this.f10118c = zza(zzjj, this.f10116a);
            return this.f10118c;
        }
        C3643iy.m19178e(this.f10121f != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.f10121f = zzjj;
        return false;
    }

    public final Bundle zzba() {
        return this.f10127l ? this.f10126k : new Bundle();
    }

    public final zzw zzbi() {
        return this.f10124i;
    }

    public final C3323b zzbj() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: getAdFrame");
        return C3327d.m15136a(this.f10120e.f10256c);
    }

    public final zzjn zzbk() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.f10120e.zzacv == null) {
            return null;
        }
        return new zzms(this.f10120e.zzacv);
    }

    public final void zzbl() {
        mo10125m_();
    }

    public final void zzbm() {
        C3266s.m14922b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f10120e.zzacw == null) {
            C3643iy.m19178e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C3643iy.m19172b("Pinging manual tracking URLs.");
        if (!this.f10120e.zzacw.f14122H) {
            ArrayList arrayList = new ArrayList();
            if (this.f10120e.zzacw.f14140g != null) {
                arrayList.addAll(this.f10120e.zzacw.f14140g);
            }
            if (!(this.f10120e.zzacw.f14148o == null || this.f10120e.zzacw.f14148o.f13410i == null)) {
                arrayList.addAll(this.f10120e.zzacw.f14148o.f13410i);
            }
            if (!arrayList.isEmpty()) {
                zzbv.zzek();
                C3653jh.m18876a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, (List<String>) arrayList);
                this.f10120e.zzacw.f14122H = true;
            }
        }
    }

    public final void zzbr() {
        C3643iy.m19176d("Ad impression.");
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12096f();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzbs() {
        C3643iy.m19176d("Ad clicked.");
        if (this.f10120e.f10258e != null) {
            try {
                this.f10120e.f10258e.mo12095e();
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzbv() {
        C3622id idVar = this.f10120e.zzacw;
        if (idVar != null && !TextUtils.isEmpty(idVar.f14116B) && !idVar.f14123I && zzbv.zzeu().mo13196b()) {
            C3643iy.m19172b("Sending troubleshooting signals to the server.");
            zzbv.zzeu().mo13195b(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar.f14116B, this.f10120e.zzacp);
            idVar.f14123I = true;
        }
    }

    public final aoe zzbw() {
        return this.f10120e.f10259f;
    }

    public final ank zzbx() {
        return this.f10120e.f10258e;
    }
}

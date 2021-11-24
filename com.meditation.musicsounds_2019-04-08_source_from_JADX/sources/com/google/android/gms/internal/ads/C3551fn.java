package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.C3266s;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.fn */
public final class C3551fn extends zzd implements C3581gq {

    /* renamed from: k */
    private static C3551fn f13995k;

    /* renamed from: l */
    private boolean f13996l;

    /* renamed from: m */
    private boolean f13997m;

    /* renamed from: n */
    private final C3610hs f13998n;

    /* renamed from: o */
    private final C3548fk f13999o;

    public C3551fn(Context context, zzw zzw, zzjn zzjn, bas bas, zzang zzang) {
        super(context, zzjn, null, bas, zzang, zzw);
        f13995k = this;
        this.f13998n = new C3610hs(context, null);
        C3548fk fkVar = new C3548fk(this.f10120e, this.f10283j, this, this, this);
        this.f13999o = fkVar;
    }

    /* renamed from: a */
    private static C3623ie m18432a(C3623ie ieVar) {
        C3623ie ieVar2 = ieVar;
        C3643iy.m18780a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = C3524en.m18351a(ieVar2.f14161b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ieVar2.f14160a.f15261e);
            String jSONObject2 = jSONObject.toString();
            bab bab = new bab(a.toString(), null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            bac bac = new bac(Arrays.asList(new bab[]{bab}), ((Long) ane.m16650f().mo12297a(aqm.f12689bB)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            C3623ie ieVar3 = new C3623ie(ieVar2.f14160a, ieVar2.f14161b, bac, ieVar2.f14163d, ieVar2.f14164e, ieVar2.f14165f, ieVar2.f14166g, ieVar2.f14167h, ieVar2.f14168i, null);
            return ieVar3;
        } catch (JSONException e) {
            C3643iy.m19173b("Unable to generate ad state for non-mediated rewarded video.", e);
            C3623ie ieVar4 = new C3623ie(ieVar2.f14160a, ieVar2.f14161b, null, ieVar2.f14163d, 0, ieVar2.f14165f, ieVar2.f14166g, ieVar2.f14167h, ieVar2.f14168i, null);
            return ieVar4;
        }
    }

    /* renamed from: i */
    public static C3551fn m18434i() {
        return f13995k;
    }

    /* renamed from: a */
    public final C3589gy mo12919a(String str) {
        return this.f13999o.mo12905a(str);
    }

    /* renamed from: a */
    public final void mo10015a() {
        if (zzbv.zzfh().mo13007e(this.f10120e.zzrt)) {
            this.f13998n.mo12995a(true);
        }
        mo10273a(this.f10120e.zzacw, false);
        mo10126n_();
    }

    /* renamed from: a */
    public final void mo12920a(Context context) {
        this.f13999o.mo12907a(context);
    }

    /* renamed from: a */
    public final void mo12921a(zzahk zzahk) {
        C3266s.m14922b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzahk.f15349b)) {
            C3643iy.m19178e("Invalid ad unit id. Aborting.");
            C3653jh.f14275a.post(new C3552fo(this));
            return;
        }
        this.f13996l = false;
        this.f10120e.zzacp = zzahk.f15349b;
        this.f13998n.mo12994a(zzahk.f15349b);
        super.zzb(zzahk.f15348a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10194a(zzjj zzjj, C3622id idVar, boolean z) {
        return false;
    }

    /* renamed from: a_ */
    public final void mo10016a_(zzaig zzaig) {
        zzaig a = this.f13999o.mo12906a(zzaig);
        if (zzbv.zzfh().mo13007e(this.f10120e.zzrt) && a != null) {
            zzbv.zzfh().mo12998a(this.f10120e.zzrt, zzbv.zzfh().mo13013j(this.f10120e.zzrt), this.f10120e.zzacp, a.f15350a, a.f15351b);
        }
        mo10111a(a);
    }

    /* renamed from: b */
    public final void mo10017b() {
        this.f13999o.mo12914g();
        mo10127o_();
    }

    /* renamed from: c */
    public final void mo10018c() {
        if (zzbv.zzfh().mo13007e(this.f10120e.zzrt)) {
            this.f13998n.mo12995a(false);
        }
        mo10124k_();
    }

    public final void destroy() {
        this.f13999o.mo12913f();
        super.destroy();
    }

    /* renamed from: e */
    public final void mo10019e() {
        mo10125m_();
    }

    /* renamed from: f */
    public final void mo10020f() {
        this.f13999o.mo12915h();
        mo10128p_();
    }

    /* renamed from: j */
    public final void mo12922j() {
        C3266s.m14922b("showAd must be called on the main UI thread.");
        if (!mo12923l()) {
            C3643iy.m19178e("The reward video has not loaded.");
        } else {
            this.f13999o.mo12908a(this.f13997m);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public final void mo10124k_() {
        this.f10120e.zzacw = null;
        super.mo10124k_();
    }

    /* renamed from: l */
    public final boolean mo12923l() {
        C3266s.m14922b("isLoaded must be called on the main UI thread.");
        return this.f10120e.zzact == null && this.f10120e.zzacu == null && this.f10120e.zzacw != null;
    }

    /* renamed from: l_ */
    public final void mo10021l_() {
        onAdClicked();
    }

    public final void pause() {
        this.f13999o.mo12911d();
    }

    public final void resume() {
        this.f13999o.mo12912e();
    }

    public final void setImmersiveMode(boolean z) {
        C3266s.m14922b("setImmersiveMode must be called on the main UI thread.");
        this.f13997m = z;
    }

    public final void zza(C3623ie ieVar, aqz aqz) {
        if (ieVar.f14164e != -2) {
            C3653jh.f14275a.post(new C3553fp(this, ieVar));
            return;
        }
        this.f10120e.zzacx = ieVar;
        if (ieVar.f14162c == null) {
            this.f10120e.zzacx = m18432a(ieVar);
        }
        this.f13999o.mo12910c();
    }

    public final boolean zza(C3622id idVar, C3622id idVar2) {
        mo10274b(idVar2, false);
        return C3548fk.m18401a(idVar, idVar2);
    }
}

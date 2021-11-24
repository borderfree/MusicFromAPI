package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.br */
public final class C3446br implements C3442bn<C3832py> {

    /* renamed from: a */
    private C3751my<C3832py> f13631a;

    /* renamed from: b */
    private final zzab f13632b = new zzab(this.f13634d);

    /* renamed from: c */
    private final ash f13633c;

    /* renamed from: d */
    private final Context f13634d;

    /* renamed from: e */
    private final zzang f13635e;

    /* renamed from: f */
    private final zzbc f13636f;

    /* renamed from: g */
    private final afm f13637g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f13638h;

    public C3446br(Context context, zzbc zzbc, String str, afm afm, zzang zzang) {
        C3643iy.m19176d("Webview loading for native ads.");
        this.f13634d = context;
        this.f13636f = zzbc;
        this.f13637g = afm;
        this.f13635e = zzang;
        this.f13638h = str;
        zzbv.zzel();
        C3751my a = C3840qf.m19489a(this.f13634d, this.f13635e, (String) ane.m16650f().mo12297a(aqm.f12711bX), this.f13637g, this.f13636f.zzbi());
        this.f13633c = new ash(zzbc, str);
        this.f13631a = C3740mn.m19193a(a, (C3735mi<? super A, ? extends B>) new C3447bs<Object,Object>(this), C3758ne.f14482b);
        C3738ml.m19187a(this.f13631a, "WebViewNativeAdsUtil.constructor");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C3751my mo12823a(C3832py pyVar) {
        C3643iy.m19176d("Javascript has loaded for native ads.");
        pyVar.mo13527t().mo13540a(this.f13636f, this.f13636f, this.f13636f, this.f13636f, this.f13636f, false, null, new zzx(this.f13634d, null, null), null, null);
        pyVar.mo13488a("/logScionEvent", (zzv<? super C3832py>) this.f13632b);
        pyVar.mo13488a("/logScionEvent", (zzv<? super C3832py>) this.f13633c);
        return C3740mn.m19191a(pyVar);
    }

    /* renamed from: a */
    public final C3751my<JSONObject> mo12815a(JSONObject jSONObject) {
        return C3740mn.m19193a(this.f13631a, (C3735mi<? super A, ? extends B>) new C3448bt<Object,Object>(this, jSONObject), C3758ne.f14481a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C3751my mo12824a(JSONObject jSONObject, C3832py pyVar) {
        jSONObject.put("ads_id", this.f13638h);
        pyVar.mo12596b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return C3740mn.m19191a(new JSONObject());
    }

    /* renamed from: a */
    public final void mo12816a() {
        C3740mn.m19198a(this.f13631a, (C3737mk<V>) new C3457cb<V>(this), C3758ne.f14481a);
    }

    /* renamed from: a */
    public final void mo12817a(String str, zzv<? super C3832py> zzv) {
        C3740mn.m19198a(this.f13631a, (C3737mk<V>) new C3453by<V>(this, str, zzv), C3758ne.f14481a);
    }

    /* renamed from: a */
    public final void mo12818a(String str, JSONObject jSONObject) {
        C3740mn.m19198a(this.f13631a, (C3737mk<V>) new C3456ca<V>(this, str, jSONObject), C3758ne.f14481a);
    }

    /* renamed from: b */
    public final C3751my<JSONObject> mo12819b(JSONObject jSONObject) {
        return C3740mn.m19193a(this.f13631a, (C3735mi<? super A, ? extends B>) new C3449bu<Object,Object>(this, jSONObject), C3758ne.f14481a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C3751my mo12825b(JSONObject jSONObject, C3832py pyVar) {
        jSONObject.put("ads_id", this.f13638h);
        pyVar.mo12596b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return C3740mn.m19191a(new JSONObject());
    }

    /* renamed from: b */
    public final void mo12820b(String str, zzv<? super C3832py> zzv) {
        C3740mn.m19198a(this.f13631a, (C3737mk<V>) new C3454bz<V>(this, str, zzv), C3758ne.f14481a);
    }

    /* renamed from: c */
    public final C3751my<JSONObject> mo12821c(JSONObject jSONObject) {
        return C3740mn.m19193a(this.f13631a, (C3735mi<? super A, ? extends B>) new C3450bv<Object,Object>(this, jSONObject), C3758ne.f14481a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ C3751my mo12826c(JSONObject jSONObject, C3832py pyVar) {
        jSONObject.put("ads_id", this.f13638h);
        pyVar.mo12596b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return C3740mn.m19191a(new JSONObject());
    }

    /* renamed from: d */
    public final C3751my<JSONObject> mo12822d(JSONObject jSONObject) {
        return C3740mn.m19193a(this.f13631a, (C3735mi<? super A, ? extends B>) new C3451bw<Object,Object>(this, jSONObject), C3758ne.f14481a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ C3751my mo12827d(JSONObject jSONObject, C3832py pyVar) {
        jSONObject.put("ads_id", this.f13638h);
        C3763nj njVar = new C3763nj();
        pyVar.mo13488a("/nativeAdPreProcess", (zzv<? super C3832py>) new C3452bx<Object>(this, pyVar, njVar));
        pyVar.mo12596b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return njVar;
    }
}

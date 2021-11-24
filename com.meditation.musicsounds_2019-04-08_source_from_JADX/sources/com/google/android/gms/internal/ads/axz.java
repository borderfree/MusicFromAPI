package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C3310o;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class axz implements axr, axx {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3832py f13297a;

    /* renamed from: b */
    private final Context f13298b;

    public axz(Context context, zzang zzang, afm afm, zzw zzw) {
        this.f13298b = context;
        zzbv.zzel();
        this.f13297a = C3840qf.m19490a(context, C3873rl.m19690a(), "", false, false, afm, zzang, null, null, null, akv.m16455a());
        this.f13297a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    private static void m17645a(Runnable runnable) {
        ane.m16645a();
        if (C3719lt.m19120b()) {
            runnable.run();
        } else {
            C3653jh.f14275a.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo12590a() {
        this.f13297a.destroy();
    }

    /* renamed from: a */
    public final void mo12591a(axy axy) {
        C3867rf t = this.f13297a.mo13527t();
        axy.getClass();
        t.mo13542a(ayc.m17662a(axy));
    }

    /* renamed from: a */
    public final void mo12592a(String str) {
        m17645a((Runnable) new aye(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: a */
    public final void mo12617a(String str, zzv<? super azg> zzv) {
        this.f13297a.mo13488a(str, (zzv<? super C3832py>) new ayh<Object>(this, zzv));
    }

    /* renamed from: a */
    public final void mo12593a(String str, String str2) {
        axs.m17625a((axr) this, str, str2);
    }

    /* renamed from: a */
    public final void mo12588a(String str, Map map) {
        axs.m17626a((axr) this, str, map);
    }

    /* renamed from: a */
    public final void mo12589a(String str, JSONObject jSONObject) {
        axs.m17628b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final azh mo12594b() {
        return new azi(this);
    }

    /* renamed from: b */
    public final void mo12595b(String str) {
        m17645a((Runnable) new aya(this, str));
    }

    /* renamed from: b */
    public final void mo12618b(String str, zzv<? super azg> zzv) {
        this.f13297a.mo13489a(str, (C3310o<zzv<? super C3832py>>) new ayb<zzv<? super C3832py>>(zzv));
    }

    /* renamed from: b */
    public final void mo12596b(String str, JSONObject jSONObject) {
        axs.m17627a((axr) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo12597c(String str) {
        m17645a((Runnable) new ayf(this, str));
    }

    /* renamed from: d */
    public final void mo12598d(String str) {
        m17645a((Runnable) new ayg(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12619e(String str) {
        this.f13297a.mo12595b(str);
    }
}

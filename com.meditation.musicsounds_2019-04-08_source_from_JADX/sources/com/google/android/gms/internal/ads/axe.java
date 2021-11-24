package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.dynamic.C3323b;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class axe extends anw {

    /* renamed from: a */
    private final String f13268a;

    /* renamed from: b */
    private boolean f13269b;

    /* renamed from: c */
    private final avu f13270c;

    /* renamed from: d */
    private zzal f13271d;

    /* renamed from: e */
    private final aww f13272e;

    public axe(Context context, String str, bas bas, zzang zzang, zzw zzw) {
        this(str, new avu(context, bas, zzang, zzw));
    }

    private axe(String str, avu avu) {
        this.f13268a = str;
        this.f13270c = avu;
        this.f13272e = new aww();
        zzbv.zzex().mo12559a(avu);
    }

    /* renamed from: a */
    private final void m17597a() {
        if (this.f13271d == null) {
            this.f13271d = this.f13270c.mo12533a(this.f13268a);
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void destroy() {
        if (this.f13271d != null) {
            this.f13271d.destroy();
        }
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String getMediationAdapterClassName() {
        if (this.f13271d != null) {
            return this.f13271d.getMediationAdapterClassName();
        }
        return null;
    }

    public final aos getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final boolean isLoading() {
        return this.f13271d != null && this.f13271d.isLoading();
    }

    public final boolean isReady() {
        return this.f13271d != null && this.f13271d.isReady();
    }

    public final void pause() {
        if (this.f13271d != null) {
            this.f13271d.pause();
        }
    }

    public final void resume() {
        if (this.f13271d != null) {
            this.f13271d.resume();
        }
    }

    public final void setImmersiveMode(boolean z) {
        this.f13269b = z;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        m17597a();
        if (this.f13271d != null) {
            this.f13271d.setManualImpressionsEnabled(z);
        }
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() {
        if (this.f13271d != null) {
            this.f13271d.setImmersiveMode(this.f13269b);
            this.f13271d.showInterstitial();
            return;
        }
        C3643iy.m19178e("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() {
        if (this.f13271d != null) {
            this.f13271d.stopLoading();
        }
    }

    public final void zza(C3402ae aeVar, String str) {
        C3643iy.m19178e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void zza(anh anh) {
        this.f13272e.f13239e = anh;
        if (this.f13271d != null) {
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void zza(ank ank) {
        this.f13272e.f13235a = ank;
        if (this.f13271d != null) {
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void zza(aoa aoa) {
        this.f13272e.f13236b = aoa;
        if (this.f13271d != null) {
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void zza(aoe aoe) {
        this.f13272e.f13237c = aoe;
        if (this.f13271d != null) {
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void zza(aok aok) {
        m17597a();
        if (this.f13271d != null) {
            this.f13271d.zza(aok);
        }
    }

    public final void zza(arf arf) {
        this.f13272e.f13238d = arf;
        if (this.f13271d != null) {
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void zza(C3566gb gbVar) {
        this.f13272e.f13240f = gbVar;
        if (this.f13271d != null) {
            this.f13272e.mo12555a(this.f13271d);
        }
    }

    public final void zza(C4054x xVar) {
        C3643iy.m19178e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzjn zzjn) {
        if (this.f13271d != null) {
            this.f13271d.zza(zzjn);
        }
    }

    public final void zza(zzlu zzlu) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzmu zzmu) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final boolean zzb(zzjj zzjj) {
        if (!awz.m17558a(zzjj).contains("gw")) {
            m17597a();
        }
        if (awz.m17558a(zzjj).contains("_skipMediation")) {
            m17597a();
        }
        if (zzjj.f15490j != null) {
            m17597a();
        }
        if (this.f13271d != null) {
            return this.f13271d.zzb(zzjj);
        }
        awz zzex = zzbv.zzex();
        if (awz.m17558a(zzjj).contains("_ad")) {
            zzex.mo12560b(zzjj, this.f13268a);
        }
        axc a = zzex.mo12557a(zzjj, this.f13268a);
        if (a != null) {
            if (!a.f13259e) {
                a.mo12576a();
                axd.m17586a().mo12581e();
            } else {
                axd.m17586a().mo12580d();
            }
            this.f13271d = a.f13255a;
            a.f13257c.mo12536a(this.f13272e);
            this.f13272e.mo12555a(this.f13271d);
            return a.f13260f;
        }
        m17597a();
        axd.m17586a().mo12581e();
        return this.f13271d.zzb(zzjj);
    }

    public final Bundle zzba() {
        return this.f13271d != null ? this.f13271d.zzba() : new Bundle();
    }

    public final C3323b zzbj() {
        if (this.f13271d != null) {
            return this.f13271d.zzbj();
        }
        return null;
    }

    public final zzjn zzbk() {
        if (this.f13271d != null) {
            return this.f13271d.zzbk();
        }
        return null;
    }

    public final void zzbm() {
        if (this.f13271d != null) {
            this.f13271d.zzbm();
        } else {
            C3643iy.m19178e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final aoe zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final ank zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String zzck() {
        if (this.f13271d != null) {
            return this.f13271d.zzck();
        }
        return null;
    }
}

package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.zza;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.amh;
import com.google.android.gms.internal.ads.ape;

public final class InterstitialAd {

    /* renamed from: a */
    private final ape f9871a;

    public InterstitialAd(Context context) {
        this.f9871a = new ape(context);
        C3266s.m14914a(context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f9871a.mo12215a();
    }

    public final String getAdUnitId() {
        return this.f9871a.mo12226b();
    }

    public final String getMediationAdapterClassName() {
        return this.f9871a.mo12233h();
    }

    public final boolean isLoaded() {
        return this.f9871a.mo12230e();
    }

    public final boolean isLoading() {
        return this.f9871a.mo12231f();
    }

    public final void loadAd(AdRequest adRequest) {
        this.f9871a.mo12223a(adRequest.zzay());
    }

    public final void setAdListener(AdListener adListener) {
        this.f9871a.mo12216a(adListener);
        if (adListener == null || !(adListener instanceof amh)) {
            if (adListener == null) {
                this.f9871a.mo12222a((amh) null);
            }
            return;
        }
        this.f9871a.mo12222a((amh) adListener);
    }

    public final void setAdUnitId(String str) {
        this.f9871a.mo12224a(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.f9871a.mo12227b(z);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f9871a.mo12220a(rewardedVideoAdListener);
    }

    public final void show() {
        this.f9871a.mo12234i();
    }

    public final void zza(zza zza) {
        this.f9871a.mo12221a(zza);
    }

    public final void zza(boolean z) {
        this.f9871a.mo12225a(true);
    }

    public final Bundle zzba() {
        return this.f9871a.mo12232g();
    }
}

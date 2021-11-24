package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.ape;

public final class PublisherInterstitialAd {

    /* renamed from: a */
    private final ape f9886a;

    public PublisherInterstitialAd(Context context) {
        this.f9886a = new ape(context, this);
        C3266s.m14914a(context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f9886a.mo12215a();
    }

    public final String getAdUnitId() {
        return this.f9886a.mo12226b();
    }

    public final AppEventListener getAppEventListener() {
        return this.f9886a.mo12228c();
    }

    public final String getMediationAdapterClassName() {
        return this.f9886a.mo12233h();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f9886a.mo12229d();
    }

    public final boolean isLoaded() {
        return this.f9886a.mo12230e();
    }

    public final boolean isLoading() {
        return this.f9886a.mo12231f();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f9886a.mo12223a(publisherAdRequest.zzay());
    }

    public final void setAdListener(AdListener adListener) {
        this.f9886a.mo12216a(adListener);
    }

    public final void setAdUnitId(String str) {
        this.f9886a.mo12224a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f9886a.mo12218a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.f9886a.mo12217a(correlator);
    }

    public final void setImmersiveMode(boolean z) {
        this.f9886a.mo12227b(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f9886a.mo12219a(onCustomRenderedAdLoadedListener);
    }

    public final void show() {
        this.f9886a.mo12234i();
    }
}

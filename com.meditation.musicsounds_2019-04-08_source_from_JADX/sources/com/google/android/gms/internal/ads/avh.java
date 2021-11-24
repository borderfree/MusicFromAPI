package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;

@C3464ci
public final class avh extends aup {

    /* renamed from: a */
    private final OnUnifiedNativeAdLoadedListener f13184a;

    public avh(OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f13184a = onUnifiedNativeAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12516a(auu auu) {
        this.f13184a.onUnifiedNativeAdLoaded(new aux(auu));
    }
}

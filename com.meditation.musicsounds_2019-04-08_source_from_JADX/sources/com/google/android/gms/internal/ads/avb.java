package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@C3464ci
public final class avb extends aud {

    /* renamed from: a */
    private final OnContentAdLoadedListener f13174a;

    public avb(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f13174a = onContentAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12487a(atq atq) {
        this.f13174a.onContentAdLoaded(new att(atq));
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@C3464ci
public final class ava extends atz {

    /* renamed from: a */
    private final OnAppInstallAdLoadedListener f13173a;

    public ava(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f13173a = onAppInstallAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12486a(atm atm) {
        this.f13173a.onAppInstallAdLoaded(new atp(atm));
    }
}

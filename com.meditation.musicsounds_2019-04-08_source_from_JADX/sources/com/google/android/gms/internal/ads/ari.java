package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@C3464ci
public final class ari extends arg {

    /* renamed from: a */
    private final OnCustomRenderedAdLoadedListener f12953a;

    public ari(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f12953a = onCustomRenderedAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12333a(arc arc) {
        this.f12953a.onCustomRenderedAdLoaded(new arb(arc));
    }
}

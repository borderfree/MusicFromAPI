package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@C3464ci
public final class amj extends anl {

    /* renamed from: a */
    private final AdListener f12423a;

    public amj(AdListener adListener) {
        this.f12423a = adListener;
    }

    /* renamed from: a */
    public final void mo12090a() {
        this.f12423a.onAdClosed();
    }

    /* renamed from: a */
    public final void mo12091a(int i) {
        this.f12423a.onAdFailedToLoad(i);
    }

    /* renamed from: b */
    public final void mo12092b() {
        this.f12423a.onAdLeftApplication();
    }

    /* renamed from: c */
    public final void mo12093c() {
        this.f12423a.onAdLoaded();
    }

    /* renamed from: d */
    public final void mo12094d() {
        this.f12423a.onAdOpened();
    }

    /* renamed from: e */
    public final void mo12095e() {
        this.f12423a.onAdClicked();
    }

    /* renamed from: f */
    public final void mo12096f() {
        this.f12423a.onAdImpression();
    }

    /* renamed from: g */
    public final AdListener mo12097g() {
        return this.f12423a;
    }
}

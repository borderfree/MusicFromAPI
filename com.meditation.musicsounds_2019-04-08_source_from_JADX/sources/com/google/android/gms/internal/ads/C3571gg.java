package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.gg */
public final class C3571gg extends C3567gc {

    /* renamed from: a */
    private RewardedVideoAdListener f14008a;

    public C3571gg(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f14008a = rewardedVideoAdListener;
    }

    /* renamed from: a */
    public final void mo12546a() {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoAdLoaded();
        }
    }

    /* renamed from: a */
    public final void mo12547a(int i) {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    /* renamed from: a */
    public final void mo12931a(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f14008a = rewardedVideoAdListener;
    }

    /* renamed from: a */
    public final void mo12548a(C3554fq fqVar) {
        if (this.f14008a != null) {
            this.f14008a.onRewarded(new C3569ge(fqVar));
        }
    }

    /* renamed from: b */
    public final void mo12549b() {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo12550c() {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoStarted();
        }
    }

    /* renamed from: d */
    public final void mo12551d() {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoAdClosed();
        }
    }

    /* renamed from: e */
    public final void mo12552e() {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoAdLeftApplication();
        }
    }

    /* renamed from: f */
    public final void mo12553f() {
        if (this.f14008a != null) {
            this.f14008a.onRewardedVideoCompleted();
        }
    }

    /* renamed from: g */
    public final RewardedVideoAdListener mo12932g() {
        return this.f14008a;
    }
}

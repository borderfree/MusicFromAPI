package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.a */
final class C2394a implements RewardedVideoAdListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f7586a;

    C2394a(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f7586a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f7586a.zzhb.onRewarded(this.f7586a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        this.f7586a.zzhb.onAdClosed(this.f7586a);
        this.f7586a.zzha = null;
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f7586a.zzhb.onAdFailedToLoad(this.f7586a, i);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f7586a.zzhb.onAdLeftApplication(this.f7586a);
    }

    public final void onRewardedVideoAdLoaded() {
        this.f7586a.zzhb.onAdLoaded(this.f7586a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f7586a.zzhb.onAdOpened(this.f7586a);
    }

    public final void onRewardedVideoCompleted() {
        this.f7586a.zzhb.onVideoCompleted(this.f7586a);
    }

    public final void onRewardedVideoStarted() {
        this.f7586a.zzhb.onVideoStarted(this.f7586a);
    }
}

package com.facebook.ads.internal.view.p093g.p095b;

/* renamed from: com.facebook.ads.internal.view.g.b.z */
public enum C2040z {
    REWARDED_VIDEO_COMPLETE("com.facebook.ads.rewarded_video.completed"),
    REWARDED_VIDEO_COMPLETE_WITHOUT_REWARD("com.facebook.ads.rewarded_video.completed.without.reward"),
    REWARDED_VIDEO_END_ACTIVITY("com.facebook.ads.rewarded_video.end_activity"),
    REWARDED_VIDEO_ERROR("com.facebook.ads.rewarded_video.error"),
    REWARDED_VIDEO_AD_CLICK("com.facebook.ads.rewarded_video.ad_click"),
    REWARDED_VIDEO_IMPRESSION("com.facebook.ads.rewarded_video.ad_impression"),
    REWARDED_VIDEO_CLOSED("com.facebook.ads.rewarded_video.closed"),
    REWARD_SERVER_SUCCESS("com.facebook.ads.rewarded_video.server_reward_success"),
    REWARD_SERVER_FAILED("com.facebook.ads.rewarded_video.server_reward_failed"),
    REWARDED_VIDEO_ACTIVITY_DESTROYED("com.facebook.ads.rewarded_video.activity_destroyed");
    

    /* renamed from: k */
    private String f6698k;

    private C2040z(String str) {
        this.f6698k = str;
    }

    /* renamed from: a */
    public String mo7487a() {
        return this.f6698k;
    }

    /* renamed from: a */
    public String mo7488a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6698k);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}

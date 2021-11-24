package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.apf;
import com.google.android.gms.internal.ads.aph;

public class MobileAds {

    public static final class Settings {

        /* renamed from: a */
        private final aph f9872a = new aph();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final aph mo9683a() {
            return this.f9872a;
        }

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }
    }

    private MobileAds() {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return apf.m16830a().mo12235a(context);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        apf.m16830a().mo12238a(context, str, settings == null ? null : settings.mo9683a());
    }

    public static void openDebugMenu(Context context, String str) {
        apf.m16830a().mo12237a(context, str);
    }

    public static void setAppMuted(boolean z) {
        apf.m16830a().mo12239a(z);
    }

    public static void setAppVolume(float f) {
        apf.m16830a().mo12236a(f);
    }
}

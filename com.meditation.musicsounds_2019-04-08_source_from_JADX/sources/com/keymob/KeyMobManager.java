package com.keymob;

import android.app.Activity;

public interface KeyMobManager {

    public interface OnKeyMobBannerClickListener {
        void onKeyMobBannerClicked(String str, String str2);
    }

    public interface OnKeyMobBannerLoadedListener {
        void onKeyMobBannerLoaded();
    }

    public interface OnKeyMobInitListener {
        void onKeyMobInitSuccess();
    }

    OnKeyMobBannerLoadedListener getOnBannerLoadedListener();

    void initFromAssets(Activity activity, String str);

    void initFromKeymobService(Activity activity, String str, boolean z);

    boolean isInited();

    void removeBanner();

    void setLogEnabled(boolean z);

    void setOnBannerClickListener(OnKeyMobBannerClickListener onKeyMobBannerClickListener);

    void setOnBannerLoadedListener(OnKeyMobBannerLoadedListener onKeyMobBannerLoadedListener);

    void setOnInitListener(OnKeyMobInitListener onKeyMobInitListener);

    void showBanner(boolean z, Activity activity);

    void showInterstitial(Activity activity);
}

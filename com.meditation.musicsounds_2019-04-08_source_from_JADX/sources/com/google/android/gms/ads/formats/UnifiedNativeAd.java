package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class UnifiedNativeAd {

    public interface OnUnifiedNativeAdLoadedListener {
        void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd);
    }

    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo9904a();

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    public abstract AdChoicesInfo getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract Image getIcon();

    public abstract List<Image> getImages();

    public abstract String getMediationAdapterClassName();

    public abstract String getPrice();

    public abstract Double getStarRating();

    public abstract String getStore();

    public abstract VideoController getVideoController();

    public abstract void performClick(Bundle bundle);

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setUnconfirmedClickListener(UnconfirmedClickListener unconfirmedClickListener);

    public abstract Object zzbh();
}

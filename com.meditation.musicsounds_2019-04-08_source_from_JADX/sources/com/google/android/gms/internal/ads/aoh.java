package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.dynamic.C3323b;

public interface aoh extends IInterface {
    anq createAdLoaderBuilder(C3323b bVar, String str, bas bas, int i);

    C3834q createAdOverlay(C3323b bVar);

    anv createBannerAdManager(C3323b bVar, zzjn zzjn, String str, bas bas, int i);

    C3388aa createInAppPurchaseManager(C3323b bVar);

    anv createInterstitialAdManager(C3323b bVar, zzjn zzjn, String str, bas bas, int i);

    atc createNativeAdViewDelegate(C3323b bVar, C3323b bVar2);

    ath createNativeAdViewHolderDelegate(C3323b bVar, C3323b bVar2, C3323b bVar3);

    C3559fv createRewardedVideoAd(C3323b bVar, bas bas, int i);

    anv createSearchAdManager(C3323b bVar, zzjn zzjn, String str, int i);

    aon getMobileAdsSettingsManager(C3323b bVar);

    aon getMobileAdsSettingsManagerWithClientJarVersion(C3323b bVar, int i);
}

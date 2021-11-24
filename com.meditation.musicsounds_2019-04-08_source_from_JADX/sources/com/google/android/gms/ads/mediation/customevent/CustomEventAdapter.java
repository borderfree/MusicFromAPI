package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C3731me;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a */
    private View f10336a;

    /* renamed from: b */
    private CustomEventBanner f10337b;

    /* renamed from: c */
    private CustomEventInterstitial f10338c;

    /* renamed from: d */
    private CustomEventNative f10339d;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C2926a implements CustomEventBannerListener {

        /* renamed from: a */
        private final CustomEventAdapter f10340a;

        /* renamed from: b */
        private final MediationBannerListener f10341b;

        public C2926a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f10340a = customEventAdapter;
            this.f10341b = mediationBannerListener;
        }

        public final void onAdClicked() {
            C3731me.m19172b("Custom event adapter called onAdClicked.");
            this.f10341b.onAdClicked(this.f10340a);
        }

        public final void onAdClosed() {
            C3731me.m19172b("Custom event adapter called onAdClosed.");
            this.f10341b.onAdClosed(this.f10340a);
        }

        public final void onAdFailedToLoad(int i) {
            C3731me.m19172b("Custom event adapter called onAdFailedToLoad.");
            this.f10341b.onAdFailedToLoad(this.f10340a, i);
        }

        public final void onAdLeftApplication() {
            C3731me.m19172b("Custom event adapter called onAdLeftApplication.");
            this.f10341b.onAdLeftApplication(this.f10340a);
        }

        public final void onAdLoaded(View view) {
            C3731me.m19172b("Custom event adapter called onAdLoaded.");
            this.f10340a.m13721a(view);
            this.f10341b.onAdLoaded(this.f10340a);
        }

        public final void onAdOpened() {
            C3731me.m19172b("Custom event adapter called onAdOpened.");
            this.f10341b.onAdOpened(this.f10340a);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C2927b implements CustomEventInterstitialListener {

        /* renamed from: a */
        private final CustomEventAdapter f10342a;

        /* renamed from: b */
        private final MediationInterstitialListener f10343b;

        public C2927b(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f10342a = customEventAdapter;
            this.f10343b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            C3731me.m19172b("Custom event adapter called onAdClicked.");
            this.f10343b.onAdClicked(this.f10342a);
        }

        public final void onAdClosed() {
            C3731me.m19172b("Custom event adapter called onAdClosed.");
            this.f10343b.onAdClosed(this.f10342a);
        }

        public final void onAdFailedToLoad(int i) {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f10343b.onAdFailedToLoad(this.f10342a, i);
        }

        public final void onAdLeftApplication() {
            C3731me.m19172b("Custom event adapter called onAdLeftApplication.");
            this.f10343b.onAdLeftApplication(this.f10342a);
        }

        public final void onAdLoaded() {
            C3731me.m19172b("Custom event adapter called onReceivedAd.");
            this.f10343b.onAdLoaded(CustomEventAdapter.this);
        }

        public final void onAdOpened() {
            C3731me.m19172b("Custom event adapter called onAdOpened.");
            this.f10343b.onAdOpened(this.f10342a);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C2928c implements CustomEventNativeListener {

        /* renamed from: a */
        private final CustomEventAdapter f10345a;

        /* renamed from: b */
        private final MediationNativeListener f10346b;

        public C2928c(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.f10345a = customEventAdapter;
            this.f10346b = mediationNativeListener;
        }

        public final void onAdClicked() {
            C3731me.m19172b("Custom event adapter called onAdClicked.");
            this.f10346b.onAdClicked(this.f10345a);
        }

        public final void onAdClosed() {
            C3731me.m19172b("Custom event adapter called onAdClosed.");
            this.f10346b.onAdClosed(this.f10345a);
        }

        public final void onAdFailedToLoad(int i) {
            C3731me.m19172b("Custom event adapter called onAdFailedToLoad.");
            this.f10346b.onAdFailedToLoad(this.f10345a, i);
        }

        public final void onAdImpression() {
            C3731me.m19172b("Custom event adapter called onAdImpression.");
            this.f10346b.onAdImpression(this.f10345a);
        }

        public final void onAdLeftApplication() {
            C3731me.m19172b("Custom event adapter called onAdLeftApplication.");
            this.f10346b.onAdLeftApplication(this.f10345a);
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            C3731me.m19172b("Custom event adapter called onAdLoaded.");
            this.f10346b.onAdLoaded((MediationNativeAdapter) this.f10345a, nativeAdMapper);
        }

        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            C3731me.m19172b("Custom event adapter called onAdLoaded.");
            this.f10346b.onAdLoaded((MediationNativeAdapter) this.f10345a, unifiedNativeAdMapper);
        }

        public final void onAdOpened() {
            C3731me.m19172b("Custom event adapter called onAdOpened.");
            this.f10346b.onAdOpened(this.f10345a);
        }
    }

    /* renamed from: a */
    private static <T> T m13720a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3731me.m19178e(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13721a(View view) {
        this.f10336a = view;
    }

    public final View getBannerView() {
        return this.f10336a;
    }

    public final void onDestroy() {
        if (this.f10337b != null) {
            this.f10337b.onDestroy();
        }
        if (this.f10338c != null) {
            this.f10338c.onDestroy();
        }
        if (this.f10339d != null) {
            this.f10339d.onDestroy();
        }
    }

    public final void onPause() {
        if (this.f10337b != null) {
            this.f10337b.onPause();
        }
        if (this.f10338c != null) {
            this.f10338c.onPause();
        }
        if (this.f10339d != null) {
            this.f10339d.onPause();
        }
    }

    public final void onResume() {
        if (this.f10337b != null) {
            this.f10337b.onResume();
        }
        if (this.f10338c != null) {
            this.f10338c.onResume();
        }
        if (this.f10339d != null) {
            this.f10339d.onResume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f10337b = (CustomEventBanner) m13720a(bundle.getString("class_name"));
        if (this.f10337b == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
        } else {
            this.f10337b.requestBannerAd(context, new C2926a(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f10338c = (CustomEventInterstitial) m13720a(bundle.getString("class_name"));
        if (this.f10338c == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
        } else {
            this.f10338c.requestInterstitialAd(context, new C2927b(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.f10339d = (CustomEventNative) m13720a(bundle.getString("class_name"));
        if (this.f10339d == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
        } else {
            this.f10339d.requestNativeAd(context, new C2928c(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void showInterstitial() {
        this.f10338c.showInterstitial();
    }
}

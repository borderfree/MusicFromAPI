package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C3731me;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {

    /* renamed from: a */
    private View f7588a;

    /* renamed from: b */
    private CustomEventBanner f7589b;

    /* renamed from: c */
    private CustomEventInterstitial f7590c;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C2396a implements CustomEventBannerListener {

        /* renamed from: a */
        private final CustomEventAdapter f7591a;

        /* renamed from: b */
        private final MediationBannerListener f7592b;

        public C2396a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f7591a = customEventAdapter;
            this.f7592b = mediationBannerListener;
        }

        public final void onClick() {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f7592b.onClick(this.f7591a);
        }

        public final void onDismissScreen() {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f7592b.onDismissScreen(this.f7591a);
        }

        public final void onFailedToReceiveAd() {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f7592b.onFailedToReceiveAd(this.f7591a, ErrorCode.NO_FILL);
        }

        public final void onLeaveApplication() {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f7592b.onLeaveApplication(this.f7591a);
        }

        public final void onPresentScreen() {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f7592b.onPresentScreen(this.f7591a);
        }

        public final void onReceivedAd(View view) {
            C3731me.m19172b("Custom event adapter called onReceivedAd.");
            this.f7591a.m11144a(view);
            this.f7592b.onReceivedAd(this.f7591a);
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C2397b implements CustomEventInterstitialListener {

        /* renamed from: a */
        private final CustomEventAdapter f7593a;

        /* renamed from: b */
        private final MediationInterstitialListener f7594b;

        public C2397b(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f7593a = customEventAdapter;
            this.f7594b = mediationInterstitialListener;
        }

        public final void onDismissScreen() {
            C3731me.m19172b("Custom event adapter called onDismissScreen.");
            this.f7594b.onDismissScreen(this.f7593a);
        }

        public final void onFailedToReceiveAd() {
            C3731me.m19172b("Custom event adapter called onFailedToReceiveAd.");
            this.f7594b.onFailedToReceiveAd(this.f7593a, ErrorCode.NO_FILL);
        }

        public final void onLeaveApplication() {
            C3731me.m19172b("Custom event adapter called onLeaveApplication.");
            this.f7594b.onLeaveApplication(this.f7593a);
        }

        public final void onPresentScreen() {
            C3731me.m19172b("Custom event adapter called onPresentScreen.");
            this.f7594b.onPresentScreen(this.f7593a);
        }

        public final void onReceivedAd() {
            C3731me.m19172b("Custom event adapter called onReceivedAd.");
            this.f7594b.onReceivedAd(CustomEventAdapter.this);
        }
    }

    /* renamed from: a */
    private static <T> T m11143a(String str) {
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
    public final void m11144a(View view) {
        this.f7588a = view;
    }

    public final void destroy() {
        if (this.f7589b != null) {
            this.f7589b.destroy();
        }
        if (this.f7590c != null) {
            this.f7590c.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f7588a;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f7589b = (CustomEventBanner) m11143a(customEventServerParameters.className);
        if (this.f7589b == null) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f7589b.requestBannerAd(new C2396a(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f7590c = (CustomEventInterstitial) m11143a(customEventServerParameters.className);
        if (this.f7590c == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f7590c.requestInterstitialAd(new C2397b(this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public final void showInterstitial() {
        this.f7590c.showInterstitial();
    }
}

package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3719lt;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.amh;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C3464ci
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgw;
    private InterstitialAd zzgx;
    private AdLoader zzgy;
    private Context zzgz;
    /* access modifiers changed from: private */
    public InterstitialAd zzha;
    /* access modifiers changed from: private */
    public MediationRewardedVideoAdListener zzhb;
    private final RewardedVideoAdListener zzhc = new C2394a(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C2388a extends NativeAppInstallAdMapper {

        /* renamed from: e */
        private final NativeAppInstallAd f7572e;

        public C2388a(NativeAppInstallAd nativeAppInstallAd) {
            this.f7572e = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f7572e);
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzvk.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f7572e);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C2389b extends NativeContentAdMapper {

        /* renamed from: e */
        private final NativeContentAd f7573e;

        public C2389b(NativeContentAd nativeContentAd) {
            this.f7573e = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f7573e);
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzvk.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f7573e);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C2390c extends UnifiedNativeAdMapper {

        /* renamed from: a */
        private final UnifiedNativeAd f7574a;

        public C2390c(UnifiedNativeAd unifiedNativeAd) {
            this.f7574a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzl(unifiedNativeAd.zzbh());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f7574a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzvk.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f7574a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C2391d extends AdListener implements AppEventListener, amh {

        /* renamed from: a */
        private final AbstractAdViewAdapter f7575a;

        /* renamed from: b */
        private final MediationBannerListener f7576b;

        public C2391d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f7575a = abstractAdViewAdapter;
            this.f7576b = mediationBannerListener;
        }

        public final void onAdClicked() {
            this.f7576b.onAdClicked(this.f7575a);
        }

        public final void onAdClosed() {
            this.f7576b.onAdClosed(this.f7575a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f7576b.onAdFailedToLoad(this.f7575a, i);
        }

        public final void onAdLeftApplication() {
            this.f7576b.onAdLeftApplication(this.f7575a);
        }

        public final void onAdLoaded() {
            this.f7576b.onAdLoaded(this.f7575a);
        }

        public final void onAdOpened() {
            this.f7576b.onAdOpened(this.f7575a);
        }

        public final void onAppEvent(String str, String str2) {
            this.f7576b.zza(this.f7575a, str, str2);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C2392e extends AdListener implements amh {

        /* renamed from: a */
        private final AbstractAdViewAdapter f7577a;

        /* renamed from: b */
        private final MediationInterstitialListener f7578b;

        public C2392e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f7577a = abstractAdViewAdapter;
            this.f7578b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            this.f7578b.onAdClicked(this.f7577a);
        }

        public final void onAdClosed() {
            this.f7578b.onAdClosed(this.f7577a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f7578b.onAdFailedToLoad(this.f7577a, i);
        }

        public final void onAdLeftApplication() {
            this.f7578b.onAdLeftApplication(this.f7577a);
        }

        public final void onAdLoaded() {
            this.f7578b.onAdLoaded(this.f7577a);
        }

        public final void onAdOpened() {
            this.f7578b.onAdOpened(this.f7577a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C2393f extends AdListener implements OnAppInstallAdLoadedListener, OnContentAdLoadedListener, OnCustomClickListener, OnCustomTemplateAdLoadedListener, OnUnifiedNativeAdLoadedListener {

        /* renamed from: a */
        private final AbstractAdViewAdapter f7579a;

        /* renamed from: b */
        private final MediationNativeListener f7580b;

        public C2393f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f7579a = abstractAdViewAdapter;
            this.f7580b = mediationNativeListener;
        }

        public final void onAdClicked() {
            this.f7580b.onAdClicked(this.f7579a);
        }

        public final void onAdClosed() {
            this.f7580b.onAdClosed(this.f7579a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f7580b.onAdFailedToLoad(this.f7579a, i);
        }

        public final void onAdImpression() {
            this.f7580b.onAdImpression(this.f7579a);
        }

        public final void onAdLeftApplication() {
            this.f7580b.onAdLeftApplication(this.f7579a);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.f7580b.onAdOpened(this.f7579a);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f7580b.onAdLoaded((MediationNativeAdapter) this.f7579a, (NativeAdMapper) new C2388a(nativeAppInstallAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f7580b.onAdLoaded((MediationNativeAdapter) this.f7579a, (NativeAdMapper) new C2389b(nativeContentAd));
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f7580b.zza(this.f7579a, nativeCustomTemplateAd, str);
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f7580b.zza(this.f7579a, nativeCustomTemplateAd);
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f7580b.onAdLoaded((MediationNativeAdapter) this.f7579a, (UnifiedNativeAdMapper) new C2390c(unifiedNativeAd));
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Builder builder = new Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            ane.m16645a();
            builder.addTestDevice(C3719lt.m19109a(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgw;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzaj(1).zzvx();
    }

    public aos getVideoController() {
        if (this.zzgw != null) {
            VideoController videoController = this.zzgw.getVideoController();
            if (videoController != null) {
                return videoController.zzbc();
            }
        }
        return null;
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = mediationRewardedVideoAdListener;
        this.zzhb.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzhb != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzgz == null || this.zzhb == null) {
            C3731me.m19174c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzha = new InterstitialAd(this.zzgz);
        this.zzha.zza(true);
        this.zzha.setAdUnitId(getAdUnitId(bundle));
        this.zzha.setRewardedVideoAdListener(this.zzhc);
        this.zzha.zza((com.google.android.gms.ads.reward.zza) new C2395b(this));
        this.zzha.loadAd(zza(this.zzgz, mediationAdRequest, bundle2, bundle));
    }

    public void onDestroy() {
        if (this.zzgw != null) {
            this.zzgw.destroy();
            this.zzgw = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
        if (this.zzgy != null) {
            this.zzgy = null;
        }
        if (this.zzha != null) {
            this.zzha = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzgx != null) {
            this.zzgx.setImmersiveMode(z);
        }
        if (this.zzha != null) {
            this.zzha.setImmersiveMode(z);
        }
    }

    public void onPause() {
        if (this.zzgw != null) {
            this.zzgw.pause();
        }
    }

    public void onResume() {
        if (this.zzgw != null) {
            this.zzgw.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgw = new AdView(context);
        this.zzgw.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzgw.setAdUnitId(getAdUnitId(bundle));
        this.zzgw.setAdListener(new C2391d(this, mediationBannerListener));
        this.zzgw.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgx = new InterstitialAd(context);
        this.zzgx.setAdUnitId(getAdUnitId(bundle));
        this.zzgx.setAdListener(new C2392e(this, mediationInterstitialListener));
        this.zzgx.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        C2393f fVar = new C2393f(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(fVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(fVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(fVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(fVar);
        }
        if (nativeMediationAdRequest.zzna()) {
            for (String str : nativeMediationAdRequest.zznb().keySet()) {
                withAdListener.forCustomTemplateAd(str, fVar, ((Boolean) nativeMediationAdRequest.zznb().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzgy = withAdListener.build();
        this.zzgy.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgx.show();
    }

    public void showVideo() {
        this.zzha.show();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}

package com.google.ads.mediation.inmobi;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.inmobi.commons.AnimationType;
import com.inmobi.commons.GenderType;
import com.inmobi.commons.InMobi;
import com.inmobi.monetization.IMBanner;
import com.inmobi.monetization.IMBannerListener;
import com.inmobi.monetization.IMErrorCode;
import com.inmobi.monetization.IMIncentivisedListener;
import com.inmobi.monetization.IMInterstitial;
import com.inmobi.monetization.IMInterstitial.State;
import com.inmobi.monetization.IMInterstitialListener;
import java.util.Calendar;
import java.util.HashMap;

public final class InMobiAdapter implements MediationBannerAdapter<InMobiAdapterExtras, InMobiAdapterServerParameters>, MediationInterstitialAdapter<InMobiAdapterExtras, InMobiAdapterServerParameters> {

    /* renamed from: a */
    private static final AdSize f7596a = new AdSize(320, 48);

    /* renamed from: b */
    private static final AdSize f7597b = new AdSize(320, 50);

    /* renamed from: c */
    private static final AdSize f7598c = new AdSize(468, 60);

    /* renamed from: d */
    private static final AdSize f7599d = new AdSize(728, 90);

    /* renamed from: e */
    private static final AdSize f7600e = new AdSize(300, 250);

    /* renamed from: f */
    private static final AdSize f7601f = new AdSize(120, 600);

    /* renamed from: l */
    private static Boolean f7602l = Boolean.valueOf(false);

    /* renamed from: m */
    private static Boolean f7603m = Boolean.valueOf(false);

    /* renamed from: g */
    private MediationBannerListener f7604g;

    /* renamed from: h */
    private MediationInterstitialListener f7605h;

    /* renamed from: i */
    private IMInterstitial f7606i;

    /* renamed from: j */
    private IMBanner f7607j;

    /* renamed from: k */
    private FrameLayout f7608k;

    /* renamed from: n */
    private IMIncentivisedListener f7609n = new IMIncentivisedListener() {
    };

    /* renamed from: com.google.ads.mediation.inmobi.InMobiAdapter$2 */
    static /* synthetic */ class C23992 {

        /* renamed from: b */
        static final /* synthetic */ int[] f7612b = new int[IMErrorCode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|(3:15|16|18)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                com.inmobi.monetization.IMErrorCode[] r0 = com.inmobi.monetization.IMErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7612b = r0
                r0 = 1
                int[] r1 = f7612b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.inmobi.monetization.IMErrorCode r2 = com.inmobi.monetization.IMErrorCode.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f7612b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.inmobi.monetization.IMErrorCode r3 = com.inmobi.monetization.IMErrorCode.INVALID_REQUEST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r2 = f7612b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.inmobi.monetization.IMErrorCode r3 = com.inmobi.monetization.IMErrorCode.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r2 = f7612b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.inmobi.monetization.IMErrorCode r3 = com.inmobi.monetization.IMErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                com.google.ads.AdRequest$Gender[] r2 = com.google.ads.AdRequest.Gender.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7611a = r2
                int[] r2 = f7611a     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.google.ads.AdRequest$Gender r3 = com.google.ads.AdRequest.Gender.MALE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f7611a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.google.ads.AdRequest$Gender r2 = com.google.ads.AdRequest.Gender.FEMALE     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.inmobi.InMobiAdapter.C23992.<clinit>():void");
        }
    }

    /* renamed from: com.google.ads.mediation.inmobi.InMobiAdapter$a */
    private class C2400a implements IMBannerListener {
        private C2400a() {
        }
    }

    /* renamed from: com.google.ads.mediation.inmobi.InMobiAdapter$b */
    private class C2401b implements IMInterstitialListener {
        private C2401b() {
        }
    }

    /* renamed from: a */
    private void m11146a(MediationAdRequest mediationAdRequest, InMobiAdapterExtras inMobiAdapterExtras) {
        GenderType genderType;
        if (inMobiAdapterExtras == null) {
            inMobiAdapterExtras = new InMobiAdapterExtras();
        }
        if (mediationAdRequest.getAgeInYears() != null) {
            InMobi.setAge(mediationAdRequest.getAgeInYears().intValue());
        }
        if (inMobiAdapterExtras.getAreaCode() != null) {
            InMobi.setAreaCode(inMobiAdapterExtras.getAreaCode());
        }
        if (mediationAdRequest.getLocation() != null) {
            InMobi.setCurrentLocation(mediationAdRequest.getLocation());
        }
        if (mediationAdRequest.getBirthday() != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(mediationAdRequest.getBirthday());
            InMobi.setDateOfBirth(instance);
        }
        if (inMobiAdapterExtras.getEducation() != null) {
            InMobi.setEducation(inMobiAdapterExtras.getEducation());
        }
        if (inMobiAdapterExtras.getEthnicity() != null) {
            InMobi.setEthnicity(inMobiAdapterExtras.getEthnicity());
        }
        if (mediationAdRequest.getGender() != null) {
            switch (mediationAdRequest.getGender()) {
                case MALE:
                    genderType = GenderType.MALE;
                    break;
                case FEMALE:
                    genderType = GenderType.FEMALE;
                    break;
                default:
                    genderType = GenderType.UNKNOWN;
                    break;
            }
            InMobi.setGender(genderType);
        }
        if (inMobiAdapterExtras.getIncome() != null) {
            InMobi.setIncome(inMobiAdapterExtras.getIncome().intValue());
        }
        if (inMobiAdapterExtras.getAge() != null) {
            InMobi.setAge(inMobiAdapterExtras.getAge().intValue());
        }
        if (inMobiAdapterExtras.getInterests() != null) {
            InMobi.setInterests(TextUtils.join(", ", inMobiAdapterExtras.getInterests()));
        }
        if (inMobiAdapterExtras.getPostalCode() != null) {
            InMobi.setPostalCode(inMobiAdapterExtras.getPostalCode());
        }
        InMobi.setDeviceIDMask(inMobiAdapterExtras.getDeviceIdMask());
        if (inMobiAdapterExtras.getSexualOrientations() != null) {
            InMobi.setSexualOrientation(inMobiAdapterExtras.getSexualOrientations());
        }
        if (inMobiAdapterExtras.getMartialStatus() != null) {
            InMobi.setMaritalStatus(inMobiAdapterExtras.getMartialStatus());
        }
        if (inMobiAdapterExtras.getLangauge() != null) {
            InMobi.setLanguage(inMobiAdapterExtras.getLangauge());
        }
        if (inMobiAdapterExtras.getHasChildren() != null) {
            InMobi.setHasChildren(inMobiAdapterExtras.getHasChildren());
        }
        if (inMobiAdapterExtras.getCity() != null && inMobiAdapterExtras.getState() != null && inMobiAdapterExtras.getCountry() != null) {
            InMobi.setLocationWithCityStateCountry(inMobiAdapterExtras.getCity(), inMobiAdapterExtras.getState(), inMobiAdapterExtras.getCountry());
        }
    }

    public static void disableHardwareAcceleration() {
        f7602l = Boolean.valueOf(true);
    }

    public void destroy() {
    }

    public Class<InMobiAdapterExtras> getAdditionalParametersType() {
        return InMobiAdapterExtras.class;
    }

    public View getBannerView() {
        return this.f7608k;
    }

    public Class<InMobiAdapterServerParameters> getServerParametersType() {
        return InMobiAdapterServerParameters.class;
    }

    public void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, InMobiAdapterServerParameters inMobiAdapterServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, InMobiAdapterExtras inMobiAdapterExtras) {
        int i;
        String str;
        StringBuilder sb;
        if (!f7603m.booleanValue()) {
            InMobi.initialize(activity, inMobiAdapterServerParameters.appId);
            f7603m = Boolean.valueOf(true);
        }
        if (VERSION.SDK_INT < 7) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INVALID_REQUEST);
        } else if (!InMobi.getVersion().substring(0, 1).equals("4")) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INVALID_REQUEST);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Please integrate with new sdk");
            sb2.append(InMobi.getVersion());
            Log.e("Invalid SDK VERSION", sb2.toString());
        } else {
            this.f7604g = mediationBannerListener;
            AdSize findBestSize = adSize.findBestSize(f7596a, f7597b, f7598c, f7599d, f7600e, f7601f);
            if (findBestSize == f7596a) {
                i = 9;
            } else if (findBestSize == f7597b) {
                i = 15;
            } else {
                if (findBestSize == f7598c) {
                    i = 12;
                    str = "ADSIZE_INMOBI_AD_UNIT_468x60";
                    sb = new StringBuilder();
                } else if (findBestSize == f7599d) {
                    i = 11;
                    str = "INMOBI_AD_UNIT_728X90";
                    sb = new StringBuilder();
                } else if (findBestSize == f7600e) {
                    i = 10;
                    str = "INMOBI_AD_UNIT_300X250";
                    sb = new StringBuilder();
                } else if (findBestSize == f7601f) {
                    i = 13;
                    str = "INMOBI_AD_UNIT_120X600";
                    sb = new StringBuilder();
                } else {
                    mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INVALID_REQUEST);
                    return;
                }
                sb.append(i);
                sb.append("");
                Log.e(str, sb.toString());
            }
            LayoutParams layoutParams = new LayoutParams(findBestSize.getWidthInPixels(activity), findBestSize.getHeightInPixels(activity));
            this.f7607j = new IMBanner(activity, inMobiAdapterServerParameters.appId, i);
            this.f7607j.setRefreshInterval(-1);
            this.f7607j.setAnimationType(AnimationType.ANIMATION_OFF);
            if (mediationAdRequest.getKeywords() != null) {
                this.f7607j.setKeywords(TextUtils.join(", ", mediationAdRequest.getKeywords()));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("tp", "c_admob");
            this.f7607j.setRequestParams(hashMap);
            if (inMobiAdapterExtras == null) {
                inMobiAdapterExtras = new InMobiAdapterExtras();
            }
            if (inMobiAdapterExtras.getRefTagKey() != null && inMobiAdapterExtras.getRefTagValue() != null && !inMobiAdapterExtras.getRefTagKey().trim().equals("") && !inMobiAdapterExtras.getRefTagValue().trim().equals("")) {
                this.f7607j.setRefTagParam(inMobiAdapterExtras.getRefTagKey(), inMobiAdapterExtras.getRefTagValue());
            }
            this.f7607j.setIMBannerListener(new C2400a());
            if (f7602l.booleanValue()) {
                this.f7607j.disableHardwareAcceleration();
            }
            this.f7608k = new FrameLayout(activity);
            this.f7608k.setLayoutParams(layoutParams);
            this.f7607j.setLayoutParams(new LinearLayout.LayoutParams(findBestSize.getWidthInPixels(activity), findBestSize.getHeightInPixels(activity)));
            this.f7608k.addView(this.f7607j);
            m11146a(mediationAdRequest, inMobiAdapterExtras);
            this.f7607j.loadBanner();
        }
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, InMobiAdapterServerParameters inMobiAdapterServerParameters, MediationAdRequest mediationAdRequest, InMobiAdapterExtras inMobiAdapterExtras) {
        if (!f7603m.booleanValue()) {
            InMobi.initialize(activity, inMobiAdapterServerParameters.appId);
            f7603m = Boolean.valueOf(true);
        }
        if (VERSION.SDK_INT < 7) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INVALID_REQUEST);
        } else if (!InMobi.getVersion().substring(0, 1).equals("4")) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INVALID_REQUEST);
            StringBuilder sb = new StringBuilder();
            sb.append("Please integrate with new sdk");
            sb.append(InMobi.getVersion());
            Log.e("Invalid SDK VERSION", sb.toString());
        } else {
            this.f7605h = mediationInterstitialListener;
            this.f7606i = new IMInterstitial(activity, inMobiAdapterServerParameters.appId);
            if (mediationAdRequest.getKeywords() != null) {
                this.f7606i.setKeywords(TextUtils.join(", ", mediationAdRequest.getKeywords()));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("tp", "c_admob");
            this.f7606i.setRequestParams(hashMap);
            this.f7606i.setIMInterstitialListener(new C2401b());
            this.f7606i.setIMIncentivisedListener(this.f7609n);
            if (f7602l.booleanValue()) {
                this.f7606i.disableHardwareAcceleration();
            }
            m11146a(mediationAdRequest, inMobiAdapterExtras);
            this.f7606i.loadInterstitial();
        }
    }

    public void showInterstitial() {
        if (this.f7606i.getState() == State.READY) {
            this.f7606i.show();
        }
    }
}

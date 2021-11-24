package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.C3266s;

@C3464ci
public final class bbr implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final bay f13536a;

    /* renamed from: b */
    private NativeAdMapper f13537b;

    /* renamed from: c */
    private UnifiedNativeAdMapper f13538c;

    /* renamed from: d */
    private NativeCustomTemplateAd f13539d;

    public bbr(bay bay) {
        this.f13536a = bay;
    }

    /* renamed from: a */
    private static void m18057a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new bbo());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
            if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
                nativeAdMapper.zza(videoController);
            }
        }
    }

    /* renamed from: a */
    public final NativeAdMapper mo12775a() {
        return this.f13537b;
    }

    /* renamed from: b */
    public final UnifiedNativeAdMapper mo12776b() {
        return this.f13538c;
    }

    /* renamed from: c */
    public final NativeCustomTemplateAd mo12777c() {
        return this.f13539d;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClicked.");
        try {
            this.f13536a.mo12658a();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClicked.");
        try {
            this.f13536a.mo12658a();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f13537b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f13538c;
        if (this.f13539d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                C3731me.m19177d("#007 Could not call remote method.", null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                C3731me.m19172b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                C3731me.m19172b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C3731me.m19172b("Adapter called onAdClicked.");
        try {
            this.f13536a.mo12658a();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClosed.");
        try {
            this.f13536a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClosed.");
        try {
            this.f13536a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClosed.");
        try {
            this.f13536a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        C3731me.m19172b(sb.toString());
        try {
            this.f13536a.mo12659a(i);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C3731me.m19172b(sb.toString());
        try {
            this.f13536a.mo12659a(i);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C3731me.m19172b(sb.toString());
        try {
            this.f13536a.mo12659a(i);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f13537b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f13538c;
        if (this.f13539d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                C3731me.m19177d("#007 Could not call remote method.", null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                C3731me.m19172b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                C3731me.m19172b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C3731me.m19172b("Adapter called onAdImpression.");
        try {
            this.f13536a.mo12670f();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLeftApplication.");
        try {
            this.f13536a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLeftApplication.");
        try {
            this.f13536a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLeftApplication.");
        try {
            this.f13536a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLoaded.");
        try {
            this.f13536a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLoaded.");
        try {
            this.f13536a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLoaded.");
        this.f13537b = nativeAdMapper;
        this.f13538c = null;
        m18057a(mediationNativeAdapter, this.f13538c, this.f13537b);
        try {
            this.f13536a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLoaded.");
        this.f13538c = unifiedNativeAdMapper;
        this.f13537b = null;
        m18057a(mediationNativeAdapter, this.f13538c, this.f13537b);
        try {
            this.f13536a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdOpened.");
        try {
            this.f13536a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdOpened.");
        try {
            this.f13536a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdOpened.");
        try {
            this.f13536a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onVideoEnd.");
        try {
            this.f13536a.mo12671g();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAppEvent.");
        try {
            this.f13536a.mo12665a(str, str2);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        String str = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        C3731me.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.f13539d = nativeCustomTemplateAd;
        try {
            this.f13536a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof atx) {
            try {
                this.f13536a.mo12660a(((atx) nativeCustomTemplateAd).mo12485a(), str);
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        } else {
            C3731me.m19178e("Unexpected native custom template ad type.");
        }
    }
}

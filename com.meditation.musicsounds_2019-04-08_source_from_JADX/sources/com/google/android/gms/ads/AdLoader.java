package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.amp;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.ann;
import com.google.android.gms.internal.ads.anq;
import com.google.android.gms.internal.ads.aok;
import com.google.android.gms.internal.ads.aoz;
import com.google.android.gms.internal.ads.aty;
import com.google.android.gms.internal.ads.aub;
import com.google.android.gms.internal.ads.auo;
import com.google.android.gms.internal.ads.ava;
import com.google.android.gms.internal.ads.avb;
import com.google.android.gms.internal.ads.avc;
import com.google.android.gms.internal.ads.ave;
import com.google.android.gms.internal.ads.avf;
import com.google.android.gms.internal.ads.avh;
import com.google.android.gms.internal.ads.bar;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;

public class AdLoader {

    /* renamed from: a */
    private final amp f9860a;

    /* renamed from: b */
    private final Context f9861b;

    /* renamed from: c */
    private final ann f9862c;

    public static class Builder {

        /* renamed from: a */
        private final Context f9863a;

        /* renamed from: b */
        private final anq f9864b;

        private Builder(Context context, anq anq) {
            this.f9863a = context;
            this.f9864b = anq;
        }

        public Builder(Context context, String str) {
            this((Context) C3266s.m14914a(context, (Object) "context cannot be null"), ane.m16646b().mo12111a(context, str, (bas) new bar()));
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.f9863a, this.f9864b.zzdh());
            } catch (RemoteException e) {
                C3731me.m19173b("Failed to build AdLoader.", e);
                return null;
            }
        }

        public Builder forAppInstallAd(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.f9864b.zza((aty) new ava(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forContentAd(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.f9864b.zza((aub) new avb(onContentAdLoadedListener));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to add content ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                this.f9864b.zza(str, new ave(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new avc(onCustomClickListener));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f9864b.zza(new avf(onPublisherAdViewLoadedListener), new zzjn(this.f9863a, adSizeArr));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.f9864b.zza((auo) new avh(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f9864b.zzb((ank) new amj(adListener));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            C3266s.m14913a(correlator);
            try {
                this.f9864b.zzb((aok) correlator.f9870a);
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to set correlator.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f9864b.zza(new zzpl(nativeAdOptions));
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.f9864b.zza(publisherAdViewOptions);
            } catch (RemoteException e) {
                C3731me.m19175c("Failed to specify DFP banner ad options", e);
            }
            return this;
        }
    }

    AdLoader(Context context, ann ann) {
        this(context, ann, amp.f12442a);
    }

    private AdLoader(Context context, ann ann, amp amp) {
        this.f9861b = context;
        this.f9862c = ann;
        this.f9860a = amp;
    }

    /* renamed from: a */
    private final void m13499a(aoz aoz) {
        try {
            this.f9862c.zzd(amp.m16600a(this.f9861b, aoz));
        } catch (RemoteException e) {
            C3731me.m19173b("Failed to load ad.", e);
        }
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.f9862c.zzck();
        } catch (RemoteException e) {
            C3731me.m19175c("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.f9862c.isLoading();
        } catch (RemoteException e) {
            C3731me.m19175c("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        m13499a(adRequest.zzay());
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        m13499a(publisherAdRequest.zzay());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.f9862c.zza(amp.m16600a(this.f9861b, adRequest.zzay()), i);
        } catch (RemoteException e) {
            C3731me.m19173b("Failed to load ads.", e);
        }
    }
}

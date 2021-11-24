package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.hc */
public final class C3594hc implements MediationRewardedVideoAdListener {

    /* renamed from: a */
    private final C3590gz f14062a;

    public C3594hc(C3590gz gzVar) {
        this.f14062a = gzVar;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClicked.");
        try {
            this.f14062a.mo12963f(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdClosed.");
        try {
            this.f14062a.mo12962e(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdFailedToLoad.");
        try {
            this.f14062a.mo12959b(C3327d.m15136a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLeftApplication.");
        try {
            this.f14062a.mo12964g(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdLoaded.");
        try {
            this.f14062a.mo12958b(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdOpened.");
        try {
            this.f14062a.mo12960c(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onInitializationFailed.");
        try {
            this.f14062a.mo12953a(C3327d.m15136a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onInitializationSucceeded.");
        try {
            this.f14062a.mo12952a(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f14062a.mo12954a(C3327d.m15136a(mediationRewardedVideoAdAdapter), new zzaig(rewardItem));
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        } else {
            this.f14062a.mo12954a(C3327d.m15136a(mediationRewardedVideoAdAdapter), new zzaig("", 1));
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onVideoCompleted.");
        try {
            this.f14062a.mo12965h(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onVideoStarted.");
        try {
            this.f14062a.mo12961d(C3327d.m15136a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(Bundle bundle) {
        C3266s.m14922b("#008 Must be called on the main UI thread.");
        C3731me.m19172b("Adapter called onAdMetadataChanged.");
        try {
            this.f14062a.mo12951a(bundle);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}

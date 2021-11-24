package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@C3464ci
public final class bbw<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bay f13554a;

    public bbw(bay bay) {
        this.f13554a = bay;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C3731me.m19172b("Adapter called onClick.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bbx(this));
            return;
        }
        try {
            this.f13554a.mo12658a();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C3731me.m19172b("Adapter called onDismissScreen.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19178e("#008 Must be called on the main UI thread.");
            C3719lt.f14416a.post(new bca(this));
            return;
        }
        try {
            this.f13554a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C3731me.m19172b("Adapter called onDismissScreen.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bcf(this));
            return;
        }
        try {
            this.f13554a.mo12666b();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        C3731me.m19172b(sb.toString());
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bcb(this, errorCode));
            return;
        }
        try {
            this.f13554a.mo12659a(bcj.m18135a(errorCode));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        C3731me.m19172b(sb.toString());
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bch(this, errorCode));
            return;
        }
        try {
            this.f13554a.mo12659a(bcj.m18135a(errorCode));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C3731me.m19172b("Adapter called onLeaveApplication.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bcc(this));
            return;
        }
        try {
            this.f13554a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C3731me.m19172b("Adapter called onLeaveApplication.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bci(this));
            return;
        }
        try {
            this.f13554a.mo12667c();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C3731me.m19172b("Adapter called onPresentScreen.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bcd(this));
            return;
        }
        try {
            this.f13554a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C3731me.m19172b("Adapter called onPresentScreen.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bby(this));
            return;
        }
        try {
            this.f13554a.mo12668d();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C3731me.m19172b("Adapter called onReceivedAd.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bce(this));
            return;
        }
        try {
            this.f13554a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C3731me.m19172b("Adapter called onReceivedAd.");
        ane.m16645a();
        if (!C3719lt.m19120b()) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", null);
            C3719lt.f14416a.post(new bbz(this));
            return;
        }
        try {
            this.f13554a.mo12669e();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3464ci
public final class bbq extends baw {

    /* renamed from: a */
    private final MediationAdapter f13534a;

    /* renamed from: b */
    private bbr f13535b;

    public bbq(MediationAdapter mediationAdapter) {
        this.f13534a = mediationAdapter;
    }

    /* renamed from: a */
    private final Bundle m18028a(String str, zzjj zzjj, String str2) {
        Bundle bundle;
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f13534a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzjj != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzjj.f15487g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m18029a(zzjj zzjj) {
        if (!zzjj.f15486f) {
            ane.m16645a();
            if (!C3719lt.m19116a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C3323b mo12685a() {
        if (!(this.f13534a instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        try {
            return C3327d.m15136a(((MediationBannerAdapter) this.f13534a).getBannerView());
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12686a(C3323b bVar) {
        try {
            ((OnContextChangedListener) this.f13534a).onContextChanged((Context) C3327d.m15137a(bVar));
        } catch (Throwable th) {
            C3731me.m19175c("Failed", th);
        }
    }

    /* renamed from: a */
    public final void mo12687a(C3323b bVar, C3590gz gzVar, List<String> list) {
        if (!(this.f13534a instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String str = "Not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3731me.m19172b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f13534a;
            ArrayList arrayList = new ArrayList();
            for (String a : list) {
                arrayList.add(m18028a(a, (zzjj) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) C3327d.m15137a(bVar), new C3594hc(gzVar), arrayList);
        } catch (Throwable th) {
            C3731me.m19175c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12688a(C3323b bVar, zzjj zzjj, String str, bay bay) {
        mo12690a(bVar, zzjj, str, (String) null, bay);
    }

    /* renamed from: a */
    public final void mo12689a(C3323b bVar, zzjj zzjj, String str, C3590gz gzVar, String str2) {
        Bundle bundle;
        bbp bbp;
        zzjj zzjj2 = zzjj;
        if (!(this.f13534a instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3731me.m19172b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f13534a;
            Bundle a = m18028a(str2, zzjj2, (String) null);
            if (zzjj2 != null) {
                bbp bbp2 = new bbp(zzjj2.f15482b == -1 ? null : new Date(zzjj2.f15482b), zzjj2.f15484d, zzjj2.f15485e != null ? new HashSet(zzjj2.f15485e) : null, zzjj2.f15491k, m18029a(zzjj), zzjj2.f15487g, zzjj2.f15498r);
                bundle = zzjj2.f15493m != null ? zzjj2.f15493m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                bbp = bbp2;
            } else {
                bbp = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) C3327d.m15137a(bVar), bbp, str, new C3594hc(gzVar), a, bundle);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12690a(C3323b bVar, zzjj zzjj, String str, String str2, bay bay) {
        zzjj zzjj2 = zzjj;
        if (!(this.f13534a instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3731me.m19172b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f13534a;
            Bundle bundle = null;
            bbp bbp = new bbp(zzjj2.f15482b == -1 ? null : new Date(zzjj2.f15482b), zzjj2.f15484d, zzjj2.f15485e != null ? new HashSet(zzjj2.f15485e) : null, zzjj2.f15491k, m18029a(zzjj), zzjj2.f15487g, zzjj2.f15498r);
            if (zzjj2.f15493m != null) {
                bundle = zzjj2.f15493m.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) C3327d.m15137a(bVar), new bbr(bay), m18028a(str, zzjj2, str2), bbp, bundle);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12691a(C3323b bVar, zzjj zzjj, String str, String str2, bay bay, zzpl zzpl, List<String> list) {
        zzjj zzjj2 = zzjj;
        if (!(this.f13534a instanceof MediationNativeAdapter)) {
            String str3 = "Not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f13534a;
            Bundle bundle = null;
            bbu bbu = new bbu(zzjj2.f15482b == -1 ? null : new Date(zzjj2.f15482b), zzjj2.f15484d, zzjj2.f15485e != null ? new HashSet(zzjj2.f15485e) : null, zzjj2.f15491k, m18029a(zzjj), zzjj2.f15487g, zzpl, list, zzjj2.f15498r);
            if (zzjj2.f15493m != null) {
                bundle = zzjj2.f15493m.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.f13535b = new bbr(bay);
            mediationNativeAdapter.requestNativeAd((Context) C3327d.m15137a(bVar), this.f13535b, m18028a(str, zzjj2, str2), bbu, bundle);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12692a(C3323b bVar, zzjn zzjn, zzjj zzjj, String str, bay bay) {
        mo12693a(bVar, zzjn, zzjj, str, null, bay);
    }

    /* renamed from: a */
    public final void mo12693a(C3323b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, bay bay) {
        zzjn zzjn2 = zzjn;
        zzjj zzjj2 = zzjj;
        if (!(this.f13534a instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3731me.m19172b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f13534a;
            Bundle bundle = null;
            bbp bbp = new bbp(zzjj2.f15482b == -1 ? null : new Date(zzjj2.f15482b), zzjj2.f15484d, zzjj2.f15485e != null ? new HashSet(zzjj2.f15485e) : null, zzjj2.f15491k, m18029a(zzjj), zzjj2.f15487g, zzjj2.f15498r);
            if (zzjj2.f15493m != null) {
                bundle = zzjj2.f15493m.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) C3327d.m15137a(bVar), new bbr(bay), m18028a(str, zzjj2, str2), zzb.zza(zzjn2.f15503e, zzjn2.f15500b, zzjn2.f15499a), bbp, bundle);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12694a(zzjj zzjj, String str) {
        mo12695a(zzjj, str, (String) null);
    }

    /* renamed from: a */
    public final void mo12695a(zzjj zzjj, String str, String str2) {
        if (!(this.f13534a instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3731me.m19172b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f13534a;
            Bundle bundle = null;
            bbp bbp = new bbp(zzjj.f15482b == -1 ? null : new Date(zzjj.f15482b), zzjj.f15484d, zzjj.f15485e != null ? new HashSet(zzjj.f15485e) : null, zzjj.f15491k, m18029a(zzjj), zzjj.f15487g, zzjj.f15498r);
            if (zzjj.f15493m != null) {
                bundle = zzjj.f15493m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(bbp, m18028a(str, zzjj, str2), bundle);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12696a(boolean z) {
        if (!(this.f13534a instanceof OnImmersiveModeUpdatedListener)) {
            String str = "Not an OnImmersiveModeUpdatedListener: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19176d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) this.f13534a).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
        }
    }

    /* renamed from: b */
    public final void mo12697b() {
        if (!(this.f13534a instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3731me.m19172b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f13534a).showInterstitial();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo12698c() {
        try {
            this.f13534a.onDestroy();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo12699d() {
        try {
            this.f13534a.onPause();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: e */
    public final void mo12700e() {
        try {
            this.f13534a.onResume();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo12701f() {
        if (!(this.f13534a instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3731me.m19172b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.f13534a).showVideo();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final boolean mo12702g() {
        if (!(this.f13534a instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3731me.m19172b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.f13534a).isInitialized();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: h */
    public final bbe mo12703h() {
        NativeAdMapper a = this.f13535b.mo12775a();
        if (a instanceof NativeAppInstallAdMapper) {
            return new bbs((NativeAppInstallAdMapper) a);
        }
        return null;
    }

    /* renamed from: i */
    public final bbi mo12704i() {
        NativeAdMapper a = this.f13535b.mo12775a();
        if (a instanceof NativeContentAdMapper) {
            return new bbt((NativeContentAdMapper) a);
        }
        return null;
    }

    /* renamed from: j */
    public final Bundle mo12705j() {
        if (this.f13534a instanceof zzatl) {
            return ((zzatl) this.f13534a).zzmq();
        }
        String str = "Not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
        C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: k */
    public final Bundle mo12706k() {
        if (this.f13534a instanceof zzatm) {
            return ((zzatm) this.f13534a).getInterstitialAdapterInfo();
        }
        String str = "Not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.f13534a.getClass().getCanonicalName());
        C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: l */
    public final Bundle mo12707l() {
        return new Bundle();
    }

    /* renamed from: m */
    public final boolean mo12708m() {
        return this.f13534a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: n */
    public final atu mo12709n() {
        NativeCustomTemplateAd c = this.f13535b.mo12777c();
        if (c instanceof atx) {
            return ((atx) c).mo12485a();
        }
        return null;
    }

    /* renamed from: o */
    public final aos mo12710o() {
        if (!(this.f13534a instanceof zza)) {
            return null;
        }
        try {
            return ((zza) this.f13534a).getVideoController();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            return null;
        }
    }

    /* renamed from: p */
    public final bbl mo12711p() {
        UnifiedNativeAdMapper b = this.f13535b.mo12776b();
        if (b != null) {
            return new bcl(b);
        }
        return null;
    }
}

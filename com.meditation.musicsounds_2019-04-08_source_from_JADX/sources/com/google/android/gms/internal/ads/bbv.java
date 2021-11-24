package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3464ci
public final class bbv<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends baw {

    /* renamed from: a */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f13552a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f13553b;

    public bbv(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f13552a = mediationAdapter;
        this.f13553b = network_extras;
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m18101a(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } finally {
                C3731me.m19173b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f13552a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.load(hashMap);
        return server_parameters;
    }

    /* renamed from: a */
    private static boolean m18102a(zzjj zzjj) {
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
        if (!(this.f13552a instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f13552a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        try {
            return C3327d.m15136a(((MediationBannerAdapter) this.f13552a).getBannerView());
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12686a(C3323b bVar) {
    }

    /* renamed from: a */
    public final void mo12687a(C3323b bVar, C3590gz gzVar, List<String> list) {
    }

    /* renamed from: a */
    public final void mo12688a(C3323b bVar, zzjj zzjj, String str, bay bay) {
        mo12690a(bVar, zzjj, str, (String) null, bay);
    }

    /* renamed from: a */
    public final void mo12689a(C3323b bVar, zzjj zzjj, String str, C3590gz gzVar, String str2) {
    }

    /* renamed from: a */
    public final void mo12690a(C3323b bVar, zzjj zzjj, String str, String str2, bay bay) {
        if (!(this.f13552a instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f13552a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3731me.m19172b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f13552a).requestInterstitialAd(new bbw(bay), (Activity) C3327d.m15137a(bVar), m18101a(str, zzjj.f15487g, str2), bcj.m18136a(zzjj, m18102a(zzjj)), this.f13553b);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12691a(C3323b bVar, zzjj zzjj, String str, String str2, bay bay, zzpl zzpl, List<String> list) {
    }

    /* renamed from: a */
    public final void mo12692a(C3323b bVar, zzjn zzjn, zzjj zzjj, String str, bay bay) {
        mo12693a(bVar, zzjn, zzjj, str, null, bay);
    }

    /* renamed from: a */
    public final void mo12693a(C3323b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, bay bay) {
        AdSize adSize;
        if (!(this.f13552a instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f13552a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3731me.m19172b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f13552a;
            bbw bbw = new bbw(bay);
            Activity activity = (Activity) C3327d.m15137a(bVar);
            MediationServerParameters a = m18101a(str, zzjj.f15487g, str2);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzjn.f15503e && adSizeArr[i].getHeight() == zzjn.f15500b) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(zzb.zza(zzjn.f15503e, zzjn.f15500b, zzjn.f15499a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(bbw, activity, a, adSize, bcj.m18136a(zzjj, m18102a(zzjj)), this.f13553b);
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12694a(zzjj zzjj, String str) {
    }

    /* renamed from: a */
    public final void mo12695a(zzjj zzjj, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo12696a(boolean z) {
    }

    /* renamed from: b */
    public final void mo12697b() {
        if (!(this.f13552a instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f13552a.getClass().getCanonicalName());
            C3731me.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3731me.m19172b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f13552a).showInterstitial();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo12698c() {
        try {
            this.f13552a.destroy();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo12699d() {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final void mo12700e() {
        throw new RemoteException();
    }

    /* renamed from: f */
    public final void mo12701f() {
    }

    /* renamed from: g */
    public final boolean mo12702g() {
        return true;
    }

    /* renamed from: h */
    public final bbe mo12703h() {
        return null;
    }

    /* renamed from: i */
    public final bbi mo12704i() {
        return null;
    }

    /* renamed from: j */
    public final Bundle mo12705j() {
        return new Bundle();
    }

    /* renamed from: k */
    public final Bundle mo12706k() {
        return new Bundle();
    }

    /* renamed from: l */
    public final Bundle mo12707l() {
        return new Bundle();
    }

    /* renamed from: m */
    public final boolean mo12708m() {
        return false;
    }

    /* renamed from: n */
    public final atu mo12709n() {
        return null;
    }

    /* renamed from: o */
    public final aos mo12710o() {
        return null;
    }

    /* renamed from: p */
    public final bbl mo12711p() {
        return null;
    }
}

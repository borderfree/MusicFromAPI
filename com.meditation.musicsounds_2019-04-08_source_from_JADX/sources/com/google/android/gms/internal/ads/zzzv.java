package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p006c.C0054c;
import android.support.p006c.C0054c.C0056a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.C3309n;

@C3464ci
public final class zzzv implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f15538a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediationInterstitialListener f15539b;

    /* renamed from: c */
    private Uri f15540c;

    public final void onDestroy() {
        C3731me.m19172b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        C3731me.m19172b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        C3731me.m19172b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f15539b = mediationInterstitialListener;
        if (this.f15539b == null) {
            C3731me.m19178e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            C3731me.m19178e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f15539b.onAdFailedToLoad(this, 0);
        } else {
            if (!(C3309n.m15071c() && arj.m16981a(context))) {
                C3731me.m19178e("Default browser does not support custom tabs. Bailing out.");
                this.f15539b.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                C3731me.m19178e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f15539b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f15538a = (Activity) context;
            this.f15540c = Uri.parse(string);
            this.f15539b.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        C0054c a = new C0056a().mo106a();
        a.f92a.setData(this.f15540c);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(a.f92a), null, new bdb(this), null, new zzang(0, 0, false));
        C3653jh.f14275a.post(new bdc(this, adOverlayInfoParcel));
        zzbv.zzeo().mo13054f();
    }
}

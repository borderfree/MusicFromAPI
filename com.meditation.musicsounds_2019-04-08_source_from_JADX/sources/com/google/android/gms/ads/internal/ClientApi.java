package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3388aa;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3550fm;
import com.google.android.gms.internal.ads.C3559fv;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3834q;
import com.google.android.gms.internal.ads.anq;
import com.google.android.gms.internal.ads.anv;
import com.google.android.gms.internal.ads.aoi;
import com.google.android.gms.internal.ads.aon;
import com.google.android.gms.internal.ads.asp;
import com.google.android.gms.internal.ads.asr;
import com.google.android.gms.internal.ads.atc;
import com.google.android.gms.internal.ads.ath;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@Keep
@DynamiteApi
@C3464ci
@ParametersAreNonnullByDefault
public class ClientApi extends aoi {
    public anq createAdLoaderBuilder(C3323b bVar, String str, bas bas, int i) {
        Context context = (Context) C3327d.m15137a(bVar);
        zzbv.zzek();
        zzak zzak = new zzak(context, str, bas, new zzang(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3653jh.m18910k(context)), zzw.zzc(context));
        return zzak;
    }

    public C3834q createAdOverlay(C3323b bVar) {
        Activity activity = (Activity) C3327d.m15137a(bVar);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzr(activity);
        }
        switch (zzc.zzbyu) {
            case 1:
                return new zzq(activity);
            case 2:
                return new zzx(activity);
            case 3:
                return new zzy(activity);
            case 4:
                return new zzs(activity, zzc);
            default:
                return new zzr(activity);
        }
    }

    public anv createBannerAdManager(C3323b bVar, zzjn zzjn, String str, bas bas, int i) {
        Context context = (Context) C3327d.m15137a(bVar);
        zzbv.zzek();
        zzy zzy = new zzy(context, zzjn, str, bas, new zzang(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3653jh.m18910k(context)), zzw.zzc(context));
        return zzy;
    }

    public C3388aa createInAppPurchaseManager(C3323b bVar) {
        return null;
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.aqk.a(com.google.android.gms.internal.ads.aqc):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.ane.m16650f().mo12297a((com.google.android.gms.internal.ads.aqc) com.google.android.gms.internal.ads.aqm.f12654aT)).booleanValue() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.ane.m16650f().mo12297a((com.google.android.gms.internal.ads.aqc) com.google.android.gms.internal.ads.aqm.f12655aU)).booleanValue() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.anv createInterstitialAdManager(com.google.android.gms.dynamic.C3323b r8, com.google.android.gms.internal.ads.zzjn r9, java.lang.String r10, com.google.android.gms.internal.ads.bas r11, int r12) {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.dynamic.C3327d.m15137a(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.aqm.m16920a(r1)
            com.google.android.gms.internal.ads.zzang r5 = new com.google.android.gms.internal.ads.zzang
            com.google.android.gms.ads.internal.zzbv.zzek()
            boolean r8 = com.google.android.gms.internal.ads.C3653jh.m18910k(r1)
            r0 = 1
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r5.<init>(r2, r12, r0, r8)
            java.lang.String r8 = "reward_mb"
            java.lang.String r12 = r9.f15499a
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0036
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.aqm.f12654aT
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r12 = r2.mo12297a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x004c
        L_0x0036:
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.aqm.f12655aU
            com.google.android.gms.internal.ads.aqk r12 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r8 = r12.mo12297a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.axe r8 = new com.google.android.gms.internal.ads.axe
            com.google.android.gms.ads.internal.zzw r9 = com.google.android.gms.ads.internal.zzw.zzc(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005d:
            com.google.android.gms.ads.internal.zzal r8 = new com.google.android.gms.ads.internal.zzal
            com.google.android.gms.ads.internal.zzw r6 = com.google.android.gms.ads.internal.zzw.zzc(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.zzjn, java.lang.String, com.google.android.gms.internal.ads.bas, int):com.google.android.gms.internal.ads.anv");
    }

    public atc createNativeAdViewDelegate(C3323b bVar, C3323b bVar2) {
        return new asp((FrameLayout) C3327d.m15137a(bVar), (FrameLayout) C3327d.m15137a(bVar2));
    }

    public ath createNativeAdViewHolderDelegate(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        return new asr((View) C3327d.m15137a(bVar), (HashMap) C3327d.m15137a(bVar2), (HashMap) C3327d.m15137a(bVar3));
    }

    public C3559fv createRewardedVideoAd(C3323b bVar, bas bas, int i) {
        Context context = (Context) C3327d.m15137a(bVar);
        zzbv.zzek();
        return new C3550fm(context, zzw.zzc(context), bas, new zzang(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3653jh.m18910k(context)));
    }

    public anv createSearchAdManager(C3323b bVar, zzjn zzjn, String str, int i) {
        Context context = (Context) C3327d.m15137a(bVar);
        zzbv.zzek();
        return new zzbp(context, zzjn, str, new zzang(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3653jh.m18910k(context)));
    }

    public aon getMobileAdsSettingsManager(C3323b bVar) {
        return null;
    }

    public aon getMobileAdsSettingsManagerWithClientJarVersion(C3323b bVar, int i) {
        Context context = (Context) C3327d.m15137a(bVar);
        zzbv.zzek();
        return zzay.zza(context, new zzang(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3653jh.m18910k(context)));
    }
}

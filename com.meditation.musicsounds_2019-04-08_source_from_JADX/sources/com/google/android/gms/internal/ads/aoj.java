package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;

public final class aoj extends ahm implements aoh {
    aoj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final anq createAdLoaderBuilder(C3323b bVar, String str, bas bas, int i) {
        anq anq;
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(i);
        Parcel a = mo11917a(3, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            anq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            anq = queryLocalInterface instanceof anq ? (anq) queryLocalInterface : new ans(readStrongBinder);
        }
        a.recycle();
        return anq;
    }

    public final C3834q createAdOverlay(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        Parcel a = mo11917a(8, q_);
        C3834q zzu = C3861r.zzu(a.readStrongBinder());
        a.recycle();
        return zzu;
    }

    public final anv createBannerAdManager(C3323b bVar, zzjn zzjn, String str, bas bas, int i) {
        anv anv;
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjn);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(i);
        Parcel a = mo11917a(1, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            anv = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            anv = queryLocalInterface instanceof anv ? (anv) queryLocalInterface : new anx(readStrongBinder);
        }
        a.recycle();
        return anv;
    }

    public final C3388aa createInAppPurchaseManager(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        Parcel a = mo11917a(7, q_);
        C3388aa a2 = C3395ac.m15560a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final anv createInterstitialAdManager(C3323b bVar, zzjn zzjn, String str, bas bas, int i) {
        anv anv;
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjn);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(i);
        Parcel a = mo11917a(2, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            anv = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            anv = queryLocalInterface instanceof anv ? (anv) queryLocalInterface : new anx(readStrongBinder);
        }
        a.recycle();
        return anv;
    }

    public final atc createNativeAdViewDelegate(C3323b bVar, C3323b bVar2) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        Parcel a = mo11917a(5, q_);
        atc a2 = atd.m17247a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final ath createNativeAdViewHolderDelegate(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        aho.m16239a(q_, (IInterface) bVar3);
        Parcel a = mo11917a(11, q_);
        ath a2 = ati.m17259a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C3559fv createRewardedVideoAd(C3323b bVar, bas bas, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(i);
        Parcel a = mo11917a(6, q_);
        C3559fv a2 = C3561fx.m18472a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final anv createSearchAdManager(C3323b bVar, zzjn zzjn, String str, int i) {
        anv anv;
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjn);
        q_.writeString(str);
        q_.writeInt(i);
        Parcel a = mo11917a(10, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            anv = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            anv = queryLocalInterface instanceof anv ? (anv) queryLocalInterface : new anx(readStrongBinder);
        }
        a.recycle();
        return anv;
    }

    public final aon getMobileAdsSettingsManager(C3323b bVar) {
        aon aon;
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        Parcel a = mo11917a(4, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aon = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            aon = queryLocalInterface instanceof aon ? (aon) queryLocalInterface : new aop(readStrongBinder);
        }
        a.recycle();
        return aon;
    }

    public final aon getMobileAdsSettingsManagerWithClientJarVersion(C3323b bVar, int i) {
        aon aon;
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeInt(i);
        Parcel a = mo11917a(9, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aon = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            aon = queryLocalInterface instanceof aon ? (aon) queryLocalInterface : new aop(readStrongBinder);
        }
        a.recycle();
        return aon;
    }
}

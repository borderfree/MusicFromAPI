package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b.C3324a;

public abstract class aoi extends ahn implements aoh {
    public aoi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static aoh asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof aoh ? (aoh) queryLocalInterface : new aoj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = createBannerAdManager(C3324a.m15129a(parcel.readStrongBinder()), (zzjn) aho.m16238a(parcel, zzjn.CREATOR), parcel.readString(), bat.m17807a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = createInterstitialAdManager(C3324a.m15129a(parcel.readStrongBinder()), (zzjn) aho.m16238a(parcel, zzjn.CREATOR), parcel.readString(), bat.m17807a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = createAdLoaderBuilder(C3324a.m15129a(parcel.readStrongBinder()), parcel.readString(), bat.m17807a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = getMobileAdsSettingsManager(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = createNativeAdViewDelegate(C3324a.m15129a(parcel.readStrongBinder()), C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = createRewardedVideoAd(C3324a.m15129a(parcel.readStrongBinder()), bat.m17807a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = createInAppPurchaseManager(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = createAdOverlay(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = getMobileAdsSettingsManagerWithClientJarVersion(C3324a.m15129a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = createSearchAdManager(C3324a.m15129a(parcel.readStrongBinder()), (zzjn) aho.m16238a(parcel, zzjn.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = createNativeAdViewHolderDelegate(C3324a.m15129a(parcel.readStrongBinder()), C3324a.m15129a(parcel.readStrongBinder()), C3324a.m15129a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        aho.m16239a(parcel2, iInterface);
        return true;
    }
}

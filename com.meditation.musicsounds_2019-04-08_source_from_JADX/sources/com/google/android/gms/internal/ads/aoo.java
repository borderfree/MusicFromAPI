package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b.C3324a;

public abstract class aoo extends ahn implements aon {
    public aoo() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zza();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                break;
            case 3:
                zzt(parcel.readString());
                break;
            case 4:
                setAppMuted(aho.m16242a(parcel));
                break;
            case 5:
                zzb(C3324a.m15129a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                zza(parcel.readString(), C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 7:
                float zzdo = zzdo();
                parcel2.writeNoException();
                parcel2.writeFloat(zzdo);
                break;
            case 8:
                boolean zzdp = zzdp();
                parcel2.writeNoException();
                aho.m16241a(parcel2, zzdp);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

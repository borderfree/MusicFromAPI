package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gc */
public abstract class C3567gc extends ahn implements C3566gb {
    public C3567gc() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C3566gb m18499a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof C3566gb ? (C3566gb) queryLocalInterface : new C3568gd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C3554fq fqVar;
        switch (i) {
            case 1:
                mo12546a();
                break;
            case 2:
                mo12549b();
                break;
            case 3:
                mo12550c();
                break;
            case 4:
                mo12551d();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    fqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    fqVar = queryLocalInterface instanceof C3554fq ? (C3554fq) queryLocalInterface : new C3556fs(readStrongBinder);
                }
                mo12548a(fqVar);
                break;
            case 6:
                mo12552e();
                break;
            case 7:
                mo12547a(parcel.readInt());
                break;
            case 8:
                mo12553f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

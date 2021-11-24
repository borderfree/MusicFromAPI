package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class baz extends ahn implements bay {
    public baz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static bay m17877a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof bay ? (bay) queryLocalInterface : new bba(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        bbb bbb;
        switch (i) {
            case 1:
                mo12658a();
                break;
            case 2:
                mo12666b();
                break;
            case 3:
                mo12659a(parcel.readInt());
                break;
            case 4:
                mo12667c();
                break;
            case 5:
                mo12668d();
                break;
            case 6:
                mo12669e();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bbb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    bbb = queryLocalInterface instanceof bbb ? (bbb) queryLocalInterface : new bbd(readStrongBinder);
                }
                mo12663a(bbb);
                break;
            case 8:
                mo12670f();
                break;
            case 9:
                mo12665a(parcel.readString(), parcel.readString());
                break;
            case 10:
                mo12660a(atv.m17348a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                mo12671g();
                break;
            case 12:
                mo12664a(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class aob extends ahn implements aoa {
    public aob() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* renamed from: a */
    public static aoa m16678a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof aoa ? (aoa) queryLocalInterface : new aoc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12100a();
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bat extends ahn implements bas {
    public bat() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static bas m17807a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof bas ? (bas) queryLocalInterface : new bau(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = mo12681a(parcel.readString());
                break;
            case 2:
                boolean b = mo12683b(parcel.readString());
                parcel2.writeNoException();
                aho.m16241a(parcel2, b);
                break;
            case 3:
                iInterface = mo12684c(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        aho.m16239a(parcel2, iInterface);
        return true;
    }
}

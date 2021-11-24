package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class aof extends ahn implements aoe {
    public aof() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public static aoe m16683a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof aoe ? (aoe) queryLocalInterface : new aog(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12108a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}

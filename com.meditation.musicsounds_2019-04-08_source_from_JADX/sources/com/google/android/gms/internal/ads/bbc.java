package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class bbc extends ahn implements bbb {
    public bbc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int a = mo12677a();
        parcel2.writeNoException();
        parcel2.writeInt(a);
        return true;
    }
}

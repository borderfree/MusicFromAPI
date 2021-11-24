package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class aus extends ahn implements aur {
    public aus() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12518a(parcel.readString());
                break;
            case 2:
                mo12517a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

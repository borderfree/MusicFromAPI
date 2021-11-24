package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class anl extends ahn implements ank {
    public anl() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12090a();
                break;
            case 2:
                mo12091a(parcel.readInt());
                break;
            case 3:
                mo12092b();
                break;
            case 4:
                mo12093c();
                break;
            case 5:
                mo12094d();
                break;
            case 6:
                mo12095e();
                break;
            case 7:
                mo12096f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

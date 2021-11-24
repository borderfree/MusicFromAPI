package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fr */
public abstract class C3555fr extends ahn implements C3554fq {
    public C3555fr() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String a = mo12916a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                int b = mo12917b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            default:
                return false;
        }
        return true;
    }
}

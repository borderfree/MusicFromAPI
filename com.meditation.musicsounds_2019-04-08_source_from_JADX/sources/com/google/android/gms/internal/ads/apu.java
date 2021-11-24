package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class apu implements Creator<zzmq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 15) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                str = SafeParcelReader.m14947m(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzmq(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmq[i];
    }
}

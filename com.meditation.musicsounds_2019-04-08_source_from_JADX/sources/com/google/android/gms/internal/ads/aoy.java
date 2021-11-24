package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class aoy implements Creator<zzlu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 2) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                i = SafeParcelReader.m14940f(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzlu(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlu[i];
    }
}

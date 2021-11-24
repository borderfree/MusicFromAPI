package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class akn implements Creator<zzhi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 2) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m14930a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzhi(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhi[i];
    }
}

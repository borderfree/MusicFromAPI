package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.k */
public final class C4526k implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        long j = 0;
        zzaj[] zzajArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i2 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 2:
                    i3 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 3:
                    j = SafeParcelReader.m14941g(parcel, a);
                    break;
                case 4:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 5:
                    zzajArr = (zzaj[]) SafeParcelReader.m14935b(parcel, a, zzaj.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        LocationAvailability locationAvailability = new LocationAvailability(i, i2, i3, j, zzajArr);
        return locationAvailability;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}

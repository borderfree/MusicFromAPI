package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.m */
public final class C4528m implements Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        List<Location> list = LocationResult.f16510a;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 1) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                list = SafeParcelReader.m14936c(parcel, a, Location.CREATOR);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}

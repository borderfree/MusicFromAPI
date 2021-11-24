package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.e */
public final class C4606e implements Creator<LatLngBounds> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m14930a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) SafeParcelReader.m14930a(parcel, a, LatLng.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}

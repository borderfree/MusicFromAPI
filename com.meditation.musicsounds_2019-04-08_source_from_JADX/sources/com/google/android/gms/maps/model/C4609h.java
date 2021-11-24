package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.h */
public final class C4609h implements Creator<VisibleRegion> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m14930a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) SafeParcelReader.m14930a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    latLng3 = (LatLng) SafeParcelReader.m14930a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    latLng4 = (LatLng) SafeParcelReader.m14930a(parcel, a, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m14930a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        VisibleRegion visibleRegion = new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
        return visibleRegion;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.g */
public final class C4608g implements Creator<MarkerOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m14930a(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 4:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m14948n(parcel2, a);
                    break;
                case 6:
                    f = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 7:
                    f2 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 10:
                    z3 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 11:
                    f3 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 12:
                    f4 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 13:
                    f5 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 14:
                    f6 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 15:
                    f7 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        MarkerOptions markerOptions = new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
        return markerOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}

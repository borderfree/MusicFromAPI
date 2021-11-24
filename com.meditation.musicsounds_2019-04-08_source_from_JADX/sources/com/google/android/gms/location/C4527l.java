package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.l */
public final class C4527l implements Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 3:
                    j2 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 4:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 5:
                    j3 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 7:
                    f = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 8:
                    j4 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        LocationRequest locationRequest = new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        return locationRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}

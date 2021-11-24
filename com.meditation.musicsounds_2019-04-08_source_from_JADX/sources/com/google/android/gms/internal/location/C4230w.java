package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.w */
public final class C4230w implements Creator<zzbd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        List<ClientIdentity> list = zzbd.f15658a;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            int a2 = SafeParcelReader.m14927a(a);
            if (a2 != 1) {
                switch (a2) {
                    case 5:
                        list = SafeParcelReader.m14936c(parcel, a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m14947m(parcel, a);
                        break;
                    case 7:
                        z = SafeParcelReader.m14937c(parcel, a);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m14937c(parcel, a);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m14937c(parcel, a);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m14947m(parcel, a);
                        break;
                    default:
                        SafeParcelReader.m14934b(parcel, a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m14930a(parcel, a, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzbd zzbd = new zzbd(locationRequest, list, str, z, z2, z3, str2);
        return zzbd;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbd[i];
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class apw implements Creator<zzmu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 3:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 4:
                    z3 = SafeParcelReader.m14937c(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzmu(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmu[i];
    }
}

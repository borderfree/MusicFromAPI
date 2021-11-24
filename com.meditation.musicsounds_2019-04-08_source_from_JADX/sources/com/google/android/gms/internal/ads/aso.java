package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class aso implements Creator<zzpl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        zzmu zzmu = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 2:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 3:
                    i2 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 4:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 5:
                    i3 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 6:
                    zzmu = (zzmu) SafeParcelReader.m14930a(parcel, a, zzmu.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzpl zzpl = new zzpl(i, z, i2, z2, i3, zzmu);
        return zzpl;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}

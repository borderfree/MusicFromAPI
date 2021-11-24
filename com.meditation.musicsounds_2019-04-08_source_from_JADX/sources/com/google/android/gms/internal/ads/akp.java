package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class akp implements Creator<zzhl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 4:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 5:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 6:
                    str4 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 7:
                    bundle = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 9:
                    j2 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzhl zzhl = new zzhl(str, j, str2, str3, str4, bundle, z, j2);
        return zzhl;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhl[i];
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class amq implements Creator<zzjn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        zzjn[] zzjnArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 3:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 5:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 6:
                    i3 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 7:
                    i4 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 8:
                    zzjnArr = (zzjn[]) SafeParcelReader.m14935b(parcel, a, zzjn.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 10:
                    z3 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 11:
                    z4 = SafeParcelReader.m14937c(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzjn zzjn = new zzjn(str, i, i2, z, i3, i4, zzjnArr, z2, z3, z4);
        return zzjn;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjn[i];
    }
}

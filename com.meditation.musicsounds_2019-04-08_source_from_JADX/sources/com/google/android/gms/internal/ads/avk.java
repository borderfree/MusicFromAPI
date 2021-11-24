package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class avk implements Creator<zzsg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 2:
                    strArr = SafeParcelReader.m14951q(parcel, a);
                    break;
                case 3:
                    strArr2 = SafeParcelReader.m14951q(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzsg(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsg[i];
    }
}

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzar implements Creator<zzaq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
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
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 5:
                    z3 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 6:
                    f = SafeParcelReader.m14943i(parcel, a);
                    break;
                case 7:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 8:
                    z4 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 9:
                    z5 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 10:
                    z6 = SafeParcelReader.m14937c(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzaq zzaq = new zzaq(z, z2, str, z3, f, i, z4, z5, z6);
        return zzaq;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }
}

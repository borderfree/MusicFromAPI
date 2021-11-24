package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.mg */
public final class C3733mg implements Creator<zzang> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
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
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzang zzang = new zzang(str, i, i2, z, z2);
        return zzang;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzang[i];
    }
}

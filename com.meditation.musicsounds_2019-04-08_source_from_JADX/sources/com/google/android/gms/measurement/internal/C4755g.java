package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C4755g implements Creator<zzag> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        zzad zzad = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 3:
                    zzad = (zzad) SafeParcelReader.m14930a(parcel, a, zzad.CREATOR);
                    break;
                case 4:
                    str2 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 5:
                    j = SafeParcelReader.m14941g(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzag zzag = new zzag(str, zzad, str2, j);
        return zzag;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }
}

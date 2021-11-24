package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.er */
public final class C4743er implements Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzfv zzfv = null;
        String str3 = null;
        zzag zzag = null;
        zzag zzag2 = null;
        zzag zzag3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 4:
                    zzfv = (zzfv) SafeParcelReader.m14930a(parcel2, a, zzfv.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 6:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 7:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 8:
                    zzag = (zzag) SafeParcelReader.m14930a(parcel2, a, zzag.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 10:
                    zzag2 = (zzag) SafeParcelReader.m14930a(parcel2, a, zzag.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 12:
                    zzag3 = (zzag) SafeParcelReader.m14930a(parcel2, a, zzag.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzo zzo = new zzo(str, str2, zzfv, j, z, str3, zzag, j2, zzag2, j3, zzag3);
        return zzo;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}

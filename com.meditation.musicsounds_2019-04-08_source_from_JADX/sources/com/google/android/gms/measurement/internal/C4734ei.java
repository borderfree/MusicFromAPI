package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.ei */
public final class C4734ei implements Creator<zzfv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 4:
                    l = SafeParcelReader.m14942h(parcel2, a);
                    break;
                case 5:
                    f = SafeParcelReader.m14944j(parcel2, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 7:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 8:
                    d = SafeParcelReader.m14946l(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzfv zzfv = new zzfv(i, str, j, l, f, str2, str3, d);
        return zzfv;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfv[i];
    }
}

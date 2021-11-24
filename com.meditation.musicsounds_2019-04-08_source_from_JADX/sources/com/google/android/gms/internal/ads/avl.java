package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class avl implements Creator<zzsi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 3:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 4:
                    bArr = SafeParcelReader.m14950p(parcel2, a);
                    break;
                case 5:
                    strArr = SafeParcelReader.m14951q(parcel2, a);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m14951q(parcel2, a);
                    break;
                case 7:
                    z2 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 8:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzsi zzsi = new zzsi(z, str, i, bArr, strArr, strArr2, z2, j);
        return zzsi;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsi[i];
    }
}

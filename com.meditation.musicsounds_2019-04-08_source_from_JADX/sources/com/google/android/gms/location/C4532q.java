package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.q */
public final class C4532q implements Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 3:
                    f = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 4:
                    j2 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 5:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzj zzj = new zzj(z, j, f, j2, i);
        return zzj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}

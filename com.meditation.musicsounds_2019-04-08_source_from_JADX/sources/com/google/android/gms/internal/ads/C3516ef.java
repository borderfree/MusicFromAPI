package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.ef */
public final class C3516ef implements Creator<zzafj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 2) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                str = SafeParcelReader.m14947m(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzafj(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafj[i];
    }
}

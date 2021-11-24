package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.av */
public final class C3224av implements Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 1) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                i = SafeParcelReader.m14940f(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzr(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}

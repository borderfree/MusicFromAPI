package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.t */
public final class C3290t implements Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m14948n(parcel, a);
                    break;
                case 3:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzk(str, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}

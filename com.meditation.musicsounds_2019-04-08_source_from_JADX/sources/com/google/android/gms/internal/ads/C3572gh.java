package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.gh */
public final class C3572gh implements Creator<zzahk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        zzjj zzjj = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    zzjj = (zzjj) SafeParcelReader.m14930a(parcel, a, zzjj.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzahk(zzjj, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahk[i];
    }
}

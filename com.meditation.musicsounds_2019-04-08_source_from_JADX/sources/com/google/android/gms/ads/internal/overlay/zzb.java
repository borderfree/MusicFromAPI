package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 4:
                    str3 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 5:
                    str4 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 6:
                    str5 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 7:
                    str6 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 8:
                    str7 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.m14930a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzc zzc = new zzc(str, str2, str3, str4, str5, str6, str7, intent);
        return zzc;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}

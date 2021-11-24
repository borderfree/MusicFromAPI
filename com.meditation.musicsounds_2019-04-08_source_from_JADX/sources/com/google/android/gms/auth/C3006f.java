package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.f */
public final class C3006f implements Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        Long l = null;
        List list = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 2:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 3:
                    l = SafeParcelReader.m14942h(parcel, a);
                    break;
                case 4:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 6:
                    list = SafeParcelReader.m14953s(parcel, a);
                    break;
                case 7:
                    str2 = SafeParcelReader.m14947m(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        TokenData tokenData = new TokenData(i, str, l, z, z2, list, str2);
        return tokenData;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}

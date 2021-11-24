package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.r */
public final class C4533r implements Creator<GeofencingRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    arrayList = SafeParcelReader.m14936c(parcel, a, zzbh.CREATOR);
                    break;
                case 2:
                    i = SafeParcelReader.m14940f(parcel, a);
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
        return new GeofencingRequest(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}

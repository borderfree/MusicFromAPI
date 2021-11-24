package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.dj */
public final class C3492dj implements Creator<zzael> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 3:
                    arrayList = SafeParcelReader.m14953s(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zzael(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzael[i];
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hm */
public final class C3604hm implements Creator<zzaiq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 6:
                    list = SafeParcelReader.m14953s(parcel, a);
                    break;
                case 7:
                    z3 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 8:
                    z4 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 9:
                    list2 = SafeParcelReader.m14953s(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzaiq zzaiq = new zzaiq(str, str2, z, z2, list, z3, z4, list2);
        return zzaiq;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaiq[i];
    }
}

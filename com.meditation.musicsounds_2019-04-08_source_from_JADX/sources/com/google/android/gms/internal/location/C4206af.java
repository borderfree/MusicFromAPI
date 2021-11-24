package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.af */
public final class C4206af implements Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        zzj zzj = zzm.f15683b;
        List<ClientIdentity> list = zzm.f15682a;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    zzj = (zzj) SafeParcelReader.m14930a(parcel, a, zzj.CREATOR);
                    break;
                case 2:
                    list = SafeParcelReader.m14936c(parcel, a, ClientIdentity.CREATOR);
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
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}

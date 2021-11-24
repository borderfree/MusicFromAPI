package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class amo implements Creator<zzjj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        Bundle bundle = null;
        List list = null;
        String str = null;
        zzmq zzmq = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 3:
                    bundle = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 5:
                    list = SafeParcelReader.m14953s(parcel2, a);
                    break;
                case 6:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 7:
                    i3 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 8:
                    z2 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 9:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 10:
                    zzmq = (zzmq) SafeParcelReader.m14930a(parcel2, a, zzmq.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.m14930a(parcel2, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 15:
                    list2 = SafeParcelReader.m14953s(parcel2, a);
                    break;
                case 16:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 17:
                    str4 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 18:
                    z3 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzjj zzjj = new zzjj(i, j, bundle, i2, list, z, i3, z2, str, zzmq, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        return zzjj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjj[i];
    }
}

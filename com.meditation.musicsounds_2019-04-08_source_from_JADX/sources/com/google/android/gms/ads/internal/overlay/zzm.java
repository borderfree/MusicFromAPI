package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzang;

public final class zzm implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzang zzang = null;
        String str4 = null;
        zzaq zzaq = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 2:
                    zzc = (zzc) SafeParcelReader.m14930a(parcel2, a, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m14948n(parcel2, a);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.m14948n(parcel2, a);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.m14948n(parcel2, a);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.m14948n(parcel2, a);
                    break;
                case 7:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 9:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.m14948n(parcel2, a);
                    break;
                case 11:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 12:
                    i2 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 13:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 14:
                    zzang = (zzang) SafeParcelReader.m14930a(parcel2, a, zzang.CREATOR);
                    break;
                case 16:
                    str4 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 17:
                    zzaq = (zzaq) SafeParcelReader.m14930a(parcel2, a, zzaq.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.m14948n(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzang, str4, zzaq, iBinder6);
        return adOverlayInfoParcel;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}

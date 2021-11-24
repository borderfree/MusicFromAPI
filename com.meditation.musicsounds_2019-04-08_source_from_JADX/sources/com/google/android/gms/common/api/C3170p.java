package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.p */
public final class C3170p implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            int a2 = SafeParcelReader.m14927a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = SafeParcelReader.m14940f(parcel, a);
                        break;
                    case 2:
                        str = SafeParcelReader.m14947m(parcel, a);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) SafeParcelReader.m14930a(parcel, a, PendingIntent.CREATOR);
                        break;
                    default:
                        SafeParcelReader.m14934b(parcel, a);
                        break;
                }
            } else {
                i = SafeParcelReader.m14940f(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}

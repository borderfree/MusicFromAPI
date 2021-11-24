package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.af */
public final class C3208af implements Creator<ResolveAccountResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
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
                    iBinder = SafeParcelReader.m14948n(parcel, a);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) SafeParcelReader.m14930a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        ResolveAccountResponse resolveAccountResponse = new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
        return resolveAccountResponse;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}

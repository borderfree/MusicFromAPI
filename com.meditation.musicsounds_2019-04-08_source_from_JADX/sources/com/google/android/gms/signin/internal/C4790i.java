package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.i */
public final class C4790i implements Creator<zaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) SafeParcelReader.m14930a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 3:
                    resolveAccountResponse = (ResolveAccountResponse) SafeParcelReader.m14930a(parcel, a, ResolveAccountResponse.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new zaj(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}

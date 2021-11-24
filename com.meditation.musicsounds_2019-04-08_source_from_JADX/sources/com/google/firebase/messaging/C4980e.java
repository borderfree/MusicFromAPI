package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.firebase.messaging.e */
public final class C4980e implements Creator<RemoteMessage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            if (SafeParcelReader.m14927a(a) != 2) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                bundle = SafeParcelReader.m14949o(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new RemoteMessage(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }
}

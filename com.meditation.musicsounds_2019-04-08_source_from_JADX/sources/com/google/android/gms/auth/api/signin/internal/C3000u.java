package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C3000u implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            int a2 = SafeParcelReader.m14927a(a);
            if (a2 == 2) {
                str = SafeParcelReader.m14947m(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m14934b(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.m14930a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}

package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C2978f implements Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        String str = "";
        String str2 = "";
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            int a2 = SafeParcelReader.m14927a(a);
            if (a2 != 4) {
                switch (a2) {
                    case 7:
                        googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m14930a(parcel, a, GoogleSignInAccount.CREATOR);
                        break;
                    case 8:
                        str2 = SafeParcelReader.m14947m(parcel, a);
                        break;
                    default:
                        SafeParcelReader.m14934b(parcel, a);
                        break;
                }
            } else {
                str = SafeParcelReader.m14947m(parcel, a);
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}

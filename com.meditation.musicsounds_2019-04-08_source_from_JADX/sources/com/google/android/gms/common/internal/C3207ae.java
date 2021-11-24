package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.ae */
public final class C3207ae implements Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 2:
                    account = (Account) SafeParcelReader.m14930a(parcel, a, Account.CREATOR);
                    break;
                case 3:
                    i2 = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m14930a(parcel, a, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}

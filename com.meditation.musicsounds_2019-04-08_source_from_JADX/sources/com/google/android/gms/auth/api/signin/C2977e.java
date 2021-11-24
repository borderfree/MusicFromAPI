package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public final class C2977e implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel, a);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m14936c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m14930a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 6:
                    z3 = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 7:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m14936c(parcel, a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
        return googleSignInOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}

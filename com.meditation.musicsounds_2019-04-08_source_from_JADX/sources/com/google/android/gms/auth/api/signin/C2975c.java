package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C2975c implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 4:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 5:
                    str4 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m14930a(parcel2, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 8:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 9:
                    str6 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 10:
                    list = SafeParcelReader.m14936c(parcel2, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 12:
                    str8 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        return googleSignInAccount;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}

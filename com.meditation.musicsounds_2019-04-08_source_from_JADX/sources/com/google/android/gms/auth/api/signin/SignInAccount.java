package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import javax.annotation.Nullable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C2978f();
    @Deprecated

    /* renamed from: a */
    private String f10491a;

    /* renamed from: b */
    private GoogleSignInAccount f10492b;
    @Deprecated

    /* renamed from: c */
    private String f10493c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f10492b = googleSignInAccount;
        this.f10491a = C3266s.m14916a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f10493c = C3266s.m14916a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    /* renamed from: a */
    public final GoogleSignInAccount mo10699a() {
        return this.f10492b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 4, this.f10491a, false);
        C3267a.m14964a(parcel, 7, (Parcelable) this.f10492b, i, false);
        C3267a.m14968a(parcel, 8, this.f10493c, false);
        C3267a.m14956a(parcel, a);
    }
}

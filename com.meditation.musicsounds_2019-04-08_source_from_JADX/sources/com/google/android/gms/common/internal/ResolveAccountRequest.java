package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C3207ae();

    /* renamed from: a */
    private final int f10984a;

    /* renamed from: b */
    private final Account f10985b;

    /* renamed from: c */
    private final int f10986c;

    /* renamed from: d */
    private final GoogleSignInAccount f10987d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f10984a = i;
        this.f10985b = account;
        this.f10986c = i2;
        this.f10987d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: a */
    public Account mo11144a() {
        return this.f10985b;
    }

    /* renamed from: b */
    public int mo11145b() {
        return this.f10986c;
    }

    /* renamed from: c */
    public GoogleSignInAccount mo11146c() {
        return this.f10987d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10984a);
        C3267a.m14964a(parcel, 2, (Parcelable) mo11144a(), i, false);
        C3267a.m14960a(parcel, 3, mo11145b());
        C3267a.m14964a(parcel, 4, (Parcelable) mo11146c(), i, false);
        C3267a.m14956a(parcel, a);
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C2982c();

    /* renamed from: a */
    private final int f10495a;

    /* renamed from: b */
    private int f10496b;

    /* renamed from: c */
    private Bundle f10497c;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f10495a = i;
        this.f10496b = i2;
        this.f10497c = bundle;
    }

    /* renamed from: a */
    public int mo10710a() {
        return this.f10496b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10495a);
        C3267a.m14960a(parcel, 2, mo10710a());
        C3267a.m14962a(parcel, 3, this.f10497c, false);
        C3267a.m14956a(parcel, a);
    }
}

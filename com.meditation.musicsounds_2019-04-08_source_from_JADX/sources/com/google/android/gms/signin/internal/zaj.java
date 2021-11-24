package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new C4790i();

    /* renamed from: a */
    private final int f17319a;

    /* renamed from: b */
    private final ConnectionResult f17320b;

    /* renamed from: c */
    private final ResolveAccountResponse f17321c;

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f17319a = i;
        this.f17320b = connectionResult;
        this.f17321c = resolveAccountResponse;
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    /* renamed from: a */
    public final ConnectionResult mo15908a() {
        return this.f17320b;
    }

    /* renamed from: b */
    public final ResolveAccountResponse mo15909b() {
        return this.f17321c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f17319a);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f17320b, i, false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f17321c, i, false);
        C3267a.m14956a(parcel, a);
    }
}

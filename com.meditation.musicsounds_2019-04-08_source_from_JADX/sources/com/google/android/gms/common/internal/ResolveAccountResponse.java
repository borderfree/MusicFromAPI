package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3252m.C3253a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C3208af();

    /* renamed from: a */
    private final int f10988a;

    /* renamed from: b */
    private IBinder f10989b;

    /* renamed from: c */
    private ConnectionResult f10990c;

    /* renamed from: d */
    private boolean f10991d;

    /* renamed from: e */
    private boolean f10992e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f10988a = i;
        this.f10989b = iBinder;
        this.f10990c = connectionResult;
        this.f10991d = z;
        this.f10992e = z2;
    }

    /* renamed from: a */
    public C3252m mo11148a() {
        return C3253a.m14894a(this.f10989b);
    }

    /* renamed from: b */
    public ConnectionResult mo11149b() {
        return this.f10990c;
    }

    /* renamed from: c */
    public boolean mo11150c() {
        return this.f10991d;
    }

    /* renamed from: d */
    public boolean mo11151d() {
        return this.f10992e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f10990c.equals(resolveAccountResponse.f10990c) && mo11148a().equals(resolveAccountResponse.mo11148a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10988a);
        C3267a.m14963a(parcel, 2, this.f10989b, false);
        C3267a.m14964a(parcel, 3, (Parcelable) mo11149b(), i, false);
        C3267a.m14971a(parcel, 4, mo11150c());
        C3267a.m14971a(parcel, 5, mo11151d());
        C3267a.m14956a(parcel, a);
    }
}

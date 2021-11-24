package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zah extends AbstractSafeParcelable {
    public static final Creator<zah> CREATOR = new C4789h();

    /* renamed from: a */
    private final int f17317a;

    /* renamed from: b */
    private final ResolveAccountRequest f17318b;

    zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f17317a = i;
        this.f17318b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f17317a);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f17318b, i, false);
        C3267a.m14956a(parcel, a);
    }
}

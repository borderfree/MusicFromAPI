package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@Deprecated
public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new C3224av();

    /* renamed from: a */
    private final int f11133a;

    zzr(int i) {
        this.f11133a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f11133a);
        C3267a.m14956a(parcel, a);
    }
}

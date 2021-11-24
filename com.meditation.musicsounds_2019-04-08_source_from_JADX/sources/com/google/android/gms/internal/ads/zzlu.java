package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzlu extends AbstractSafeParcelable {
    public static final Creator<zzlu> CREATOR = new aoy();

    /* renamed from: a */
    public final int f15509a;

    public zzlu(int i) {
        this.f15509a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 2, this.f15509a);
        C3267a.m14956a(parcel, a);
    }
}

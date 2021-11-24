package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzafj extends AbstractSafeParcelable {
    public static final Creator<zzafj> CREATOR = new C3516ef();

    /* renamed from: a */
    String f15347a;

    public zzafj(String str) {
        this.f15347a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15347a, false);
        C3267a.m14956a(parcel, a);
    }
}

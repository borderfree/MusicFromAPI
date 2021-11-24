package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzatt extends AbstractSafeParcelable {
    public static final Creator<zzatt> CREATOR = new C3910sv();

    /* renamed from: a */
    private final int f15365a;

    /* renamed from: b */
    private final String f15366b;

    /* renamed from: c */
    private final String f15367c;

    zzatt(int i, String str, String str2) {
        this.f15365a = i;
        this.f15366b = str;
        this.f15367c = str2;
    }

    public zzatt(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15365a);
        C3267a.m14968a(parcel, 2, this.f15366b, false);
        C3267a.m14968a(parcel, 3, this.f15367c, false);
        C3267a.m14956a(parcel, a);
    }
}

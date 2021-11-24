package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzahk extends AbstractSafeParcelable {
    public static final Creator<zzahk> CREATOR = new C3572gh();

    /* renamed from: a */
    public final zzjj f15348a;

    /* renamed from: b */
    public final String f15349b;

    public zzahk(zzjj zzjj, String str) {
        this.f15348a = zzjj;
        this.f15349b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f15348a, i, false);
        C3267a.m14968a(parcel, 3, this.f15349b, false);
        C3267a.m14956a(parcel, a);
    }
}

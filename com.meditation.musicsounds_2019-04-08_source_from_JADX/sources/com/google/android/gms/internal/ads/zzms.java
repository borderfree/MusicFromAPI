package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzms extends zzjn {
    public zzms(zzjn zzjn) {
        super(zzjn.f15499a, zzjn.f15500b, zzjn.f15501c, zzjn.f15502d, zzjn.f15503e, zzjn.f15504f, zzjn.f15505g, zzjn.f15506h, zzjn.f15507i, zzjn.f15508j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15499a, false);
        C3267a.m14960a(parcel, 3, this.f15500b);
        C3267a.m14960a(parcel, 6, this.f15503e);
        C3267a.m14956a(parcel, a);
    }
}

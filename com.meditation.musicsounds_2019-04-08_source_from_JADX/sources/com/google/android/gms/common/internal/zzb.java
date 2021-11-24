package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzb extends AbstractSafeParcelable {
    public static final Creator<zzb> CREATOR = new C3209ag();

    /* renamed from: a */
    Bundle f11131a;

    /* renamed from: b */
    Feature[] f11132b;

    public zzb() {
    }

    zzb(Bundle bundle, Feature[] featureArr) {
        this.f11131a = bundle;
        this.f11132b = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14962a(parcel, 1, this.f11131a, false);
        C3267a.m14973a(parcel, 2, (T[]) this.f11132b, i, false);
        C3267a.m14956a(parcel, a);
    }
}

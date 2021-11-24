package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new C4526k();
    @Deprecated

    /* renamed from: a */
    private int f16497a;
    @Deprecated

    /* renamed from: b */
    private int f16498b;

    /* renamed from: c */
    private long f16499c;

    /* renamed from: d */
    private int f16500d;

    /* renamed from: e */
    private zzaj[] f16501e;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f16500d = i;
        this.f16497a = i2;
        this.f16498b = i3;
        this.f16499c = j;
        this.f16501e = zzajArr;
    }

    /* renamed from: a */
    public final boolean mo14957a() {
        return this.f16500d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f16497a == locationAvailability.f16497a && this.f16498b == locationAvailability.f16498b && this.f16499c == locationAvailability.f16499c && this.f16500d == locationAvailability.f16500d && Arrays.equals(this.f16501e, locationAvailability.f16501e);
        }
    }

    public final int hashCode() {
        return C3261q.m14904a(Integer.valueOf(this.f16500d), Integer.valueOf(this.f16497a), Integer.valueOf(this.f16498b), Long.valueOf(this.f16499c), this.f16501e);
    }

    public final String toString() {
        boolean a = mo14957a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f16497a);
        C3267a.m14960a(parcel, 2, this.f16498b);
        C3267a.m14961a(parcel, 3, this.f16499c);
        C3267a.m14960a(parcel, 4, this.f16500d);
        C3267a.m14973a(parcel, 5, (T[]) this.f16501e, i, false);
        C3267a.m14956a(parcel, a);
    }
}

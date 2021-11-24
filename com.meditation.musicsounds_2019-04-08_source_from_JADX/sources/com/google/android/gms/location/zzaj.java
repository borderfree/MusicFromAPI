package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzaj extends AbstractSafeParcelable {
    public static final Creator<zzaj> CREATOR = new C4530o();

    /* renamed from: a */
    private final int f16531a;

    /* renamed from: b */
    private final int f16532b;

    /* renamed from: c */
    private final long f16533c;

    /* renamed from: d */
    private final long f16534d;

    zzaj(int i, int i2, long j, long j2) {
        this.f16531a = i;
        this.f16532b = i2;
        this.f16533c = j;
        this.f16534d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f16531a == zzaj.f16531a && this.f16532b == zzaj.f16532b && this.f16533c == zzaj.f16533c && this.f16534d == zzaj.f16534d;
        }
    }

    public final int hashCode() {
        return C3261q.m14904a(Integer.valueOf(this.f16532b), Integer.valueOf(this.f16531a), Long.valueOf(this.f16534d), Long.valueOf(this.f16533c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ");
        sb.append(this.f16531a);
        sb.append(" Cell status: ");
        sb.append(this.f16532b);
        sb.append(" elapsed time NS: ");
        sb.append(this.f16534d);
        sb.append(" system time ms: ");
        sb.append(this.f16533c);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f16531a);
        C3267a.m14960a(parcel, 2, this.f16532b);
        C3267a.m14961a(parcel, 3, this.f16533c);
        C3267a.m14961a(parcel, 4, this.f16534d);
        C3267a.m14956a(parcel, a);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzag extends AbstractSafeParcelable {
    public static final Creator<zzag> CREATOR = new C4755g();

    /* renamed from: a */
    public final String f17252a;

    /* renamed from: b */
    public final zzad f17253b;

    /* renamed from: c */
    public final String f17254c;

    /* renamed from: d */
    public final long f17255d;

    zzag(zzag zzag, long j) {
        C3266s.m14913a(zzag);
        this.f17252a = zzag.f17252a;
        this.f17253b = zzag.f17253b;
        this.f17254c = zzag.f17254c;
        this.f17255d = j;
    }

    public zzag(String str, zzad zzad, String str2, long j) {
        this.f17252a = str;
        this.f17253b = zzad;
        this.f17254c = str2;
        this.f17255d = j;
    }

    public final String toString() {
        String str = this.f17254c;
        String str2 = this.f17252a;
        String valueOf = String.valueOf(this.f17253b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f17252a, false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f17253b, i, false);
        C3267a.m14968a(parcel, 4, this.f17254c, false);
        C3267a.m14961a(parcel, 5, this.f17255d);
        C3267a.m14956a(parcel, a);
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzj extends AbstractSafeParcelable {
    public static final Creator<zzj> CREATOR = new C4532q();

    /* renamed from: a */
    private boolean f16538a;

    /* renamed from: b */
    private long f16539b;

    /* renamed from: c */
    private float f16540c;

    /* renamed from: d */
    private long f16541d;

    /* renamed from: e */
    private int f16542e;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f16538a = z;
        this.f16539b = j;
        this.f16540c = f;
        this.f16541d = j2;
        this.f16542e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f16538a == zzj.f16538a && this.f16539b == zzj.f16539b && Float.compare(this.f16540c, zzj.f16540c) == 0 && this.f16541d == zzj.f16541d && this.f16542e == zzj.f16542e;
    }

    public final int hashCode() {
        return C3261q.m14904a(Boolean.valueOf(this.f16538a), Long.valueOf(this.f16539b), Float.valueOf(this.f16540c), Long.valueOf(this.f16541d), Integer.valueOf(this.f16542e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f16538a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f16539b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f16540c);
        if (this.f16541d != Long.MAX_VALUE) {
            long elapsedRealtime = this.f16541d - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f16542e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f16542e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14971a(parcel, 1, this.f16538a);
        C3267a.m14961a(parcel, 2, this.f16539b);
        C3267a.m14959a(parcel, 3, this.f16540c);
        C3267a.m14961a(parcel, 4, this.f16541d);
        C3267a.m14960a(parcel, 5, this.f16542e);
        C3267a.m14956a(parcel, a);
    }
}

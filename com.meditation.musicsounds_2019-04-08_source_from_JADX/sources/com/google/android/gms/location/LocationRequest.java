package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationRequest> CREATOR = new C4527l();

    /* renamed from: a */
    private int f16502a;

    /* renamed from: b */
    private long f16503b;

    /* renamed from: c */
    private long f16504c;

    /* renamed from: d */
    private boolean f16505d;

    /* renamed from: e */
    private long f16506e;

    /* renamed from: f */
    private int f16507f;

    /* renamed from: g */
    private float f16508g;

    /* renamed from: h */
    private long f16509h;

    public LocationRequest() {
        this.f16502a = 102;
        this.f16503b = 3600000;
        this.f16504c = 600000;
        this.f16505d = false;
        this.f16506e = Long.MAX_VALUE;
        this.f16507f = Integer.MAX_VALUE;
        this.f16508g = 0.0f;
        this.f16509h = 0;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f16502a = i;
        this.f16503b = j;
        this.f16504c = j2;
        this.f16505d = z;
        this.f16506e = j3;
        this.f16507f = i2;
        this.f16508g = f;
        this.f16509h = j4;
    }

    /* renamed from: a */
    public final long mo14962a() {
        long j = this.f16509h;
        return j < this.f16503b ? this.f16503b : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f16502a == locationRequest.f16502a && this.f16503b == locationRequest.f16503b && this.f16504c == locationRequest.f16504c && this.f16505d == locationRequest.f16505d && this.f16506e == locationRequest.f16506e && this.f16507f == locationRequest.f16507f && this.f16508g == locationRequest.f16508g && mo14962a() == locationRequest.mo14962a();
    }

    public final int hashCode() {
        return C3261q.m14904a(Integer.valueOf(this.f16502a), Long.valueOf(this.f16503b), Float.valueOf(this.f16508g), Long.valueOf(this.f16509h));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        switch (this.f16502a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        sb.append(str);
        if (this.f16502a != 105) {
            sb.append(" requested=");
            sb.append(this.f16503b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f16504c);
        sb.append("ms");
        if (this.f16509h > this.f16503b) {
            sb.append(" maxWait=");
            sb.append(this.f16509h);
            sb.append("ms");
        }
        if (this.f16508g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f16508g);
            sb.append("m");
        }
        if (this.f16506e != Long.MAX_VALUE) {
            long elapsedRealtime = this.f16506e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f16507f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f16507f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f16502a);
        C3267a.m14961a(parcel, 2, this.f16503b);
        C3267a.m14961a(parcel, 3, this.f16504c);
        C3267a.m14971a(parcel, 4, this.f16505d);
        C3267a.m14961a(parcel, 5, this.f16506e);
        C3267a.m14960a(parcel, 6, this.f16507f);
        C3267a.m14959a(parcel, 7, this.f16508g);
        C3267a.m14961a(parcel, 8, this.f16509h);
        C3267a.m14956a(parcel, a);
    }
}

package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbd extends AbstractSafeParcelable {
    public static final Creator<zzbd> CREATOR = new C4230w();

    /* renamed from: a */
    static final List<ClientIdentity> f15658a = Collections.emptyList();

    /* renamed from: b */
    private LocationRequest f15659b;

    /* renamed from: c */
    private List<ClientIdentity> f15660c;

    /* renamed from: d */
    private String f15661d;

    /* renamed from: e */
    private boolean f15662e;

    /* renamed from: f */
    private boolean f15663f;

    /* renamed from: g */
    private boolean f15664g;

    /* renamed from: h */
    private String f15665h;

    /* renamed from: i */
    private boolean f15666i = true;

    zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f15659b = locationRequest;
        this.f15660c = list;
        this.f15661d = str;
        this.f15662e = z;
        this.f15663f = z2;
        this.f15664g = z3;
        this.f15665h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C3261q.m14906a(this.f15659b, zzbd.f15659b) && C3261q.m14906a(this.f15660c, zzbd.f15660c) && C3261q.m14906a(this.f15661d, zzbd.f15661d) && this.f15662e == zzbd.f15662e && this.f15663f == zzbd.f15663f && this.f15664g == zzbd.f15664g && C3261q.m14906a(this.f15665h, zzbd.f15665h);
    }

    public final int hashCode() {
        return this.f15659b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15659b);
        if (this.f15661d != null) {
            sb.append(" tag=");
            sb.append(this.f15661d);
        }
        if (this.f15665h != null) {
            sb.append(" moduleId=");
            sb.append(this.f15665h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f15662e);
        sb.append(" clients=");
        sb.append(this.f15660c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f15663f);
        if (this.f15664g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 1, (Parcelable) this.f15659b, i, false);
        C3267a.m14980c(parcel, 5, this.f15660c, false);
        C3267a.m14968a(parcel, 6, this.f15661d, false);
        C3267a.m14971a(parcel, 7, this.f15662e);
        C3267a.m14971a(parcel, 8, this.f15663f);
        C3267a.m14971a(parcel, 9, this.f15664g);
        C3267a.m14968a(parcel, 10, this.f15665h, false);
        C3267a.m14956a(parcel, a);
    }
}

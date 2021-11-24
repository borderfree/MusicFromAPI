package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.List;

@C3464ci
public final class zzjj extends AbstractSafeParcelable {
    public static final Creator<zzjj> CREATOR = new amo();

    /* renamed from: a */
    public final int f15481a;

    /* renamed from: b */
    public final long f15482b;

    /* renamed from: c */
    public final Bundle f15483c;

    /* renamed from: d */
    public final int f15484d;

    /* renamed from: e */
    public final List<String> f15485e;

    /* renamed from: f */
    public final boolean f15486f;

    /* renamed from: g */
    public final int f15487g;

    /* renamed from: h */
    public final boolean f15488h;

    /* renamed from: i */
    public final String f15489i;

    /* renamed from: j */
    public final zzmq f15490j;

    /* renamed from: k */
    public final Location f15491k;

    /* renamed from: l */
    public final String f15492l;

    /* renamed from: m */
    public final Bundle f15493m;

    /* renamed from: n */
    public final Bundle f15494n;

    /* renamed from: o */
    public final List<String> f15495o;

    /* renamed from: p */
    public final String f15496p;

    /* renamed from: q */
    public final String f15497q;

    /* renamed from: r */
    public final boolean f15498r;

    public zzjj(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzmq zzmq, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f15481a = i;
        this.f15482b = j;
        this.f15483c = bundle == null ? new Bundle() : bundle;
        this.f15484d = i2;
        this.f15485e = list;
        this.f15486f = z;
        this.f15487g = i3;
        this.f15488h = z2;
        this.f15489i = str;
        this.f15490j = zzmq;
        this.f15491k = location;
        this.f15492l = str2;
        this.f15493m = bundle2 == null ? new Bundle() : bundle2;
        this.f15494n = bundle3;
        this.f15495o = list2;
        this.f15496p = str3;
        this.f15497q = str4;
        this.f15498r = z3;
    }

    /* renamed from: a */
    public final zzjj mo13978a() {
        Bundle bundle = this.f15493m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f15483c;
            this.f15493m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", this.f15483c);
        }
        zzjj zzjj = new zzjj(this.f15481a, this.f15482b, bundle, this.f15484d, this.f15485e, this.f15486f, this.f15487g, this.f15488h, this.f15489i, this.f15490j, this.f15491k, this.f15492l, this.f15493m, this.f15494n, this.f15495o, this.f15496p, this.f15497q, this.f15498r);
        return zzjj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjj = (zzjj) obj;
        return this.f15481a == zzjj.f15481a && this.f15482b == zzjj.f15482b && C3261q.m14906a(this.f15483c, zzjj.f15483c) && this.f15484d == zzjj.f15484d && C3261q.m14906a(this.f15485e, zzjj.f15485e) && this.f15486f == zzjj.f15486f && this.f15487g == zzjj.f15487g && this.f15488h == zzjj.f15488h && C3261q.m14906a(this.f15489i, zzjj.f15489i) && C3261q.m14906a(this.f15490j, zzjj.f15490j) && C3261q.m14906a(this.f15491k, zzjj.f15491k) && C3261q.m14906a(this.f15492l, zzjj.f15492l) && C3261q.m14906a(this.f15493m, zzjj.f15493m) && C3261q.m14906a(this.f15494n, zzjj.f15494n) && C3261q.m14906a(this.f15495o, zzjj.f15495o) && C3261q.m14906a(this.f15496p, zzjj.f15496p) && C3261q.m14906a(this.f15497q, zzjj.f15497q) && this.f15498r == zzjj.f15498r;
    }

    public final int hashCode() {
        return C3261q.m14904a(Integer.valueOf(this.f15481a), Long.valueOf(this.f15482b), this.f15483c, Integer.valueOf(this.f15484d), this.f15485e, Boolean.valueOf(this.f15486f), Integer.valueOf(this.f15487g), Boolean.valueOf(this.f15488h), this.f15489i, this.f15490j, this.f15491k, this.f15492l, this.f15493m, this.f15494n, this.f15495o, this.f15496p, this.f15497q, Boolean.valueOf(this.f15498r));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15481a);
        C3267a.m14961a(parcel, 2, this.f15482b);
        C3267a.m14962a(parcel, 3, this.f15483c, false);
        C3267a.m14960a(parcel, 4, this.f15484d);
        C3267a.m14978b(parcel, 5, this.f15485e, false);
        C3267a.m14971a(parcel, 6, this.f15486f);
        C3267a.m14960a(parcel, 7, this.f15487g);
        C3267a.m14971a(parcel, 8, this.f15488h);
        C3267a.m14968a(parcel, 9, this.f15489i, false);
        C3267a.m14964a(parcel, 10, (Parcelable) this.f15490j, i, false);
        C3267a.m14964a(parcel, 11, (Parcelable) this.f15491k, i, false);
        C3267a.m14968a(parcel, 12, this.f15492l, false);
        C3267a.m14962a(parcel, 13, this.f15493m, false);
        C3267a.m14962a(parcel, 14, this.f15494n, false);
        C3267a.m14978b(parcel, 15, this.f15495o, false);
        C3267a.m14968a(parcel, 16, this.f15496p, false);
        C3267a.m14968a(parcel, 17, this.f15497q, false);
        C3267a.m14971a(parcel, 18, this.f15498r);
        C3267a.m14956a(parcel, a);
    }
}

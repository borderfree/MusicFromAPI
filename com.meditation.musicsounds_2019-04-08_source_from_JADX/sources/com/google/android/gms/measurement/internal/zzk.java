package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C4740eo();

    /* renamed from: a */
    public final String f17264a;

    /* renamed from: b */
    public final String f17265b;

    /* renamed from: c */
    public final String f17266c;

    /* renamed from: d */
    public final String f17267d;

    /* renamed from: e */
    public final long f17268e;

    /* renamed from: f */
    public final long f17269f;

    /* renamed from: g */
    public final String f17270g;

    /* renamed from: h */
    public final boolean f17271h;

    /* renamed from: i */
    public final boolean f17272i;

    /* renamed from: j */
    public final long f17273j;

    /* renamed from: k */
    public final String f17274k;

    /* renamed from: l */
    public final long f17275l;

    /* renamed from: m */
    public final long f17276m;

    /* renamed from: n */
    public final int f17277n;

    /* renamed from: o */
    public final boolean f17278o;

    /* renamed from: p */
    public final boolean f17279p;

    /* renamed from: q */
    public final boolean f17280q;

    /* renamed from: r */
    public final String f17281r;

    zzk(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        C3266s.m14915a(str);
        this.f17264a = str;
        this.f17265b = TextUtils.isEmpty(str2) ? null : str2;
        this.f17266c = str3;
        this.f17273j = j;
        this.f17267d = str4;
        this.f17268e = j2;
        this.f17269f = j3;
        this.f17270g = str5;
        this.f17271h = z;
        this.f17272i = z2;
        this.f17274k = str6;
        this.f17275l = j4;
        this.f17276m = j5;
        this.f17277n = i;
        this.f17278o = z3;
        this.f17279p = z4;
        this.f17280q = z5;
        this.f17281r = str7;
    }

    zzk(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        this.f17264a = str;
        this.f17265b = str2;
        this.f17266c = str3;
        this.f17273j = j3;
        this.f17267d = str4;
        this.f17268e = j;
        this.f17269f = j2;
        this.f17270g = str5;
        this.f17271h = z;
        this.f17272i = z2;
        this.f17274k = str6;
        this.f17275l = j4;
        this.f17276m = j5;
        this.f17277n = i;
        this.f17278o = z3;
        this.f17279p = z4;
        this.f17280q = z5;
        this.f17281r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f17264a, false);
        C3267a.m14968a(parcel, 3, this.f17265b, false);
        C3267a.m14968a(parcel, 4, this.f17266c, false);
        C3267a.m14968a(parcel, 5, this.f17267d, false);
        C3267a.m14961a(parcel, 6, this.f17268e);
        C3267a.m14961a(parcel, 7, this.f17269f);
        C3267a.m14968a(parcel, 8, this.f17270g, false);
        C3267a.m14971a(parcel, 9, this.f17271h);
        C3267a.m14971a(parcel, 10, this.f17272i);
        C3267a.m14961a(parcel, 11, this.f17273j);
        C3267a.m14968a(parcel, 12, this.f17274k, false);
        C3267a.m14961a(parcel, 13, this.f17275l);
        C3267a.m14961a(parcel, 14, this.f17276m);
        C3267a.m14960a(parcel, 15, this.f17277n);
        C3267a.m14971a(parcel, 16, this.f17278o);
        C3267a.m14971a(parcel, 17, this.f17279p);
        C3267a.m14971a(parcel, 18, this.f17280q);
        C3267a.m14968a(parcel, 19, this.f17281r, false);
        C3267a.m14956a(parcel, a);
    }
}

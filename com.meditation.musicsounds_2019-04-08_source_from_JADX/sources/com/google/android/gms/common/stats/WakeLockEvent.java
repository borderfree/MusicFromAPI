package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C3289e();

    /* renamed from: a */
    private final int f11145a;

    /* renamed from: b */
    private final long f11146b;

    /* renamed from: c */
    private int f11147c;

    /* renamed from: d */
    private final String f11148d;

    /* renamed from: e */
    private final String f11149e;

    /* renamed from: f */
    private final String f11150f;

    /* renamed from: g */
    private final int f11151g;

    /* renamed from: h */
    private final List<String> f11152h;

    /* renamed from: i */
    private final String f11153i;

    /* renamed from: j */
    private final long f11154j;

    /* renamed from: k */
    private int f11155k;

    /* renamed from: l */
    private final String f11156l;

    /* renamed from: m */
    private final float f11157m;

    /* renamed from: n */
    private final long f11158n;

    /* renamed from: o */
    private long f11159o;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f11145a = i;
        this.f11146b = j;
        this.f11147c = i2;
        this.f11148d = str;
        this.f11149e = str3;
        this.f11150f = str5;
        this.f11151g = i3;
        this.f11159o = -1;
        this.f11152h = list;
        this.f11153i = str2;
        this.f11154j = j2;
        this.f11155k = i4;
        this.f11156l = str4;
        this.f11157m = f;
        this.f11158n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    /* renamed from: a */
    public final long mo11305a() {
        return this.f11146b;
    }

    /* renamed from: b */
    public final int mo11306b() {
        return this.f11147c;
    }

    /* renamed from: c */
    public final long mo11307c() {
        return this.f11159o;
    }

    /* renamed from: d */
    public final String mo11308d() {
        String str = this.f11148d;
        int i = this.f11151g;
        String join = this.f11152h == null ? "" : TextUtils.join(",", this.f11152h);
        int i2 = this.f11155k;
        String str2 = this.f11149e == null ? "" : this.f11149e;
        String str3 = this.f11156l == null ? "" : this.f11156l;
        float f = this.f11157m;
        String str4 = this.f11150f == null ? "" : this.f11150f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(join).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f11145a);
        C3267a.m14961a(parcel, 2, mo11305a());
        C3267a.m14968a(parcel, 4, this.f11148d, false);
        C3267a.m14960a(parcel, 5, this.f11151g);
        C3267a.m14978b(parcel, 6, this.f11152h, false);
        C3267a.m14961a(parcel, 8, this.f11154j);
        C3267a.m14968a(parcel, 10, this.f11149e, false);
        C3267a.m14960a(parcel, 11, mo11306b());
        C3267a.m14968a(parcel, 12, this.f11153i, false);
        C3267a.m14968a(parcel, 13, this.f11156l, false);
        C3267a.m14960a(parcel, 14, this.f11155k);
        C3267a.m14959a(parcel, 15, this.f11157m);
        C3267a.m14961a(parcel, 16, this.f11158n);
        C3267a.m14968a(parcel, 17, this.f11150f, false);
        C3267a.m14956a(parcel, a);
    }
}

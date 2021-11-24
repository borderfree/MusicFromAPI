package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzsi extends AbstractSafeParcelable {
    public static final Creator<zzsi> CREATOR = new avl();

    /* renamed from: a */
    public final boolean f15523a;

    /* renamed from: b */
    public final String f15524b;

    /* renamed from: c */
    public final int f15525c;

    /* renamed from: d */
    public final byte[] f15526d;

    /* renamed from: e */
    public final String[] f15527e;

    /* renamed from: f */
    public final String[] f15528f;

    /* renamed from: g */
    public final boolean f15529g;

    /* renamed from: h */
    public final long f15530h;

    zzsi(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f15523a = z;
        this.f15524b = str;
        this.f15525c = i;
        this.f15526d = bArr;
        this.f15527e = strArr;
        this.f15528f = strArr2;
        this.f15529g = z2;
        this.f15530h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14971a(parcel, 1, this.f15523a);
        C3267a.m14968a(parcel, 2, this.f15524b, false);
        C3267a.m14960a(parcel, 3, this.f15525c);
        C3267a.m14972a(parcel, 4, this.f15526d, false);
        C3267a.m14974a(parcel, 5, this.f15527e, false);
        C3267a.m14974a(parcel, 6, this.f15528f, false);
        C3267a.m14971a(parcel, 7, this.f15529g);
        C3267a.m14961a(parcel, 8, this.f15530h);
        C3267a.m14956a(parcel, a);
    }
}

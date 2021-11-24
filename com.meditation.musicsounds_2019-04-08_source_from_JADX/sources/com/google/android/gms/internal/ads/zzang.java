package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzang extends AbstractSafeParcelable {
    public static final Creator<zzang> CREATOR = new C3733mg();

    /* renamed from: a */
    public String f15360a;

    /* renamed from: b */
    public int f15361b;

    /* renamed from: c */
    public int f15362c;

    /* renamed from: d */
    public boolean f15363d;

    /* renamed from: e */
    public boolean f15364e;

    public zzang(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzang(int i, int i2, boolean z, boolean z2) {
        this((int) C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, false, z2);
    }

    private zzang(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i, i2, z, z3);
    }

    zzang(String str, int i, int i2, boolean z, boolean z2) {
        this.f15360a = str;
        this.f15361b = i;
        this.f15362c = i2;
        this.f15363d = z;
        this.f15364e = z2;
    }

    /* renamed from: a */
    public static zzang m20619a() {
        return new zzang(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15360a, false);
        C3267a.m14960a(parcel, 3, this.f15361b);
        C3267a.m14960a(parcel, 4, this.f15362c);
        C3267a.m14971a(parcel, 5, this.f15363d);
        C3267a.m14971a(parcel, 6, this.f15364e);
        C3267a.m14956a(parcel, a);
    }
}

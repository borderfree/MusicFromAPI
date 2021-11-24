package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzzt extends AbstractSafeParcelable {
    public static final Creator<zzzt> CREATOR = new bda();

    /* renamed from: a */
    private final int f15535a;

    /* renamed from: b */
    private final int f15536b;

    /* renamed from: c */
    private final int f15537c;

    zzzt(int i, int i2, int i3) {
        this.f15535a = i;
        this.f15536b = i2;
        this.f15537c = i3;
    }

    /* renamed from: a */
    public static zzzt m20765a(C3903so soVar) {
        return new zzzt(soVar.f14932a, soVar.f14933b, soVar.f14934c);
    }

    public final String toString() {
        int i = this.f15535a;
        int i2 = this.f15536b;
        int i3 = this.f15537c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15535a);
        C3267a.m14960a(parcel, 2, this.f15536b);
        C3267a.m14960a(parcel, 3, this.f15537c);
        C3267a.m14956a(parcel, a);
    }
}

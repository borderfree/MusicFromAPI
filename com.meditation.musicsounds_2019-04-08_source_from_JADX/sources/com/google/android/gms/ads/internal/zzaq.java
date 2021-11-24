package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.internal.ads.C3464ci;

@C3464ci
public final class zzaq extends AbstractSafeParcelable {
    public static final Creator<zzaq> CREATOR = new zzar();

    /* renamed from: a */
    private final String f10181a;
    public final boolean zzze;
    public final boolean zzzf;
    public final boolean zzzh;
    public final float zzzi;
    public final int zzzj;
    public final boolean zzzk;
    public final boolean zzzl;
    public final boolean zzzm;

    zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzze = z;
        this.zzzf = z2;
        this.f10181a = str;
        this.zzzh = z3;
        this.zzzi = f;
        this.zzzj = i;
        this.zzzk = z4;
        this.zzzl = z5;
        this.zzzm = z6;
    }

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14971a(parcel, 2, this.zzze);
        C3267a.m14971a(parcel, 3, this.zzzf);
        C3267a.m14968a(parcel, 4, this.f10181a, false);
        C3267a.m14971a(parcel, 5, this.zzzh);
        C3267a.m14959a(parcel, 6, this.zzzi);
        C3267a.m14960a(parcel, 7, this.zzzj);
        C3267a.m14971a(parcel, 8, this.zzzk);
        C3267a.m14971a(parcel, 9, this.zzzl);
        C3267a.m14971a(parcel, 10, this.zzzm);
        C3267a.m14956a(parcel, a);
    }
}

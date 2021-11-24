package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.location.C4537v;
import com.google.android.gms.location.C4538w;
import com.google.android.gms.location.C4540y;
import com.google.android.gms.location.C4541z;

public final class zzbf extends AbstractSafeParcelable {
    public static final Creator<zzbf> CREATOR = new C4231x();

    /* renamed from: a */
    private int f15667a;

    /* renamed from: b */
    private zzbd f15668b;

    /* renamed from: c */
    private C4540y f15669c;

    /* renamed from: d */
    private PendingIntent f15670d;

    /* renamed from: e */
    private C4537v f15671e;

    /* renamed from: f */
    private C4213f f15672f;

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f15667a = i;
        this.f15668b = zzbd;
        C4213f fVar = null;
        this.f15669c = iBinder == null ? null : C4541z.m22626a(iBinder);
        this.f15670d = pendingIntent;
        this.f15671e = iBinder2 == null ? null : C4538w.m22621a(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof C4213f ? (C4213f) queryLocalInterface : new C4214g(iBinder3);
        }
        this.f15672f = fVar;
    }

    /* renamed from: a */
    public static zzbf m20919a(C4537v vVar, C4213f fVar) {
        zzbf zzbf = new zzbf(2, null, null, null, vVar.asBinder(), fVar != null ? fVar.asBinder() : null);
        return zzbf;
    }

    /* renamed from: a */
    public static zzbf m20920a(C4540y yVar, C4213f fVar) {
        zzbf zzbf = new zzbf(2, null, yVar.asBinder(), null, null, fVar != null ? fVar.asBinder() : null);
        return zzbf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15667a);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f15668b, i, false);
        IBinder iBinder = null;
        C3267a.m14963a(parcel, 3, this.f15669c == null ? null : this.f15669c.asBinder(), false);
        C3267a.m14964a(parcel, 4, (Parcelable) this.f15670d, i, false);
        C3267a.m14963a(parcel, 5, this.f15671e == null ? null : this.f15671e.asBinder(), false);
        if (this.f15672f != null) {
            iBinder = this.f15672f.asBinder();
        }
        C3267a.m14963a(parcel, 6, iBinder, false);
        C3267a.m14956a(parcel, a);
    }
}

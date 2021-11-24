package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.location.C4534s;
import com.google.android.gms.location.C4535t;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C4207ag();

    /* renamed from: a */
    private int f15687a;

    /* renamed from: b */
    private zzm f15688b;

    /* renamed from: c */
    private C4534s f15689c;

    /* renamed from: d */
    private C4213f f15690d;

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f15687a = i;
        this.f15688b = zzm;
        C4213f fVar = null;
        this.f15689c = iBinder == null ? null : C4535t.m22617a(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof C4213f ? (C4213f) queryLocalInterface : new C4214g(iBinder2);
        }
        this.f15690d = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15687a);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f15688b, i, false);
        IBinder iBinder = null;
        C3267a.m14963a(parcel, 3, this.f15689c == null ? null : this.f15689c.asBinder(), false);
        if (this.f15690d != null) {
            iBinder = this.f15690d.asBinder();
        }
        C3267a.m14963a(parcel, 4, iBinder, false);
        C3267a.m14956a(parcel, a);
    }
}

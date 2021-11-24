package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.C4200a;
import com.google.android.gms.internal.location.C4202ab;

/* renamed from: com.google.android.gms.location.x */
public final class C4539x extends C4200a implements C4537v {
    C4539x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final void mo14069a(LocationAvailability locationAvailability) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) locationAvailability);
        mo14048b(2, a);
    }

    /* renamed from: a */
    public final void mo14070a(LocationResult locationResult) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) locationResult);
        mo14048b(1, a);
    }
}

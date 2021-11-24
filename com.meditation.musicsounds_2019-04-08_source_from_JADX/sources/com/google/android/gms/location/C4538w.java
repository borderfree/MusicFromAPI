package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.C4202ab;
import com.google.android.gms.internal.location.C4227t;

/* renamed from: com.google.android.gms.location.w */
public abstract class C4538w extends C4227t implements C4537v {
    /* renamed from: a */
    public static C4537v m22621a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof C4537v ? (C4537v) queryLocalInterface : new C4539x(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14060a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo14070a((LocationResult) C4202ab.m20862a(parcel, LocationResult.CREATOR));
                break;
            case 2:
                mo14069a((LocationAvailability) C4202ab.m20862a(parcel, LocationAvailability.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}

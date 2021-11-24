package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.C4202ab;
import com.google.android.gms.internal.location.C4227t;

/* renamed from: com.google.android.gms.location.z */
public abstract class C4541z extends C4227t implements C4540y {
    /* renamed from: a */
    public static C4540y m22626a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof C4540y ? (C4540y) queryLocalInterface : new C4514aa(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14060a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo14071a((Location) C4202ab.m20862a(parcel, Location.CREATOR));
        return true;
    }
}

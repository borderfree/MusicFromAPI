package com.google.android.gms.internal.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth.f */
public class C4146f extends Binder implements IInterface {

    /* renamed from: a */
    private static C4148h f15544a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13995a(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo13995a(i, parcel, parcel2, i2);
    }
}

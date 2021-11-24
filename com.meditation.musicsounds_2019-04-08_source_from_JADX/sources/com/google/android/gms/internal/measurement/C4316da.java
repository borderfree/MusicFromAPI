package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.da */
public class C4316da implements IInterface {

    /* renamed from: a */
    private final IBinder f15996a;

    /* renamed from: b */
    private final String f15997b;

    protected C4316da(IBinder iBinder, String str) {
        this.f15996a = iBinder;
        this.f15997b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14267a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15997b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14268a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15996a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15996a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14270b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15996a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

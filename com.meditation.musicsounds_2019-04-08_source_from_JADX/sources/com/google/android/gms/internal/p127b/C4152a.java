package com.google.android.gms.internal.p127b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.b.a */
public class C4152a implements IInterface {

    /* renamed from: a */
    private final IBinder f15596a;

    /* renamed from: b */
    private final String f15597b;

    protected C4152a(IBinder iBinder, String str) {
        this.f15596a = iBinder;
        this.f15597b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14000a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15597b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14001a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15596a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15596a;
    }
}

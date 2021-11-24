package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.a */
public class C4200a implements IInterface {

    /* renamed from: a */
    private final IBinder f15633a;

    /* renamed from: b */
    private final String f15634b;

    protected C4200a(IBinder iBinder, String str) {
        this.f15633a = iBinder;
        this.f15634b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14045a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15634b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14046a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15633a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15633a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14048b(int i, Parcel parcel) {
        try {
            this.f15633a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

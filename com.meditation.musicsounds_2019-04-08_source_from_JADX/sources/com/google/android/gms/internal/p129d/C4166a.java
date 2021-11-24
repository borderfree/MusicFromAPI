package com.google.android.gms.internal.p129d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.d.a */
public class C4166a implements IInterface {

    /* renamed from: a */
    private final IBinder f15606a;

    /* renamed from: b */
    private final String f15607b;

    protected C4166a(IBinder iBinder, String str) {
        this.f15606a = iBinder;
        this.f15607b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14011a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15606a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15606a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14013b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15606a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo14014c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15607b);
        return obtain;
    }
}

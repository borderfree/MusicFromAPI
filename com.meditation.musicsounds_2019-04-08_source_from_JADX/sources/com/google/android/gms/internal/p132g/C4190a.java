package com.google.android.gms.internal.p132g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.g.a */
public class C4190a implements IInterface {

    /* renamed from: a */
    private final IBinder f15629a;

    /* renamed from: b */
    private final String f15630b;

    protected C4190a(IBinder iBinder, String str) {
        this.f15629a = iBinder;
        this.f15630b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14029a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15629a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15629a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14031b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15629a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s_ */
    public final Parcel mo14032s_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15630b);
        return obtain;
    }
}

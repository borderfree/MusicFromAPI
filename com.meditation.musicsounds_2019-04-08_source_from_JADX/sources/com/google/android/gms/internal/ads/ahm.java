package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class ahm implements IInterface {

    /* renamed from: a */
    private final IBinder f12049a;

    /* renamed from: b */
    private final String f12050b;

    protected ahm(IBinder iBinder, String str) {
        this.f12049a = iBinder;
        this.f12050b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo11917a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f12049a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f12049a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11919b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12049a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q_ */
    public final Parcel mo11920q_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12050b);
        return obtain;
    }
}

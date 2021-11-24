package com.google.android.gms.internal.p126a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.a.a */
public class C3380a implements IInterface {

    /* renamed from: a */
    private final IBinder f11323a;

    /* renamed from: b */
    private final String f11324b;

    protected C3380a(IBinder iBinder, String str) {
        this.f11323a = iBinder;
        this.f11324b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo11419a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11323a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f11323a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r_ */
    public final Parcel mo11421r_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11324b);
        return obtain;
    }
}

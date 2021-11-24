package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth.a */
public class C4141a implements IInterface {

    /* renamed from: a */
    private final IBinder f15541a;

    /* renamed from: b */
    private final String f15542b;

    protected C4141a(IBinder iBinder, String str) {
        this.f15541a = iBinder;
        this.f15542b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13992a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15542b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo13993a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15541a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15541a;
    }
}

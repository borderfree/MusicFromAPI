package com.google.android.gms.internal.p128c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.c.a */
public class C4160a implements IInterface {

    /* renamed from: a */
    private final IBinder f15601a;

    /* renamed from: b */
    private final String f15602b;

    protected C4160a(IBinder iBinder, String str) {
        this.f15601a = iBinder;
        this.f15602b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14005a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15602b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14006a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15601a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15601a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14008b(int i, Parcel parcel) {
        try {
            this.f15601a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

package com.google.android.gms.internal.p131f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.f.a */
public class C4181a implements IInterface {

    /* renamed from: a */
    private final IBinder f15619a;

    /* renamed from: b */
    private final String f15620b;

    protected C4181a(IBinder iBinder, String str) {
        this.f15619a = iBinder;
        this.f15620b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14022a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15620b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14023a(int i, Parcel parcel) {
        try {
            this.f15619a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15619a;
    }
}

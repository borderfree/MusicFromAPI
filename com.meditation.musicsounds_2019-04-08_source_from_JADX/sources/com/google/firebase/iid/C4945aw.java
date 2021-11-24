package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: com.google.firebase.iid.aw */
public final class C4945aw implements C4944av {

    /* renamed from: a */
    private final IBinder f17744a;

    C4945aw(IBinder iBinder) {
        this.f17744a = iBinder;
    }

    /* renamed from: a */
    public final void mo16209a(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f17744a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f17744a;
    }
}

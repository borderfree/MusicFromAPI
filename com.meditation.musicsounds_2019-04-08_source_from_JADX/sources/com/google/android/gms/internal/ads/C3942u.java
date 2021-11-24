package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;

/* renamed from: com.google.android.gms.internal.ads.u */
public final class C3942u extends ahm implements C3915t {
    C3942u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    /* renamed from: a */
    public final IBinder mo13682a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        Parcel a = mo11917a(1, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}

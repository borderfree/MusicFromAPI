package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class bau extends ahm implements bas {
    bau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public final bav mo12681a(String str) {
        bav bav;
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        Parcel a = mo11917a(1, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bav = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bav = queryLocalInterface instanceof bav ? (bav) queryLocalInterface : new bax(readStrongBinder);
        }
        a.recycle();
        return bav;
    }

    /* renamed from: b */
    public final boolean mo12683b(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        Parcel a = mo11917a(2, q_);
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final bcq mo12684c(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        Parcel a = mo11917a(3, q_);
        bcq a2 = bcr.m18169a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}

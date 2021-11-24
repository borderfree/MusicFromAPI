package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3323b;

public final class anz extends ahm implements any {
    anz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo12124a(C3323b bVar, zzjn zzjn, String str, bas bas, int i, int i2) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjn);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        q_.writeInt(i2);
        Parcel a = mo11917a(2, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}

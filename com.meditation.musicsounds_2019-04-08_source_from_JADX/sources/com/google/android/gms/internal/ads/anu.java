package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3323b;

public final class anu extends ahm implements ant {
    anu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: a */
    public final IBinder mo12123a(C3323b bVar, String str, bas bas, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = mo11917a(1, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}

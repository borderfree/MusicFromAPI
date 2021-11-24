package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3323b;

/* renamed from: com.google.android.gms.internal.ads.ga */
public final class C3565ga extends ahm implements C3563fz {
    C3565ga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    /* renamed from: a */
    public final IBinder mo12928a(C3323b bVar, bas bas, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bas);
        q_.writeInt(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = mo11917a(1, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}

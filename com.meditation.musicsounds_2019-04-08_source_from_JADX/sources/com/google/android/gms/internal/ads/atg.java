package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3323b;

public final class atg extends ahm implements atf {
    atg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo12483a(C3323b bVar, C3323b bVar2, C3323b bVar3, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        aho.m16239a(q_, (IInterface) bVar3);
        q_.writeInt(C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = mo11917a(1, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}

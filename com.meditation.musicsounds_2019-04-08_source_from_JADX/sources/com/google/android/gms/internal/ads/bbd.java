package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bbd extends ahm implements bbb {
    bbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: a */
    public final int mo12677a() {
        Parcel a = mo11917a(1, mo11920q_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}

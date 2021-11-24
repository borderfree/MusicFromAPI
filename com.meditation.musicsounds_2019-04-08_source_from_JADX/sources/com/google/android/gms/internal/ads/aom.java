package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class aom extends ahm implements aok {
    aom(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* renamed from: b */
    public final long mo12121b() {
        Parcel a = mo11917a(1, mo11920q_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}

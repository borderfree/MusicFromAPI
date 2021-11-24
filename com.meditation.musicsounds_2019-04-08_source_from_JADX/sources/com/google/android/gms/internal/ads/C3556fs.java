package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fs */
public final class C3556fs extends ahm implements C3554fq {
    C3556fs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo12916a() {
        Parcel a = mo11917a(1, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo12917b() {
        Parcel a = mo11917a(2, mo11920q_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}

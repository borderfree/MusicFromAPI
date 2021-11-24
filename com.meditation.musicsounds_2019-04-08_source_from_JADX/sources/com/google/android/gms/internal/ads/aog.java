package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class aog extends ahm implements aoe {
    aog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo12108a(String str, String str2) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        q_.writeString(str2);
        mo11919b(1, q_);
    }
}

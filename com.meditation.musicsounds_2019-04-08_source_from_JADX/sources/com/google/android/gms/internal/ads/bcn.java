package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bcn extends ahm implements bcm {
    bcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* renamed from: a */
    public final void mo12792a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(2, q_);
    }
}

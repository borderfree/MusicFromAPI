package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bcp extends ahm implements bco {
    bcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo12793a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(3, q_);
    }
}

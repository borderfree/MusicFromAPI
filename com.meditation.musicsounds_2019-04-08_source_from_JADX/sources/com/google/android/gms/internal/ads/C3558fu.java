package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fu */
public final class C3558fu extends ahm implements C3557ft {
    C3558fu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo12926a(C3554fq fqVar, String str) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) fqVar);
        q_.writeString(str);
        mo11919b(1, q_);
    }
}

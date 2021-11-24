package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aue extends ahm implements aub {
    aue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12487a(atq atq) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) atq);
        mo11919b(1, q_);
    }
}

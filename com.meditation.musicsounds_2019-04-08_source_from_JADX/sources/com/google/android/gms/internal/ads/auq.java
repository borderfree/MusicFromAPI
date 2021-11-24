package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class auq extends ahm implements auo {
    auq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12516a(auu auu) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) auu);
        mo11919b(1, q_);
    }
}

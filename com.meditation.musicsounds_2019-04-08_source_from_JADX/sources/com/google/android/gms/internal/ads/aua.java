package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aua extends ahm implements aty {
    aua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12486a(atm atm) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) atm);
        mo11919b(1, q_);
    }
}

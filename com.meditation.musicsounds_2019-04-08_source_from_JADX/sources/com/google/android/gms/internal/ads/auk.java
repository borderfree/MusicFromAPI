package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class auk extends ahm implements aui {
    auk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo12514a(atu atu) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) atu);
        mo11919b(1, q_);
    }
}

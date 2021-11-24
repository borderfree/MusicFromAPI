package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class auh extends ahm implements auf {
    auh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public final void mo12513a(atu atu, String str) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) atu);
        q_.writeString(str);
        mo11919b(1, q_);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.dp */
public final class C3498dp extends ahm implements C3496dn {
    C3498dp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* renamed from: a */
    public final void mo12854a(zzaej zzaej) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzaej);
        mo11919b(1, q_);
    }
}

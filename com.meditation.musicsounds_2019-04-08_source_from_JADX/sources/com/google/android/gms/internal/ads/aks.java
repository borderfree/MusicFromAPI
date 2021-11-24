package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class aks extends ahm implements akr {
    aks(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzhi mo12080a(zzhl zzhl) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzhl);
        Parcel a = mo11917a(1, q_);
        zzhi zzhi = (zzhi) aho.m16238a(a, zzhi.CREATOR);
        a.recycle();
        return zzhi;
    }
}

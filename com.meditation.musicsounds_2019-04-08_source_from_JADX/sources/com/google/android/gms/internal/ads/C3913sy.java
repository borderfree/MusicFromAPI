package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.sy */
public final class C3913sy extends ahm implements C3912sx {
    C3913sy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzatv mo13680a(zzatt zzatt) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzatt);
        Parcel a = mo11917a(1, q_);
        zzatv zzatv = (zzatv) aho.m16238a(a, zzatv.CREATOR);
        a.recycle();
        return zzatv;
    }
}

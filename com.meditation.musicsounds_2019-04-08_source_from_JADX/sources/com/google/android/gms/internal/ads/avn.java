package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class avn extends ahm implements avm {
    avn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo12528a(zzsg zzsg) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzsg);
        Parcel a = mo11917a(1, q_);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) aho.m16238a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }
}

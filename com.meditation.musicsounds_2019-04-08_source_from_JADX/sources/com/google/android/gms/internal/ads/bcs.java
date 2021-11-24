package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;

public final class bcs extends ahm implements bcq {
    bcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public final zzzt mo12794a() {
        Parcel a = mo11917a(2, mo11920q_());
        zzzt zzzt = (zzzt) aho.m16238a(a, zzzt.CREATOR);
        a.recycle();
        return zzzt;
    }

    /* renamed from: a */
    public final void mo12795a(C3323b bVar, String str, Bundle bundle, bct bct) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str);
        aho.m16240a(q_, (Parcelable) bundle);
        aho.m16239a(q_, (IInterface) bct);
        mo11919b(1, q_);
    }

    /* renamed from: a */
    public final void mo12796a(byte[] bArr, String str, Bundle bundle, C3323b bVar, bcm bcm, bay bay, zzjn zzjn) {
        Parcel q_ = mo11920q_();
        q_.writeByteArray(bArr);
        q_.writeString(str);
        aho.m16240a(q_, (Parcelable) bundle);
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bcm);
        aho.m16239a(q_, (IInterface) bay);
        aho.m16240a(q_, (Parcelable) zzjn);
        mo11919b(4, q_);
    }

    /* renamed from: a */
    public final void mo12797a(byte[] bArr, String str, Bundle bundle, C3323b bVar, bco bco, bay bay) {
        Parcel q_ = mo11920q_();
        q_.writeByteArray(bArr);
        q_.writeString(str);
        aho.m16240a(q_, (Parcelable) bundle);
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bco);
        aho.m16239a(q_, (IInterface) bay);
        mo11919b(6, q_);
    }

    /* renamed from: b */
    public final zzzt mo12798b() {
        Parcel a = mo11917a(3, mo11920q_());
        zzzt zzzt = (zzzt) aho.m16238a(a, zzzt.CREATOR);
        a.recycle();
        return zzzt;
    }

    /* renamed from: c */
    public final aos mo12799c() {
        Parcel a = mo11917a(5, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo12800d() {
        mo11919b(7, mo11920q_());
    }
}

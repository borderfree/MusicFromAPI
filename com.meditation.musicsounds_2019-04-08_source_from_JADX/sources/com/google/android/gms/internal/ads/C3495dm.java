package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.dm */
public final class C3495dm extends ahm implements C3493dk {
    C3495dm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzaej mo12859a(zzaef zzaef) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzaef);
        Parcel a = mo11917a(1, q_);
        zzaej zzaej = (zzaej) aho.m16238a(a, zzaej.CREATOR);
        a.recycle();
        return zzaej;
    }

    /* renamed from: a */
    public final void mo12860a(zzaef zzaef, C3496dn dnVar) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzaef);
        aho.m16239a(q_, (IInterface) dnVar);
        mo11919b(2, q_);
    }

    /* renamed from: a */
    public final void mo12861a(zzaey zzaey, C3499dq dqVar) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzaey);
        aho.m16239a(q_, (IInterface) dqVar);
        mo11919b(4, q_);
    }

    /* renamed from: b */
    public final void mo12862b(zzaey zzaey, C3499dq dqVar) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzaey);
        aho.m16239a(q_, (IInterface) dqVar);
        mo11919b(5, q_);
    }
}

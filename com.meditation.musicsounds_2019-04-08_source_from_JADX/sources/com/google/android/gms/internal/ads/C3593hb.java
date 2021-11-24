package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;

/* renamed from: com.google.android.gms.internal.ads.hb */
public final class C3593hb extends ahm implements C3590gz {
    C3593hb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo12951a(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        mo11919b(12, q_);
    }

    /* renamed from: a */
    public final void mo12952a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(1, q_);
    }

    /* renamed from: a */
    public final void mo12953a(C3323b bVar, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeInt(i);
        mo11919b(2, q_);
    }

    /* renamed from: a */
    public final void mo12954a(C3323b bVar, zzaig zzaig) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzaig);
        mo11919b(7, q_);
    }

    /* renamed from: b */
    public final void mo12958b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(3, q_);
    }

    /* renamed from: b */
    public final void mo12959b(C3323b bVar, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeInt(i);
        mo11919b(9, q_);
    }

    /* renamed from: c */
    public final void mo12960c(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(4, q_);
    }

    /* renamed from: d */
    public final void mo12961d(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(5, q_);
    }

    /* renamed from: e */
    public final void mo12962e(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(6, q_);
    }

    /* renamed from: f */
    public final void mo12963f(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(8, q_);
    }

    /* renamed from: g */
    public final void mo12964g(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(10, q_);
    }

    /* renamed from: h */
    public final void mo12965h(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(11, q_);
    }
}

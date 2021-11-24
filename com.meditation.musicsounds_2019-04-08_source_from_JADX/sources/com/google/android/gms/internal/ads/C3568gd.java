package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gd */
public final class C3568gd extends ahm implements C3566gb {
    C3568gd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo12546a() {
        mo11919b(1, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12547a(int i) {
        Parcel q_ = mo11920q_();
        q_.writeInt(i);
        mo11919b(7, q_);
    }

    /* renamed from: a */
    public final void mo12548a(C3554fq fqVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) fqVar);
        mo11919b(5, q_);
    }

    /* renamed from: b */
    public final void mo12549b() {
        mo11919b(2, mo11920q_());
    }

    /* renamed from: c */
    public final void mo12550c() {
        mo11919b(3, mo11920q_());
    }

    /* renamed from: d */
    public final void mo12551d() {
        mo11919b(4, mo11920q_());
    }

    /* renamed from: e */
    public final void mo12552e() {
        mo11919b(6, mo11920q_());
    }

    /* renamed from: f */
    public final void mo12553f() {
        mo11919b(8, mo11920q_());
    }
}

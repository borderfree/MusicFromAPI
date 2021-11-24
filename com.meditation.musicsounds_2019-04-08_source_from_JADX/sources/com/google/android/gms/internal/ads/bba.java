package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class bba extends ahm implements bay {
    bba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public final void mo12658a() {
        mo11919b(1, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12659a(int i) {
        Parcel q_ = mo11920q_();
        q_.writeInt(i);
        mo11919b(3, q_);
    }

    /* renamed from: a */
    public final void mo12660a(atu atu, String str) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) atu);
        q_.writeString(str);
        mo11919b(10, q_);
    }

    /* renamed from: a */
    public final void mo12663a(bbb bbb) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bbb);
        mo11919b(7, q_);
    }

    /* renamed from: a */
    public final void mo12664a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(12, q_);
    }

    /* renamed from: a */
    public final void mo12665a(String str, String str2) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        q_.writeString(str2);
        mo11919b(9, q_);
    }

    /* renamed from: b */
    public final void mo12666b() {
        mo11919b(2, mo11920q_());
    }

    /* renamed from: c */
    public final void mo12667c() {
        mo11919b(4, mo11920q_());
    }

    /* renamed from: d */
    public final void mo12668d() {
        mo11919b(5, mo11920q_());
    }

    /* renamed from: e */
    public final void mo12669e() {
        mo11919b(6, mo11920q_());
    }

    /* renamed from: f */
    public final void mo12670f() {
        mo11919b(8, mo11920q_());
    }

    /* renamed from: g */
    public final void mo12671g() {
        mo11919b(11, mo11920q_());
    }
}

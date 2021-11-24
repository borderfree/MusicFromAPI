package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;

/* renamed from: com.google.android.gms.internal.ads.fy */
public final class C3562fy extends ahm implements C3559fv {
    C3562fy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public final void mo12255a() {
        mo11919b(2, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12256a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(9, q_);
    }

    /* renamed from: a */
    public final void mo12257a(aoa aoa) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aoa);
        mo11919b(14, q_);
    }

    /* renamed from: a */
    public final void mo12258a(C3557ft ftVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) ftVar);
        mo11919b(16, q_);
    }

    /* renamed from: a */
    public final void mo12259a(C3566gb gbVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) gbVar);
        mo11919b(3, q_);
    }

    /* renamed from: a */
    public final void mo12260a(zzahk zzahk) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzahk);
        mo11919b(1, q_);
    }

    /* renamed from: a */
    public final void mo12261a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(13, q_);
    }

    /* renamed from: a */
    public final void mo12262a(boolean z) {
        Parcel q_ = mo11920q_();
        aho.m16241a(q_, z);
        mo11919b(34, q_);
    }

    /* renamed from: b */
    public final Bundle mo12263b() {
        Parcel a = mo11917a(15, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final void mo12264b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(10, q_);
    }

    /* renamed from: c */
    public final void mo12265c(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(11, q_);
    }

    /* renamed from: c */
    public final boolean mo12266c() {
        Parcel a = mo11917a(5, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo12267d() {
        mo11919b(6, mo11920q_());
    }

    /* renamed from: e */
    public final void mo12268e() {
        mo11919b(7, mo11920q_());
    }

    /* renamed from: f */
    public final void mo12269f() {
        mo11919b(8, mo11920q_());
    }

    /* renamed from: g */
    public final String mo12270g() {
        Parcel a = mo11917a(12, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}

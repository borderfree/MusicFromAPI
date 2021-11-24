package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.util.List;

public final class bax extends ahm implements bav {
    bax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: a */
    public final C3323b mo12685a() {
        Parcel a = mo11917a(2, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12686a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(21, q_);
    }

    /* renamed from: a */
    public final void mo12687a(C3323b bVar, C3590gz gzVar, List<String> list) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) gzVar);
        q_.writeStringList(list);
        mo11919b(23, q_);
    }

    /* renamed from: a */
    public final void mo12688a(C3323b bVar, zzjj zzjj, String str, bay bay) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bay);
        mo11919b(3, q_);
    }

    /* renamed from: a */
    public final void mo12689a(C3323b bVar, zzjj zzjj, String str, C3590gz gzVar, String str2) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) gzVar);
        q_.writeString(str2);
        mo11919b(10, q_);
    }

    /* renamed from: a */
    public final void mo12690a(C3323b bVar, zzjj zzjj, String str, String str2, bay bay) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        q_.writeString(str2);
        aho.m16239a(q_, (IInterface) bay);
        mo11919b(7, q_);
    }

    /* renamed from: a */
    public final void mo12691a(C3323b bVar, zzjj zzjj, String str, String str2, bay bay, zzpl zzpl, List<String> list) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        q_.writeString(str2);
        aho.m16239a(q_, (IInterface) bay);
        aho.m16240a(q_, (Parcelable) zzpl);
        q_.writeStringList(list);
        mo11919b(14, q_);
    }

    /* renamed from: a */
    public final void mo12692a(C3323b bVar, zzjn zzjn, zzjj zzjj, String str, bay bay) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjn);
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bay);
        mo11919b(1, q_);
    }

    /* renamed from: a */
    public final void mo12693a(C3323b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, bay bay) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16240a(q_, (Parcelable) zzjn);
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        q_.writeString(str2);
        aho.m16239a(q_, (IInterface) bay);
        mo11919b(6, q_);
    }

    /* renamed from: a */
    public final void mo12694a(zzjj zzjj, String str) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        mo11919b(11, q_);
    }

    /* renamed from: a */
    public final void mo12695a(zzjj zzjj, String str, String str2) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeString(str);
        q_.writeString(str2);
        mo11919b(20, q_);
    }

    /* renamed from: a */
    public final void mo12696a(boolean z) {
        Parcel q_ = mo11920q_();
        aho.m16241a(q_, z);
        mo11919b(25, q_);
    }

    /* renamed from: b */
    public final void mo12697b() {
        mo11919b(4, mo11920q_());
    }

    /* renamed from: c */
    public final void mo12698c() {
        mo11919b(5, mo11920q_());
    }

    /* renamed from: d */
    public final void mo12699d() {
        mo11919b(8, mo11920q_());
    }

    /* renamed from: e */
    public final void mo12700e() {
        mo11919b(9, mo11920q_());
    }

    /* renamed from: f */
    public final void mo12701f() {
        mo11919b(12, mo11920q_());
    }

    /* renamed from: g */
    public final boolean mo12702g() {
        Parcel a = mo11917a(13, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final bbe mo12703h() {
        bbe bbe;
        Parcel a = mo11917a(15, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bbe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            bbe = queryLocalInterface instanceof bbe ? (bbe) queryLocalInterface : new bbh(readStrongBinder);
        }
        a.recycle();
        return bbe;
    }

    /* renamed from: i */
    public final bbi mo12704i() {
        bbi bbi;
        Parcel a = mo11917a(16, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bbi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            bbi = queryLocalInterface instanceof bbi ? (bbi) queryLocalInterface : new bbk(readStrongBinder);
        }
        a.recycle();
        return bbi;
    }

    /* renamed from: j */
    public final Bundle mo12705j() {
        Parcel a = mo11917a(17, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final Bundle mo12706k() {
        Parcel a = mo11917a(18, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo12707l() {
        Parcel a = mo11917a(19, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: m */
    public final boolean mo12708m() {
        Parcel a = mo11917a(22, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final atu mo12709n() {
        Parcel a = mo11917a(24, mo11920q_());
        atu a2 = atv.m17348a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final aos mo12710o() {
        Parcel a = mo11917a(26, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final bbl mo12711p() {
        bbl bbl;
        Parcel a = mo11917a(27, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bbl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            bbl = queryLocalInterface instanceof bbl ? (bbl) queryLocalInterface : new bbn(readStrongBinder);
        }
        a.recycle();
        return bbl;
    }
}

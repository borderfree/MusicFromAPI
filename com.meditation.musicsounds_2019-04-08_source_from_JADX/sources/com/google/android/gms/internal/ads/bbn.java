package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.util.ArrayList;
import java.util.List;

public final class bbn extends ahm implements bbl {
    bbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: a */
    public final String mo12754a() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12755a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(20, q_);
    }

    /* renamed from: a */
    public final void mo12756a(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        aho.m16239a(q_, (IInterface) bVar3);
        mo11919b(21, q_);
    }

    /* renamed from: b */
    public final List mo12757b() {
        Parcel a = mo11917a(3, mo11920q_());
        ArrayList b = aho.m16243b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final void mo12758b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(22, q_);
    }

    /* renamed from: c */
    public final String mo12759c() {
        Parcel a = mo11917a(4, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final asy mo12760d() {
        Parcel a = mo11917a(5, mo11920q_());
        asy a2 = asz.m17237a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo12761e() {
        Parcel a = mo11917a(6, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo12762f() {
        Parcel a = mo11917a(7, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final double mo12763g() {
        Parcel a = mo11917a(8, mo11920q_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: h */
    public final String mo12764h() {
        Parcel a = mo11917a(9, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final String mo12765i() {
        Parcel a = mo11917a(10, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final aos mo12766j() {
        Parcel a = mo11917a(11, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final asu mo12767k() {
        Parcel a = mo11917a(12, mo11920q_());
        asu a2 = asv.m17231a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final C3323b mo12768l() {
        Parcel a = mo11917a(13, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final C3323b mo12769m() {
        Parcel a = mo11917a(14, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C3323b mo12770n() {
        Parcel a = mo11917a(15, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final Bundle mo12771o() {
        Parcel a = mo11917a(16, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: p */
    public final boolean mo12772p() {
        Parcel a = mo11917a(17, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final boolean mo12773q() {
        Parcel a = mo11917a(18, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final void mo12774r() {
        mo11919b(19, mo11920q_());
    }
}

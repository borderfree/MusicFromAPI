package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.util.ArrayList;
import java.util.List;

public final class bbh extends ahm implements bbe {
    bbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: a */
    public final String mo12713a() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12714a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(11, q_);
    }

    /* renamed from: a */
    public final void mo12715a(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        aho.m16239a(q_, (IInterface) bVar3);
        mo11919b(22, q_);
    }

    /* renamed from: b */
    public final List mo12716b() {
        Parcel a = mo11917a(3, mo11920q_());
        ArrayList b = aho.m16243b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final void mo12717b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(12, q_);
    }

    /* renamed from: c */
    public final String mo12718c() {
        Parcel a = mo11917a(4, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo12719c(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(16, q_);
    }

    /* renamed from: d */
    public final asy mo12720d() {
        Parcel a = mo11917a(5, mo11920q_());
        asy a2 = asz.m17237a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo12721e() {
        Parcel a = mo11917a(6, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final double mo12722f() {
        Parcel a = mo11917a(7, mo11920q_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: g */
    public final String mo12723g() {
        Parcel a = mo11917a(8, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final String mo12724h() {
        Parcel a = mo11917a(9, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final void mo12725i() {
        mo11919b(10, mo11920q_());
    }

    /* renamed from: j */
    public final boolean mo12726j() {
        Parcel a = mo11917a(13, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final boolean mo12727k() {
        Parcel a = mo11917a(14, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final Bundle mo12728l() {
        Parcel a = mo11917a(15, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: m */
    public final aos mo12729m() {
        Parcel a = mo11917a(17, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C3323b mo12730n() {
        Parcel a = mo11917a(18, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final asu mo12731o() {
        Parcel a = mo11917a(19, mo11920q_());
        asu a2 = asv.m17231a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C3323b mo12732p() {
        Parcel a = mo11917a(20, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final C3323b mo12733q() {
        Parcel a = mo11917a(21, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}

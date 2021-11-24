package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.util.ArrayList;
import java.util.List;

public final class bbk extends ahm implements bbi {
    bbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: a */
    public final String mo12735a() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12736a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(9, q_);
    }

    /* renamed from: a */
    public final void mo12737a(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        aho.m16239a(q_, (IInterface) bVar3);
        mo11919b(22, q_);
    }

    /* renamed from: b */
    public final List mo12738b() {
        Parcel a = mo11917a(3, mo11920q_());
        ArrayList b = aho.m16243b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final void mo12739b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(10, q_);
    }

    /* renamed from: c */
    public final String mo12740c() {
        Parcel a = mo11917a(4, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo12741c(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(14, q_);
    }

    /* renamed from: d */
    public final asy mo12742d() {
        Parcel a = mo11917a(5, mo11920q_());
        asy a2 = asz.m17237a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo12743e() {
        Parcel a = mo11917a(6, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo12744f() {
        Parcel a = mo11917a(7, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo12745g() {
        mo11919b(8, mo11920q_());
    }

    /* renamed from: h */
    public final boolean mo12746h() {
        Parcel a = mo11917a(11, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo12747i() {
        Parcel a = mo11917a(12, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final Bundle mo12748j() {
        Parcel a = mo11917a(13, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final C3323b mo12749k() {
        Parcel a = mo11917a(15, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final aos mo12750l() {
        Parcel a = mo11917a(16, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final asu mo12751m() {
        Parcel a = mo11917a(19, mo11920q_());
        asu a2 = asv.m17231a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C3323b mo12752n() {
        Parcel a = mo11917a(20, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C3323b mo12753o() {
        Parcel a = mo11917a(21, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}

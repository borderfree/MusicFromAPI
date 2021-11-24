package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.util.ArrayList;
import java.util.List;

public final class ats extends ahm implements atq {
    ats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* renamed from: a */
    public final String mo12381a() {
        Parcel a = mo11917a(3, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12382a(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        mo11919b(12, q_);
    }

    /* renamed from: b */
    public final List mo12360b() {
        Parcel a = mo11917a(4, mo11920q_());
        ArrayList b = aho.m16243b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final boolean mo12383b(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        Parcel a = mo11917a(13, q_);
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final C3323b mo12384c() {
        Parcel a = mo11917a(16, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo12385c(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        mo11919b(14, q_);
    }

    /* renamed from: d */
    public final String mo12386d() {
        Parcel a = mo11917a(17, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final String mo12387e() {
        Parcel a = mo11917a(5, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final asy mo12388f() {
        asy asy;
        Parcel a = mo11917a(6, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            asy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            asy = queryLocalInterface instanceof asy ? (asy) queryLocalInterface : new ata(readStrongBinder);
        }
        a.recycle();
        return asy;
    }

    /* renamed from: g */
    public final String mo12389g() {
        Parcel a = mo11917a(7, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final String mo12390h() {
        Parcel a = mo11917a(8, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final aos mo12391i() {
        Parcel a = mo11917a(11, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final C3323b mo12392j() {
        Parcel a = mo11917a(2, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final Bundle mo12393n() {
        Parcel a = mo11917a(9, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: p */
    public final asu mo12394p() {
        asu asu;
        Parcel a = mo11917a(15, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            asu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            asu = queryLocalInterface instanceof asu ? (asu) queryLocalInterface : new asw(readStrongBinder);
        }
        a.recycle();
        return asu;
    }

    /* renamed from: q */
    public final void mo12395q() {
        mo11919b(10, mo11920q_());
    }
}

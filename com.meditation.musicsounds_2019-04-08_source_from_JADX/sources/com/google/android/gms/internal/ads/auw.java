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

public final class auw extends ahm implements auu {
    auw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: a */
    public final String mo12410a() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12411a(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        mo11919b(15, q_);
    }

    /* renamed from: a */
    public final void mo12412a(aur aur) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aur);
        mo11919b(21, q_);
    }

    /* renamed from: b */
    public final List mo12360b() {
        Parcel a = mo11917a(3, mo11920q_());
        ArrayList b = aho.m16243b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final boolean mo12413b(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        Parcel a = mo11917a(16, q_);
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final String mo12414c() {
        Parcel a = mo11917a(4, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo12415c(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        mo11919b(17, q_);
    }

    /* renamed from: d */
    public final asy mo12416d() {
        asy asy;
        Parcel a = mo11917a(5, mo11920q_());
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

    /* renamed from: e */
    public final String mo12417e() {
        Parcel a = mo11917a(6, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo12418f() {
        Parcel a = mo11917a(7, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final double mo12419g() {
        Parcel a = mo11917a(8, mo11920q_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: h */
    public final String mo12420h() {
        Parcel a = mo11917a(9, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final String mo12421i() {
        Parcel a = mo11917a(10, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final aos mo12422j() {
        Parcel a = mo11917a(11, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C3323b mo12423n() {
        Parcel a = mo11917a(18, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C3323b mo12424p() {
        Parcel a = mo11917a(19, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final String mo12425q() {
        Parcel a = mo11917a(12, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: r */
    public final Bundle mo12426r() {
        Parcel a = mo11917a(20, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: s */
    public final asu mo12427s() {
        asu asu;
        Parcel a = mo11917a(14, mo11920q_());
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

    /* renamed from: t */
    public final void mo12428t() {
        mo11919b(13, mo11920q_());
    }

    /* renamed from: u */
    public final void mo12429u() {
        mo11919b(22, mo11920q_());
    }
}

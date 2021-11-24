package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aou extends ahm implements aos {
    aou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo12132a() {
        mo11919b(1, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12133a(aov aov) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aov);
        mo11919b(8, q_);
    }

    /* renamed from: a */
    public final void mo12134a(boolean z) {
        Parcel q_ = mo11920q_();
        aho.m16241a(q_, z);
        mo11919b(3, q_);
    }

    /* renamed from: b */
    public final void mo12135b() {
        mo11919b(2, mo11920q_());
    }

    /* renamed from: c */
    public final boolean mo12136c() {
        Parcel a = mo11917a(4, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final int mo12137d() {
        Parcel a = mo11917a(5, mo11920q_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final float mo12138e() {
        Parcel a = mo11917a(9, mo11920q_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo12139f() {
        Parcel a = mo11917a(6, mo11920q_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: g */
    public final float mo12140g() {
        Parcel a = mo11917a(7, mo11920q_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final aov mo12141h() {
        aov aov;
        Parcel a = mo11917a(11, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aov = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            aov = queryLocalInterface instanceof aov ? (aov) queryLocalInterface : new aox(readStrongBinder);
        }
        a.recycle();
        return aov;
    }

    /* renamed from: i */
    public final boolean mo12142i() {
        Parcel a = mo11917a(10, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final boolean mo12143j() {
        Parcel a = mo11917a(12, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }
}

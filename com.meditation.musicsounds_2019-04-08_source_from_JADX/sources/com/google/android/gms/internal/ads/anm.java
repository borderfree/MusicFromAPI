package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class anm extends ahm implements ank {
    anm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: a */
    public final void mo12090a() {
        mo11919b(1, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12091a(int i) {
        Parcel q_ = mo11920q_();
        q_.writeInt(i);
        mo11919b(2, q_);
    }

    /* renamed from: b */
    public final void mo12092b() {
        mo11919b(3, mo11920q_());
    }

    /* renamed from: c */
    public final void mo12093c() {
        mo11919b(4, mo11920q_());
    }

    /* renamed from: d */
    public final void mo12094d() {
        mo11919b(5, mo11920q_());
    }

    /* renamed from: e */
    public final void mo12095e() {
        mo11919b(6, mo11920q_());
    }

    /* renamed from: f */
    public final void mo12096f() {
        mo11919b(7, mo11920q_());
    }
}

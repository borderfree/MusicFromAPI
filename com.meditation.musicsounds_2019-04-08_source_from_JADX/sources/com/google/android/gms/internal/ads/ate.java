package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;

public final class ate extends ahm implements atc {
    ate(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final C3323b mo12246a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        Parcel a = mo11917a(2, q_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo12247a() {
        mo11919b(4, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12248a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(3, q_);
    }

    /* renamed from: a */
    public final void mo12249a(C3323b bVar, int i) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeInt(i);
        mo11919b(5, q_);
    }

    /* renamed from: a */
    public final void mo12250a(String str, C3323b bVar) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(1, q_);
    }

    /* renamed from: b */
    public final void mo12251b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(6, q_);
    }
}

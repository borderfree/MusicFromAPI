package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;

public final class are extends ahm implements arc {
    are(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: a */
    public final String mo12328a() {
        Parcel a = mo11917a(1, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12329a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(3, q_);
    }

    /* renamed from: b */
    public final String mo12330b() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo12331c() {
        mo11919b(4, mo11920q_());
    }

    /* renamed from: d */
    public final void mo12332d() {
        mo11919b(5, mo11920q_());
    }
}

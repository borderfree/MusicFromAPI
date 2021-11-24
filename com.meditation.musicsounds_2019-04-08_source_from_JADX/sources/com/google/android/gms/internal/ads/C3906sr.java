package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;

/* renamed from: com.google.android.gms.internal.ads.sr */
public final class C3906sr extends ahm implements C3904sp {
    C3906sr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final C3323b mo13669a(String str, C3323b bVar, String str2, String str3, String str4) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str2);
        q_.writeString(str3);
        q_.writeString(str4);
        Parcel a = mo11917a(3, q_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final String mo13670a() {
        Parcel a = mo11917a(6, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo13671a(C3323b bVar, C3323b bVar2) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        aho.m16239a(q_, (IInterface) bVar2);
        mo11919b(5, q_);
    }

    /* renamed from: a */
    public final boolean mo13672a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        Parcel a = mo11917a(2, q_);
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo13673b(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(4, q_);
    }

    /* renamed from: c */
    public final void mo13674c(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(7, q_);
    }
}

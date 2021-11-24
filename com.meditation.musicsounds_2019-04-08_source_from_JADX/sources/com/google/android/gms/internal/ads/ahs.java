package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;

public final class ahs extends ahm implements ahq {
    ahs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo11924a() {
        mo11919b(3, mo11920q_());
    }

    /* renamed from: a */
    public final void mo11925a(int i) {
        Parcel q_ = mo11920q_();
        q_.writeInt(i);
        mo11919b(6, q_);
    }

    /* renamed from: a */
    public final void mo11926a(C3323b bVar, String str) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str);
        mo11919b(2, q_);
    }

    /* renamed from: a */
    public final void mo11927a(C3323b bVar, String str, String str2) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str);
        q_.writeString(null);
        mo11919b(8, q_);
    }

    /* renamed from: a */
    public final void mo11928a(byte[] bArr) {
        Parcel q_ = mo11920q_();
        q_.writeByteArray(bArr);
        mo11919b(5, q_);
    }

    /* renamed from: a */
    public final void mo11929a(int[] iArr) {
        Parcel q_ = mo11920q_();
        q_.writeIntArray(null);
        mo11919b(4, q_);
    }

    /* renamed from: b */
    public final void mo11930b(int i) {
        Parcel q_ = mo11920q_();
        q_.writeInt(i);
        mo11919b(7, q_);
    }
}

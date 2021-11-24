package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;

public final class aop extends ahm implements aon {
    aop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void setAppMuted(boolean z) {
        Parcel q_ = mo11920q_();
        aho.m16241a(q_, z);
        mo11919b(4, q_);
    }

    public final void setAppVolume(float f) {
        Parcel q_ = mo11920q_();
        q_.writeFloat(f);
        mo11919b(2, q_);
    }

    public final void zza() {
        mo11919b(1, mo11920q_());
    }

    public final void zza(String str, C3323b bVar) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(6, q_);
    }

    public final void zzb(C3323b bVar, String str) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        q_.writeString(str);
        mo11919b(5, q_);
    }

    public final float zzdo() {
        Parcel a = mo11917a(7, mo11920q_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean zzdp() {
        Parcel a = mo11917a(8, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    public final void zzt(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(3, q_);
    }
}

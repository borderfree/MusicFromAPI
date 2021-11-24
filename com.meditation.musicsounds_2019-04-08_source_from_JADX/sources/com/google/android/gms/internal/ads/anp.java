package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class anp extends ahm implements ann {
    anp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String getMediationAdapterClassName() {
        Parcel a = mo11917a(2, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoading() {
        Parcel a = mo11917a(3, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    public final void zza(zzjj zzjj, int i) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzjj);
        q_.writeInt(i);
        mo11919b(5, q_);
    }

    public final String zzck() {
        Parcel a = mo11917a(4, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zzd(zzjj zzjj) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzjj);
        mo11919b(1, q_);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class ans extends ahm implements anq {
    ans(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) publisherAdViewOptions);
        mo11919b(9, q_);
    }

    public final void zza(aty aty) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aty);
        mo11919b(3, q_);
    }

    public final void zza(aub aub) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aub);
        mo11919b(4, q_);
    }

    public final void zza(aul aul, zzjn zzjn) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aul);
        aho.m16240a(q_, (Parcelable) zzjn);
        mo11919b(8, q_);
    }

    public final void zza(auo auo) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) auo);
        mo11919b(10, q_);
    }

    public final void zza(zzpl zzpl) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzpl);
        mo11919b(6, q_);
    }

    public final void zza(String str, aui aui, auf auf) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        aho.m16239a(q_, (IInterface) aui);
        aho.m16239a(q_, (IInterface) auf);
        mo11919b(5, q_);
    }

    public final void zzb(ank ank) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) ank);
        mo11919b(2, q_);
    }

    public final void zzb(aok aok) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aok);
        mo11919b(7, q_);
    }

    public final ann zzdh() {
        ann ann;
        Parcel a = mo11917a(1, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ann = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            ann = queryLocalInterface instanceof ann ? (ann) queryLocalInterface : new anp(readStrongBinder);
        }
        a.recycle();
        return ann;
    }
}

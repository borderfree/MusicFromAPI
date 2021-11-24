package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;

public final class anx extends ahm implements anv {
    anx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void destroy() {
        mo11919b(2, mo11920q_());
    }

    public final String getAdUnitId() {
        Parcel a = mo11917a(31, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getMediationAdapterClassName() {
        Parcel a = mo11917a(18, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final aos getVideoController() {
        aos aos;
        Parcel a = mo11917a(26, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aos = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            aos = queryLocalInterface instanceof aos ? (aos) queryLocalInterface : new aou(readStrongBinder);
        }
        a.recycle();
        return aos;
    }

    public final boolean isLoading() {
        Parcel a = mo11917a(23, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    public final boolean isReady() {
        Parcel a = mo11917a(3, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    public final void pause() {
        mo11919b(5, mo11920q_());
    }

    public final void resume() {
        mo11919b(6, mo11920q_());
    }

    public final void setImmersiveMode(boolean z) {
        Parcel q_ = mo11920q_();
        aho.m16241a(q_, z);
        mo11919b(34, q_);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Parcel q_ = mo11920q_();
        aho.m16241a(q_, z);
        mo11919b(22, q_);
    }

    public final void setUserId(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(25, q_);
    }

    public final void showInterstitial() {
        mo11919b(9, mo11920q_());
    }

    public final void stopLoading() {
        mo11919b(10, mo11920q_());
    }

    public final void zza(C3402ae aeVar, String str) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aeVar);
        q_.writeString(str);
        mo11919b(15, q_);
    }

    public final void zza(anh anh) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) anh);
        mo11919b(20, q_);
    }

    public final void zza(ank ank) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) ank);
        mo11919b(7, q_);
    }

    public final void zza(aoa aoa) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aoa);
        mo11919b(36, q_);
    }

    public final void zza(aoe aoe) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aoe);
        mo11919b(8, q_);
    }

    public final void zza(aok aok) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) aok);
        mo11919b(21, q_);
    }

    public final void zza(arf arf) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) arf);
        mo11919b(19, q_);
    }

    public final void zza(C3566gb gbVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) gbVar);
        mo11919b(24, q_);
    }

    public final void zza(C4054x xVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) xVar);
        mo11919b(14, q_);
    }

    public final void zza(zzjn zzjn) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzjn);
        mo11919b(13, q_);
    }

    public final void zza(zzlu zzlu) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzlu);
        mo11919b(30, q_);
    }

    public final void zza(zzmu zzmu) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzmu);
        mo11919b(29, q_);
    }

    public final boolean zzb(zzjj zzjj) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) zzjj);
        Parcel a = mo11917a(4, q_);
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    public final Bundle zzba() {
        Parcel a = mo11917a(37, mo11920q_());
        Bundle bundle = (Bundle) aho.m16238a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final C3323b zzbj() {
        Parcel a = mo11917a(1, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzjn zzbk() {
        Parcel a = mo11917a(12, mo11920q_());
        zzjn zzjn = (zzjn) aho.m16238a(a, zzjn.CREATOR);
        a.recycle();
        return zzjn;
    }

    public final void zzbm() {
        mo11919b(11, mo11920q_());
    }

    public final aoe zzbw() {
        aoe aoe;
        Parcel a = mo11917a(32, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aoe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            aoe = queryLocalInterface instanceof aoe ? (aoe) queryLocalInterface : new aog(readStrongBinder);
        }
        a.recycle();
        return aoe;
    }

    public final ank zzbx() {
        ank ank;
        Parcel a = mo11917a(33, mo11920q_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ank = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            ank = queryLocalInterface instanceof ank ? (ank) queryLocalInterface : new anm(readStrongBinder);
        }
        a.recycle();
        return ank;
    }

    public final String zzck() {
        Parcel a = mo11917a(35, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.amh;
import com.google.android.gms.internal.ads.zzang;

@C3464ci
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final zzang zzacr;
    public final zzc zzbyl;
    public final amh zzbym;
    public final zzn zzbyn;
    public final C3832py zzbyo;
    public final zzd zzbyp;
    public final String zzbyq;
    public final boolean zzbyr;
    public final String zzbys;
    public final zzt zzbyt;
    public final int zzbyu;
    public final String zzbyv;
    public final zzaq zzbyw;
    public final zzb zzbyx;

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzang zzang, String str4, zzaq zzaq, IBinder iBinder6) {
        this.zzbyl = zzc;
        this.zzbym = (amh) C3327d.m15137a(C3324a.m15129a(iBinder));
        this.zzbyn = (zzn) C3327d.m15137a(C3324a.m15129a(iBinder2));
        this.zzbyo = (C3832py) C3327d.m15137a(C3324a.m15129a(iBinder3));
        this.zzbyx = (zzb) C3327d.m15137a(C3324a.m15129a(iBinder6));
        this.zzbyp = (zzd) C3327d.m15137a(C3324a.m15129a(iBinder4));
        this.zzbyq = str;
        this.zzbyr = z;
        this.zzbys = str2;
        this.zzbyt = (zzt) C3327d.m15137a(C3324a.m15129a(iBinder5));
        this.orientation = i;
        this.zzbyu = i2;
        this.url = str3;
        this.zzacr = zzang;
        this.zzbyv = str4;
        this.zzbyw = zzaq;
    }

    public AdOverlayInfoParcel(zzc zzc, amh amh, zzn zzn, zzt zzt, zzang zzang) {
        this.zzbyl = zzc;
        this.zzbym = amh;
        this.zzbyn = zzn;
        this.zzbyo = null;
        this.zzbyx = null;
        this.zzbyp = null;
        this.zzbyq = null;
        this.zzbyr = false;
        this.zzbys = null;
        this.zzbyt = zzt;
        this.orientation = -1;
        this.zzbyu = 4;
        this.url = null;
        this.zzacr = zzang;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public AdOverlayInfoParcel(amh amh, zzn zzn, zzb zzb, zzd zzd, zzt zzt, C3832py pyVar, boolean z, int i, String str, zzang zzang) {
        this.zzbyl = null;
        this.zzbym = amh;
        this.zzbyn = zzn;
        this.zzbyo = pyVar;
        this.zzbyx = zzb;
        this.zzbyp = zzd;
        this.zzbyq = null;
        this.zzbyr = z;
        this.zzbys = null;
        this.zzbyt = zzt;
        this.orientation = i;
        this.zzbyu = 3;
        this.url = str;
        this.zzacr = zzang;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public AdOverlayInfoParcel(amh amh, zzn zzn, zzb zzb, zzd zzd, zzt zzt, C3832py pyVar, boolean z, int i, String str, String str2, zzang zzang) {
        this.zzbyl = null;
        this.zzbym = amh;
        this.zzbyn = zzn;
        this.zzbyo = pyVar;
        this.zzbyx = zzb;
        this.zzbyp = zzd;
        this.zzbyq = str2;
        this.zzbyr = z;
        this.zzbys = str;
        this.zzbyt = zzt;
        this.orientation = i;
        this.zzbyu = 3;
        this.url = null;
        this.zzacr = zzang;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public AdOverlayInfoParcel(amh amh, zzn zzn, zzt zzt, C3832py pyVar, int i, zzang zzang, String str, zzaq zzaq) {
        this.zzbyl = null;
        this.zzbym = amh;
        this.zzbyn = zzn;
        this.zzbyo = pyVar;
        this.zzbyx = null;
        this.zzbyp = null;
        this.zzbyq = null;
        this.zzbyr = false;
        this.zzbys = null;
        this.zzbyt = zzt;
        this.orientation = i;
        this.zzbyu = 1;
        this.url = null;
        this.zzacr = zzang;
        this.zzbyv = str;
        this.zzbyw = zzaq;
    }

    public AdOverlayInfoParcel(amh amh, zzn zzn, zzt zzt, C3832py pyVar, boolean z, int i, zzang zzang) {
        this.zzbyl = null;
        this.zzbym = amh;
        this.zzbyn = zzn;
        this.zzbyo = pyVar;
        this.zzbyx = null;
        this.zzbyp = null;
        this.zzbyq = null;
        this.zzbyr = z;
        this.zzbys = null;
        this.zzbyt = zzt;
        this.orientation = i;
        this.zzbyu = 2;
        this.url = null;
        this.zzacr = zzang;
        this.zzbyv = null;
        this.zzbyw = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) this.zzbyl, i, false);
        C3267a.m14963a(parcel, 3, C3327d.m15136a(this.zzbym).asBinder(), false);
        C3267a.m14963a(parcel, 4, C3327d.m15136a(this.zzbyn).asBinder(), false);
        C3267a.m14963a(parcel, 5, C3327d.m15136a(this.zzbyo).asBinder(), false);
        C3267a.m14963a(parcel, 6, C3327d.m15136a(this.zzbyp).asBinder(), false);
        C3267a.m14968a(parcel, 7, this.zzbyq, false);
        C3267a.m14971a(parcel, 8, this.zzbyr);
        C3267a.m14968a(parcel, 9, this.zzbys, false);
        C3267a.m14963a(parcel, 10, C3327d.m15136a(this.zzbyt).asBinder(), false);
        C3267a.m14960a(parcel, 11, this.orientation);
        C3267a.m14960a(parcel, 12, this.zzbyu);
        C3267a.m14968a(parcel, 13, this.url, false);
        C3267a.m14964a(parcel, 14, (Parcelable) this.zzacr, i, false);
        C3267a.m14968a(parcel, 16, this.zzbyv, false);
        C3267a.m14964a(parcel, 17, (Parcelable) this.zzbyw, i, false);
        C3267a.m14963a(parcel, 18, C3327d.m15136a(this.zzbyx).asBinder(), false);
        C3267a.m14956a(parcel, a);
    }
}

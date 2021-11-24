package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzbv;

final class bdc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f13588a;

    /* renamed from: b */
    private final /* synthetic */ zzzv f13589b;

    bdc(zzzv zzzv, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f13589b = zzzv;
        this.f13588a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzei();
        zzl.zza(this.f13589b.f15538a, this.f13588a, true);
    }
}

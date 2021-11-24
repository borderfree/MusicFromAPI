package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;

/* renamed from: com.google.android.gms.ads.internal.i */
final class C2902i implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f10031a;

    /* renamed from: b */
    private final /* synthetic */ C2901h f10032b;

    C2902i(C2901h hVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f10032b = hVar;
        this.f10031a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzei();
        zzl.zza(this.f10032b.f10029a.f10120e.zzrt, this.f10031a, true);
    }
}

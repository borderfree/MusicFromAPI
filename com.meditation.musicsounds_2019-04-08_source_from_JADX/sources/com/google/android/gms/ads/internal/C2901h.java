package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3638it;
import com.google.android.gms.internal.ads.C3653jh;

@C3464ci
/* renamed from: com.google.android.gms.ads.internal.h */
final class C2901h extends C3638it {

    /* renamed from: a */
    final /* synthetic */ zzal f10029a;

    /* renamed from: b */
    private final int f10030b;

    public C2901h(zzal zzal, int i) {
        this.f10029a = zzal;
        this.f10030b = i;
    }

    /* renamed from: a */
    public final void mo10051a() {
        zzaq zzaq = new zzaq(this.f10029a.f10120e.f10277x, this.f10029a.mo10195i(), this.f10029a.f10174m, this.f10029a.f10175n, this.f10029a.f10120e.f10277x ? this.f10030b : -1, this.f10029a.f10176o, this.f10029a.f10120e.zzacw.f14126L, this.f10029a.f10120e.zzacw.f14129O);
        int requestedOrientation = this.f10029a.f10120e.zzacw.f14135b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f10029a.f10120e.zzacw.f14141h;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.f10029a, this.f10029a, this.f10029a, this.f10029a.f10120e.zzacw.f14135b, requestedOrientation, this.f10029a.f10120e.zzacr, this.f10029a.f10120e.zzacw.f14115A, zzaq);
        C3653jh.f14275a.post(new C2902i(this, adOverlayInfoParcel));
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
    }
}

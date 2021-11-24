package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.ik */
final class C3629ik extends C3638it {

    /* renamed from: a */
    private final /* synthetic */ C3627ii f14208a;

    C3629ik(C3627ii iiVar) {
        this.f14208a = iiVar;
    }

    /* renamed from: a */
    public final void mo10051a() {
        aqo aqo = new aqo(this.f14208a.f14196f, this.f14208a.f14197g.f15360a);
        synchronized (this.f14208a.f14191a) {
            try {
                zzbv.zzet();
                aqr.m16934a(this.f14208a.f14198h, aqo);
            } catch (IllegalArgumentException e) {
                C3643iy.m19175c("Cannot config CSI reporter.", e);
            }
        }
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
    }
}

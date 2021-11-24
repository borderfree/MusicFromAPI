package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dz */
final class C3509dz implements C3768no<azg> {

    /* renamed from: a */
    private final /* synthetic */ C3508dy f13802a;

    C3509dz(C3508dy dyVar) {
        this.f13802a = dyVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11976a(Object obj) {
        try {
            ((azg) obj).mo12596b("AFMA_getAdapterLessMediationAd", this.f13802a.f13799a);
        } catch (Exception e) {
            C3643iy.m19173b("Error requesting an ad url", e);
            C3506dw.f13789f.zzat(this.f13802a.f13800b);
        }
    }
}

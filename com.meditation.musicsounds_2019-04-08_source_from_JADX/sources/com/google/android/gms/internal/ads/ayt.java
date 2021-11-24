package com.google.android.gms.internal.ads;

final class ayt implements C3766nm {

    /* renamed from: a */
    private final /* synthetic */ aza f13354a;

    /* renamed from: b */
    private final /* synthetic */ ayj f13355b;

    ayt(ayj ayj, aza aza) {
        this.f13355b = ayj;
        this.f13354a = aza;
    }

    /* renamed from: a */
    public final void mo11977a() {
        synchronized (this.f13355b.f13323a) {
            this.f13355b.f13330h = 1;
            C3643iy.m18780a("Failed loading new engine. Marking new engine destroyable.");
            this.f13354a.mo12642e();
        }
    }
}

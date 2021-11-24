package com.google.android.gms.internal.ads;

final class ays implements C3768no<axx> {

    /* renamed from: a */
    private final /* synthetic */ aza f13352a;

    /* renamed from: b */
    private final /* synthetic */ ayj f13353b;

    ays(ayj ayj, aza aza) {
        this.f13353b = ayj;
        this.f13352a = aza;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11976a(Object obj) {
        synchronized (this.f13353b.f13323a) {
            this.f13353b.f13330h = 0;
            if (!(this.f13353b.f13329g == null || this.f13352a == this.f13353b.f13329g)) {
                C3643iy.m18780a("New JS engine is loaded, marking previous one as destroyable.");
                this.f13353b.f13329g.mo12642e();
            }
            this.f13353b.f13329g = this.f13352a;
        }
    }
}

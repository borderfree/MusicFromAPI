package com.google.android.gms.internal.ads;

public final class aly extends adn<aly> {

    /* renamed from: a */
    private Integer f12394a;

    /* renamed from: b */
    private alz f12395b;

    /* renamed from: c */
    private alv f12396c;

    public aly() {
        this.f12394a = null;
        this.f12395b = null;
        this.f12396c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aly mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f12395b == null) {
                        this.f12395b = new alz();
                    }
                    ads = this.f12395b;
                } else if (a == 26) {
                    if (this.f12396c == null) {
                        this.f12396c = new alv();
                    }
                    ads = this.f12396c;
                } else if (!super.mo11811a(adk, a)) {
                    return this;
                }
                adk.mo11784a(ads);
            } else {
                int j = adk.mo11799j();
                try {
                    this.f12394a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12394a != null) {
            a += adm.m15974b(1, this.f12394a.intValue());
        }
        if (this.f12395b != null) {
            a += adm.m15975b(2, (C3401ads) this.f12395b);
        }
        return this.f12396c != null ? a + adm.m15975b(3, (C3401ads) this.f12396c) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12394a != null) {
            adm.mo11801a(1, this.f12394a.intValue());
        }
        if (this.f12395b != null) {
            adm.mo11803a(2, (C3401ads) this.f12395b);
        }
        if (this.f12396c != null) {
            adm.mo11803a(3, (C3401ads) this.f12396c);
        }
        super.mo11512a(adm);
    }
}

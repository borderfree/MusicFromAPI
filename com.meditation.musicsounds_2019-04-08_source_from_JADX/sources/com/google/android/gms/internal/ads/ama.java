package com.google.android.gms.internal.ads;

public final class ama extends adn<ama> {

    /* renamed from: a */
    private alw f12398a;

    /* renamed from: b */
    private Integer f12399b;

    /* renamed from: c */
    private alz f12400c;

    /* renamed from: d */
    private alv f12401d;

    public ama() {
        this.f12398a = null;
        this.f12399b = null;
        this.f12400c = null;
        this.f12401d = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ama mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f12398a == null) {
                    this.f12398a = new alw();
                }
                ads = this.f12398a;
            } else if (a == 16) {
                int j = adk.mo11799j();
                try {
                    this.f12399b = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 26) {
                if (this.f12400c == null) {
                    this.f12400c = new alz();
                }
                ads = this.f12400c;
            } else if (a == 34) {
                if (this.f12401d == null) {
                    this.f12401d = new alv();
                }
                ads = this.f12401d;
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
            adk.mo11784a(ads);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12398a != null) {
            a += adm.m15975b(1, (C3401ads) this.f12398a);
        }
        if (this.f12399b != null) {
            a += adm.m15974b(2, this.f12399b.intValue());
        }
        if (this.f12400c != null) {
            a += adm.m15975b(3, (C3401ads) this.f12400c);
        }
        return this.f12401d != null ? a + adm.m15975b(4, (C3401ads) this.f12401d) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12398a != null) {
            adm.mo11803a(1, (C3401ads) this.f12398a);
        }
        if (this.f12399b != null) {
            adm.mo11801a(2, this.f12399b.intValue());
        }
        if (this.f12400c != null) {
            adm.mo11803a(3, (C3401ads) this.f12400c);
        }
        if (this.f12401d != null) {
            adm.mo11803a(4, (C3401ads) this.f12401d);
        }
        super.mo11512a(adm);
    }
}

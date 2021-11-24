package com.google.android.gms.internal.ads;

public final class amb extends adn<amb> {

    /* renamed from: a */
    private Integer f12402a;

    /* renamed from: b */
    private alz f12403b;

    /* renamed from: c */
    private Integer f12404c;

    /* renamed from: d */
    private Integer f12405d;

    /* renamed from: e */
    private Integer f12406e;

    public amb() {
        this.f12402a = null;
        this.f12403b = null;
        this.f12404c = null;
        this.f12405d = null;
        this.f12406e = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amb mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = adk.mo11799j();
                try {
                    this.f12402a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 18) {
                if (this.f12403b == null) {
                    this.f12403b = new alz();
                }
                adk.mo11784a((C3401ads) this.f12403b);
            } else if (a == 24) {
                this.f12404c = Integer.valueOf(adk.mo11796g());
            } else if (a == 32) {
                this.f12405d = Integer.valueOf(adk.mo11796g());
            } else if (a == 40) {
                this.f12406e = Integer.valueOf(adk.mo11796g());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12402a != null) {
            a += adm.m15974b(1, this.f12402a.intValue());
        }
        if (this.f12403b != null) {
            a += adm.m15975b(2, (C3401ads) this.f12403b);
        }
        if (this.f12404c != null) {
            a += adm.m15974b(3, this.f12404c.intValue());
        }
        if (this.f12405d != null) {
            a += adm.m15974b(4, this.f12405d.intValue());
        }
        return this.f12406e != null ? a + adm.m15974b(5, this.f12406e.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12402a != null) {
            adm.mo11801a(1, this.f12402a.intValue());
        }
        if (this.f12403b != null) {
            adm.mo11803a(2, (C3401ads) this.f12403b);
        }
        if (this.f12404c != null) {
            adm.mo11801a(3, this.f12404c.intValue());
        }
        if (this.f12405d != null) {
            adm.mo11801a(4, this.f12405d.intValue());
        }
        if (this.f12406e != null) {
            adm.mo11801a(5, this.f12406e.intValue());
        }
        super.mo11512a(adm);
    }
}

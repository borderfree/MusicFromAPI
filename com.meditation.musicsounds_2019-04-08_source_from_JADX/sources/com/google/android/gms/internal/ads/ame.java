package com.google.android.gms.internal.ads;

public final class ame extends adn<ame> {

    /* renamed from: a */
    private Integer f12411a;

    /* renamed from: b */
    private alz f12412b;

    /* renamed from: c */
    private Integer f12413c;

    /* renamed from: d */
    private Integer f12414d;

    /* renamed from: e */
    private Integer f12415e;

    /* renamed from: f */
    private Long f12416f;

    public ame() {
        this.f12411a = null;
        this.f12412b = null;
        this.f12413c = null;
        this.f12414d = null;
        this.f12415e = null;
        this.f12416f = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ame mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = adk.mo11799j();
                try {
                    this.f12411a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 18) {
                if (this.f12412b == null) {
                    this.f12412b = new alz();
                }
                adk.mo11784a((C3401ads) this.f12412b);
            } else if (a == 24) {
                this.f12413c = Integer.valueOf(adk.mo11796g());
            } else if (a == 32) {
                this.f12414d = Integer.valueOf(adk.mo11796g());
            } else if (a == 40) {
                this.f12415e = Integer.valueOf(adk.mo11796g());
            } else if (a == 48) {
                this.f12416f = Long.valueOf(adk.mo11797h());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12411a != null) {
            a += adm.m15974b(1, this.f12411a.intValue());
        }
        if (this.f12412b != null) {
            a += adm.m15975b(2, (C3401ads) this.f12412b);
        }
        if (this.f12413c != null) {
            a += adm.m15974b(3, this.f12413c.intValue());
        }
        if (this.f12414d != null) {
            a += adm.m15974b(4, this.f12414d.intValue());
        }
        if (this.f12415e != null) {
            a += adm.m15974b(5, this.f12415e.intValue());
        }
        return this.f12416f != null ? a + adm.m15980c(6, this.f12416f.longValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12411a != null) {
            adm.mo11801a(1, this.f12411a.intValue());
        }
        if (this.f12412b != null) {
            adm.mo11803a(2, (C3401ads) this.f12412b);
        }
        if (this.f12413c != null) {
            adm.mo11801a(3, this.f12413c.intValue());
        }
        if (this.f12414d != null) {
            adm.mo11801a(4, this.f12414d.intValue());
        }
        if (this.f12415e != null) {
            adm.mo11801a(5, this.f12415e.intValue());
        }
        if (this.f12416f != null) {
            adm.mo11802a(6, this.f12416f.longValue());
        }
        super.mo11512a(adm);
    }
}

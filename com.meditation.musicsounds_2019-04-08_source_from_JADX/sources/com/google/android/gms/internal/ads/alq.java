package com.google.android.gms.internal.ads;

public final class alq extends adn<alq> {

    /* renamed from: a */
    private Integer f12350a;

    /* renamed from: b */
    private alv f12351b;

    public alq() {
        this.f12350a = null;
        this.f12351b = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alq mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = adk.mo11799j();
                try {
                    this.f12350a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 18) {
                if (this.f12351b == null) {
                    this.f12351b = new alv();
                }
                adk.mo11784a((C3401ads) this.f12351b);
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12350a != null) {
            a += adm.m15974b(1, this.f12350a.intValue());
        }
        return this.f12351b != null ? a + adm.m15975b(2, (C3401ads) this.f12351b) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12350a != null) {
            adm.mo11801a(1, this.f12350a.intValue());
        }
        if (this.f12351b != null) {
            adm.mo11803a(2, (C3401ads) this.f12351b);
        }
        super.mo11512a(adm);
    }
}

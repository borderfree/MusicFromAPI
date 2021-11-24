package com.google.android.gms.internal.ads;

public final class amf extends adn<amf> {

    /* renamed from: a */
    private Integer f12417a;

    /* renamed from: b */
    private alz f12418b;

    /* renamed from: c */
    private alv f12419c;

    public amf() {
        this.f12417a = null;
        this.f12418b = null;
        this.f12419c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amf mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f12418b == null) {
                        this.f12418b = new alz();
                    }
                    ads = this.f12418b;
                } else if (a == 26) {
                    if (this.f12419c == null) {
                        this.f12419c = new alv();
                    }
                    ads = this.f12419c;
                } else if (!super.mo11811a(adk, a)) {
                    return this;
                }
                adk.mo11784a(ads);
            } else {
                int j = adk.mo11799j();
                try {
                    this.f12417a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
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
        if (this.f12417a != null) {
            a += adm.m15974b(1, this.f12417a.intValue());
        }
        if (this.f12418b != null) {
            a += adm.m15975b(2, (C3401ads) this.f12418b);
        }
        return this.f12419c != null ? a + adm.m15975b(3, (C3401ads) this.f12419c) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12417a != null) {
            adm.mo11801a(1, this.f12417a.intValue());
        }
        if (this.f12418b != null) {
            adm.mo11803a(2, (C3401ads) this.f12418b);
        }
        if (this.f12419c != null) {
            adm.mo11803a(3, (C3401ads) this.f12419c);
        }
        super.mo11512a(adm);
    }
}

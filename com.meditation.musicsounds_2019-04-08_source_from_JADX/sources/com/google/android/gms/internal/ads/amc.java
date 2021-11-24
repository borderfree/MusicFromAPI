package com.google.android.gms.internal.ads;

public final class amc extends adn<amc> {

    /* renamed from: a */
    private Integer f12407a;

    /* renamed from: b */
    private alz f12408b;

    /* renamed from: c */
    private alv f12409c;

    public amc() {
        this.f12407a = null;
        this.f12408b = null;
        this.f12409c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amc mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f12408b == null) {
                        this.f12408b = new alz();
                    }
                    ads = this.f12408b;
                } else if (a == 26) {
                    if (this.f12409c == null) {
                        this.f12409c = new alv();
                    }
                    ads = this.f12409c;
                } else if (!super.mo11811a(adk, a)) {
                    return this;
                }
                adk.mo11784a(ads);
            } else {
                int j = adk.mo11799j();
                try {
                    this.f12407a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
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
        if (this.f12407a != null) {
            a += adm.m15974b(1, this.f12407a.intValue());
        }
        if (this.f12408b != null) {
            a += adm.m15975b(2, (C3401ads) this.f12408b);
        }
        return this.f12409c != null ? a + adm.m15975b(3, (C3401ads) this.f12409c) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12407a != null) {
            adm.mo11801a(1, this.f12407a.intValue());
        }
        if (this.f12408b != null) {
            adm.mo11803a(2, (C3401ads) this.f12408b);
        }
        if (this.f12409c != null) {
            adm.mo11803a(3, (C3401ads) this.f12409c);
        }
        super.mo11512a(adm);
    }
}

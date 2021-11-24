package com.google.android.gms.internal.ads;

public final class als extends adn<als> {

    /* renamed from: a */
    private Integer f12363a;

    /* renamed from: b */
    private Integer f12364b;

    public als() {
        this.f12363a = null;
        this.f12364b = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12363a != null) {
            a += adm.m15974b(1, this.f12363a.intValue());
        }
        return this.f12364b != null ? a + adm.m15974b(2, this.f12364b.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f12363a = Integer.valueOf(adk.mo11796g());
            } else if (a == 16) {
                this.f12364b = Integer.valueOf(adk.mo11796g());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12363a != null) {
            adm.mo11801a(1, this.f12363a.intValue());
        }
        if (this.f12364b != null) {
            adm.mo11801a(2, this.f12364b.intValue());
        }
        super.mo11512a(adm);
    }
}

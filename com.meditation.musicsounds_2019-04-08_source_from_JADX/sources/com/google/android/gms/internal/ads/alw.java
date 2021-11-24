package com.google.android.gms.internal.ads;

public final class alw extends adn<alw> {

    /* renamed from: a */
    public Integer f12374a;

    /* renamed from: b */
    public Integer f12375b;

    /* renamed from: c */
    public Integer f12376c;

    public alw() {
        this.f12374a = null;
        this.f12375b = null;
        this.f12376c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12374a != null) {
            a += adm.m15974b(1, this.f12374a.intValue());
        }
        if (this.f12375b != null) {
            a += adm.m15974b(2, this.f12375b.intValue());
        }
        return this.f12376c != null ? a + adm.m15974b(3, this.f12376c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f12374a = Integer.valueOf(adk.mo11796g());
            } else if (a == 16) {
                this.f12375b = Integer.valueOf(adk.mo11796g());
            } else if (a == 24) {
                this.f12376c = Integer.valueOf(adk.mo11796g());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12374a != null) {
            adm.mo11801a(1, this.f12374a.intValue());
        }
        if (this.f12375b != null) {
            adm.mo11801a(2, this.f12375b.intValue());
        }
        if (this.f12376c != null) {
            adm.mo11801a(3, this.f12376c.intValue());
        }
        super.mo11512a(adm);
    }
}

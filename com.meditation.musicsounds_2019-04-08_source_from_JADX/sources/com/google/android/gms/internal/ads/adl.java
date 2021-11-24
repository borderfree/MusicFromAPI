package com.google.android.gms.internal.ads;

public final class adl extends adn<adl> {

    /* renamed from: a */
    public Long f11549a;

    /* renamed from: b */
    private String f11550b;

    /* renamed from: c */
    private byte[] f11551c;

    public adl() {
        this.f11549a = null;
        this.f11550b = null;
        this.f11551c = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11549a != null) {
            a += adm.m15982d(1, this.f11549a.longValue());
        }
        if (this.f11550b != null) {
            a += adm.m15976b(3, this.f11550b);
        }
        return this.f11551c != null ? a + adm.m15977b(4, this.f11551c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11549a = Long.valueOf(adk.mo11797h());
            } else if (a == 26) {
                this.f11550b = adk.mo11793e();
            } else if (a == 34) {
                this.f11551c = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11549a != null) {
            adm.mo11807b(1, this.f11549a.longValue());
        }
        if (this.f11550b != null) {
            adm.mo11804a(3, this.f11550b);
        }
        if (this.f11551c != null) {
            adm.mo11806a(4, this.f11551c);
        }
        super.mo11512a(adm);
    }
}

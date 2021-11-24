package com.google.android.gms.internal.ads;

public final class aar extends adn<aar> {

    /* renamed from: a */
    public Long f11368a;

    /* renamed from: b */
    public Long f11369b;

    /* renamed from: c */
    public Long f11370c;

    /* renamed from: d */
    private Long f11371d;

    /* renamed from: e */
    private Long f11372e;

    public aar() {
        this.f11371d = null;
        this.f11372e = null;
        this.f11368a = null;
        this.f11369b = null;
        this.f11370c = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11371d != null) {
            a += adm.m15982d(1, this.f11371d.longValue());
        }
        if (this.f11372e != null) {
            a += adm.m15982d(2, this.f11372e.longValue());
        }
        if (this.f11368a != null) {
            a += adm.m15982d(3, this.f11368a.longValue());
        }
        if (this.f11369b != null) {
            a += adm.m15982d(4, this.f11369b.longValue());
        }
        return this.f11370c != null ? a + adm.m15982d(5, this.f11370c.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11371d = Long.valueOf(adk.mo11797h());
            } else if (a == 16) {
                this.f11372e = Long.valueOf(adk.mo11797h());
            } else if (a == 24) {
                this.f11368a = Long.valueOf(adk.mo11797h());
            } else if (a == 32) {
                this.f11369b = Long.valueOf(adk.mo11797h());
            } else if (a == 40) {
                this.f11370c = Long.valueOf(adk.mo11797h());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11371d != null) {
            adm.mo11807b(1, this.f11371d.longValue());
        }
        if (this.f11372e != null) {
            adm.mo11807b(2, this.f11372e.longValue());
        }
        if (this.f11368a != null) {
            adm.mo11807b(3, this.f11368a.longValue());
        }
        if (this.f11369b != null) {
            adm.mo11807b(4, this.f11369b.longValue());
        }
        if (this.f11370c != null) {
            adm.mo11807b(5, this.f11370c.longValue());
        }
        super.mo11512a(adm);
    }
}

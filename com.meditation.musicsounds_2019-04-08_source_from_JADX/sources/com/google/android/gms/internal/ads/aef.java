package com.google.android.gms.internal.ads;

public final class aef extends adn<aef> {

    /* renamed from: a */
    public String f11633a;

    /* renamed from: b */
    public Long f11634b;

    /* renamed from: c */
    public Boolean f11635c;

    public aef() {
        this.f11633a = null;
        this.f11634b = null;
        this.f11635c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11633a != null) {
            a += adm.m15976b(1, this.f11633a);
        }
        if (this.f11634b != null) {
            a += adm.m15982d(2, this.f11634b.longValue());
        }
        if (this.f11635c == null) {
            return a;
        }
        this.f11635c.booleanValue();
        return a + adm.m15973b(3) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11633a = adk.mo11793e();
            } else if (a == 16) {
                this.f11634b = Long.valueOf(adk.mo11786b());
            } else if (a == 24) {
                this.f11635c = Boolean.valueOf(adk.mo11792d());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11633a != null) {
            adm.mo11804a(1, this.f11633a);
        }
        if (this.f11634b != null) {
            adm.mo11807b(2, this.f11634b.longValue());
        }
        if (this.f11635c != null) {
            adm.mo11805a(3, this.f11635c.booleanValue());
        }
        super.mo11512a(adm);
    }
}

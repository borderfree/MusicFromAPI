package com.google.android.gms.internal.ads;

public final class adx extends adn<adx> {

    /* renamed from: a */
    public String f11599a;

    public adx() {
        this.f11599a = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        return this.f11599a != null ? a + adm.m15976b(1, this.f11599a) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11599a = adk.mo11793e();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11599a != null) {
            adm.mo11804a(1, this.f11599a);
        }
        super.mo11512a(adm);
    }
}

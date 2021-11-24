package com.google.android.gms.internal.ads;

public final class aec extends adn<aec> {

    /* renamed from: a */
    private Integer f11617a;

    /* renamed from: b */
    private byte[] f11618b;

    /* renamed from: c */
    private byte[] f11619c;

    public aec() {
        this.f11617a = null;
        this.f11618b = null;
        this.f11619c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11617a != null) {
            a += adm.m15974b(1, this.f11617a.intValue());
        }
        if (this.f11618b != null) {
            a += adm.m15977b(2, this.f11618b);
        }
        return this.f11619c != null ? a + adm.m15977b(3, this.f11619c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11617a = Integer.valueOf(adk.mo11789c());
            } else if (a == 18) {
                this.f11618b = adk.mo11795f();
            } else if (a == 26) {
                this.f11619c = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11617a != null) {
            adm.mo11801a(1, this.f11617a.intValue());
        }
        if (this.f11618b != null) {
            adm.mo11806a(2, this.f11618b);
        }
        if (this.f11619c != null) {
            adm.mo11806a(3, this.f11619c);
        }
        super.mo11512a(adm);
    }
}

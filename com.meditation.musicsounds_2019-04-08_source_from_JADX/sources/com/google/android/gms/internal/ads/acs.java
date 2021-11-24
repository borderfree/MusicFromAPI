package com.google.android.gms.internal.ads;

public final class acs extends adn<acs> {

    /* renamed from: a */
    public byte[] f11494a;

    /* renamed from: b */
    public byte[] f11495b;

    /* renamed from: c */
    public byte[] f11496c;

    /* renamed from: d */
    public byte[] f11497d;

    public acs() {
        this.f11494a = null;
        this.f11495b = null;
        this.f11496c = null;
        this.f11497d = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11494a != null) {
            a += adm.m15977b(1, this.f11494a);
        }
        if (this.f11495b != null) {
            a += adm.m15977b(2, this.f11495b);
        }
        if (this.f11496c != null) {
            a += adm.m15977b(3, this.f11496c);
        }
        return this.f11497d != null ? a + adm.m15977b(4, this.f11497d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11494a = adk.mo11795f();
            } else if (a == 18) {
                this.f11495b = adk.mo11795f();
            } else if (a == 26) {
                this.f11496c = adk.mo11795f();
            } else if (a == 34) {
                this.f11497d = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11494a != null) {
            adm.mo11806a(1, this.f11494a);
        }
        if (this.f11495b != null) {
            adm.mo11806a(2, this.f11495b);
        }
        if (this.f11496c != null) {
            adm.mo11806a(3, this.f11496c);
        }
        if (this.f11497d != null) {
            adm.mo11806a(4, this.f11497d);
        }
        super.mo11512a(adm);
    }
}

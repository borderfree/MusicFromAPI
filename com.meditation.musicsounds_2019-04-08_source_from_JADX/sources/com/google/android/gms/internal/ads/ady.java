package com.google.android.gms.internal.ads;

public final class ady extends adn<ady> {

    /* renamed from: c */
    private static volatile ady[] f11600c;

    /* renamed from: a */
    public byte[] f11601a;

    /* renamed from: b */
    public byte[] f11602b;

    public ady() {
        this.f11601a = null;
        this.f11602b = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* renamed from: b */
    public static ady[] m16030b() {
        if (f11600c == null) {
            synchronized (adr.f11564b) {
                if (f11600c == null) {
                    f11600c = new ady[0];
                }
            }
        }
        return f11600c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a() + adm.m15977b(1, this.f11601a);
        return this.f11602b != null ? a + adm.m15977b(2, this.f11602b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11601a = adk.mo11795f();
            } else if (a == 18) {
                this.f11602b = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        adm.mo11806a(1, this.f11601a);
        if (this.f11602b != null) {
            adm.mo11806a(2, this.f11602b);
        }
        super.mo11512a(adm);
    }
}

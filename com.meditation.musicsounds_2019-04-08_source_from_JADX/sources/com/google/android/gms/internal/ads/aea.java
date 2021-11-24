package com.google.android.gms.internal.ads;

public final class aea extends adn<aea> {

    /* renamed from: a */
    private byte[] f11608a;

    /* renamed from: b */
    private byte[] f11609b;

    /* renamed from: c */
    private byte[] f11610c;

    public aea() {
        this.f11608a = null;
        this.f11609b = null;
        this.f11610c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11608a != null) {
            a += adm.m15977b(1, this.f11608a);
        }
        if (this.f11609b != null) {
            a += adm.m15977b(2, this.f11609b);
        }
        return this.f11610c != null ? a + adm.m15977b(3, this.f11610c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11608a = adk.mo11795f();
            } else if (a == 18) {
                this.f11609b = adk.mo11795f();
            } else if (a == 26) {
                this.f11610c = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11608a != null) {
            adm.mo11806a(1, this.f11608a);
        }
        if (this.f11609b != null) {
            adm.mo11806a(2, this.f11609b);
        }
        if (this.f11610c != null) {
            adm.mo11806a(3, this.f11610c);
        }
        super.mo11512a(adm);
    }
}

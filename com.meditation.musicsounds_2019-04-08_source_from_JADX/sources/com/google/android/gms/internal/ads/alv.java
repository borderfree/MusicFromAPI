package com.google.android.gms.internal.ads;

public final class alv extends adn<alv> {

    /* renamed from: a */
    private static volatile alv[] f12371a;

    /* renamed from: b */
    private Integer f12372b;

    /* renamed from: c */
    private Integer f12373c;

    public alv() {
        this.f12372b = null;
        this.f12373c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* renamed from: b */
    public static alv[] m16540b() {
        if (f12371a == null) {
            synchronized (adr.f11564b) {
                if (f12371a == null) {
                    f12371a = new alv[0];
                }
            }
        }
        return f12371a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12372b != null) {
            a += adm.m15974b(1, this.f12372b.intValue());
        }
        return this.f12373c != null ? a + adm.m15974b(2, this.f12373c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f12372b = Integer.valueOf(adk.mo11796g());
            } else if (a == 16) {
                this.f12373c = Integer.valueOf(adk.mo11796g());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12372b != null) {
            adm.mo11801a(1, this.f12372b.intValue());
        }
        if (this.f12373c != null) {
            adm.mo11801a(2, this.f12373c.intValue());
        }
        super.mo11512a(adm);
    }
}

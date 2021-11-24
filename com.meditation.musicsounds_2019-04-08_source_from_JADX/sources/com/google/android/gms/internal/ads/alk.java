package com.google.android.gms.internal.ads;

public final class alk extends adn<alk> {

    /* renamed from: a */
    private Integer f12324a;

    /* renamed from: b */
    private alw f12325b;

    /* renamed from: c */
    private String f12326c;

    /* renamed from: d */
    private String f12327d;

    public alk() {
        this.f12324a = null;
        this.f12325b = null;
        this.f12326c = null;
        this.f12327d = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alk mo11511a(adk adk) {
        int g;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 40) {
                try {
                    g = adk.mo11796g();
                    if (g < 0 || g > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(g);
                        sb.append(" is not a valid enum Platform");
                    } else {
                        this.f12324a = Integer.valueOf(g);
                    }
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(adk.mo11799j());
                    mo11811a(adk, a);
                }
            } else if (a == 50) {
                if (this.f12325b == null) {
                    this.f12325b = new alw();
                }
                adk.mo11784a((C3401ads) this.f12325b);
            } else if (a == 58) {
                this.f12326c = adk.mo11793e();
            } else if (a == 66) {
                this.f12327d = adk.mo11793e();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(g);
        sb2.append(" is not a valid enum Platform");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12324a != null) {
            a += adm.m15974b(5, this.f12324a.intValue());
        }
        if (this.f12325b != null) {
            a += adm.m15975b(6, (C3401ads) this.f12325b);
        }
        if (this.f12326c != null) {
            a += adm.m15976b(7, this.f12326c);
        }
        return this.f12327d != null ? a + adm.m15976b(8, this.f12327d) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12324a != null) {
            adm.mo11801a(5, this.f12324a.intValue());
        }
        if (this.f12325b != null) {
            adm.mo11803a(6, (C3401ads) this.f12325b);
        }
        if (this.f12326c != null) {
            adm.mo11804a(7, this.f12326c);
        }
        if (this.f12327d != null) {
            adm.mo11804a(8, this.f12327d);
        }
        super.mo11512a(adm);
    }
}

package com.google.android.gms.internal.ads;

public final class alu extends adn<alu> {

    /* renamed from: a */
    private static volatile alu[] f12367a;

    /* renamed from: b */
    private String f12368b;

    /* renamed from: c */
    private Integer f12369c;

    /* renamed from: d */
    private alv f12370d;

    public alu() {
        this.f12368b = null;
        this.f12369c = null;
        this.f12370d = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alu mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f12368b = adk.mo11793e();
            } else if (a == 16) {
                int j = adk.mo11799j();
                try {
                    this.f12369c = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 26) {
                if (this.f12370d == null) {
                    this.f12370d = new alv();
                }
                adk.mo11784a((C3401ads) this.f12370d);
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: b */
    public static alu[] m16536b() {
        if (f12367a == null) {
            synchronized (adr.f11564b) {
                if (f12367a == null) {
                    f12367a = new alu[0];
                }
            }
        }
        return f12367a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12368b != null) {
            a += adm.m15976b(1, this.f12368b);
        }
        if (this.f12369c != null) {
            a += adm.m15974b(2, this.f12369c.intValue());
        }
        return this.f12370d != null ? a + adm.m15975b(3, (C3401ads) this.f12370d) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12368b != null) {
            adm.mo11804a(1, this.f12368b);
        }
        if (this.f12369c != null) {
            adm.mo11801a(2, this.f12369c.intValue());
        }
        if (this.f12370d != null) {
            adm.mo11803a(3, (C3401ads) this.f12370d);
        }
        super.mo11512a(adm);
    }
}

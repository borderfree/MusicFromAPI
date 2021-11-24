package com.google.android.gms.internal.ads;

public final class alf extends adn<alf> {

    /* renamed from: a */
    private static volatile alf[] f12299a;

    /* renamed from: b */
    private Integer f12300b;

    /* renamed from: c */
    private alt f12301c;

    public alf() {
        this.f12300b = null;
        this.f12301c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alf mo11511a(adk adk) {
        int g;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    g = adk.mo11796g();
                    if (g < 0 || g > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(g);
                        sb.append(" is not a valid enum AdFormatType");
                    } else {
                        this.f12300b = Integer.valueOf(g);
                    }
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(adk.mo11799j());
                    mo11811a(adk, a);
                }
            } else if (a == 18) {
                if (this.f12301c == null) {
                    this.f12301c = new alt();
                }
                adk.mo11784a((C3401ads) this.f12301c);
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(g);
        sb2.append(" is not a valid enum AdFormatType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    public static alf[] m16478b() {
        if (f12299a == null) {
            synchronized (adr.f11564b) {
                if (f12299a == null) {
                    f12299a = new alf[0];
                }
            }
        }
        return f12299a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12300b != null) {
            a += adm.m15974b(1, this.f12300b.intValue());
        }
        return this.f12301c != null ? a + adm.m15975b(2, (C3401ads) this.f12301c) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12300b != null) {
            adm.mo11801a(1, this.f12300b.intValue());
        }
        if (this.f12301c != null) {
            adm.mo11803a(2, (C3401ads) this.f12301c);
        }
        super.mo11512a(adm);
    }
}

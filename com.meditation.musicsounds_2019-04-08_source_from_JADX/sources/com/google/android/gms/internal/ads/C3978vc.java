package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vc */
public final class C3978vc extends adn<C3978vc> {

    /* renamed from: a */
    public String f14986a;

    /* renamed from: b */
    public Long f14987b;

    /* renamed from: c */
    private String f14988c;

    /* renamed from: d */
    private String f14989d;

    /* renamed from: e */
    private String f14990e;

    /* renamed from: f */
    private Long f14991f;

    /* renamed from: g */
    private Long f14992g;

    /* renamed from: h */
    private String f14993h;

    /* renamed from: i */
    private Long f14994i;

    /* renamed from: j */
    private String f14995j;

    public C3978vc() {
        this.f14986a = null;
        this.f14987b = null;
        this.f14988c = null;
        this.f14989d = null;
        this.f14990e = null;
        this.f14991f = null;
        this.f14992g = null;
        this.f14993h = null;
        this.f14994i = null;
        this.f14995j = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f14986a != null) {
            a += adm.m15976b(1, this.f14986a);
        }
        if (this.f14987b != null) {
            a += adm.m15982d(2, this.f14987b.longValue());
        }
        if (this.f14988c != null) {
            a += adm.m15976b(3, this.f14988c);
        }
        if (this.f14989d != null) {
            a += adm.m15976b(4, this.f14989d);
        }
        if (this.f14990e != null) {
            a += adm.m15976b(5, this.f14990e);
        }
        if (this.f14991f != null) {
            a += adm.m15982d(6, this.f14991f.longValue());
        }
        if (this.f14992g != null) {
            a += adm.m15982d(7, this.f14992g.longValue());
        }
        if (this.f14993h != null) {
            a += adm.m15976b(8, this.f14993h);
        }
        if (this.f14994i != null) {
            a += adm.m15982d(9, this.f14994i.longValue());
        }
        return this.f14995j != null ? a + adm.m15976b(10, this.f14995j) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f14986a = adk.mo11793e();
                    break;
                case 16:
                    this.f14987b = Long.valueOf(adk.mo11797h());
                    break;
                case 26:
                    this.f14988c = adk.mo11793e();
                    break;
                case 34:
                    this.f14989d = adk.mo11793e();
                    break;
                case 42:
                    this.f14990e = adk.mo11793e();
                    break;
                case 48:
                    this.f14991f = Long.valueOf(adk.mo11797h());
                    break;
                case 56:
                    this.f14992g = Long.valueOf(adk.mo11797h());
                    break;
                case 66:
                    this.f14993h = adk.mo11793e();
                    break;
                case 72:
                    this.f14994i = Long.valueOf(adk.mo11797h());
                    break;
                case 82:
                    this.f14995j = adk.mo11793e();
                    break;
                default:
                    if (super.mo11811a(adk, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f14986a != null) {
            adm.mo11804a(1, this.f14986a);
        }
        if (this.f14987b != null) {
            adm.mo11807b(2, this.f14987b.longValue());
        }
        if (this.f14988c != null) {
            adm.mo11804a(3, this.f14988c);
        }
        if (this.f14989d != null) {
            adm.mo11804a(4, this.f14989d);
        }
        if (this.f14990e != null) {
            adm.mo11804a(5, this.f14990e);
        }
        if (this.f14991f != null) {
            adm.mo11807b(6, this.f14991f.longValue());
        }
        if (this.f14992g != null) {
            adm.mo11807b(7, this.f14992g.longValue());
        }
        if (this.f14993h != null) {
            adm.mo11804a(8, this.f14993h);
        }
        if (this.f14994i != null) {
            adm.mo11807b(9, this.f14994i.longValue());
        }
        if (this.f14995j != null) {
            adm.mo11804a(10, this.f14995j);
        }
        super.mo11512a(adm);
    }
}

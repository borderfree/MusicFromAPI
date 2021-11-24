package com.google.android.gms.internal.ads;

public final class alx extends adn<alx> {

    /* renamed from: a */
    private static volatile alx[] f12377a;

    /* renamed from: b */
    private amb f12378b;

    /* renamed from: c */
    private ame f12379c;

    /* renamed from: d */
    private amf f12380d;

    /* renamed from: e */
    private amg f12381e;

    /* renamed from: f */
    private aly f12382f;

    /* renamed from: g */
    private amc f12383g;

    /* renamed from: h */
    private ama f12384h;

    /* renamed from: i */
    private Integer f12385i;

    /* renamed from: j */
    private Integer f12386j;

    /* renamed from: k */
    private alv f12387k;

    /* renamed from: l */
    private Integer f12388l;

    /* renamed from: m */
    private Integer f12389m;

    /* renamed from: n */
    private Integer f12390n;

    /* renamed from: o */
    private Integer f12391o;

    /* renamed from: p */
    private Integer f12392p;

    /* renamed from: q */
    private Long f12393q;

    public alx() {
        this.f12378b = null;
        this.f12379c = null;
        this.f12380d = null;
        this.f12381e = null;
        this.f12382f = null;
        this.f12383g = null;
        this.f12384h = null;
        this.f12385i = null;
        this.f12386j = null;
        this.f12387k = null;
        this.f12388l = null;
        this.f12389m = null;
        this.f12390n = null;
        this.f12391o = null;
        this.f12392p = null;
        this.f12393q = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* renamed from: b */
    public static alx[] m16547b() {
        if (f12377a == null) {
            synchronized (adr.f11564b) {
                if (f12377a == null) {
                    f12377a = new alx[0];
                }
            }
        }
        return f12377a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12378b != null) {
            a += adm.m15975b(5, (C3401ads) this.f12378b);
        }
        if (this.f12379c != null) {
            a += adm.m15975b(6, (C3401ads) this.f12379c);
        }
        if (this.f12380d != null) {
            a += adm.m15975b(7, (C3401ads) this.f12380d);
        }
        if (this.f12381e != null) {
            a += adm.m15975b(8, (C3401ads) this.f12381e);
        }
        if (this.f12382f != null) {
            a += adm.m15975b(9, (C3401ads) this.f12382f);
        }
        if (this.f12383g != null) {
            a += adm.m15975b(10, (C3401ads) this.f12383g);
        }
        if (this.f12384h != null) {
            a += adm.m15975b(11, (C3401ads) this.f12384h);
        }
        if (this.f12385i != null) {
            a += adm.m15974b(12, this.f12385i.intValue());
        }
        if (this.f12386j != null) {
            a += adm.m15974b(13, this.f12386j.intValue());
        }
        if (this.f12387k != null) {
            a += adm.m15975b(14, (C3401ads) this.f12387k);
        }
        if (this.f12388l != null) {
            a += adm.m15974b(15, this.f12388l.intValue());
        }
        if (this.f12389m != null) {
            a += adm.m15974b(16, this.f12389m.intValue());
        }
        if (this.f12390n != null) {
            a += adm.m15974b(17, this.f12390n.intValue());
        }
        if (this.f12391o != null) {
            a += adm.m15974b(18, this.f12391o.intValue());
        }
        if (this.f12392p != null) {
            a += adm.m15974b(19, this.f12392p.intValue());
        }
        return this.f12393q != null ? a + adm.m15980c(20, this.f12393q.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            switch (a) {
                case 0:
                    return this;
                case 42:
                    if (this.f12378b == null) {
                        this.f12378b = new amb();
                    }
                    ads = this.f12378b;
                    break;
                case 50:
                    if (this.f12379c == null) {
                        this.f12379c = new ame();
                    }
                    ads = this.f12379c;
                    break;
                case 58:
                    if (this.f12380d == null) {
                        this.f12380d = new amf();
                    }
                    ads = this.f12380d;
                    break;
                case 66:
                    if (this.f12381e == null) {
                        this.f12381e = new amg();
                    }
                    ads = this.f12381e;
                    break;
                case 74:
                    if (this.f12382f == null) {
                        this.f12382f = new aly();
                    }
                    ads = this.f12382f;
                    break;
                case 82:
                    if (this.f12383g == null) {
                        this.f12383g = new amc();
                    }
                    ads = this.f12383g;
                    break;
                case 90:
                    if (this.f12384h == null) {
                        this.f12384h = new ama();
                    }
                    ads = this.f12384h;
                    break;
                case 96:
                    this.f12385i = Integer.valueOf(adk.mo11796g());
                    continue;
                case 104:
                    this.f12386j = Integer.valueOf(adk.mo11796g());
                    continue;
                case 114:
                    if (this.f12387k == null) {
                        this.f12387k = new alv();
                    }
                    ads = this.f12387k;
                    break;
                case 120:
                    this.f12388l = Integer.valueOf(adk.mo11796g());
                    continue;
                case 128:
                    this.f12389m = Integer.valueOf(adk.mo11796g());
                    continue;
                case 136:
                    this.f12390n = Integer.valueOf(adk.mo11796g());
                    continue;
                case 144:
                    this.f12391o = Integer.valueOf(adk.mo11796g());
                    continue;
                case 152:
                    this.f12392p = Integer.valueOf(adk.mo11796g());
                    continue;
                case 160:
                    this.f12393q = Long.valueOf(adk.mo11797h());
                    continue;
                default:
                    if (!super.mo11811a(adk, a)) {
                        return this;
                    }
                    continue;
            }
            adk.mo11784a(ads);
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12378b != null) {
            adm.mo11803a(5, (C3401ads) this.f12378b);
        }
        if (this.f12379c != null) {
            adm.mo11803a(6, (C3401ads) this.f12379c);
        }
        if (this.f12380d != null) {
            adm.mo11803a(7, (C3401ads) this.f12380d);
        }
        if (this.f12381e != null) {
            adm.mo11803a(8, (C3401ads) this.f12381e);
        }
        if (this.f12382f != null) {
            adm.mo11803a(9, (C3401ads) this.f12382f);
        }
        if (this.f12383g != null) {
            adm.mo11803a(10, (C3401ads) this.f12383g);
        }
        if (this.f12384h != null) {
            adm.mo11803a(11, (C3401ads) this.f12384h);
        }
        if (this.f12385i != null) {
            adm.mo11801a(12, this.f12385i.intValue());
        }
        if (this.f12386j != null) {
            adm.mo11801a(13, this.f12386j.intValue());
        }
        if (this.f12387k != null) {
            adm.mo11803a(14, (C3401ads) this.f12387k);
        }
        if (this.f12388l != null) {
            adm.mo11801a(15, this.f12388l.intValue());
        }
        if (this.f12389m != null) {
            adm.mo11801a(16, this.f12389m.intValue());
        }
        if (this.f12390n != null) {
            adm.mo11801a(17, this.f12390n.intValue());
        }
        if (this.f12391o != null) {
            adm.mo11801a(18, this.f12391o.intValue());
        }
        if (this.f12392p != null) {
            adm.mo11801a(19, this.f12392p.intValue());
        }
        if (this.f12393q != null) {
            adm.mo11802a(20, this.f12393q.longValue());
        }
        super.mo11512a(adm);
    }
}

package com.google.android.gms.internal.ads;

public final class all extends adn<all> {

    /* renamed from: a */
    public String f12328a;

    /* renamed from: b */
    public long[] f12329b;

    /* renamed from: c */
    public alj f12330c;

    /* renamed from: d */
    public ale f12331d;

    /* renamed from: e */
    private Integer f12332e;

    /* renamed from: f */
    private Integer f12333f;

    /* renamed from: g */
    private Integer f12334g;

    /* renamed from: h */
    private alw f12335h;

    /* renamed from: i */
    private alk f12336i;

    /* renamed from: j */
    private alp f12337j;

    public all() {
        this.f12332e = null;
        this.f12328a = null;
        this.f12333f = null;
        this.f12334g = null;
        this.f12335h = null;
        this.f12329b = adv.f11570b;
        this.f12330c = null;
        this.f12336i = null;
        this.f12337j = null;
        this.f12331d = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final all mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            switch (a) {
                case 0:
                    return this;
                case 72:
                    this.f12332e = Integer.valueOf(adk.mo11796g());
                    continue;
                case 82:
                    this.f12328a = adk.mo11793e();
                    continue;
                case 88:
                    this.f12333f = Integer.valueOf(adk.mo11796g());
                    continue;
                case 96:
                    int j = adk.mo11799j();
                    try {
                        this.f12334g = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        adk.mo11794e(j);
                        mo11811a(adk, a);
                        break;
                    }
                case 106:
                    if (this.f12335h == null) {
                        this.f12335h = new alw();
                    }
                    ads = this.f12335h;
                    break;
                case 112:
                    int a2 = adv.m16022a(adk, 112);
                    int length = this.f12329b == null ? 0 : this.f12329b.length;
                    long[] jArr = new long[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f12329b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = adk.mo11797h();
                        adk.mo11782a();
                        length++;
                    }
                    jArr[length] = adk.mo11797h();
                    this.f12329b = jArr;
                    continue;
                case 114:
                    int c = adk.mo11790c(adk.mo11796g());
                    int j2 = adk.mo11799j();
                    int i = 0;
                    while (adk.mo11798i() > 0) {
                        adk.mo11797h();
                        i++;
                    }
                    adk.mo11794e(j2);
                    int length2 = this.f12329b == null ? 0 : this.f12329b.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f12329b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = adk.mo11797h();
                        length2++;
                    }
                    this.f12329b = jArr2;
                    adk.mo11791d(c);
                    continue;
                case 122:
                    if (this.f12330c == null) {
                        this.f12330c = new alj();
                    }
                    ads = this.f12330c;
                    break;
                case 130:
                    if (this.f12336i == null) {
                        this.f12336i = new alk();
                    }
                    ads = this.f12336i;
                    break;
                case 138:
                    if (this.f12337j == null) {
                        this.f12337j = new alp();
                    }
                    ads = this.f12337j;
                    break;
                case 146:
                    if (this.f12331d == null) {
                        this.f12331d = new ale();
                    }
                    ads = this.f12331d;
                    break;
                default:
                    if (!super.mo11811a(adk, a)) {
                        return this;
                    }
                    continue;
            }
            adk.mo11784a(ads);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12332e != null) {
            a += adm.m15974b(9, this.f12332e.intValue());
        }
        if (this.f12328a != null) {
            a += adm.m15976b(10, this.f12328a);
        }
        if (this.f12333f != null) {
            a += adm.m15973b(11) + adm.m15981d(this.f12333f.intValue());
        }
        if (this.f12334g != null) {
            a += adm.m15974b(12, this.f12334g.intValue());
        }
        if (this.f12335h != null) {
            a += adm.m15975b(13, (C3401ads) this.f12335h);
        }
        if (this.f12329b != null && this.f12329b.length > 0) {
            int i = 0;
            for (long a2 : this.f12329b) {
                i += adm.m15967a(a2);
            }
            a = a + i + (this.f12329b.length * 1);
        }
        if (this.f12330c != null) {
            a += adm.m15975b(15, (C3401ads) this.f12330c);
        }
        if (this.f12336i != null) {
            a += adm.m15975b(16, (C3401ads) this.f12336i);
        }
        if (this.f12337j != null) {
            a += adm.m15975b(17, (C3401ads) this.f12337j);
        }
        return this.f12331d != null ? a + adm.m15975b(18, (C3401ads) this.f12331d) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12332e != null) {
            adm.mo11801a(9, this.f12332e.intValue());
        }
        if (this.f12328a != null) {
            adm.mo11804a(10, this.f12328a);
        }
        if (this.f12333f != null) {
            int intValue = this.f12333f.intValue();
            adm.mo11809c(11, 0);
            adm.mo11808c(intValue);
        }
        if (this.f12334g != null) {
            adm.mo11801a(12, this.f12334g.intValue());
        }
        if (this.f12335h != null) {
            adm.mo11803a(13, (C3401ads) this.f12335h);
        }
        if (this.f12329b != null && this.f12329b.length > 0) {
            for (long a : this.f12329b) {
                adm.mo11802a(14, a);
            }
        }
        if (this.f12330c != null) {
            adm.mo11803a(15, (C3401ads) this.f12330c);
        }
        if (this.f12336i != null) {
            adm.mo11803a(16, (C3401ads) this.f12336i);
        }
        if (this.f12337j != null) {
            adm.mo11803a(17, (C3401ads) this.f12337j);
        }
        if (this.f12331d != null) {
            adm.mo11803a(18, (C3401ads) this.f12331d);
        }
        super.mo11512a(adm);
    }
}

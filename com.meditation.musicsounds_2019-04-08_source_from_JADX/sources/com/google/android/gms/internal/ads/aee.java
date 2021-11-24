package com.google.android.gms.internal.ads;

public final class aee extends adn<aee> {

    /* renamed from: f */
    private static volatile aee[] f11623f;

    /* renamed from: a */
    public Integer f11624a;

    /* renamed from: b */
    public String f11625b;

    /* renamed from: c */
    public adz f11626c;

    /* renamed from: d */
    public Integer f11627d;

    /* renamed from: e */
    public String[] f11628e;

    /* renamed from: g */
    private aeb f11629g;

    /* renamed from: h */
    private Integer f11630h;

    /* renamed from: i */
    private int[] f11631i;

    /* renamed from: j */
    private String f11632j;

    public aee() {
        this.f11624a = null;
        this.f11625b = null;
        this.f11626c = null;
        this.f11629g = null;
        this.f11630h = null;
        this.f11631i = adv.f11569a;
        this.f11632j = null;
        this.f11627d = null;
        this.f11628e = adv.f11571c;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aee mo11511a(adk adk) {
        C3401ads ads;
        int c;
        while (true) {
            int a = adk.mo11782a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f11624a = Integer.valueOf(adk.mo11789c());
                    continue;
                case 18:
                    this.f11625b = adk.mo11793e();
                    continue;
                case 26:
                    if (this.f11626c == null) {
                        this.f11626c = new adz();
                    }
                    ads = this.f11626c;
                    break;
                case 34:
                    if (this.f11629g == null) {
                        this.f11629g = new aeb();
                    }
                    ads = this.f11629g;
                    break;
                case 40:
                    this.f11630h = Integer.valueOf(adk.mo11789c());
                    continue;
                case 48:
                    int a2 = adv.m16022a(adk, 48);
                    int length = this.f11631i == null ? 0 : this.f11631i.length;
                    int[] iArr = new int[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f11631i, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = adk.mo11789c();
                        adk.mo11782a();
                        length++;
                    }
                    iArr[length] = adk.mo11789c();
                    this.f11631i = iArr;
                    continue;
                case 50:
                    int c2 = adk.mo11790c(adk.mo11796g());
                    int j = adk.mo11799j();
                    int i = 0;
                    while (adk.mo11798i() > 0) {
                        adk.mo11789c();
                        i++;
                    }
                    adk.mo11794e(j);
                    int length2 = this.f11631i == null ? 0 : this.f11631i.length;
                    int[] iArr2 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f11631i, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = adk.mo11789c();
                        length2++;
                    }
                    this.f11631i = iArr2;
                    adk.mo11791d(c2);
                    continue;
                case 58:
                    this.f11632j = adk.mo11793e();
                    continue;
                case 64:
                    try {
                        c = adk.mo11789c();
                        if (c < 0 || c > 3) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(c);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        } else {
                            this.f11627d = Integer.valueOf(c);
                            continue;
                        }
                    } catch (IllegalArgumentException unused) {
                        adk.mo11794e(adk.mo11799j());
                        mo11811a(adk, a);
                        break;
                    }
                case 74:
                    int a3 = adv.m16022a(adk, 74);
                    int length3 = this.f11628e == null ? 0 : this.f11628e.length;
                    String[] strArr = new String[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f11628e, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = adk.mo11793e();
                        adk.mo11782a();
                        length3++;
                    }
                    strArr[length3] = adk.mo11793e();
                    this.f11628e = strArr;
                    continue;
                default:
                    if (!super.mo11811a(adk, a)) {
                        return this;
                    }
                    continue;
            }
            adk.mo11784a(ads);
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(c);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    public static aee[] m16051b() {
        if (f11623f == null) {
            synchronized (adr.f11564b) {
                if (f11623f == null) {
                    f11623f = new aee[0];
                }
            }
        }
        return f11623f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a() + adm.m15974b(1, this.f11624a.intValue());
        if (this.f11625b != null) {
            a += adm.m15976b(2, this.f11625b);
        }
        if (this.f11626c != null) {
            a += adm.m15975b(3, (C3401ads) this.f11626c);
        }
        if (this.f11629g != null) {
            a += adm.m15975b(4, (C3401ads) this.f11629g);
        }
        if (this.f11630h != null) {
            a += adm.m15974b(5, this.f11630h.intValue());
        }
        if (this.f11631i != null && this.f11631i.length > 0) {
            int i = 0;
            for (int a2 : this.f11631i) {
                i += adm.m15966a(a2);
            }
            a = a + i + (this.f11631i.length * 1);
        }
        if (this.f11632j != null) {
            a += adm.m15976b(7, this.f11632j);
        }
        if (this.f11627d != null) {
            a += adm.m15974b(8, this.f11627d.intValue());
        }
        if (this.f11628e == null || this.f11628e.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        for (String str : this.f11628e) {
            if (str != null) {
                i3++;
                i2 += adm.m15969a(str);
            }
        }
        return a + i2 + (i3 * 1);
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        adm.mo11801a(1, this.f11624a.intValue());
        if (this.f11625b != null) {
            adm.mo11804a(2, this.f11625b);
        }
        if (this.f11626c != null) {
            adm.mo11803a(3, (C3401ads) this.f11626c);
        }
        if (this.f11629g != null) {
            adm.mo11803a(4, (C3401ads) this.f11629g);
        }
        if (this.f11630h != null) {
            adm.mo11801a(5, this.f11630h.intValue());
        }
        if (this.f11631i != null && this.f11631i.length > 0) {
            for (int a : this.f11631i) {
                adm.mo11801a(6, a);
            }
        }
        if (this.f11632j != null) {
            adm.mo11804a(7, this.f11632j);
        }
        if (this.f11627d != null) {
            adm.mo11801a(8, this.f11627d.intValue());
        }
        if (this.f11628e != null && this.f11628e.length > 0) {
            for (String str : this.f11628e) {
                if (str != null) {
                    adm.mo11804a(9, str);
                }
            }
        }
        super.mo11512a(adm);
    }
}

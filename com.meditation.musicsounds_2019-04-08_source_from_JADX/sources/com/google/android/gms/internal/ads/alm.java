package com.google.android.gms.internal.ads;

public final class alm extends adn<alm> {

    /* renamed from: a */
    private String f12338a;

    /* renamed from: b */
    private Integer f12339b;

    /* renamed from: c */
    private int[] f12340c;

    /* renamed from: d */
    private alv f12341d;

    public alm() {
        this.f12338a = null;
        this.f12339b = null;
        this.f12340c = adv.f11569a;
        this.f12341d = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alm mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f12338a = adk.mo11793e();
            } else if (a == 16) {
                int j = adk.mo11799j();
                try {
                    this.f12339b = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 24) {
                int a2 = adv.m16022a(adk, 24);
                int length = this.f12340c == null ? 0 : this.f12340c.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f12340c, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = adk.mo11796g();
                    adk.mo11782a();
                    length++;
                }
                iArr[length] = adk.mo11796g();
                this.f12340c = iArr;
            } else if (a == 26) {
                int c = adk.mo11790c(adk.mo11796g());
                int j2 = adk.mo11799j();
                int i = 0;
                while (adk.mo11798i() > 0) {
                    adk.mo11796g();
                    i++;
                }
                adk.mo11794e(j2);
                int length2 = this.f12340c == null ? 0 : this.f12340c.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f12340c, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = adk.mo11796g();
                    length2++;
                }
                this.f12340c = iArr2;
                adk.mo11791d(c);
            } else if (a == 34) {
                if (this.f12341d == null) {
                    this.f12341d = new alv();
                }
                adk.mo11784a((C3401ads) this.f12341d);
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12338a != null) {
            a += adm.m15976b(1, this.f12338a);
        }
        if (this.f12339b != null) {
            a += adm.m15974b(2, this.f12339b.intValue());
        }
        if (this.f12340c != null && this.f12340c.length > 0) {
            int i = 0;
            for (int a2 : this.f12340c) {
                i += adm.m15966a(a2);
            }
            a = a + i + (this.f12340c.length * 1);
        }
        return this.f12341d != null ? a + adm.m15975b(4, (C3401ads) this.f12341d) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12338a != null) {
            adm.mo11804a(1, this.f12338a);
        }
        if (this.f12339b != null) {
            adm.mo11801a(2, this.f12339b.intValue());
        }
        if (this.f12340c != null && this.f12340c.length > 0) {
            for (int a : this.f12340c) {
                adm.mo11801a(3, a);
            }
        }
        if (this.f12341d != null) {
            adm.mo11803a(4, (C3401ads) this.f12341d);
        }
        super.mo11512a(adm);
    }
}

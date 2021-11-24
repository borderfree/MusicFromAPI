package com.google.android.gms.internal.ads;

public final class aeb extends adn<aeb> {

    /* renamed from: a */
    private aec f11611a;

    /* renamed from: b */
    private ady[] f11612b;

    /* renamed from: c */
    private byte[] f11613c;

    /* renamed from: d */
    private byte[] f11614d;

    /* renamed from: e */
    private Integer f11615e;

    /* renamed from: f */
    private byte[] f11616f;

    public aeb() {
        this.f11611a = null;
        this.f11612b = ady.m16030b();
        this.f11613c = null;
        this.f11614d = null;
        this.f11615e = null;
        this.f11616f = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11611a != null) {
            a += adm.m15975b(1, (C3401ads) this.f11611a);
        }
        if (this.f11612b != null && this.f11612b.length > 0) {
            for (ady ady : this.f11612b) {
                if (ady != null) {
                    a += adm.m15975b(2, (C3401ads) ady);
                }
            }
        }
        if (this.f11613c != null) {
            a += adm.m15977b(3, this.f11613c);
        }
        if (this.f11614d != null) {
            a += adm.m15977b(4, this.f11614d);
        }
        if (this.f11615e != null) {
            a += adm.m15974b(5, this.f11615e.intValue());
        }
        return this.f11616f != null ? a + adm.m15977b(6, this.f11616f) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f11611a == null) {
                    this.f11611a = new aec();
                }
                adk.mo11784a((C3401ads) this.f11611a);
            } else if (a == 18) {
                int a2 = adv.m16022a(adk, 18);
                int length = this.f11612b == null ? 0 : this.f11612b.length;
                ady[] adyArr = new ady[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11612b, 0, adyArr, 0, length);
                }
                while (length < adyArr.length - 1) {
                    adyArr[length] = new ady();
                    adk.mo11784a((C3401ads) adyArr[length]);
                    adk.mo11782a();
                    length++;
                }
                adyArr[length] = new ady();
                adk.mo11784a((C3401ads) adyArr[length]);
                this.f11612b = adyArr;
            } else if (a == 26) {
                this.f11613c = adk.mo11795f();
            } else if (a == 34) {
                this.f11614d = adk.mo11795f();
            } else if (a == 40) {
                this.f11615e = Integer.valueOf(adk.mo11789c());
            } else if (a == 50) {
                this.f11616f = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11611a != null) {
            adm.mo11803a(1, (C3401ads) this.f11611a);
        }
        if (this.f11612b != null && this.f11612b.length > 0) {
            for (ady ady : this.f11612b) {
                if (ady != null) {
                    adm.mo11803a(2, (C3401ads) ady);
                }
            }
        }
        if (this.f11613c != null) {
            adm.mo11806a(3, this.f11613c);
        }
        if (this.f11614d != null) {
            adm.mo11806a(4, this.f11614d);
        }
        if (this.f11615e != null) {
            adm.mo11801a(5, this.f11615e.intValue());
        }
        if (this.f11616f != null) {
            adm.mo11806a(6, this.f11616f);
        }
        super.mo11512a(adm);
    }
}

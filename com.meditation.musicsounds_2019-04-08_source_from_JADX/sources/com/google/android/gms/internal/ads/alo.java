package com.google.android.gms.internal.ads;

public final class alo extends adn<alo> {

    /* renamed from: a */
    private alm f12344a;

    /* renamed from: b */
    private alu[] f12345b;

    /* renamed from: c */
    private Integer f12346c;

    /* renamed from: d */
    private alv f12347d;

    public alo() {
        this.f12344a = null;
        this.f12345b = alu.m16536b();
        this.f12346c = null;
        this.f12347d = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alo mo11511a(adk adk) {
        C3401ads ads;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f12344a == null) {
                    this.f12344a = new alm();
                }
                ads = this.f12344a;
            } else if (a == 18) {
                int a2 = adv.m16022a(adk, 18);
                int length = this.f12345b == null ? 0 : this.f12345b.length;
                alu[] aluArr = new alu[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f12345b, 0, aluArr, 0, length);
                }
                while (length < aluArr.length - 1) {
                    aluArr[length] = new alu();
                    adk.mo11784a((C3401ads) aluArr[length]);
                    adk.mo11782a();
                    length++;
                }
                aluArr[length] = new alu();
                adk.mo11784a((C3401ads) aluArr[length]);
                this.f12345b = aluArr;
            } else if (a == 24) {
                int j = adk.mo11799j();
                try {
                    this.f12346c = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 34) {
                if (this.f12347d == null) {
                    this.f12347d = new alv();
                }
                ads = this.f12347d;
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
            adk.mo11784a(ads);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12344a != null) {
            a += adm.m15975b(1, (C3401ads) this.f12344a);
        }
        if (this.f12345b != null && this.f12345b.length > 0) {
            for (alu alu : this.f12345b) {
                if (alu != null) {
                    a += adm.m15975b(2, (C3401ads) alu);
                }
            }
        }
        if (this.f12346c != null) {
            a += adm.m15974b(3, this.f12346c.intValue());
        }
        return this.f12347d != null ? a + adm.m15975b(4, (C3401ads) this.f12347d) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12344a != null) {
            adm.mo11803a(1, (C3401ads) this.f12344a);
        }
        if (this.f12345b != null && this.f12345b.length > 0) {
            for (alu alu : this.f12345b) {
                if (alu != null) {
                    adm.mo11803a(2, (C3401ads) alu);
                }
            }
        }
        if (this.f12346c != null) {
            adm.mo11801a(3, this.f12346c.intValue());
        }
        if (this.f12347d != null) {
            adm.mo11803a(4, (C3401ads) this.f12347d);
        }
        super.mo11512a(adm);
    }
}

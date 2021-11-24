package com.google.android.gms.internal.ads;

public final class adz extends adn<adz> {

    /* renamed from: a */
    public ady[] f11603a;

    /* renamed from: b */
    private aea f11604b;

    /* renamed from: c */
    private byte[] f11605c;

    /* renamed from: d */
    private byte[] f11606d;

    /* renamed from: e */
    private Integer f11607e;

    public adz() {
        this.f11604b = null;
        this.f11603a = ady.m16030b();
        this.f11605c = null;
        this.f11606d = null;
        this.f11607e = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11604b != null) {
            a += adm.m15975b(1, (C3401ads) this.f11604b);
        }
        if (this.f11603a != null && this.f11603a.length > 0) {
            for (ady ady : this.f11603a) {
                if (ady != null) {
                    a += adm.m15975b(2, (C3401ads) ady);
                }
            }
        }
        if (this.f11605c != null) {
            a += adm.m15977b(3, this.f11605c);
        }
        if (this.f11606d != null) {
            a += adm.m15977b(4, this.f11606d);
        }
        return this.f11607e != null ? a + adm.m15974b(5, this.f11607e.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f11604b == null) {
                    this.f11604b = new aea();
                }
                adk.mo11784a((C3401ads) this.f11604b);
            } else if (a == 18) {
                int a2 = adv.m16022a(adk, 18);
                int length = this.f11603a == null ? 0 : this.f11603a.length;
                ady[] adyArr = new ady[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11603a, 0, adyArr, 0, length);
                }
                while (length < adyArr.length - 1) {
                    adyArr[length] = new ady();
                    adk.mo11784a((C3401ads) adyArr[length]);
                    adk.mo11782a();
                    length++;
                }
                adyArr[length] = new ady();
                adk.mo11784a((C3401ads) adyArr[length]);
                this.f11603a = adyArr;
            } else if (a == 26) {
                this.f11605c = adk.mo11795f();
            } else if (a == 34) {
                this.f11606d = adk.mo11795f();
            } else if (a == 40) {
                this.f11607e = Integer.valueOf(adk.mo11789c());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11604b != null) {
            adm.mo11803a(1, (C3401ads) this.f11604b);
        }
        if (this.f11603a != null && this.f11603a.length > 0) {
            for (ady ady : this.f11603a) {
                if (ady != null) {
                    adm.mo11803a(2, (C3401ads) ady);
                }
            }
        }
        if (this.f11605c != null) {
            adm.mo11806a(3, this.f11605c);
        }
        if (this.f11606d != null) {
            adm.mo11806a(4, this.f11606d);
        }
        if (this.f11607e != null) {
            adm.mo11801a(5, this.f11607e.intValue());
        }
        super.mo11512a(adm);
    }
}

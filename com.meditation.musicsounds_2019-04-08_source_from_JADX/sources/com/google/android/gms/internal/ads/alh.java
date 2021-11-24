package com.google.android.gms.internal.ads;

public final class alh extends adn<alh> {

    /* renamed from: a */
    private String f12305a;

    /* renamed from: b */
    private alf[] f12306b;

    /* renamed from: c */
    private Integer f12307c;

    /* renamed from: d */
    private Integer f12308d;

    /* renamed from: e */
    private Integer f12309e;

    public alh() {
        this.f12305a = null;
        this.f12306b = alf.m16478b();
        this.f12307c = null;
        this.f12308d = null;
        this.f12309e = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alh mo11511a(adk adk) {
        int i;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f12305a = adk.mo11793e();
            } else if (a == 18) {
                int a2 = adv.m16022a(adk, 18);
                int length = this.f12306b == null ? 0 : this.f12306b.length;
                alf[] alfArr = new alf[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f12306b, 0, alfArr, 0, length);
                }
                while (length < alfArr.length - 1) {
                    alfArr[length] = new alf();
                    adk.mo11784a((C3401ads) alfArr[length]);
                    adk.mo11782a();
                    length++;
                }
                alfArr[length] = new alf();
                adk.mo11784a((C3401ads) alfArr[length]);
                this.f12306b = alfArr;
            } else if (a == 24) {
                i = adk.mo11799j();
                this.f12307c = Integer.valueOf(ald.m16472a(adk.mo11796g()));
            } else if (a == 32) {
                i = adk.mo11799j();
                this.f12308d = Integer.valueOf(ald.m16472a(adk.mo11796g()));
            } else if (a == 40) {
                i = adk.mo11799j();
                try {
                    this.f12309e = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(i);
                    mo11811a(adk, a);
                }
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12305a != null) {
            a += adm.m15976b(1, this.f12305a);
        }
        if (this.f12306b != null && this.f12306b.length > 0) {
            for (alf alf : this.f12306b) {
                if (alf != null) {
                    a += adm.m15975b(2, (C3401ads) alf);
                }
            }
        }
        if (this.f12307c != null) {
            a += adm.m15974b(3, this.f12307c.intValue());
        }
        if (this.f12308d != null) {
            a += adm.m15974b(4, this.f12308d.intValue());
        }
        return this.f12309e != null ? a + adm.m15974b(5, this.f12309e.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12305a != null) {
            adm.mo11804a(1, this.f12305a);
        }
        if (this.f12306b != null && this.f12306b.length > 0) {
            for (alf alf : this.f12306b) {
                if (alf != null) {
                    adm.mo11803a(2, (C3401ads) alf);
                }
            }
        }
        if (this.f12307c != null) {
            adm.mo11801a(3, this.f12307c.intValue());
        }
        if (this.f12308d != null) {
            adm.mo11801a(4, this.f12308d.intValue());
        }
        if (this.f12309e != null) {
            adm.mo11801a(5, this.f12309e.intValue());
        }
        super.mo11512a(adm);
    }
}

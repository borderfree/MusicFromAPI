package com.google.android.gms.internal.ads;

public final class alj extends adn<alj> {

    /* renamed from: a */
    public String f12316a;

    /* renamed from: b */
    public alw f12317b;

    /* renamed from: c */
    private alv f12318c;

    /* renamed from: d */
    private Integer f12319d;

    /* renamed from: e */
    private Integer f12320e;

    /* renamed from: f */
    private Integer f12321f;

    /* renamed from: g */
    private Integer f12322g;

    /* renamed from: h */
    private Integer f12323h;

    public alj() {
        this.f12316a = null;
        this.f12318c = null;
        this.f12319d = null;
        this.f12317b = null;
        this.f12320e = null;
        this.f12321f = null;
        this.f12322g = null;
        this.f12323h = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alj mo11511a(adk adk) {
        C3401ads ads;
        int i;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a != 10) {
                if (a == 18) {
                    if (this.f12318c == null) {
                        this.f12318c = new alv();
                    }
                    ads = this.f12318c;
                } else if (a == 24) {
                    this.f12319d = Integer.valueOf(adk.mo11796g());
                } else if (a == 34) {
                    if (this.f12317b == null) {
                        this.f12317b = new alw();
                    }
                    ads = this.f12317b;
                } else if (a == 40) {
                    this.f12320e = Integer.valueOf(adk.mo11796g());
                } else if (a == 48) {
                    i = adk.mo11799j();
                    this.f12321f = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } else if (a == 56) {
                    i = adk.mo11799j();
                    this.f12322g = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } else if (a == 64) {
                    i = adk.mo11799j();
                    try {
                        this.f12323h = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                    } catch (IllegalArgumentException unused) {
                        adk.mo11794e(i);
                        mo11811a(adk, a);
                    }
                } else if (!super.mo11811a(adk, a)) {
                    return this;
                }
                adk.mo11784a(ads);
            } else {
                this.f12316a = adk.mo11793e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12316a != null) {
            a += adm.m15976b(1, this.f12316a);
        }
        if (this.f12318c != null) {
            a += adm.m15975b(2, (C3401ads) this.f12318c);
        }
        if (this.f12319d != null) {
            a += adm.m15974b(3, this.f12319d.intValue());
        }
        if (this.f12317b != null) {
            a += adm.m15975b(4, (C3401ads) this.f12317b);
        }
        if (this.f12320e != null) {
            a += adm.m15974b(5, this.f12320e.intValue());
        }
        if (this.f12321f != null) {
            a += adm.m15974b(6, this.f12321f.intValue());
        }
        if (this.f12322g != null) {
            a += adm.m15974b(7, this.f12322g.intValue());
        }
        return this.f12323h != null ? a + adm.m15974b(8, this.f12323h.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12316a != null) {
            adm.mo11804a(1, this.f12316a);
        }
        if (this.f12318c != null) {
            adm.mo11803a(2, (C3401ads) this.f12318c);
        }
        if (this.f12319d != null) {
            adm.mo11801a(3, this.f12319d.intValue());
        }
        if (this.f12317b != null) {
            adm.mo11803a(4, (C3401ads) this.f12317b);
        }
        if (this.f12320e != null) {
            adm.mo11801a(5, this.f12320e.intValue());
        }
        if (this.f12321f != null) {
            adm.mo11801a(6, this.f12321f.intValue());
        }
        if (this.f12322g != null) {
            adm.mo11801a(7, this.f12322g.intValue());
        }
        if (this.f12323h != null) {
            adm.mo11801a(8, this.f12323h.intValue());
        }
        super.mo11512a(adm);
    }
}

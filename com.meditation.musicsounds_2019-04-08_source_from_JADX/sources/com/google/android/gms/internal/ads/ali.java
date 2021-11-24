package com.google.android.gms.internal.ads;

public final class ali extends adn<ali> {

    /* renamed from: a */
    private Integer f12310a;

    /* renamed from: b */
    private alv f12311b;

    /* renamed from: c */
    private alv f12312c;

    /* renamed from: d */
    private alv f12313d;

    /* renamed from: e */
    private alv[] f12314e;

    /* renamed from: f */
    private Integer f12315f;

    public ali() {
        this.f12310a = null;
        this.f12311b = null;
        this.f12312c = null;
        this.f12313d = null;
        this.f12314e = alv.m16540b();
        this.f12315f = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12310a != null) {
            a += adm.m15974b(1, this.f12310a.intValue());
        }
        if (this.f12311b != null) {
            a += adm.m15975b(2, (C3401ads) this.f12311b);
        }
        if (this.f12312c != null) {
            a += adm.m15975b(3, (C3401ads) this.f12312c);
        }
        if (this.f12313d != null) {
            a += adm.m15975b(4, (C3401ads) this.f12313d);
        }
        if (this.f12314e != null && this.f12314e.length > 0) {
            for (alv alv : this.f12314e) {
                if (alv != null) {
                    a += adm.m15975b(5, (C3401ads) alv);
                }
            }
        }
        return this.f12315f != null ? a + adm.m15974b(6, this.f12315f.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        alv alv;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f12311b == null) {
                        this.f12311b = new alv();
                    }
                    alv = this.f12311b;
                } else if (a == 26) {
                    if (this.f12312c == null) {
                        this.f12312c = new alv();
                    }
                    alv = this.f12312c;
                } else if (a == 34) {
                    if (this.f12313d == null) {
                        this.f12313d = new alv();
                    }
                    alv = this.f12313d;
                } else if (a == 42) {
                    int a2 = adv.m16022a(adk, 42);
                    int length = this.f12314e == null ? 0 : this.f12314e.length;
                    alv[] alvArr = new alv[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f12314e, 0, alvArr, 0, length);
                    }
                    while (length < alvArr.length - 1) {
                        alvArr[length] = new alv();
                        adk.mo11784a((C3401ads) alvArr[length]);
                        adk.mo11782a();
                        length++;
                    }
                    alvArr[length] = new alv();
                    adk.mo11784a((C3401ads) alvArr[length]);
                    this.f12314e = alvArr;
                } else if (a == 48) {
                    this.f12315f = Integer.valueOf(adk.mo11796g());
                } else if (!super.mo11811a(adk, a)) {
                    return this;
                }
                adk.mo11784a((C3401ads) alv);
            } else {
                this.f12310a = Integer.valueOf(adk.mo11796g());
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12310a != null) {
            adm.mo11801a(1, this.f12310a.intValue());
        }
        if (this.f12311b != null) {
            adm.mo11803a(2, (C3401ads) this.f12311b);
        }
        if (this.f12312c != null) {
            adm.mo11803a(3, (C3401ads) this.f12312c);
        }
        if (this.f12313d != null) {
            adm.mo11803a(4, (C3401ads) this.f12313d);
        }
        if (this.f12314e != null && this.f12314e.length > 0) {
            for (alv alv : this.f12314e) {
                if (alv != null) {
                    adm.mo11803a(5, (C3401ads) alv);
                }
            }
        }
        if (this.f12315f != null) {
            adm.mo11801a(6, this.f12315f.intValue());
        }
        super.mo11512a(adm);
    }
}

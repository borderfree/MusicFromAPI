package com.google.android.gms.internal.ads;

public final class abr extends adn<abr> {

    /* renamed from: a */
    private Long f11416a;

    /* renamed from: b */
    private Integer f11417b;

    /* renamed from: c */
    private Boolean f11418c;

    /* renamed from: d */
    private int[] f11419d;

    /* renamed from: e */
    private Long f11420e;

    public abr() {
        this.f11416a = null;
        this.f11417b = null;
        this.f11418c = null;
        this.f11419d = adv.f11569a;
        this.f11420e = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11416a != null) {
            a += adm.m15982d(1, this.f11416a.longValue());
        }
        if (this.f11417b != null) {
            a += adm.m15974b(2, this.f11417b.intValue());
        }
        if (this.f11418c != null) {
            this.f11418c.booleanValue();
            a += adm.m15973b(3) + 1;
        }
        if (this.f11419d != null && this.f11419d.length > 0) {
            int i = 0;
            for (int a2 : this.f11419d) {
                i += adm.m15966a(a2);
            }
            a = a + i + (this.f11419d.length * 1);
        }
        return this.f11420e != null ? a + adm.m15980c(5, this.f11420e.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11416a = Long.valueOf(adk.mo11797h());
            } else if (a == 16) {
                this.f11417b = Integer.valueOf(adk.mo11796g());
            } else if (a == 24) {
                this.f11418c = Boolean.valueOf(adk.mo11792d());
            } else if (a == 32) {
                int a2 = adv.m16022a(adk, 32);
                int length = this.f11419d == null ? 0 : this.f11419d.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11419d, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = adk.mo11796g();
                    adk.mo11782a();
                    length++;
                }
                iArr[length] = adk.mo11796g();
                this.f11419d = iArr;
            } else if (a == 34) {
                int c = adk.mo11790c(adk.mo11796g());
                int j = adk.mo11799j();
                int i = 0;
                while (adk.mo11798i() > 0) {
                    adk.mo11796g();
                    i++;
                }
                adk.mo11794e(j);
                int length2 = this.f11419d == null ? 0 : this.f11419d.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f11419d, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = adk.mo11796g();
                    length2++;
                }
                this.f11419d = iArr2;
                adk.mo11791d(c);
            } else if (a == 40) {
                this.f11420e = Long.valueOf(adk.mo11797h());
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11416a != null) {
            adm.mo11807b(1, this.f11416a.longValue());
        }
        if (this.f11417b != null) {
            adm.mo11801a(2, this.f11417b.intValue());
        }
        if (this.f11418c != null) {
            adm.mo11805a(3, this.f11418c.booleanValue());
        }
        if (this.f11419d != null && this.f11419d.length > 0) {
            for (int a : this.f11419d) {
                adm.mo11801a(4, a);
            }
        }
        if (this.f11420e != null) {
            adm.mo11802a(5, this.f11420e.longValue());
        }
        super.mo11512a(adm);
    }
}

package com.google.android.gms.internal.ads;

public final class aej extends adn<aej> {

    /* renamed from: a */
    public byte[][] f11638a;

    /* renamed from: b */
    public byte[] f11639b;

    /* renamed from: c */
    public Integer f11640c;

    /* renamed from: d */
    private Integer f11641d;

    public aej() {
        this.f11638a = adv.f11572d;
        this.f11639b = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aej mo11511a(adk adk) {
        int i;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = adv.m16022a(adk, 10);
                int length = this.f11638a == null ? 0 : this.f11638a.length;
                byte[][] bArr = new byte[(a2 + length)][];
                if (length != 0) {
                    System.arraycopy(this.f11638a, 0, bArr, 0, length);
                }
                while (length < bArr.length - 1) {
                    bArr[length] = adk.mo11795f();
                    adk.mo11782a();
                    length++;
                }
                bArr[length] = adk.mo11795f();
                this.f11638a = bArr;
            } else if (a == 18) {
                this.f11639b = adk.mo11795f();
            } else if (a == 24) {
                i = adk.mo11799j();
                this.f11641d = Integer.valueOf(C4080xx.m20346b(adk.mo11796g()));
            } else if (a == 32) {
                i = adk.mo11799j();
                try {
                    this.f11640c = Integer.valueOf(C4080xx.m20347c(adk.mo11796g()));
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
        if (this.f11638a != null && this.f11638a.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.f11638a) {
                if (bArr != null) {
                    i2++;
                    i += adm.m15978b(bArr);
                }
            }
            a = a + i + (i2 * 1);
        }
        if (this.f11639b != null) {
            a += adm.m15977b(2, this.f11639b);
        }
        if (this.f11641d != null) {
            a += adm.m15974b(3, this.f11641d.intValue());
        }
        return this.f11640c != null ? a + adm.m15974b(4, this.f11640c.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11638a != null && this.f11638a.length > 0) {
            for (byte[] bArr : this.f11638a) {
                if (bArr != null) {
                    adm.mo11806a(1, bArr);
                }
            }
        }
        if (this.f11639b != null) {
            adm.mo11806a(2, this.f11639b);
        }
        if (this.f11641d != null) {
            adm.mo11801a(3, this.f11641d.intValue());
        }
        if (this.f11640c != null) {
            adm.mo11801a(4, this.f11640c.intValue());
        }
        super.mo11512a(adm);
    }
}

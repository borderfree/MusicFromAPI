package com.google.android.gms.internal.ads;

public final class aln extends adn<aln> {

    /* renamed from: a */
    private Integer f12342a;

    /* renamed from: b */
    private int[] f12343b;

    public aln() {
        this.f12342a = null;
        this.f12343b = adv.f11569a;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aln mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = adk.mo11799j();
                try {
                    this.f12342a = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
                    mo11811a(adk, a);
                }
            } else if (a == 16) {
                int a2 = adv.m16022a(adk, 16);
                int length = this.f12343b == null ? 0 : this.f12343b.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f12343b, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = adk.mo11796g();
                    adk.mo11782a();
                    length++;
                }
                iArr[length] = adk.mo11796g();
                this.f12343b = iArr;
            } else if (a == 18) {
                int c = adk.mo11790c(adk.mo11796g());
                int j2 = adk.mo11799j();
                int i = 0;
                while (adk.mo11798i() > 0) {
                    adk.mo11796g();
                    i++;
                }
                adk.mo11794e(j2);
                int length2 = this.f12343b == null ? 0 : this.f12343b.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f12343b, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = adk.mo11796g();
                    length2++;
                }
                this.f12343b = iArr2;
                adk.mo11791d(c);
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12342a != null) {
            a += adm.m15974b(1, this.f12342a.intValue());
        }
        if (this.f12343b == null || this.f12343b.length <= 0) {
            return a;
        }
        int i = 0;
        for (int a2 : this.f12343b) {
            i += adm.m15966a(a2);
        }
        return a + i + (this.f12343b.length * 1);
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12342a != null) {
            adm.mo11801a(1, this.f12342a.intValue());
        }
        if (this.f12343b != null && this.f12343b.length > 0) {
            for (int a : this.f12343b) {
                adm.mo11801a(2, a);
            }
        }
        super.mo11512a(adm);
    }
}

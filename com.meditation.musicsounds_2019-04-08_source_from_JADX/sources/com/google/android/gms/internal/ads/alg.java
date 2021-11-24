package com.google.android.gms.internal.ads;

public final class alg extends adn<alg> {

    /* renamed from: a */
    private String f12302a;

    /* renamed from: b */
    private alf[] f12303b;

    /* renamed from: c */
    private Integer f12304c;

    public alg() {
        this.f12302a = null;
        this.f12303b = alf.m16478b();
        this.f12304c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alg mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f12302a = adk.mo11793e();
            } else if (a == 18) {
                int a2 = adv.m16022a(adk, 18);
                int length = this.f12303b == null ? 0 : this.f12303b.length;
                alf[] alfArr = new alf[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f12303b, 0, alfArr, 0, length);
                }
                while (length < alfArr.length - 1) {
                    alfArr[length] = new alf();
                    adk.mo11784a((C3401ads) alfArr[length]);
                    adk.mo11782a();
                    length++;
                }
                alfArr[length] = new alf();
                adk.mo11784a((C3401ads) alfArr[length]);
                this.f12303b = alfArr;
            } else if (a == 24) {
                int j = adk.mo11799j();
                try {
                    this.f12304c = Integer.valueOf(ald.m16472a(adk.mo11796g()));
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(j);
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
        if (this.f12302a != null) {
            a += adm.m15976b(1, this.f12302a);
        }
        if (this.f12303b != null && this.f12303b.length > 0) {
            for (alf alf : this.f12303b) {
                if (alf != null) {
                    a += adm.m15975b(2, (C3401ads) alf);
                }
            }
        }
        return this.f12304c != null ? a + adm.m15974b(3, this.f12304c.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12302a != null) {
            adm.mo11804a(1, this.f12302a);
        }
        if (this.f12303b != null && this.f12303b.length > 0) {
            for (alf alf : this.f12303b) {
                if (alf != null) {
                    adm.mo11803a(2, (C3401ads) alf);
                }
            }
        }
        if (this.f12304c != null) {
            adm.mo11801a(3, this.f12304c.intValue());
        }
        super.mo11512a(adm);
    }
}

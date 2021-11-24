package com.google.android.gms.internal.ads;

public final class aed extends adn<aed> {

    /* renamed from: a */
    public Integer f11620a;

    /* renamed from: b */
    public String f11621b;

    /* renamed from: c */
    public byte[] f11622c;

    public aed() {
        this.f11620a = null;
        this.f11621b = null;
        this.f11622c = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aed mo11511a(adk adk) {
        int c;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    c = adk.mo11789c();
                    if (c < 0 || c > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(c);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.f11620a = Integer.valueOf(c);
                    }
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(adk.mo11799j());
                    mo11811a(adk, a);
                }
            } else if (a == 18) {
                this.f11621b = adk.mo11793e();
            } else if (a == 26) {
                this.f11622c = adk.mo11795f();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(c);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11620a != null) {
            a += adm.m15974b(1, this.f11620a.intValue());
        }
        if (this.f11621b != null) {
            a += adm.m15976b(2, this.f11621b);
        }
        return this.f11622c != null ? a + adm.m15977b(3, this.f11622c) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11620a != null) {
            adm.mo11801a(1, this.f11620a.intValue());
        }
        if (this.f11621b != null) {
            adm.mo11804a(2, this.f11621b);
        }
        if (this.f11622c != null) {
            adm.mo11806a(3, this.f11622c);
        }
        super.mo11512a(adm);
    }
}

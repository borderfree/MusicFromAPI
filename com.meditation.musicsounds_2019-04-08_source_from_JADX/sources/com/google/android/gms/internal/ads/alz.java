package com.google.android.gms.internal.ads;

public final class alz extends adn<alz> {

    /* renamed from: a */
    private Integer f12397a;

    public alz() {
        this.f12397a = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final alz mo11511a(adk adk) {
        int g;
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    g = adk.mo11796g();
                    if (g < 0 || g > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(g);
                        sb.append(" is not a valid enum VideoErrorCode");
                    } else {
                        this.f12397a = Integer.valueOf(g);
                    }
                } catch (IllegalArgumentException unused) {
                    adk.mo11794e(adk.mo11799j());
                    mo11811a(adk, a);
                }
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(g);
        sb2.append(" is not a valid enum VideoErrorCode");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        return this.f12397a != null ? a + adm.m15974b(1, this.f12397a.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12397a != null) {
            adm.mo11801a(1, this.f12397a.intValue());
        }
        super.mo11512a(adm);
    }
}

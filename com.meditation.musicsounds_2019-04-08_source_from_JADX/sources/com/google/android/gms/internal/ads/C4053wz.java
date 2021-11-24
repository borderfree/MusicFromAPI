package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wz */
public final class C4053wz extends adn<C4053wz> {

    /* renamed from: a */
    public String f15017a;

    /* renamed from: b */
    private String f15018b;

    /* renamed from: c */
    private String f15019c;

    /* renamed from: d */
    private String f15020d;

    /* renamed from: e */
    private String f15021e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f15017a != null) {
            a += adm.m15976b(1, this.f15017a);
        }
        if (this.f15018b != null) {
            a += adm.m15976b(2, this.f15018b);
        }
        if (this.f15019c != null) {
            a += adm.m15976b(3, this.f15019c);
        }
        if (this.f15020d != null) {
            a += adm.m15976b(4, this.f15020d);
        }
        return this.f15021e != null ? a + adm.m15976b(5, this.f15021e) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3401ads mo11511a(adk adk) {
        while (true) {
            int a = adk.mo11782a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15017a = adk.mo11793e();
            } else if (a == 18) {
                this.f15018b = adk.mo11793e();
            } else if (a == 26) {
                this.f15019c = adk.mo11793e();
            } else if (a == 34) {
                this.f15020d = adk.mo11793e();
            } else if (a == 42) {
                this.f15021e = adk.mo11793e();
            } else if (!super.mo11811a(adk, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f15017a != null) {
            adm.mo11804a(1, this.f15017a);
        }
        if (this.f15018b != null) {
            adm.mo11804a(2, this.f15018b);
        }
        if (this.f15019c != null) {
            adm.mo11804a(3, this.f15019c);
        }
        if (this.f15020d != null) {
            adm.mo11804a(4, this.f15020d);
        }
        if (this.f15021e != null) {
            adm.mo11804a(5, this.f15021e);
        }
        super.mo11512a(adm);
    }
}

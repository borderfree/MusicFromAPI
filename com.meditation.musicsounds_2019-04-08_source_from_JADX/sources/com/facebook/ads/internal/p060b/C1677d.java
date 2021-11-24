package com.facebook.ads.internal.p060b;

import android.os.Bundle;

/* renamed from: com.facebook.ads.internal.b.d */
public class C1677d {

    /* renamed from: a */
    private C1675c f5502a;

    /* renamed from: b */
    private final C1675c f5503b;

    /* renamed from: c */
    private final C1674b f5504c;

    /* renamed from: d */
    private boolean f5505d = false;

    /* renamed from: e */
    private boolean f5506e = false;

    /* renamed from: f */
    private boolean f5507f = false;

    public C1677d(C1674b bVar) {
        this.f5504c = bVar;
        this.f5503b = new C1675c(bVar.f5485a);
        this.f5502a = new C1675c(bVar.f5485a);
    }

    public C1677d(C1674b bVar, Bundle bundle) {
        this.f5504c = bVar;
        this.f5503b = (C1675c) bundle.getSerializable("testStats");
        this.f5502a = (C1675c) bundle.getSerializable("viewableStats");
        this.f5505d = bundle.getBoolean("ended");
        this.f5506e = bundle.getBoolean("passed");
        this.f5507f = bundle.getBoolean("complete");
    }

    /* renamed from: b */
    private void m8397b() {
        this.f5506e = true;
        m8398c();
    }

    /* renamed from: c */
    private void m8398c() {
        this.f5507f = true;
        m8399d();
    }

    /* renamed from: d */
    private void m8399d() {
        this.f5505d = true;
        this.f5504c.mo6794a(this.f5507f, this.f5506e, this.f5506e ? this.f5502a : this.f5503b);
    }

    /* renamed from: a */
    public void mo6810a() {
        if (!this.f5505d) {
            this.f5502a.mo6797b();
        }
    }

    /* renamed from: a */
    public void mo6811a(double d, double d2) {
        if (!this.f5505d) {
            this.f5503b.mo6796a(d, d2);
            this.f5502a.mo6796a(d, d2);
            double h = this.f5504c.f5488d ? this.f5502a.mo6799c().mo6809h() : this.f5502a.mo6799c().mo6808g();
            if (this.f5504c.f5486b < 0.0d || this.f5503b.mo6799c().mo6807f() <= this.f5504c.f5486b || h != 0.0d) {
                if (h >= this.f5504c.f5487c) {
                    m8397b();
                }
                return;
            }
            m8398c();
        }
    }
}

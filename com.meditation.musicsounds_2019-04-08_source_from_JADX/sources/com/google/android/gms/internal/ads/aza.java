package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3266s;

public final class aza extends C3769np<axx> {

    /* renamed from: a */
    private final Object f13366a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3685km<axx> f13367b;

    /* renamed from: c */
    private boolean f13368c;

    /* renamed from: d */
    private int f13369d;

    public aza(C3685km<axx> kmVar) {
        this.f13367b = kmVar;
        this.f13368c = false;
        this.f13369d = 0;
    }

    /* renamed from: f */
    private final void m17692f() {
        synchronized (this.f13366a) {
            C3266s.m14919a(this.f13369d >= 0);
            if (!this.f13368c || this.f13369d != 0) {
                C3643iy.m18780a("There are still references to the engine. Not destroying.");
            } else {
                C3643iy.m18780a("No reference is left (including root). Cleaning up engine.");
                mo13301a(new azd(this), new C3767nn());
            }
        }
    }

    /* renamed from: c */
    public final ayw mo12640c() {
        ayw ayw = new ayw(this);
        synchronized (this.f13366a) {
            mo13301a(new azb(this, ayw), new azc(this, ayw));
            C3266s.m14919a(this.f13369d >= 0);
            this.f13369d++;
        }
        return ayw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo12641d() {
        synchronized (this.f13366a) {
            C3266s.m14919a(this.f13369d > 0);
            C3643iy.m18780a("Releasing 1 reference for JS Engine");
            this.f13369d--;
            m17692f();
        }
    }

    /* renamed from: e */
    public final void mo12642e() {
        synchronized (this.f13366a) {
            C3266s.m14919a(this.f13369d >= 0);
            C3643iy.m18780a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f13368c = true;
            m17692f();
        }
    }
}

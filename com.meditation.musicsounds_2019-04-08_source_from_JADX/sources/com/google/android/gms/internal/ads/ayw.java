package com.google.android.gms.internal.ads;

public final class ayw extends C3769np<azg> {

    /* renamed from: a */
    private final Object f13358a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final aza f13359b;

    /* renamed from: c */
    private boolean f13360c;

    public ayw(aza aza) {
        this.f13359b = aza;
    }

    /* renamed from: c */
    public final void mo12638c() {
        synchronized (this.f13358a) {
            if (!this.f13360c) {
                this.f13360c = true;
                mo13301a(new ayx(this), new C3767nn());
                mo13301a(new ayy(this), new ayz(this));
            }
        }
    }
}

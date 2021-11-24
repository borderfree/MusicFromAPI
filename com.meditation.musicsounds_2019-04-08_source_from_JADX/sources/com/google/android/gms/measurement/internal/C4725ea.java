package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ea */
abstract class C4725ea extends C4723dz {

    /* renamed from: b */
    private boolean f17006b;

    C4725ea(C4726eb ebVar) {
        super(ebVar);
        this.f17003a.mo15529a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo15307e();

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo15524j() {
        return this.f17006b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo15525k() {
        if (!mo15524j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: v */
    public final void mo15526v() {
        if (!this.f17006b) {
            mo15307e();
            this.f17003a.mo15556o();
            this.f17006b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}

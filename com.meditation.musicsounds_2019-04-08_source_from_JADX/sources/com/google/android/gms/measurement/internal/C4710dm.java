package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dm */
abstract class C4710dm extends C4687cq {

    /* renamed from: a */
    private boolean f16977a;

    C4710dm(C4638av avVar) {
        super(avVar);
        this.f16825q.mo15333a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final boolean mo15502D() {
        return this.f16977a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo15503E() {
        if (!mo15502D()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: F */
    public final void mo15504F() {
        if (this.f16977a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo15423v()) {
            this.f16825q.mo15329G();
            this.f16977a = true;
        }
    }

    /* renamed from: G */
    public final void mo15505G() {
        if (!this.f16977a) {
            mo15506w();
            this.f16825q.mo15329G();
            this.f16977a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract boolean mo15423v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo15506w() {
    }
}

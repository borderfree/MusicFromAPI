package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bs */
abstract class C4662bs extends C4661br {

    /* renamed from: a */
    private boolean f16826a;

    C4662bs(C4638av avVar) {
        super(avVar);
        this.f16825q.mo15332a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo15395A() {
        if (!mo15398z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: B */
    public final void mo15396B() {
        if (this.f16826a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo15271e()) {
            this.f16825q.mo15329G();
            this.f16826a = true;
        }
    }

    /* renamed from: C */
    public final void mo15397C() {
        if (!this.f16826a) {
            mo15272f();
            this.f16825q.mo15329G();
            this.f16826a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo15271e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo15272f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final boolean mo15398z() {
        return this.f16826a;
    }
}

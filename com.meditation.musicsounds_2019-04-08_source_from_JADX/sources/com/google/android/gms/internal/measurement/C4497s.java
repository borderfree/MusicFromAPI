package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s */
public abstract class C4497s extends C4496r {

    /* renamed from: a */
    private boolean f16365a;

    protected C4497s(C4499u uVar) {
        super(uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10611a();

    /* renamed from: w */
    public final boolean mo14839w() {
        return this.f16365a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14840x() {
        if (!mo14839w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void mo14841y() {
        mo10611a();
        this.f16365a = true;
    }
}

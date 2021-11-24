package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.iw */
public abstract class C4483iw {

    /* renamed from: M */
    protected volatile int f16326M = -1;

    /* renamed from: a */
    public abstract C4483iw mo14223a(C4475io ioVar);

    /* renamed from: a */
    public void mo14224a(C4477iq iqVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo14225b() {
        return 0;
    }

    /* renamed from: c */
    public C4483iw clone() {
        return (C4483iw) super.clone();
    }

    /* renamed from: d */
    public final int mo14783d() {
        if (this.f16326M < 0) {
            mo14784e();
        }
        return this.f16326M;
    }

    /* renamed from: e */
    public final int mo14784e() {
        int b = mo14225b();
        this.f16326M = b;
        return b;
    }

    public String toString() {
        return C4484ix.m22278a(this);
    }
}

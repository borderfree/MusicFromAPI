package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4478ir;

/* renamed from: com.google.android.gms.internal.measurement.ir */
public abstract class C4478ir<M extends C4478ir<M>> extends C4483iw {

    /* renamed from: L */
    protected C4480it f16310L;

    /* renamed from: a */
    public void mo14224a(C4477iq iqVar) {
        if (this.f16310L != null) {
            for (int i = 0; i < this.f16310L.mo14769a(); i++) {
                this.f16310L.mo14772b(i).mo14778a(iqVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14761a(C4475io ioVar, int i) {
        int i2 = ioVar.mo14725i();
        if (!ioVar.mo14715b(i)) {
            return false;
        }
        int i3 = i >>> 3;
        C4485iy iyVar = new C4485iy(i, ioVar.mo14712a(i2, ioVar.mo14725i() - i2));
        C4481iu iuVar = null;
        if (this.f16310L == null) {
            this.f16310L = new C4480it();
        } else {
            iuVar = this.f16310L.mo14770a(i3);
        }
        if (iuVar == null) {
            iuVar = new C4481iu();
            this.f16310L.mo14771a(i3, iuVar);
        }
        iuVar.mo14779a(iyVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo14225b() {
        if (this.f16310L == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f16310L.mo14769a(); i2++) {
            i += this.f16310L.mo14772b(i2).mo14777a();
        }
        return i;
    }

    /* renamed from: c */
    public final /* synthetic */ C4483iw mo14762c() {
        return (C4478ir) clone();
    }

    public /* synthetic */ Object clone() {
        C4478ir irVar = (C4478ir) super.clone();
        C4482iv.m22268a(this, irVar);
        return irVar;
    }
}

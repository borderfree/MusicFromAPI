package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cp */
final class C4686cp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f16898a;

    /* renamed from: b */
    private final /* synthetic */ C4684cn f16899b;

    /* renamed from: c */
    private final /* synthetic */ C4684cn f16900c;

    /* renamed from: d */
    private final /* synthetic */ C4685co f16901d;

    C4686cp(C4685co coVar, boolean z, C4684cn cnVar, C4684cn cnVar2) {
        this.f16901d = coVar;
        this.f16898a = z;
        this.f16899b = cnVar;
        this.f16900c = cnVar2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.f16901d.mo15255t().mo15760t(this.f16901d.mo15242g().mo15825x())) {
            z = this.f16898a && this.f16901d.f16892a != null;
            if (z) {
                this.f16901d.m23214a(this.f16901d.f16892a, true);
            }
        } else {
            if (this.f16898a && this.f16901d.f16892a != null) {
                this.f16901d.m23214a(this.f16901d.f16892a, true);
            }
            z = false;
        }
        if (this.f16899b == null || this.f16899b.f16890c != this.f16900c.f16890c || !C4736ek.m23540c(this.f16899b.f16889b, this.f16900c.f16889b) || !C4736ek.m23540c(this.f16899b.f16888a, this.f16900c.f16888a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            C4685co.m23213a(this.f16900c, bundle, true);
            if (this.f16899b != null) {
                if (this.f16899b.f16888a != null) {
                    bundle.putString("_pn", this.f16899b.f16888a);
                }
                bundle.putString("_pc", this.f16899b.f16889b);
                bundle.putLong("_pi", this.f16899b.f16890c);
            }
            if (this.f16901d.mo15255t().mo15760t(this.f16901d.mo15242g().mo15825x()) && z) {
                long y = this.f16901d.mo15246k().mo15513y();
                if (y > 0) {
                    this.f16901d.mo15251p().mo15585a(bundle, y);
                }
            }
            this.f16901d.mo15241f().mo15421b("auto", "_vs", bundle);
        }
        this.f16901d.f16892a = this.f16900c;
        this.f16901d.mo15243h().mo15457a(this.f16900c);
    }
}

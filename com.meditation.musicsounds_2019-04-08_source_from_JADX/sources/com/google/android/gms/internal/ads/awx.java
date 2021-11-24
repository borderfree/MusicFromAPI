package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Random;

final class awx extends anl {

    /* renamed from: a */
    private final ank f13241a;

    awx(ank ank) {
        this.f13241a = ank;
    }

    /* renamed from: a */
    public final void mo12090a() {
        if (axg.m17601a()) {
            int intValue = ((Integer) ane.m16650f().mo12297a(aqm.f12715bb)).intValue();
            int intValue2 = ((Integer) ane.m16650f().mo12297a(aqm.f12716bc)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                zzbv.zzex().mo12558a();
            } else {
                C3653jh.f14275a.postDelayed(awy.f13242a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.f13241a.mo12090a();
    }

    /* renamed from: a */
    public final void mo12091a(int i) {
        this.f13241a.mo12091a(i);
    }

    /* renamed from: b */
    public final void mo12092b() {
        this.f13241a.mo12092b();
    }

    /* renamed from: c */
    public final void mo12093c() {
        this.f13241a.mo12093c();
    }

    /* renamed from: d */
    public final void mo12094d() {
        this.f13241a.mo12094d();
    }

    /* renamed from: e */
    public final void mo12095e() {
        this.f13241a.mo12095e();
    }

    /* renamed from: f */
    public final void mo12096f() {
        this.f13241a.mo12096f();
    }
}

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.p019g.C0488a;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C4616a extends C4687cq {

    /* renamed from: a */
    private final Map<String, Long> f16630a = new C0488a();

    /* renamed from: b */
    private final Map<String, Integer> f16631b = new C0488a();

    /* renamed from: c */
    private long f16632c;

    public C4616a(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: a */
    private final void m22895a(long j, C4684cn cnVar) {
        if (cnVar == null) {
            mo15253r().mo15855x().mo15858a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo15253r().mo15855x().mo15859a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C4685co.m23213a(cnVar, bundle, true);
            mo15241f().mo15413a("am", "_xa", bundle);
        }
    }

    /* renamed from: a */
    private final void m22898a(String str, long j, C4684cn cnVar) {
        if (cnVar == null) {
            mo15253r().mo15855x().mo15858a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo15253r().mo15855x().mo15859a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C4685co.m23213a(cnVar, bundle, true);
            mo15241f().mo15413a("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22899b(long j) {
        for (String put : this.f16630a.keySet()) {
            this.f16630a.put(put, Long.valueOf(j));
        }
        if (!this.f16630a.isEmpty()) {
            this.f16632c = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m22901c(String str, long j) {
        mo15236b();
        mo15239d();
        C3266s.m14915a(str);
        if (this.f16631b.isEmpty()) {
            this.f16632c = j;
        }
        Integer num = (Integer) this.f16631b.get(str);
        if (num != null) {
            this.f16631b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f16631b.size() >= 100) {
            mo15253r().mo15849i().mo15858a("Too many ads visible");
        } else {
            this.f16631b.put(str, Integer.valueOf(1));
            this.f16630a.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m22902d(String str, long j) {
        mo15236b();
        mo15239d();
        C3266s.m14915a(str);
        Integer num = (Integer) this.f16631b.get(str);
        if (num != null) {
            C4684cn x = mo15244i().mo15450x();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f16631b.remove(str);
                Long l = (Long) this.f16630a.get(str);
                if (l == null) {
                    mo15253r().mo15852u_().mo15858a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f16630a.remove(str);
                    m22898a(str, longValue, x);
                }
                if (this.f16631b.isEmpty()) {
                    if (this.f16632c == 0) {
                        mo15253r().mo15852u_().mo15858a("First ad exposure time was never set");
                        return;
                    } else {
                        m22895a(j - this.f16632c, x);
                        this.f16632c = 0;
                    }
                }
                return;
            }
            this.f16631b.put(str, Integer.valueOf(intValue));
            return;
        }
        mo15253r().mo15852u_().mo15859a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final void mo15234a(long j) {
        C4684cn x = mo15244i().mo15450x();
        for (String str : this.f16630a.keySet()) {
            m22898a(str, j - ((Long) this.f16630a.get(str)).longValue(), x);
        }
        if (!this.f16630a.isEmpty()) {
            m22895a(j - this.f16632c, x);
        }
        m22899b(j);
    }

    /* renamed from: a */
    public final void mo15235a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo15253r().mo15852u_().mo15858a("Ad unit id must be a non-empty string");
        } else {
            mo15252q().mo15314a((Runnable) new C4775z(this, str, j));
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: b */
    public final void mo15237b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo15253r().mo15852u_().mo15858a("Ad unit id must be a non-empty string");
        } else {
            mo15252q().mo15314a((Runnable) new C4642az(this, str, j));
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4616a mo15240e() {
        return super.mo15240e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4672cb mo15241f() {
        return super.mo15241f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4761l mo15242g() {
        return super.mo15242g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4689cs mo15243h() {
        return super.mo15243h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4685co mo15244i() {
        return super.mo15244i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C4763n mo15245j() {
        return super.mo15245j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C4714dq mo15246k() {
        return super.mo15246k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}

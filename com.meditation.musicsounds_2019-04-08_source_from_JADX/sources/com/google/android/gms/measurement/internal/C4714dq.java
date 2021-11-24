package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.internal.measurement.C4292cd;

/* renamed from: com.google.android.gms.measurement.internal.dq */
public final class C4714dq extends C4710dm {

    /* renamed from: a */
    private Handler f16983a;

    /* renamed from: b */
    private long f16984b = mo15248m().mo11327b();

    /* renamed from: c */
    private long f16985c = this.f16984b;

    /* renamed from: d */
    private final C4753fa f16986d = new C4715dr(this, this.f16825q);

    /* renamed from: e */
    private final C4753fa f16987e = new C4716ds(this, this.f16825q);

    /* renamed from: f */
    private final C4753fa f16988f = new C4717dt(this, this.f16825q);

    C4714dq(C4638av avVar) {
        super(avVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m23342A() {
        mo15239d();
        mo15511a(false, false);
        mo15240e().mo15234a(mo15248m().mo11327b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23345b(long j) {
        mo15239d();
        m23349z();
        mo15253r().mo15855x().mo15859a("Activity resumed, time", Long.valueOf(j));
        this.f16984b = j;
        this.f16985c = this.f16984b;
        if (mo15255t().mo15758r(mo15242g().mo15825x())) {
            mo15509a(mo15248m().mo11326a());
            return;
        }
        this.f16986d.mo15815c();
        this.f16987e.mo15815c();
        if (mo15255t().mo15756p(mo15242g().mo15825x()) || mo15255t().mo15757q(mo15242g().mo15825x())) {
            this.f16988f.mo15815c();
        }
        if (mo15254s().mo15264a(mo15248m().mo11326a())) {
            mo15254s().f16657m.mo15281a(true);
            mo15254s().f16659o.mo15284a(0);
        }
        if (mo15254s().f16657m.mo15282a()) {
            this.f16986d.mo15813a(Math.max(0, mo15254s().f16655k.mo15283a() - mo15254s().f16659o.mo15283a()));
        } else {
            this.f16987e.mo15813a(Math.max(0, 3600000 - mo15254s().f16659o.mo15283a()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23347c(long j) {
        mo15239d();
        m23349z();
        this.f16986d.mo15815c();
        this.f16987e.mo15815c();
        if (mo15255t().mo15756p(mo15242g().mo15825x()) || mo15255t().mo15757q(mo15242g().mo15825x())) {
            this.f16988f.mo15815c();
            this.f16988f.mo15813a(mo15254s().f16656l.mo15283a());
        }
        mo15253r().mo15855x().mo15859a("Activity paused, time", Long.valueOf(j));
        if (this.f16984b != 0) {
            mo15254s().f16659o.mo15284a(mo15254s().f16659o.mo15283a() + (j - this.f16984b));
        }
    }

    /* renamed from: d */
    private final void m23348d(long j) {
        mo15239d();
        mo15253r().mo15855x().mo15859a("Session started, time", Long.valueOf(mo15248m().mo11327b()));
        Long l = null;
        Long valueOf = mo15255t().mo15756p(mo15242g().mo15825x()) ? Long.valueOf(j / 1000) : null;
        if (mo15255t().mo15757q(mo15242g().mo15825x())) {
            l = Long.valueOf(-1);
        }
        long j2 = j;
        mo15241f().mo15415a("auto", "_sid", (Object) valueOf, j2);
        mo15241f().mo15415a("auto", "_sno", (Object) l, j2);
        mo15254s().f16657m.mo15281a(false);
        Bundle bundle = new Bundle();
        if (mo15255t().mo15756p(mo15242g().mo15825x())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        mo15241f().mo15412a("auto", "_s", j, bundle);
        mo15254s().f16658n.mo15284a(j);
    }

    /* renamed from: z */
    private final void m23349z() {
        synchronized (this) {
            if (this.f16983a == null) {
                this.f16983a = new C4292cd(Looper.getMainLooper());
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15509a(long j) {
        mo15239d();
        m23349z();
        mo15510a(j, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15510a(long j, boolean z) {
        mo15239d();
        m23349z();
        this.f16986d.mo15815c();
        this.f16987e.mo15815c();
        if (mo15255t().mo15756p(mo15242g().mo15825x()) || mo15255t().mo15757q(mo15242g().mo15825x())) {
            this.f16988f.mo15815c();
        }
        if (mo15254s().mo15264a(j)) {
            mo15254s().f16657m.mo15281a(true);
            mo15254s().f16659o.mo15284a(0);
        }
        if (mo15254s().f16657m.mo15282a()) {
            m23348d(j);
            return;
        }
        this.f16987e.mo15813a(Math.max(0, 3600000 - mo15254s().f16659o.mo15283a()));
        if (z && mo15255t().mo15759s(mo15242g().mo15825x())) {
            mo15254s().f16658n.mo15284a(j);
            if (mo15255t().mo15756p(mo15242g().mo15825x()) || mo15255t().mo15757q(mo15242g().mo15825x())) {
                this.f16988f.mo15815c();
                this.f16988f.mo15813a(mo15254s().f16656l.mo15283a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0094, code lost:
        if (r10 == false) goto L_0x0096;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15511a(boolean r9, boolean r10) {
        /*
            r8 = this;
            r8.mo15239d()
            r8.mo15503E()
            com.google.android.gms.common.util.e r0 = r8.mo15248m()
            long r0 = r0.mo11327b()
            com.google.android.gms.measurement.internal.ad r2 = r8.mo15254s()
            com.google.android.gms.measurement.internal.ag r2 = r2.f16658n
            com.google.android.gms.common.util.e r3 = r8.mo15248m()
            long r3 = r3.mo11326a()
            r2.mo15284a(r3)
            long r2 = r8.f16984b
            long r2 = r0 - r2
            if (r9 != 0) goto L_0x003e
            r4 = 1000(0x3e8, double:4.94E-321)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x003e
            com.google.android.gms.measurement.internal.r r9 = r8.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15855x()
            java.lang.String r10 = "Screen exposed for less than 1000 ms. Event not sent. time"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r9.mo15859a(r10, r0)
            r9 = 0
            return r9
        L_0x003e:
            com.google.android.gms.measurement.internal.ad r9 = r8.mo15254s()
            com.google.android.gms.measurement.internal.ag r9 = r9.f16659o
            r9.mo15284a(r2)
            com.google.android.gms.measurement.internal.r r9 = r8.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15855x()
            java.lang.String r4 = "Recording user engagement, ms"
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r9.mo15859a(r4, r5)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r4 = "_et"
            r9.putLong(r4, r2)
            com.google.android.gms.measurement.internal.co r2 = r8.mo15244i()
            com.google.android.gms.measurement.internal.cn r2 = r2.mo15450x()
            r3 = 1
            com.google.android.gms.measurement.internal.C4685co.m23213a(r2, r9, r3)
            com.google.android.gms.measurement.internal.es r2 = r8.mo15255t()
            com.google.android.gms.measurement.internal.l r4 = r8.mo15242g()
            java.lang.String r4 = r4.mo15825x()
            boolean r2 = r2.mo15760t(r4)
            if (r2 == 0) goto L_0x00a3
            com.google.android.gms.measurement.internal.es r2 = r8.mo15255t()
            com.google.android.gms.measurement.internal.l r4 = r8.mo15242g()
            java.lang.String r4 = r4.mo15825x()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C4756h.f17153ao
            boolean r2 = r2.mo15740d(r4, r5)
            if (r2 == 0) goto L_0x009a
            if (r10 != 0) goto L_0x00a3
        L_0x0096:
            r8.mo15513y()
            goto L_0x00a3
        L_0x009a:
            if (r10 == 0) goto L_0x0096
            java.lang.String r2 = "_fr"
            r4 = 1
            r9.putLong(r2, r4)
        L_0x00a3:
            com.google.android.gms.measurement.internal.es r2 = r8.mo15255t()
            com.google.android.gms.measurement.internal.l r4 = r8.mo15242g()
            java.lang.String r4 = r4.mo15825x()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C4756h.f17153ao
            boolean r2 = r2.mo15740d(r4, r5)
            if (r2 == 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00c4
        L_0x00b9:
            com.google.android.gms.measurement.internal.cb r10 = r8.mo15241f()
            java.lang.String r2 = "auto"
            java.lang.String r4 = "_e"
            r10.mo15413a(r2, r4, r9)
        L_0x00c4:
            r8.f16984b = r0
            com.google.android.gms.measurement.internal.fa r9 = r8.f16987e
            r9.mo15815c()
            com.google.android.gms.measurement.internal.fa r9 = r8.f16987e
            r0 = 0
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.measurement.internal.ad r10 = r8.mo15254s()
            com.google.android.gms.measurement.internal.ag r10 = r10.f16659o
            long r6 = r10.mo15283a()
            long r4 = r4 - r6
            long r0 = java.lang.Math.max(r0, r4)
            r9.mo15813a(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4714dq.mo15511a(boolean, boolean):boolean");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
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

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo15423v() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo15512x() {
        mo15239d();
        m23348d(mo15248m().mo11326a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final long mo15513y() {
        long b = mo15248m().mo11327b();
        long j = b - this.f16985c;
        this.f16985c = b;
        return j;
    }
}

package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C2952p;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.internal.measurement.l */
public final class C4490l extends C4497s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4241ag f16352a;

    public C4490l(C4499u uVar, C4501w wVar) {
        super(uVar);
        C3266s.m14913a(wVar);
        this.f16352a = new C4241ag(uVar, wVar);
    }

    /* renamed from: a */
    public final long mo14793a(C4502x xVar) {
        mo14840x();
        C3266s.m14913a(xVar);
        C2952p.m13827d();
        long a = this.f16352a.mo14122a(xVar, true);
        if (a == 0) {
            this.f16352a.mo14126a(xVar);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        this.f16352a.mo14841y();
    }

    /* renamed from: a */
    public final void mo14794a(int i) {
        mo14840x();
        mo14812b("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        mo14829l().mo10647a((Runnable) new C4491m(this, i));
    }

    /* renamed from: a */
    public final void mo14795a(C4259ay ayVar) {
        mo14840x();
        mo14829l().mo10647a((Runnable) new C4495q(this, ayVar));
    }

    /* renamed from: a */
    public final void mo14796a(C4267bf bfVar) {
        C3266s.m14913a(bfVar);
        mo14840x();
        mo14812b("Hit delivery requested", bfVar);
        mo14829l().mo10647a((Runnable) new C4494p(this, bfVar));
    }

    /* renamed from: a */
    public final void mo14797a(String str, Runnable runnable) {
        C3266s.m14916a(str, (Object) "campaign param can't be empty");
        mo14829l().mo10647a((Runnable) new C4493o(this, str, runnable));
    }

    /* renamed from: b */
    public final void mo14798b() {
        this.f16352a.mo14128b();
    }

    /* renamed from: c */
    public final void mo14799c() {
        mo14840x();
        Context i = mo14826i();
        if (!C4279br.m21111a(i) || !C4280bs.m21114a(i)) {
            mo14795a((C4259ay) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(i, "com.google.android.gms.analytics.AnalyticsService"));
        i.startService(intent);
    }

    /* renamed from: d */
    public final void mo14800d() {
        mo14840x();
        C2952p.m13827d();
        C4241ag agVar = this.f16352a;
        C2952p.m13827d();
        agVar.mo14840x();
        agVar.mo14811b("Service disconnected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo14801e() {
        C2952p.m13827d();
        this.f16352a.mo14131e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo14802f() {
        C2952p.m13827d();
        this.f16352a.mo14130d();
    }
}

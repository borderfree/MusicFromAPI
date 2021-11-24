package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.p019g.C0488a;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.co */
public final class C4685co extends C4710dm {

    /* renamed from: a */
    protected C4684cn f16892a;

    /* renamed from: b */
    private volatile C4684cn f16893b;

    /* renamed from: c */
    private C4684cn f16894c;

    /* renamed from: d */
    private final Map<Activity, C4684cn> f16895d = new C0488a();

    /* renamed from: e */
    private C4684cn f16896e;

    /* renamed from: f */
    private String f16897f;

    public C4685co(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: a */
    private static String m23211a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: a */
    private final void m23212a(Activity activity, C4684cn cnVar, boolean z) {
        C4684cn cnVar2 = this.f16893b == null ? this.f16894c : this.f16893b;
        if (cnVar.f16889b == null) {
            cnVar = new C4684cn(cnVar.f16888a, m23211a(activity.getClass().getCanonicalName()), cnVar.f16890c);
        }
        this.f16894c = this.f16893b;
        this.f16893b = cnVar;
        mo15252q().mo15314a((Runnable) new C4686cp(this, z, cnVar2, cnVar));
    }

    /* renamed from: a */
    public static void m23213a(C4684cn cnVar, Bundle bundle, boolean z) {
        if (bundle == null || cnVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && cnVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
            return;
        }
        if (cnVar.f16888a != null) {
            bundle.putString("_sn", cnVar.f16888a);
        } else {
            bundle.remove("_sn");
        }
        bundle.putString("_sc", cnVar.f16889b);
        bundle.putLong("_si", cnVar.f16890c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23214a(C4684cn cnVar, boolean z) {
        mo15240e().mo15234a(mo15248m().mo11327b());
        if (mo15246k().mo15511a(cnVar.f16891d, z)) {
            cnVar.f16891d = false;
        }
    }

    /* renamed from: d */
    private final C4684cn m23216d(Activity activity) {
        C3266s.m14913a(activity);
        C4684cn cnVar = (C4684cn) this.f16895d.get(activity);
        if (cnVar != null) {
            return cnVar;
        }
        C4684cn cnVar2 = new C4684cn(null, m23211a(activity.getClass().getCanonicalName()), mo15251p().mo15598g());
        this.f16895d.put(activity, cnVar2);
        return cnVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final void mo15443a(Activity activity) {
        m23212a(activity, m23216d(activity), false);
        C4616a e = mo15240e();
        e.mo15252q().mo15314a((Runnable) new C4671ca(e, e.mo15248m().mo11327b()));
    }

    /* renamed from: a */
    public final void mo15444a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f16895d.put(activity, new C4684cn(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    /* renamed from: a */
    public final void mo15445a(Activity activity, String str, String str2) {
        if (this.f16893b == null) {
            mo15253r().mo15849i().mo15858a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f16895d.get(activity) == null) {
            mo15253r().mo15849i().mo15858a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m23211a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f16893b.f16889b.equals(str2);
            boolean c = C4736ek.m23540c(this.f16893b.f16888a, str);
            if (equals && c) {
                mo15253r().mo15851k().mo15858a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo15253r().mo15849i().mo15859a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo15253r().mo15855x().mo15860a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C4684cn cnVar = new C4684cn(str, str2, mo15251p().mo15598g());
                this.f16895d.put(activity, cnVar);
                m23212a(activity, cnVar, true);
            } else {
                mo15253r().mo15849i().mo15859a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: a */
    public final void mo15446a(String str, C4684cn cnVar) {
        mo15239d();
        synchronized (this) {
            if (this.f16897f == null || this.f16897f.equals(str) || cnVar != null) {
                this.f16897f = str;
                this.f16896e = cnVar;
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: b */
    public final void mo15447b(Activity activity) {
        C4684cn d = m23216d(activity);
        this.f16894c = this.f16893b;
        this.f16893b = null;
        mo15252q().mo15314a((Runnable) new C4688cr(this, d));
    }

    /* renamed from: b */
    public final void mo15448b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            C4684cn cnVar = (C4684cn) this.f16895d.get(activity);
            if (cnVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", cnVar.f16890c);
                bundle2.putString("name", cnVar.f16888a);
                bundle2.putString("referrer_name", cnVar.f16889b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: c */
    public final void mo15449c(Activity activity) {
        this.f16895d.remove(activity);
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

    /* renamed from: x */
    public final C4684cn mo15450x() {
        mo15503E();
        mo15239d();
        return this.f16892a;
    }

    /* renamed from: y */
    public final C4684cn mo15451y() {
        mo15236b();
        return this.f16893b;
    }
}

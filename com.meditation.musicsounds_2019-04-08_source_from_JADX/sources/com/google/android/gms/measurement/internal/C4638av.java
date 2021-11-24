package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C3139e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3303h;
import com.google.android.gms.internal.measurement.C4333dr;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.av */
public class C4638av implements C4663bt {

    /* renamed from: a */
    private static volatile C4638av f16727a;

    /* renamed from: A */
    private long f16728A;

    /* renamed from: B */
    private volatile Boolean f16729B;

    /* renamed from: C */
    private Boolean f16730C;

    /* renamed from: D */
    private Boolean f16731D;

    /* renamed from: E */
    private int f16732E;

    /* renamed from: F */
    private AtomicInteger f16733F = new AtomicInteger(0);

    /* renamed from: G */
    private final long f16734G;

    /* renamed from: b */
    private final Context f16735b;

    /* renamed from: c */
    private final String f16736c;

    /* renamed from: d */
    private final String f16737d;

    /* renamed from: e */
    private final String f16738e;

    /* renamed from: f */
    private final boolean f16739f;

    /* renamed from: g */
    private final C4742eq f16740g;

    /* renamed from: h */
    private final C4744es f16741h;

    /* renamed from: i */
    private final C4620ad f16742i;

    /* renamed from: j */
    private final C4767r f16743j;

    /* renamed from: k */
    private final C4634ar f16744k;

    /* renamed from: l */
    private final C4714dq f16745l;

    /* renamed from: m */
    private final AppMeasurement f16746m;

    /* renamed from: n */
    private final C4736ek f16747n;

    /* renamed from: o */
    private final C4765p f16748o;

    /* renamed from: p */
    private final C3300e f16749p;

    /* renamed from: q */
    private final C4685co f16750q;

    /* renamed from: r */
    private final C4672cb f16751r;

    /* renamed from: s */
    private final C4616a f16752s;

    /* renamed from: t */
    private C4763n f16753t;

    /* renamed from: u */
    private C4689cs f16754u;

    /* renamed from: v */
    private C4643b f16755v;

    /* renamed from: w */
    private C4761l f16756w;

    /* renamed from: x */
    private C4626aj f16757x;

    /* renamed from: y */
    private boolean f16758y = false;

    /* renamed from: z */
    private Boolean f16759z;

    private C4638av(C4669bz bzVar) {
        String str;
        C4769t tVar;
        C3266s.m14913a(bzVar);
        this.f16740g = new C4742eq(bzVar.f16833a);
        C4756h.m23786a(this.f16740g);
        this.f16735b = bzVar.f16833a;
        this.f16736c = bzVar.f16834b;
        this.f16737d = bzVar.f16835c;
        this.f16738e = bzVar.f16836d;
        this.f16739f = bzVar.f16837e;
        this.f16729B = bzVar.f16838f;
        C4762m mVar = bzVar.f16839g;
        if (!(mVar == null || mVar.f17211g == null)) {
            Object obj = mVar.f17211g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f16730C = (Boolean) obj;
            }
            Object obj2 = mVar.f17211g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f16731D = (Boolean) obj2;
            }
        }
        C4333dr.m21274a(this.f16735b);
        this.f16749p = C3303h.m15052d();
        this.f16734G = this.f16749p.mo11326a();
        this.f16741h = new C4744es(this);
        C4620ad adVar = new C4620ad(this);
        adVar.mo15396B();
        this.f16742i = adVar;
        C4767r rVar = new C4767r(this);
        rVar.mo15396B();
        this.f16743j = rVar;
        C4736ek ekVar = new C4736ek(this);
        ekVar.mo15396B();
        this.f16747n = ekVar;
        C4765p pVar = new C4765p(this);
        pVar.mo15396B();
        this.f16748o = pVar;
        this.f16752s = new C4616a(this);
        C4685co coVar = new C4685co(this);
        coVar.mo15504F();
        this.f16750q = coVar;
        C4672cb cbVar = new C4672cb(this);
        cbVar.mo15504F();
        this.f16751r = cbVar;
        this.f16746m = new AppMeasurement(this);
        C4714dq dqVar = new C4714dq(this);
        dqVar.mo15504F();
        this.f16745l = dqVar;
        C4634ar arVar = new C4634ar(this);
        arVar.mo15396B();
        this.f16744k = arVar;
        C4742eq eqVar = this.f16740g;
        if (this.f16735b.getApplicationContext() instanceof Application) {
            C4672cb h = mo15341h();
            if (h.mo15249n().getApplicationContext() instanceof Application) {
                Application application = (Application) h.mo15249n().getApplicationContext();
                if (h.f16848a == null) {
                    h.f16848a = new C4681ck(h, null);
                }
                application.unregisterActivityLifecycleCallbacks(h.f16848a);
                application.registerActivityLifecycleCallbacks(h.f16848a);
                tVar = h.mo15253r().mo15855x();
                str = "Registered activity lifecycle callback";
            }
            this.f16744k.mo15314a((Runnable) new C4639aw(this, bzVar));
        }
        tVar = mo15253r().mo15849i();
        str = "Application context is not an Application";
        tVar.mo15858a(str);
        this.f16744k.mo15314a((Runnable) new C4639aw(this, bzVar));
    }

    /* renamed from: I */
    private final void m23034I() {
        if (!this.f16758y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: a */
    public static C4638av m23035a(Context context, C4762m mVar) {
        if (mVar != null && (mVar.f17209e == null || mVar.f17210f == null)) {
            C4762m mVar2 = new C4762m(mVar.f17205a, mVar.f17206b, mVar.f17207c, mVar.f17208d, null, null, mVar.f17211g);
            mVar = mVar2;
        }
        C3266s.m14913a(context);
        C3266s.m14913a(context.getApplicationContext());
        if (f16727a == null) {
            synchronized (C4638av.class) {
                if (f16727a == null) {
                    f16727a = new C4638av(new C4669bz(context, mVar));
                }
            }
        } else if (!(mVar == null || mVar.f17211g == null || !mVar.f17211g.containsKey("dataCollectionDefaultEnabled"))) {
            f16727a.mo15334a(mVar.f17211g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f16727a;
    }

    /* renamed from: a */
    private static void m23037a(C4661br brVar) {
        if (brVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23038a(C4669bz bzVar) {
        String str;
        C4769t tVar;
        mo15252q().mo15239d();
        C4744es.m23659e();
        C4643b bVar = new C4643b(this);
        bVar.mo15396B();
        this.f16755v = bVar;
        C4761l lVar = new C4761l(this);
        lVar.mo15504F();
        this.f16756w = lVar;
        C4763n nVar = new C4763n(this);
        nVar.mo15504F();
        this.f16753t = nVar;
        C4689cs csVar = new C4689cs(this);
        csVar.mo15504F();
        this.f16754u = csVar;
        this.f16747n.mo15397C();
        this.f16742i.mo15397C();
        this.f16757x = new C4626aj(this);
        this.f16756w.mo15505G();
        mo15253r().mo15853v().mo15859a("App measurement is starting up, version", Long.valueOf(this.f16741h.mo15742f()));
        C4742eq eqVar = this.f16740g;
        mo15253r().mo15853v().mo15858a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        C4742eq eqVar2 = this.f16740g;
        String x = lVar.mo15825x();
        if (TextUtils.isEmpty(this.f16736c)) {
            if (mo15343j().mo15597f(x)) {
                tVar = mo15253r().mo15853v();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                tVar = mo15253r().mo15853v();
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(x);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            tVar.mo15858a(str);
        }
        mo15253r().mo15854w().mo15858a("Debug-level message logging enabled");
        if (this.f16732E != this.f16733F.get()) {
            mo15253r().mo15852u_().mo15860a("Not all components initialized", Integer.valueOf(this.f16732E), Integer.valueOf(this.f16733F.get()));
        }
        this.f16758y = true;
    }

    /* renamed from: b */
    private static void m23039b(C4662bs bsVar) {
        if (bsVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!bsVar.mo15398z()) {
            String valueOf = String.valueOf(bsVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m23040b(C4710dm dmVar) {
        if (dmVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!dmVar.mo15502D()) {
            String valueOf = String.valueOf(dmVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: A */
    public final C4616a mo15323A() {
        if (this.f16752s != null) {
            return this.f16752s;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: B */
    public final boolean mo15324B() {
        return this.f16729B != null && this.f16729B.booleanValue();
    }

    /* renamed from: C */
    public final boolean mo15325C() {
        boolean z;
        mo15252q().mo15239d();
        m23034I();
        if (this.f16741h.mo15734a(C4756h.f17155aq)) {
            if (this.f16741h.mo15746h()) {
                return false;
            }
            if (this.f16731D != null && this.f16731D.booleanValue()) {
                return false;
            }
            Boolean k = mo15336c().mo15277k();
            if (k != null) {
                return k.booleanValue();
            }
            Boolean i = this.f16741h.mo15748i();
            if (i != null) {
                return i.booleanValue();
            }
            if (this.f16730C != null) {
                return this.f16730C.booleanValue();
            }
            if (C3139e.m14513b()) {
                return false;
            }
            if (!this.f16741h.mo15734a(C4756h.f17151am) || this.f16729B == null) {
                return true;
            }
            return this.f16729B.booleanValue();
        } else if (this.f16741h.mo15746h()) {
            return false;
        } else {
            Boolean i2 = this.f16741h.mo15748i();
            if (i2 == null) {
                z = !C3139e.m14513b();
                if (z && this.f16729B != null && ((Boolean) C4756h.f17151am.mo15821b()).booleanValue()) {
                    i2 = this.f16729B;
                }
                return mo15336c().mo15268c(z);
            }
            z = i2.booleanValue();
            return mo15336c().mo15268c(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final long mo15326D() {
        Long valueOf = Long.valueOf(mo15336c().f16652h.mo15283a());
        return valueOf.longValue() == 0 ? this.f16734G : Math.min(this.f16734G, valueOf.longValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final void mo15327E() {
        C4742eq eqVar = this.f16740g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final void mo15328F() {
        C4742eq eqVar = this.f16740g;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final void mo15329G() {
        this.f16733F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo15330H() {
        m23034I();
        mo15252q().mo15239d();
        if (this.f16759z == null || this.f16728A == 0 || (this.f16759z != null && !this.f16759z.booleanValue() && Math.abs(this.f16749p.mo11327b() - this.f16728A) > 1000)) {
            this.f16728A = this.f16749p.mo11327b();
            C4742eq eqVar = this.f16740g;
            boolean z = true;
            this.f16759z = Boolean.valueOf(mo15343j().mo15596d("android.permission.INTERNET") && mo15343j().mo15596d("android.permission.ACCESS_NETWORK_STATE") && (C3181c.m14658a(this.f16735b).mo11126a() || this.f16741h.mo15762x() || (C4629am.m22965a(this.f16735b) && C4736ek.m23529a(this.f16735b, false))));
            if (this.f16759z.booleanValue()) {
                if (!mo15343j().mo15593b(mo15354z().mo15826y(), mo15354z().mo15827z()) && TextUtils.isEmpty(mo15354z().mo15827z())) {
                    z = false;
                }
                this.f16759z = Boolean.valueOf(z);
            }
        }
        return this.f16759z.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15331a() {
        mo15252q().mo15239d();
        if (mo15336c().f16647c.mo15283a() == 0) {
            mo15336c().f16647c.mo15284a(this.f16749p.mo11326a());
        }
        if (Long.valueOf(mo15336c().f16652h.mo15283a()).longValue() == 0) {
            mo15253r().mo15855x().mo15859a("Persisting first open", Long.valueOf(this.f16734G));
            mo15336c().f16652h.mo15284a(this.f16734G);
        }
        if (mo15330H()) {
            C4742eq eqVar = this.f16740g;
            if (!TextUtils.isEmpty(mo15354z().mo15826y()) || !TextUtils.isEmpty(mo15354z().mo15827z())) {
                mo15343j();
                if (C4736ek.m23534a(mo15354z().mo15826y(), mo15336c().mo15273g(), mo15354z().mo15827z(), mo15336c().mo15274h())) {
                    mo15253r().mo15853v().mo15858a("Rechecking which service to use due to a GMP App Id change");
                    mo15336c().mo15276j();
                    mo15345l().mo15832x();
                    this.f16754u.mo15456C();
                    this.f16754u.mo15454A();
                    mo15336c().f16652h.mo15284a(this.f16734G);
                    mo15336c().f16654j.mo15288a(null);
                }
                mo15336c().mo15267c(mo15354z().mo15826y());
                mo15336c().mo15269d(mo15354z().mo15827z());
                if (this.f16741h.mo15758r(mo15354z().mo15825x())) {
                    this.f16745l.mo15509a(this.f16734G);
                }
            }
            mo15341h().mo15411a(mo15336c().f16654j.mo15287a());
            C4742eq eqVar2 = this.f16740g;
            if (!TextUtils.isEmpty(mo15354z().mo15826y()) || !TextUtils.isEmpty(mo15354z().mo15827z())) {
                boolean C = mo15325C();
                if (!mo15336c().mo15280x() && !this.f16741h.mo15746h()) {
                    mo15336c().mo15270d(!C);
                }
                if (!this.f16741h.mo15750j(mo15354z().mo15825x()) || C) {
                    mo15341h().mo15425y();
                }
                mo15352x().mo15463a(new AtomicReference<>());
            }
        } else if (mo15325C()) {
            if (!mo15343j().mo15596d("android.permission.INTERNET")) {
                mo15253r().mo15852u_().mo15858a("App is missing INTERNET permission");
            }
            if (!mo15343j().mo15596d("android.permission.ACCESS_NETWORK_STATE")) {
                mo15253r().mo15852u_().mo15858a("App is missing ACCESS_NETWORK_STATE permission");
            }
            C4742eq eqVar3 = this.f16740g;
            if (!C3181c.m14658a(this.f16735b).mo11126a() && !this.f16741h.mo15762x()) {
                if (!C4629am.m22965a(this.f16735b)) {
                    mo15253r().mo15852u_().mo15858a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4736ek.m23529a(this.f16735b, false)) {
                    mo15253r().mo15852u_().mo15858a("AppMeasurementService not registered/enabled");
                }
            }
            mo15253r().mo15852u_().mo15858a("Uploading is not possible. App measurement disabled");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15332a(C4662bs bsVar) {
        this.f16732E++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15333a(C4710dm dmVar) {
        this.f16732E++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15334a(boolean z) {
        this.f16729B = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final C4744es mo15335b() {
        return this.f16741h;
    }

    /* renamed from: c */
    public final C4620ad mo15336c() {
        m23037a((C4661br) this.f16742i);
        return this.f16742i;
    }

    /* renamed from: d */
    public final C4767r mo15337d() {
        if (this.f16743j == null || !this.f16743j.mo15398z()) {
            return null;
        }
        return this.f16743j;
    }

    /* renamed from: e */
    public final C4714dq mo15338e() {
        m23040b((C4710dm) this.f16745l);
        return this.f16745l;
    }

    /* renamed from: f */
    public final C4626aj mo15339f() {
        return this.f16757x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C4634ar mo15340g() {
        return this.f16744k;
    }

    /* renamed from: h */
    public final C4672cb mo15341h() {
        m23040b((C4710dm) this.f16751r);
        return this.f16751r;
    }

    /* renamed from: i */
    public final AppMeasurement mo15342i() {
        return this.f16746m;
    }

    /* renamed from: j */
    public final C4736ek mo15343j() {
        m23037a((C4661br) this.f16747n);
        return this.f16747n;
    }

    /* renamed from: k */
    public final C4765p mo15344k() {
        m23037a((C4661br) this.f16748o);
        return this.f16748o;
    }

    /* renamed from: l */
    public final C4763n mo15345l() {
        m23040b((C4710dm) this.f16753t);
        return this.f16753t;
    }

    /* renamed from: m */
    public final C3300e mo15248m() {
        return this.f16749p;
    }

    /* renamed from: n */
    public final Context mo15249n() {
        return this.f16735b;
    }

    /* renamed from: o */
    public final boolean mo15346o() {
        return TextUtils.isEmpty(this.f16736c);
    }

    /* renamed from: p */
    public final String mo15347p() {
        return this.f16736c;
    }

    /* renamed from: q */
    public final C4634ar mo15252q() {
        m23039b((C4662bs) this.f16744k);
        return this.f16744k;
    }

    /* renamed from: r */
    public final C4767r mo15253r() {
        m23039b((C4662bs) this.f16743j);
        return this.f16743j;
    }

    /* renamed from: s */
    public final String mo15348s() {
        return this.f16737d;
    }

    /* renamed from: t */
    public final String mo15349t() {
        return this.f16738e;
    }

    /* renamed from: u */
    public final C4742eq mo15256u() {
        return this.f16740g;
    }

    /* renamed from: v */
    public final boolean mo15350v() {
        return this.f16739f;
    }

    /* renamed from: w */
    public final C4685co mo15351w() {
        m23040b((C4710dm) this.f16750q);
        return this.f16750q;
    }

    /* renamed from: x */
    public final C4689cs mo15352x() {
        m23040b((C4710dm) this.f16754u);
        return this.f16754u;
    }

    /* renamed from: y */
    public final C4643b mo15353y() {
        m23039b((C4662bs) this.f16755v);
        return this.f16755v;
    }

    /* renamed from: z */
    public final C4761l mo15354z() {
        m23040b((C4710dm) this.f16756w);
        return this.f16756w;
    }
}

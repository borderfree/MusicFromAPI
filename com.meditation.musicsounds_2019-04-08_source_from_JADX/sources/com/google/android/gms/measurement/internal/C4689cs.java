package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.stats.C3285a;
import com.google.android.gms.common.util.C3300e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cs */
public final class C4689cs extends C4710dm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4702de f16904a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4758i f16905b;

    /* renamed from: c */
    private volatile Boolean f16906c;

    /* renamed from: d */
    private final C4753fa f16907d;

    /* renamed from: e */
    private final C4720dw f16908e;

    /* renamed from: f */
    private final List<Runnable> f16909f = new ArrayList();

    /* renamed from: g */
    private final C4753fa f16910g;

    protected C4689cs(C4638av avVar) {
        super(avVar);
        this.f16908e = new C4720dw(avVar.mo15248m());
        this.f16904a = new C4702de(this);
        this.f16907d = new C4690ct(this, avVar);
        this.f16910g = new C4694cx(this, avVar);
    }

    /* renamed from: H */
    private final boolean m23259H() {
        mo15256u();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m23260I() {
        mo15239d();
        this.f16908e.mo15516a();
        this.f16907d.mo15813a(((Long) C4756h.f17125O.mo15821b()).longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m23261J() {
        mo15239d();
        if (mo15466x()) {
            mo15253r().mo15855x().mo15858a("Inactivity, disconnecting from the service");
            mo15456C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m23262K() {
        mo15239d();
        mo15253r().mo15855x().mo15859a("Processing queued up service tasks", Integer.valueOf(this.f16909f.size()));
        for (Runnable run : this.f16909f) {
            try {
                run.run();
            } catch (Exception e) {
                mo15253r().mo15852u_().mo15859a("Task exception while flushing queue", e);
            }
        }
        this.f16909f.clear();
        this.f16910g.mo15815c();
    }

    /* renamed from: a */
    private final zzk m23265a(boolean z) {
        mo15256u();
        return mo15242g().mo15824a(z ? mo15253r().mo15856y() : null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23266a(ComponentName componentName) {
        mo15239d();
        if (this.f16905b != null) {
            this.f16905b = null;
            mo15253r().mo15855x().mo15859a("Disconnected from device MeasurementService", componentName);
            mo15239d();
            mo15454A();
        }
    }

    /* renamed from: a */
    private final void m23268a(Runnable runnable) {
        mo15239d();
        if (mo15466x()) {
            runnable.run();
        } else if (((long) this.f16909f.size()) >= 1000) {
            mo15253r().mo15852u_().mo15858a("Discarding data. Max runnable queue size reached");
        } else {
            this.f16909f.add(runnable);
            this.f16910g.mo15813a(60000);
            mo15454A();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0100  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15454A() {
        /*
            r6 = this;
            r6.mo15239d()
            r6.mo15503E()
            boolean r0 = r6.mo15466x()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f16906c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x010d
            r6.mo15239d()
            r6.mo15503E()
            com.google.android.gms.measurement.internal.ad r0 = r6.mo15254s()
            java.lang.Boolean r0 = r0.mo15275i()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x0107
        L_0x002c:
            r6.mo15256u()
            com.google.android.gms.measurement.internal.l r0 = r6.mo15242g()
            int r0 = r0.mo15823B()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = 1
        L_0x003a:
            r3 = 1
            goto L_0x00e4
        L_0x003d:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()
            java.lang.String r3 = "Checking service availability"
            r0.mo15858a(r3)
            com.google.android.gms.measurement.internal.ek r0 = r6.mo15251p()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.mo15577a(r3)
            r3 = 9
            if (r0 == r3) goto L_0x00d9
            r3 = 18
            if (r0 == r3) goto L_0x00ce
            switch(r0) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00af;
                case 2: goto L_0x0083;
                case 3: goto L_0x0075;
                default: goto L_0x0060;
            }
        L_0x0060:
            com.google.android.gms.measurement.internal.r r3 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo15849i()
            java.lang.String r4 = "Unexpected service status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo15859a(r4, r0)
        L_0x0071:
            r0 = 0
        L_0x0072:
            r3 = 0
            goto L_0x00e4
        L_0x0075:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r3 = "Service disabled"
        L_0x007f:
            r0.mo15858a(r3)
            goto L_0x0071
        L_0x0083:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15854w()
            java.lang.String r3 = "Service container out of date"
            r0.mo15858a(r3)
            com.google.android.gms.measurement.internal.ek r0 = r6.mo15251p()
            int r0 = r0.mo15600j()
            r3 = 14500(0x38a4, float:2.0319E-41)
            if (r0 >= r3) goto L_0x009d
            goto L_0x00bc
        L_0x009d:
            com.google.android.gms.measurement.internal.ad r0 = r6.mo15254s()
            java.lang.Boolean r0 = r0.mo15275i()
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0071
        L_0x00ad:
            r0 = 1
            goto L_0x0072
        L_0x00af:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()
            java.lang.String r3 = "Service missing"
            r0.mo15858a(r3)
        L_0x00bc:
            r0 = 0
            goto L_0x003a
        L_0x00bf:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()
            java.lang.String r3 = "Service available"
        L_0x00c9:
            r0.mo15858a(r3)
            goto L_0x0039
        L_0x00ce:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r3 = "Service updating"
            goto L_0x00c9
        L_0x00d9:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r3 = "Service invalid"
            goto L_0x007f
        L_0x00e4:
            if (r0 != 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.es r4 = r6.mo15255t()
            boolean r4 = r4.mo15762x()
            if (r4 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.r r3 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo15852u_()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo15858a(r4)
            r3 = 0
        L_0x00fe:
            if (r3 == 0) goto L_0x0107
            com.google.android.gms.measurement.internal.ad r3 = r6.mo15254s()
            r3.mo15263a(r0)
        L_0x0107:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f16906c = r0
        L_0x010d:
            java.lang.Boolean r0 = r6.f16906c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011b
            com.google.android.gms.measurement.internal.de r0 = r6.f16904a
            r0.mo15484b()
            return
        L_0x011b:
            com.google.android.gms.measurement.internal.es r0 = r6.mo15255t()
            boolean r0 = r0.mo15762x()
            if (r0 != 0) goto L_0x017b
            r6.mo15256u()
            android.content.Context r0 = r6.mo15249n()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.mo15249n()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x014e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x014e
            r1 = 1
        L_0x014e:
            if (r1 == 0) goto L_0x016e
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.mo15249n()
            r6.mo15256u()
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.de r1 = r6.f16904a
            r1.mo15483a(r0)
            return
        L_0x016e:
            com.google.android.gms.measurement.internal.r r0 = r6.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo15858a(r1)
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4689cs.mo15454A():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final Boolean mo15455B() {
        return this.f16906c;
    }

    /* renamed from: C */
    public final void mo15456C() {
        mo15239d();
        mo15503E();
        this.f16904a.mo15482a();
        try {
            C3285a.m15014a().mo11311a(mo15249n(), this.f16904a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16905b = null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15457a(C4684cn cnVar) {
        mo15239d();
        mo15503E();
        m23268a((Runnable) new C4693cw(this, cnVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15458a(C4758i iVar) {
        mo15239d();
        C3266s.m14913a(iVar);
        this.f16905b = iVar;
        m23260I();
        m23262K();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15459a(com.google.android.gms.measurement.internal.C4758i r12, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r13, com.google.android.gms.measurement.internal.zzk r14) {
        /*
            r11 = this;
            r11.mo15239d()
            r11.mo15236b()
            r11.mo15503E()
            boolean r0 = r11.m23259H()
            r1 = 0
            r2 = 100
            r3 = 0
            r4 = 100
        L_0x0013:
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r5) goto L_0x00a3
            if (r4 != r2) goto L_0x00a3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.n r5 = r11.mo15245j()
            java.util.List r5 = r5.mo15828a(r2)
            if (r5 == 0) goto L_0x0032
            r4.addAll(r5)
            int r5 = r5.size()
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r13 == 0) goto L_0x003a
            if (r5 >= r2) goto L_0x003a
            r4.add(r13)
        L_0x003a:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = r4.size()
            r7 = 0
        L_0x0041:
            if (r7 >= r6) goto L_0x009e
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r8 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) r8
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzag
            if (r9 == 0) goto L_0x0064
            com.google.android.gms.measurement.internal.zzag r8 = (com.google.android.gms.measurement.internal.zzag) r8     // Catch:{ RemoteException -> 0x0055 }
            r12.mo15362a(r8, r14)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0041
        L_0x0055:
            r8 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r11.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15852u_()
            java.lang.String r10 = "Failed to send event to the service"
        L_0x0060:
            r9.mo15859a(r10, r8)
            goto L_0x0041
        L_0x0064:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzfv
            if (r9 == 0) goto L_0x007a
            com.google.android.gms.measurement.internal.zzfv r8 = (com.google.android.gms.measurement.internal.zzfv) r8     // Catch:{ RemoteException -> 0x006e }
            r12.mo15364a(r8, r14)     // Catch:{ RemoteException -> 0x006e }
            goto L_0x0041
        L_0x006e:
            r8 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r11.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15852u_()
            java.lang.String r10 = "Failed to send attribute to the service"
            goto L_0x0060
        L_0x007a:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzo
            if (r9 == 0) goto L_0x0090
            com.google.android.gms.measurement.internal.zzo r8 = (com.google.android.gms.measurement.internal.zzo) r8     // Catch:{ RemoteException -> 0x0084 }
            r12.mo15367a(r8, r14)     // Catch:{ RemoteException -> 0x0084 }
            goto L_0x0041
        L_0x0084:
            r8 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r11.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15852u_()
            java.lang.String r10 = "Failed to send conditional property to the service"
            goto L_0x0060
        L_0x0090:
            com.google.android.gms.measurement.internal.r r8 = r11.mo15253r()
            com.google.android.gms.measurement.internal.t r8 = r8.mo15852u_()
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r8.mo15858a(r9)
            goto L_0x0041
        L_0x009e:
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0013
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4689cs.mo15459a(com.google.android.gms.measurement.internal.i, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15460a(zzag zzag, String str) {
        C3266s.m14913a(zzag);
        mo15239d();
        mo15503E();
        boolean H = m23259H();
        C4696cz czVar = new C4696cz(this, H, H && mo15245j().mo15829a(zzag), zzag, m23265a(true), str);
        m23268a((Runnable) czVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15461a(zzfv zzfv) {
        mo15239d();
        mo15503E();
        m23268a((Runnable) new C4701dd(this, m23259H() && mo15245j().mo15830a(zzfv), zzfv, m23265a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15462a(zzo zzo) {
        C3266s.m14913a(zzo);
        mo15239d();
        mo15503E();
        mo15256u();
        C4698da daVar = new C4698da(this, true, mo15245j().mo15831a(zzo), new zzo(zzo), m23265a(true), zzo);
        m23268a((Runnable) daVar);
    }

    /* renamed from: a */
    public final void mo15463a(AtomicReference<String> atomicReference) {
        mo15239d();
        mo15503E();
        m23268a((Runnable) new C4691cu(this, atomicReference, m23265a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15464a(AtomicReference<List<zzo>> atomicReference, String str, String str2, String str3) {
        mo15239d();
        mo15503E();
        C4699db dbVar = new C4699db(this, atomicReference, str, str2, str3, m23265a(false));
        m23268a((Runnable) dbVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15465a(AtomicReference<List<zzfv>> atomicReference, String str, String str2, String str3, boolean z) {
        mo15239d();
        mo15503E();
        C4700dc dcVar = new C4700dc(this, atomicReference, str, str2, str3, z, m23265a(false));
        m23268a((Runnable) dcVar);
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

    /* renamed from: x */
    public final boolean mo15466x() {
        mo15239d();
        mo15503E();
        return this.f16905b != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo15467y() {
        mo15239d();
        mo15503E();
        m23268a((Runnable) new C4695cy(this, m23265a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo15468z() {
        mo15239d();
        mo15503E();
        m23268a((Runnable) new C4692cv(this, m23265a(true)));
    }
}

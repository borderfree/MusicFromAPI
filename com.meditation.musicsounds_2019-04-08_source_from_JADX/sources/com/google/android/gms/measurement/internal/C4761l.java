package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.C3300e;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C4761l extends C4710dm {

    /* renamed from: a */
    private String f17195a;

    /* renamed from: b */
    private String f17196b;

    /* renamed from: c */
    private int f17197c;

    /* renamed from: d */
    private String f17198d;

    /* renamed from: e */
    private String f17199e;

    /* renamed from: f */
    private long f17200f;

    /* renamed from: g */
    private long f17201g;

    /* renamed from: h */
    private int f17202h;

    /* renamed from: i */
    private String f17203i;

    /* renamed from: j */
    private String f17204j;

    C4761l(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: C */
    private final String m23832C() {
        C4769t j;
        String str;
        try {
            Class loadClass = mo15249n().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo15249n()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    j = mo15253r().mo15851k();
                    str = "Failed to retrieve Firebase Instance Id";
                    j.mo15858a(str);
                    return null;
                }
            } catch (Exception unused2) {
                j = mo15253r().mo15850j();
                str = "Failed to obtain Firebase Analytics instance";
                j.mo15858a(str);
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final int mo15822A() {
        mo15503E();
        return this.f17197c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final int mo15823B() {
        mo15503E();
        return this.f17202h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzk mo15824a(String str) {
        mo15239d();
        mo15236b();
        String x = mo15825x();
        String y = mo15826y();
        mo15503E();
        String str2 = this.f17196b;
        long A = (long) mo15822A();
        mo15503E();
        String str3 = this.f17198d;
        long f = mo15255t().mo15742f();
        mo15503E();
        mo15239d();
        if (this.f17200f == 0) {
            this.f17200f = this.f16825q.mo15343j().mo15578a(mo15249n(), mo15249n().getPackageName());
        }
        long j = this.f17200f;
        boolean C = this.f16825q.mo15325C();
        boolean z = !mo15254s().f16660p;
        mo15239d();
        mo15236b();
        String C2 = (!mo15255t().mo15749i(this.f17195a) || this.f16825q.mo15325C()) ? m23832C() : null;
        mo15503E();
        boolean z2 = z;
        String str4 = C2;
        long j2 = this.f17201g;
        long D = this.f16825q.mo15326D();
        int B = mo15823B();
        C4744es t = mo15255t();
        t.mo15236b();
        Boolean b = t.mo15736b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b == null || b.booleanValue()).booleanValue();
        C4744es t2 = mo15255t();
        t2.mo15236b();
        Boolean b2 = t2.mo15736b("google_analytics_ssaid_collection_enabled");
        zzk zzk = new zzk(x, y, str2, A, str3, f, j, str, C, z2, str4, j2, D, B, booleanValue, Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue(), mo15254s().mo15279w(), mo15827z());
        return zzk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
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
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0199 A[Catch:{ IllegalStateException -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019c A[Catch:{ IllegalStateException -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a5 A[Catch:{ IllegalStateException -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b8 A[Catch:{ IllegalStateException -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15506w() {
        /*
            r10 = this;
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "Unknown"
            java.lang.String r2 = "Unknown"
            android.content.Context r3 = r10.mo15249n()
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r4 = r10.mo15249n()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.r r4 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()
            java.lang.String r7 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)
            r4.mo15859a(r7, r8)
            goto L_0x008b
        L_0x002d:
            java.lang.String r7 = r4.getInstallerPackageName(r3)     // Catch:{ IllegalArgumentException -> 0x0033 }
            r0 = r7
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.r r7 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo15852u_()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)
            r7.mo15859a(r8, r9)
        L_0x0044:
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "manual_install"
            goto L_0x0053
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0053:
            android.content.Context r7 = r10.mo15249n()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x008b
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r8 != 0) goto L_0x0072
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            r2 = r4
        L_0x0072:
            java.lang.String r4 = r7.versionName     // Catch:{ NameNotFoundException -> 0x007a }
            int r1 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0079 }
            r6 = r1
            r1 = r4
            goto L_0x008b
        L_0x0079:
            r1 = r4
        L_0x007a:
            com.google.android.gms.measurement.internal.r r4 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()
            java.lang.String r7 = "Error retrieving package info. appId, appName"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)
            r4.mo15860a(r7, r8, r2)
        L_0x008b:
            r10.f17195a = r3
            r10.f17198d = r0
            r10.f17196b = r1
            r10.f17197c = r6
            r10.f17199e = r2
            r0 = 0
            r10.f17200f = r0
            r10.mo15256u()
            android.content.Context r2 = r10.mo15249n()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C3139e.m14510a(r2)
            r4 = 1
            if (r2 == 0) goto L_0x00af
            boolean r6 = r2.mo10795d()
            if (r6 == 0) goto L_0x00af
            r6 = 1
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            com.google.android.gms.measurement.internal.av r7 = r10.f16825q
            java.lang.String r7 = r7.mo15347p()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00cc
            java.lang.String r7 = "am"
            com.google.android.gms.measurement.internal.av r8 = r10.f16825q
            java.lang.String r8 = r8.mo15348s()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00cc
            r7 = 1
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f9
            if (r2 != 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.r r2 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()
            java.lang.String r7 = "GoogleService failed to initialize (no status)"
            r2.mo15858a(r7)
            goto L_0x00f9
        L_0x00e0:
            com.google.android.gms.measurement.internal.r r7 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo15852u_()
            java.lang.String r8 = "GoogleService failed to initialize, status"
            int r9 = r2.mo10796e()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.mo10793b()
            r7.mo15860a(r8, r9, r2)
        L_0x00f9:
            if (r6 == 0) goto L_0x015f
            com.google.android.gms.measurement.internal.es r2 = r10.mo15255t()
            java.lang.Boolean r2 = r2.mo15748i()
            com.google.android.gms.measurement.internal.es r6 = r10.mo15255t()
            boolean r6 = r6.mo15746h()
            if (r6 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.av r2 = r10.f16825q
            boolean r2 = r2.mo15346o()
            if (r2 == 0) goto L_0x015f
            com.google.android.gms.measurement.internal.r r2 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15853v()
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_deactivated=1"
        L_0x011f:
            r2.mo15858a(r4)
            goto L_0x015f
        L_0x0123:
            if (r2 == 0) goto L_0x013e
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x013e
            com.google.android.gms.measurement.internal.av r2 = r10.f16825q
            boolean r2 = r2.mo15346o()
            if (r2 == 0) goto L_0x015f
            com.google.android.gms.measurement.internal.r r2 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15853v()
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_enabled=0"
            goto L_0x011f
        L_0x013e:
            if (r2 != 0) goto L_0x0151
            boolean r2 = com.google.android.gms.common.api.internal.C3139e.m14513b()
            if (r2 == 0) goto L_0x0151
            com.google.android.gms.measurement.internal.r r2 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15853v()
            java.lang.String r4 = "Collection disabled with google_app_measurement_enable=0"
            goto L_0x011f
        L_0x0151:
            com.google.android.gms.measurement.internal.r r2 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15855x()
            java.lang.String r6 = "Collection enabled"
            r2.mo15858a(r6)
            goto L_0x0160
        L_0x015f:
            r4 = 0
        L_0x0160:
            java.lang.String r2 = ""
            r10.f17203i = r2
            java.lang.String r2 = ""
            r10.f17204j = r2
            r10.f17201g = r0
            r10.mo15256u()
            com.google.android.gms.measurement.internal.av r0 = r10.f16825q
            java.lang.String r0 = r0.mo15347p()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x018f
            java.lang.String r0 = "am"
            com.google.android.gms.measurement.internal.av r1 = r10.f16825q
            java.lang.String r1 = r1.mo15348s()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018f
            com.google.android.gms.measurement.internal.av r0 = r10.f16825q
            java.lang.String r0 = r0.mo15347p()
            r10.f17204j = r0
        L_0x018f:
            java.lang.String r0 = com.google.android.gms.common.api.internal.C3139e.m14512a()     // Catch:{ IllegalStateException -> 0x01ca }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01ca }
            if (r1 == 0) goto L_0x019c
            java.lang.String r1 = ""
            goto L_0x019d
        L_0x019c:
            r1 = r0
        L_0x019d:
            r10.f17203i = r1     // Catch:{ IllegalStateException -> 0x01ca }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01ca }
            if (r0 != 0) goto L_0x01b6
            com.google.android.gms.common.internal.u r0 = new com.google.android.gms.common.internal.u     // Catch:{ IllegalStateException -> 0x01ca }
            android.content.Context r1 = r10.mo15249n()     // Catch:{ IllegalStateException -> 0x01ca }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x01ca }
            java.lang.String r1 = "admob_app_id"
            java.lang.String r0 = r0.mo11291a(r1)     // Catch:{ IllegalStateException -> 0x01ca }
            r10.f17204j = r0     // Catch:{ IllegalStateException -> 0x01ca }
        L_0x01b6:
            if (r4 == 0) goto L_0x01dc
            com.google.android.gms.measurement.internal.r r0 = r10.mo15253r()     // Catch:{ IllegalStateException -> 0x01ca }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()     // Catch:{ IllegalStateException -> 0x01ca }
            java.lang.String r1 = "App package, google app id"
            java.lang.String r2 = r10.f17195a     // Catch:{ IllegalStateException -> 0x01ca }
            java.lang.String r4 = r10.f17203i     // Catch:{ IllegalStateException -> 0x01ca }
            r0.mo15860a(r1, r2, r4)     // Catch:{ IllegalStateException -> 0x01ca }
            goto L_0x01dc
        L_0x01ca:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r1 = r10.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15852u_()
            java.lang.String r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)
            r1.mo15860a(r2, r3, r0)
        L_0x01dc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01ed
            android.content.Context r0 = r10.mo15249n()
            boolean r0 = com.google.android.gms.common.p123d.C3179a.m14648a(r0)
            r10.f17202h = r0
            return
        L_0x01ed:
            r10.f17202h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4761l.mo15506w():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final String mo15825x() {
        mo15503E();
        return this.f17195a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final String mo15826y() {
        mo15503E();
        return this.f17203i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final String mo15827z() {
        mo15503E();
        return this.f17204j;
    }
}

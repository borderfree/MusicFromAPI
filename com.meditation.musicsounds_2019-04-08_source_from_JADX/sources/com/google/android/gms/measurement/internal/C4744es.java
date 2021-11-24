package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3311p;
import com.google.android.gms.measurement.internal.C4756h.C4757a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.es */
public final class C4744es extends C4661br {

    /* renamed from: a */
    private Boolean f17087a;

    /* renamed from: b */
    private C4746eu f17088b = C4745et.f17090a;

    /* renamed from: c */
    private Boolean f17089c;

    C4744es(C4638av avVar) {
        super(avVar);
        C4756h.m23785a(avVar);
    }

    /* renamed from: e */
    static String m23659e() {
        return (String) C4756h.f17172i.mo15821b();
    }

    /* renamed from: j */
    public static long m23660j() {
        return ((Long) C4756h.f17122L.mo15821b()).longValue();
    }

    /* renamed from: k */
    public static long m23661k() {
        return ((Long) C4756h.f17175l.mo15821b()).longValue();
    }

    /* renamed from: w */
    public static boolean m23662w() {
        return ((Boolean) C4756h.f17171h.mo15821b()).booleanValue();
    }

    /* renamed from: y */
    static boolean m23663y() {
        return ((Boolean) C4756h.f17146ah.mo15821b()).booleanValue();
    }

    /* renamed from: a */
    public final int mo15731a(String str) {
        return mo15735b(str, C4756h.f17186w);
    }

    /* renamed from: a */
    public final long mo15732a(String str, C4757a<Long> aVar) {
        if (str != null) {
            String a = this.f17088b.mo15298a(str, aVar.mo15820a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Long) aVar.mo15819a(Long.valueOf(Long.parseLong(a)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) aVar.mo15821b()).longValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15733a(C4746eu euVar) {
        this.f17088b = euVar;
    }

    /* renamed from: a */
    public final boolean mo15734a(C4757a<Boolean> aVar) {
        return mo15738c(null, aVar);
    }

    /* renamed from: b */
    public final int mo15735b(String str, C4757a<Integer> aVar) {
        if (str != null) {
            String a = this.f17088b.mo15298a(str, aVar.mo15820a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Integer) aVar.mo15819a(Integer.valueOf(Integer.parseInt(a)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) aVar.mo15821b()).intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Boolean mo15736b(String str) {
        C3266s.m14915a(str);
        try {
            if (mo15249n().getPackageManager() == null) {
                mo15253r().mo15852u_().mo15858a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C3181c.m14658a(mo15249n()).mo11124a(mo15249n().getPackageName(), 128);
            if (a == null) {
                mo15253r().mo15852u_().mo15858a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                mo15253r().mo15852u_().mo15858a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (NameNotFoundException e) {
            mo15253r().mo15852u_().mo15859a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: c */
    public final boolean mo15737c(String str) {
        return "1".equals(this.f17088b.mo15298a(str, "gaia_collection_enabled"));
    }

    /* renamed from: c */
    public final boolean mo15738c(String str, C4757a<Boolean> aVar) {
        Object a;
        if (str != null) {
            String a2 = this.f17088b.mo15298a(str, aVar.mo15820a());
            if (!TextUtils.isEmpty(a2)) {
                a = aVar.mo15819a(Boolean.valueOf(Boolean.parseBoolean(a2)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = aVar.mo15821b();
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* renamed from: d */
    public final boolean mo15739d(String str) {
        return "1".equals(this.f17088b.mo15298a(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: d */
    public final boolean mo15740d(String str, C4757a<Boolean> aVar) {
        return mo15738c(str, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo15741e(String str) {
        return mo15738c(str, C4756h.f17132V);
    }

    /* renamed from: f */
    public final long mo15742f() {
        mo15256u();
        return 14710;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo15743f(String str) {
        return mo15738c(str, C4756h.f17134X);
    }

    /* renamed from: g */
    public final boolean mo15744g() {
        if (this.f17089c == null) {
            synchronized (this) {
                if (this.f17089c == null) {
                    ApplicationInfo applicationInfo = mo15249n().getApplicationInfo();
                    String a = C3311p.m15084a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f17089c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f17089c == null) {
                        this.f17089c = Boolean.TRUE;
                        mo15253r().mo15852u_().mo15858a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f17089c.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo15745g(String str) {
        return mo15738c(str, C4756h.f17135Y);
    }

    /* renamed from: h */
    public final boolean mo15746h() {
        mo15256u();
        Boolean b = mo15736b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo15747h(String str) {
        return mo15738c(str, C4756h.f17126P);
    }

    /* renamed from: i */
    public final Boolean mo15748i() {
        mo15256u();
        return mo15736b("firebase_analytics_collection_enabled");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo15749i(String str) {
        return mo15738c(str, C4756h.f17136Z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo15750j(String str) {
        return mo15738c(str, C4756h.f17139aa);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo15751k(String str) {
        return mo15738c(str, C4756h.f17141ac);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo15752l(String str) {
        return mo15738c(str, C4756h.f17142ad);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo15753m(String str) {
        return mo15738c(str, C4756h.f17143ae);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final boolean mo15754n(String str) {
        return mo15738c(str, C4756h.f17145ag);
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final boolean mo15755o(String str) {
        return mo15738c(str, C4756h.f17144af);
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final boolean mo15756p(String str) {
        return mo15738c(str, C4756h.f17147ai);
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final boolean mo15757q(String str) {
        return mo15738c(str, C4756h.f17148aj);
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final boolean mo15758r(String str) {
        return mo15738c(str, C4756h.f17149ak);
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo15759s(String str) {
        return mo15738c(str, C4756h.f17150al);
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final boolean mo15760t(String str) {
        return mo15738c(str, C4756h.f17152an);
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }

    /* renamed from: v */
    public final String mo15761v() {
        String str;
        C4769t tVar;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            e = e;
            tVar = mo15253r().mo15852u_();
            str = "Could not find SystemProperties class";
            tVar.mo15859a(str, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            tVar = mo15253r().mo15852u_();
            str = "Could not find SystemProperties.get() method";
            tVar.mo15859a(str, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            tVar = mo15253r().mo15852u_();
            str = "Could not access SystemProperties.get()";
            tVar.mo15859a(str, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            tVar = mo15253r().mo15852u_();
            str = "SystemProperties.get() threw an exception";
            tVar.mo15859a(str, e);
            return "";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo15762x() {
        if (this.f17087a == null) {
            this.f17087a = mo15736b("app_measurement_lite");
            if (this.f17087a == null) {
                this.f17087a = Boolean.valueOf(false);
            }
        }
        return this.f17087a.booleanValue() || !this.f16825q.mo15350v();
    }
}

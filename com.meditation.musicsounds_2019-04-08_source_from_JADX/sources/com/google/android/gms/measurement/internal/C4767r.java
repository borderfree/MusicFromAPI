package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C4767r extends C4662bs {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public char f17218a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f17219b = -1;

    /* renamed from: c */
    private String f17220c;

    /* renamed from: d */
    private final C4769t f17221d = new C4769t(this, 6, false, false);

    /* renamed from: e */
    private final C4769t f17222e = new C4769t(this, 6, true, false);

    /* renamed from: f */
    private final C4769t f17223f = new C4769t(this, 6, false, true);

    /* renamed from: g */
    private final C4769t f17224g = new C4769t(this, 5, false, false);

    /* renamed from: h */
    private final C4769t f17225h = new C4769t(this, 5, true, false);

    /* renamed from: i */
    private final C4769t f17226i = new C4769t(this, 5, false, true);

    /* renamed from: j */
    private final C4769t f17227j = new C4769t(this, 4, false, false);

    /* renamed from: k */
    private final C4769t f17228k = new C4769t(this, 3, false, false);

    /* renamed from: l */
    private final C4769t f17229l = new C4769t(this, 2, false, false);

    C4767r(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: D */
    private final String m23920D() {
        String str;
        synchronized (this) {
            if (this.f17220c == null) {
                this.f17220c = this.f16825q.mo15349t() != null ? this.f16825q.mo15349t() : C4744es.m23659e();
            }
            str = this.f17220c;
        }
        return str;
    }

    /* renamed from: a */
    protected static Object m23924a(String str) {
        if (str == null) {
            return null;
        }
        return new C4770u(str);
    }

    /* renamed from: a */
    private static String m23925a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C4770u ? ((C4770u) obj).f17240a : z ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b = m23928b(AppMeasurement.class.getCanonicalName());
            String b2 = m23928b(C4638av.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod()) {
                    String className = stackTraceElement.getClassName();
                    if (className != null) {
                        String b3 = m23928b(className);
                        if (b3.equals(b) || b3.equals(b2)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* renamed from: a */
    static String m23926a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m23925a(z, obj);
        String a2 = m23925a(z, obj2);
        String a3 = m23925a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m23928b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15844a(int i, String str) {
        Log.println(i, m23920D(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15845a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && mo15846a(i)) {
            mo15844a(i, m23926a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C3266s.m14913a(str);
            C4634ar g = this.f16825q.mo15340g();
            if (g == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!g.mo15398z()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i < 0) {
                    i = 0;
                }
                C4768s sVar = new C4768s(this, i >= 9 ? 8 : i, str, obj, obj2, obj3);
                g.mo15314a((Runnable) sVar);
            }
            mo15844a(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo15846a(int i) {
        return Log.isLoggable(m23920D(), i);
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

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15271e() {
        return false;
    }

    /* renamed from: g */
    public final C4769t mo15847g() {
        return this.f17222e;
    }

    /* renamed from: h */
    public final C4769t mo15848h() {
        return this.f17223f;
    }

    /* renamed from: i */
    public final C4769t mo15849i() {
        return this.f17224g;
    }

    /* renamed from: j */
    public final C4769t mo15850j() {
        return this.f17225h;
    }

    /* renamed from: k */
    public final C4769t mo15851k() {
        return this.f17226i;
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

    /* renamed from: u_ */
    public final C4769t mo15852u_() {
        return this.f17221d;
    }

    /* renamed from: v */
    public final C4769t mo15853v() {
        return this.f17227j;
    }

    /* renamed from: w */
    public final C4769t mo15854w() {
        return this.f17228k;
    }

    /* renamed from: x */
    public final C4769t mo15855x() {
        return this.f17229l;
    }

    /* renamed from: y */
    public final String mo15856y() {
        Pair<String, Long> a = mo15254s().f16646b.mo15285a();
        if (a == null || a == C4620ad.f16645a) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}

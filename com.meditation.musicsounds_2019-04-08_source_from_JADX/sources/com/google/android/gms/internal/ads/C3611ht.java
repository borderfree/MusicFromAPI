package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ht */
public final class C3611ht {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f14093a = new AtomicReference<>(null);

    /* renamed from: b */
    private final Object f14094b = new Object();
    @GuardedBy("mGmpAppIdLock")

    /* renamed from: c */
    private String f14095c = null;

    /* renamed from: d */
    private final AtomicBoolean f14096d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicInteger f14097e = new AtomicInteger(-1);

    /* renamed from: f */
    private final AtomicReference<Object> f14098f = new AtomicReference<>(null);

    /* renamed from: g */
    private final AtomicReference<Object> f14099g = new AtomicReference<>(null);

    /* renamed from: h */
    private ConcurrentMap<String, Method> f14100h = new ConcurrentHashMap(9);

    /* renamed from: a */
    private static Bundle m18648a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String str2 = "Invalid event ID: ";
            String valueOf = String.valueOf(str);
            C3643iy.m19173b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: a */
    private final Object m18649a(String str, Context context) {
        Object obj;
        if (!m18652a(context, "com.google.android.gms.measurement.AppMeasurement", this.f14098f, true)) {
            return null;
        }
        try {
            obj = m18655h(context, str).invoke(this.f14098f.get(), new Object[0]);
        } catch (Exception e) {
            m18651a(e, str, true);
            obj = null;
        }
        return obj;
    }

    /* renamed from: a */
    private final void m18650a(Context context, String str, Bundle bundle) {
        if (mo12999a(context) && m18652a(context, "com.google.android.gms.measurement.AppMeasurement", this.f14098f, true)) {
            Method l = m18657l(context);
            try {
                l.invoke(this.f14098f.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m18651a(e, "logEventInternal", true);
            }
        }
    }

    /* renamed from: a */
    private final void m18651a(Exception exc, String str, boolean z) {
        if (!this.f14096d.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C3643iy.m19178e(sb.toString());
            if (z) {
                C3643iy.m19178e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f14096d.set(true);
            }
        }
    }

    /* renamed from: a */
    private final boolean m18652a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception e) {
                m18651a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m18653b(Context context, String str, String str2) {
        if (m18652a(context, "com.google.android.gms.measurement.AppMeasurement", this.f14098f, true)) {
            Method g = m18654g(context, str2);
            try {
                g.invoke(this.f14098f.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C3643iy.m18780a(sb.toString());
            } catch (Exception e) {
                m18651a(e, str2, false);
            }
        }
    }

    /* renamed from: g */
    private final Method m18654g(Context context, String str) {
        Method method = (Method) this.f14100h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f14100h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m18651a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m18655h(Context context, String str) {
        Method method = (Method) this.f14100h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f14100h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m18651a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m18656i(Context context, String str) {
        Method method = (Method) this.f14100h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f14100h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m18651a(e, str, false);
            return null;
        }
    }

    /* renamed from: l */
    private final Method m18657l(Context context) {
        Method method = (Method) this.f14100h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f14100h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m18651a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo12996a(Context context, String str) {
        if (mo12999a(context)) {
            m18653b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: a */
    public final void mo12997a(Context context, String str, String str2) {
        if (mo12999a(context)) {
            m18650a(context, str, m18648a(context, str2, "_ac".equals(str)));
        }
    }

    /* renamed from: a */
    public final void mo12998a(Context context, String str, String str2, String str3, int i) {
        if (mo12999a(context)) {
            Bundle a = m18648a(context, str, false);
            a.putString("_ai", str2);
            a.putString("type", str3);
            a.putInt("value", i);
            m18650a(context, "_ar", a);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C3643iy.m18780a(sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo12999a(Context context) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12672al)).booleanValue() && !this.f14096d.get()) {
            if (this.f14097e.get() == -1) {
                ane.m16645a();
                if (!C3719lt.m19123c(context)) {
                    ane.m16645a();
                    if (C3719lt.m19126f(context)) {
                        C3643iy.m19178e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f14097e.set(0);
                    }
                }
                this.f14097e.set(1);
            }
            if (this.f14097e.get() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo13000b(Context context, String str) {
        if (mo12999a(context)) {
            m18653b(context, str, "endAdUnitExposure");
        }
    }

    /* renamed from: b */
    public final boolean mo13001b(Context context) {
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12673am)).booleanValue() && mo12999a(context);
    }

    /* renamed from: c */
    public final void mo13002c(Context context, String str) {
        if (mo12999a(context) && (context instanceof Activity) && m18652a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f14099g, false)) {
            Method i = m18656i(context, "setCurrentScreen");
            try {
                Activity activity = (Activity) context;
                i.invoke(this.f14099g.get(), new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                m18651a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo13003c(Context context) {
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12674an)).booleanValue() && mo12999a(context);
    }

    /* renamed from: d */
    public final void mo13004d(Context context, String str) {
        mo12997a(context, "_ac", str);
    }

    /* renamed from: d */
    public final boolean mo13005d(Context context) {
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12675ao)).booleanValue() && mo12999a(context);
    }

    /* renamed from: e */
    public final void mo13006e(Context context, String str) {
        mo12997a(context, "_ai", str);
    }

    /* renamed from: e */
    public final boolean mo13007e(Context context) {
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12676ap)).booleanValue() && mo12999a(context);
    }

    /* renamed from: f */
    public final void mo13008f(Context context, String str) {
        mo12997a(context, "_aq", str);
    }

    /* renamed from: f */
    public final boolean mo13009f(Context context) {
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12679as)).booleanValue() && mo12999a(context);
    }

    /* renamed from: g */
    public final String mo13010g(Context context) {
        if (!mo12999a(context)) {
            return "";
        }
        if (!m18652a(context, "com.google.android.gms.measurement.AppMeasurement", this.f14098f, true)) {
            return "";
        }
        try {
            String str = (String) m18655h(context, "getCurrentScreenName").invoke(this.f14098f.get(), new Object[0]);
            if (str == null) {
                str = (String) m18655h(context, "getCurrentScreenClass").invoke(this.f14098f.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            m18651a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: h */
    public final String mo13011h(Context context) {
        if (!mo12999a(context)) {
            return null;
        }
        synchronized (this.f14094b) {
            if (this.f14095c != null) {
                String str = this.f14095c;
                return str;
            }
            this.f14095c = (String) m18649a("getGmpAppId", context);
            String str2 = this.f14095c;
            return str2;
        }
    }

    /* renamed from: i */
    public final String mo13012i(Context context) {
        if (!mo12999a(context)) {
            return null;
        }
        long longValue = ((Long) ane.m16650f().mo12297a(aqm.f12682av)).longValue();
        if (longValue < 0) {
            return (String) m18649a("getAppInstanceId", context);
        }
        if (this.f14093a.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.f14093a;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) ane.m16650f().mo12297a(aqm.f12683aw)).intValue(), ((Integer) ane.m16650f().mo12297a(aqm.f12683aw)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C3614hw(this));
            atomicReference.compareAndSet(null, threadPoolExecutor);
        }
        Future submit = ((ThreadPoolExecutor) this.f14093a.get()).submit(new C3612hu(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    /* renamed from: j */
    public final String mo13013j(Context context) {
        if (!mo12999a(context)) {
            return null;
        }
        Object a = m18649a("generateEventId", context);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ String mo13014k(Context context) {
        return (String) m18649a("getAppInstanceId", context);
    }
}

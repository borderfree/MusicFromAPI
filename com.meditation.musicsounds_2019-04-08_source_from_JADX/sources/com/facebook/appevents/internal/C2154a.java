package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2189f;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.C2168i.C2170a;
import com.facebook.internal.C2230m;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2240r;
import com.facebook.internal.C2258x;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.appevents.internal.a */
public class C2154a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7039a = C2154a.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f7040b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f7041c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f7042d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AtomicInteger f7043e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C2166g f7044f;

    /* renamed from: g */
    private static AtomicBoolean f7045g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f7046h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f7047i;

    /* renamed from: a */
    public static UUID m10000a() {
        if (f7044f != null) {
            return f7044f.mo7728g();
        }
        return null;
    }

    /* renamed from: a */
    public static void m10002a(Activity activity) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Context applicationContext = activity.getApplicationContext();
        final String c = C2258x.m10400c((Context) activity);
        final C2168i a = C2170a.m10048a(activity);
        C21562 r0 = new Runnable() {
            public void run() {
                if (C2154a.f7044f == null) {
                    C2166g a = C2166g.m10029a();
                    if (a != null) {
                        C2167h.m10043a(applicationContext, c, a, C2154a.f7046h);
                    }
                    C2154a.f7044f = new C2166g(Long.valueOf(currentTimeMillis), null);
                    C2154a.f7044f.mo7722a(a);
                    C2167h.m10044a(applicationContext, c, a, C2154a.f7046h);
                }
            }
        };
        f7040b.execute(r0);
    }

    /* renamed from: a */
    public static void m10003a(Application application, String str) {
        if (f7045g.compareAndSet(false, true)) {
            f7046h = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivityCreated");
                    C2160b.m10018b();
                    C2154a.m10002a(activity);
                }

                public void onActivityDestroyed(Activity activity) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivityDestroyed");
                }

                public void onActivityPaused(Activity activity) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivityPaused");
                    C2160b.m10018b();
                    C2154a.m10009d(activity);
                }

                public void onActivityResumed(Activity activity) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivityResumed");
                    C2160b.m10018b();
                    C2154a.m10005b(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivitySaveInstanceState");
                }

                public void onActivityStarted(Activity activity) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivityStarted");
                }

                public void onActivityStopped(Activity activity) {
                    C2240r.m10258a(LoggingBehavior.APP_EVENTS, C2154a.f7039a, "onActivityStopped");
                    AppEventsLogger.m9950c();
                }
            });
        }
    }

    /* renamed from: b */
    public static void m10005b(Activity activity) {
        f7043e.incrementAndGet();
        m10016k();
        final long currentTimeMillis = System.currentTimeMillis();
        f7047i = currentTimeMillis;
        final Context applicationContext = activity.getApplicationContext();
        final String c = C2258x.m10400c((Context) activity);
        f7040b.execute(new Runnable() {
            public void run() {
                if (C2154a.f7044f == null) {
                    C2154a.f7044f = new C2166g(Long.valueOf(currentTimeMillis), null);
                    C2167h.m10044a(applicationContext, c, (C2168i) null, C2154a.f7046h);
                } else if (C2154a.f7044f.mo7724c() != null) {
                    long longValue = currentTimeMillis - C2154a.f7044f.mo7724c().longValue();
                    if (longValue > ((long) (C2154a.m10015j() * 1000))) {
                        C2167h.m10043a(applicationContext, c, C2154a.f7044f, C2154a.f7046h);
                        C2167h.m10044a(applicationContext, c, (C2168i) null, C2154a.f7046h);
                        C2154a.f7044f = new C2166g(Long.valueOf(currentTimeMillis), null);
                    } else if (longValue > 1000) {
                        C2154a.f7044f.mo7726e();
                    }
                }
                C2154a.f7044f.mo7723a(Long.valueOf(currentTimeMillis));
                C2154a.f7044f.mo7731j();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m10009d(Activity activity) {
        if (f7043e.decrementAndGet() < 0) {
            f7043e.set(0);
            Log.w(f7039a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m10016k();
        final long currentTimeMillis = System.currentTimeMillis();
        final Context applicationContext = activity.getApplicationContext();
        final String c = C2258x.m10400c((Context) activity);
        f7040b.execute(new Runnable() {
            public void run() {
                if (C2154a.f7044f == null) {
                    C2154a.f7044f = new C2166g(Long.valueOf(currentTimeMillis), null);
                }
                C2154a.f7044f.mo7723a(Long.valueOf(currentTimeMillis));
                if (C2154a.f7043e.get() <= 0) {
                    C21591 r0 = new Runnable() {
                        public void run() {
                            if (C2154a.f7043e.get() <= 0) {
                                C2167h.m10043a(applicationContext, c, C2154a.f7044f, C2154a.f7046h);
                                C2166g.m10030b();
                                C2154a.f7044f = null;
                            }
                            synchronized (C2154a.f7042d) {
                                C2154a.f7041c = null;
                            }
                        }
                    };
                    synchronized (C2154a.f7042d) {
                        C2154a.f7041c = C2154a.f7040b.schedule(r0, (long) C2154a.m10015j(), TimeUnit.SECONDS);
                    }
                }
                long i = C2154a.f7047i;
                long j = 0;
                if (i > 0) {
                    j = (currentTimeMillis - i) / 1000;
                }
                C2161c.m10021a(c, j);
                C2154a.f7044f.mo7731j();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m10015j() {
        C2230m a = C2232n.m10235a(C2189f.m10096j());
        return a == null ? C2163d.m10026a() : a.mo7849c();
    }

    /* renamed from: k */
    private static void m10016k() {
        synchronized (f7042d) {
            if (f7041c != null) {
                f7041c.cancel(false);
            }
            f7041c = null;
        }
    }
}

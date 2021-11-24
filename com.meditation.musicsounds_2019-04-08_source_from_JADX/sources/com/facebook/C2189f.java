package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import com.facebook.GraphRequest.C1609b;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.internal.C2202b;
import com.facebook.internal.C2238q;
import com.facebook.internal.C2257w;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: com.facebook.f */
public final class C2189f {

    /* renamed from: a */
    private static final String f7104a = C2189f.class.getCanonicalName();

    /* renamed from: b */
    private static final HashSet<LoggingBehavior> f7105b = new HashSet<>(Arrays.asList(new LoggingBehavior[]{LoggingBehavior.DEVELOPER_ERRORS}));

    /* renamed from: c */
    private static Executor f7106c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile String f7107d;

    /* renamed from: e */
    private static volatile String f7108e;

    /* renamed from: f */
    private static volatile String f7109f;

    /* renamed from: g */
    private static volatile Boolean f7110g;

    /* renamed from: h */
    private static volatile String f7111h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f7112i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f7113j = false;

    /* renamed from: k */
    private static boolean f7114k = false;

    /* renamed from: l */
    private static C2238q<File> f7115l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static Context f7116m;

    /* renamed from: n */
    private static int f7117n = 64206;

    /* renamed from: o */
    private static final Object f7118o = new Object();

    /* renamed from: p */
    private static String f7119p = C2257w.m10354d();

    /* renamed from: q */
    private static final BlockingQueue<Runnable> f7120q = new LinkedBlockingQueue(10);

    /* renamed from: r */
    private static final ThreadFactory f7121r = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f7123a = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("FacebookSdk #");
            sb.append(this.f7123a.incrementAndGet());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: s */
    private static Boolean f7122s = Boolean.valueOf(false);

    /* renamed from: com.facebook.f$a */
    public interface C2194a {
        /* renamed from: a */
        void mo7763a();
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized void m10080a(Context context) {
        synchronized (C2189f.class) {
            m10081a(context, (C2194a) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m10081a(final android.content.Context r3, final com.facebook.C2189f.C2194a r4) {
        /*
            java.lang.Class<com.facebook.f> r0 = com.facebook.C2189f.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f7122s     // Catch:{ all -> 0x0081 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.mo7763a()     // Catch:{ all -> 0x0081 }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C2264y.m10422a(r3, r1)     // Catch:{ all -> 0x0081 }
            r1 = 0
            com.facebook.internal.C2264y.m10427b(r3, r1)     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2264y.m10421a(r3, r1)     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x0081 }
            f7116m = r1     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = f7116m     // Catch:{ all -> 0x0081 }
            m10088c(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = f7107d     // Catch:{ all -> 0x0081 }
            boolean r1 = com.facebook.internal.C2258x.m10392a(r1)     // Catch:{ all -> 0x0081 }
            if (r1 != 0) goto L_0x0079
            android.content.Context r1 = f7116m     // Catch:{ all -> 0x0081 }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0048
            java.lang.Boolean r1 = f7110g     // Catch:{ all -> 0x0081 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0048
            android.content.Context r1 = f7116m     // Catch:{ all -> 0x0081 }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = f7107d     // Catch:{ all -> 0x0081 }
            com.facebook.appevents.internal.C2154a.m10003a(r1, r2)     // Catch:{ all -> 0x0081 }
        L_0x0048:
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0081 }
            f7122s = r1     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2232n.m10239a()     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2244t.m10309b()     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = f7116m     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C2206c.m10163a(r1)     // Catch:{ all -> 0x0081 }
            com.facebook.internal.q r1 = new com.facebook.internal.q     // Catch:{ all -> 0x0081 }
            com.facebook.f$2 r2 = new com.facebook.f$2     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            r1.<init>(r2)     // Catch:{ all -> 0x0081 }
            f7115l = r1     // Catch:{ all -> 0x0081 }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0081 }
            com.facebook.f$3 r2 = new com.facebook.f$3     // Catch:{ all -> 0x0081 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0081 }
            r1.<init>(r2)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Executor r3 = m10090d()     // Catch:{ all -> 0x0081 }
            r3.execute(r1)     // Catch:{ all -> 0x0081 }
            monitor-exit(r0)
            return
        L_0x0079:
            com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>(r4)     // Catch:{ all -> 0x0081 }
            throw r3     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2189f.m10081a(android.content.Context, com.facebook.f$a):void");
    }

    /* renamed from: a */
    public static void m10082a(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        m10090d().execute(new Runnable() {
            public void run() {
                C2189f.m10085b(applicationContext, str);
            }
        });
    }

    /* renamed from: a */
    public static synchronized boolean m10083a() {
        boolean booleanValue;
        synchronized (C2189f.class) {
            booleanValue = f7122s.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public static boolean m10084a(LoggingBehavior loggingBehavior) {
        boolean z;
        synchronized (f7105b) {
            z = m10086b() && f7105b.contains(loggingBehavior);
        }
        return z;
    }

    /* renamed from: b */
    static void m10085b(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            C2202b a = C2202b.m10150a(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("ping");
            String sb2 = sb.toString();
            long j = sharedPreferences.getLong(sb2, 0);
            GraphRequest a2 = GraphRequest.m8026a((AccessToken) null, String.format("%s/activities", new Object[]{str}), AppEventsLoggerUtility.m9998a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, a, AppEventsLogger.m9949b(context), m10087b(context), context), (C1609b) null);
            if (j == 0) {
                a2.mo6584i();
                Editor edit = sharedPreferences.edit();
                edit.putLong(sb2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while publishing install.", (Throwable) e);
        } catch (Exception e2) {
            C2258x.m10383a("Facebook-publish", e2);
        }
    }

    /* renamed from: b */
    public static boolean m10086b() {
        return f7113j;
    }

    /* renamed from: b */
    public static boolean m10087b(Context context) {
        C2264y.m10419a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: c */
    static void m10088c(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    if (f7107d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                str = str.substring(2);
                            }
                            f7107d = str;
                        } else if (obj instanceof Integer) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f7108e == null) {
                        f7108e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f7109f == null) {
                        f7109f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f7117n == 64206) {
                        f7117n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f7110g == null) {
                        f7110g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoLogAppEventsEnabled", true));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m10089c() {
        return f7114k;
    }

    /* renamed from: d */
    public static Executor m10090d() {
        synchronized (f7118o) {
            if (f7106c == null) {
                f7106c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f7106c;
    }

    /* renamed from: e */
    public static String m10091e() {
        return f7111h;
    }

    /* renamed from: f */
    public static Context m10092f() {
        C2264y.m10419a();
        return f7116m;
    }

    /* renamed from: g */
    public static String m10093g() {
        return f7119p;
    }

    /* renamed from: h */
    public static String m10094h() {
        return "4.32.0";
    }

    /* renamed from: i */
    public static long m10095i() {
        C2264y.m10419a();
        return f7112i.get();
    }

    /* renamed from: j */
    public static String m10096j() {
        C2264y.m10419a();
        return f7107d;
    }

    /* renamed from: k */
    public static String m10097k() {
        C2264y.m10419a();
        return f7108e;
    }

    /* renamed from: l */
    public static String m10098l() {
        C2264y.m10419a();
        return f7109f;
    }

    /* renamed from: m */
    public static boolean m10099m() {
        C2264y.m10419a();
        return f7110g.booleanValue();
    }

    /* renamed from: n */
    public static int m10100n() {
        C2264y.m10419a();
        return f7117n;
    }
}

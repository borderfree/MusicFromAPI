package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.p119b.C3008b;

/* renamed from: com.google.android.gms.internal.measurement.br */
public final class C4279br {

    /* renamed from: a */
    static Object f15827a = new Object();

    /* renamed from: b */
    static C3008b f15828b;

    /* renamed from: c */
    private static Boolean f15829c;

    /* renamed from: a */
    public static void m21110a(Context context, Intent intent) {
        C4272bk e = C4499u.m22345a(context).mo14846e();
        if (intent == null) {
            e.mo14821e("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        e.mo14808a("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a = C4280bs.m21114a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (f15827a) {
                context.startService(intent2);
                if (a) {
                    try {
                        if (f15828b == null) {
                            C3008b bVar = new C3008b(context, 1, "Analytics WakeLock");
                            f15828b = bVar;
                            bVar.mo10755a(false);
                        }
                        f15828b.mo10754a(1000);
                    } catch (SecurityException unused) {
                        e.mo14821e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m21111a(Context context) {
        C3266s.m14913a(context);
        if (f15829c != null) {
            return f15829c.booleanValue();
        }
        boolean a = C4286by.m21136a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f15829c = Boolean.valueOf(a);
        return a;
    }
}

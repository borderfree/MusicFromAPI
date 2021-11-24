package com.facebook.ads.internal.p068j;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p066h.C1701b;
import com.facebook.ads.internal.p069k.C1713a;

/* renamed from: com.facebook.ads.internal.j.a */
public class C1709a {

    /* renamed from: a */
    private static final String f5627a = "com.facebook.ads.internal.j.a";

    /* renamed from: b */
    private static C1709a f5628b = null;

    /* renamed from: c */
    private static boolean f5629c = false;

    /* renamed from: d */
    private Context f5630d;

    private C1709a(Context context) {
        this.f5630d = context;
    }

    /* renamed from: a */
    public static C1709a m8554a(Context context) {
        if (f5628b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (applicationContext) {
                if (f5628b == null) {
                    f5628b = new C1709a(applicationContext);
                }
            }
        }
        return f5628b;
    }

    /* renamed from: a */
    public synchronized void mo6897a() {
        if (!f5629c) {
            if (C1713a.m8578i(this.f5630d)) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(new C1701b(Thread.getDefaultUncaughtExceptionHandler(), this.f5630d, new C1711c(this.f5630d, false).mo6898a()));
                } catch (SecurityException e) {
                    Log.e(f5627a, "No permissions to set the default uncaught exception handler", e);
                }
            }
            f5629c = true;
        }
    }
}

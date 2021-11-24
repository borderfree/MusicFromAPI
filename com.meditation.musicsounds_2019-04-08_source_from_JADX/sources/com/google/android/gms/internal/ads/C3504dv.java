package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.dv */
public class C3504dv {

    /* renamed from: a */
    public static boolean f13779a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    private static String f13780b = "Volley";

    /* renamed from: com.google.android.gms.internal.ads.dv$a */
    static class C3505a {

        /* renamed from: a */
        public static final boolean f13781a = C3504dv.f13779a;

        /* renamed from: b */
        private final List<C3532ev> f13782b = new ArrayList();

        /* renamed from: c */
        private boolean f13783c = false;

        C3505a() {
        }

        /* renamed from: a */
        public final synchronized void mo12868a(String str) {
            long j;
            this.f13783c = true;
            if (this.f13782b.size() == 0) {
                j = 0;
            } else {
                j = ((C3532ev) this.f13782b.get(this.f13782b.size() - 1)).f13908c - ((C3532ev) this.f13782b.get(0)).f13908c;
            }
            if (j > 0) {
                long j2 = ((C3532ev) this.f13782b.get(0)).f13908c;
                C3504dv.m18312b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C3532ev evVar : this.f13782b) {
                    long j3 = evVar.f13908c;
                    C3504dv.m18312b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(evVar.f13907b), evVar.f13906a);
                    j2 = j3;
                }
            }
        }

        /* renamed from: a */
        public final synchronized void mo12869a(String str, long j) {
            if (!this.f13783c) {
                List<C3532ev> list = this.f13782b;
                C3532ev evVar = new C3532ev(str, j, SystemClock.elapsedRealtime());
                list.add(evVar);
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f13783c) {
                mo12868a("Request on the loose");
                C3504dv.m18313c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m18310a(String str, Object... objArr) {
        if (f13779a) {
            Log.v(f13780b, m18314d(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m18311a(Throwable th, String str, Object... objArr) {
        Log.e(f13780b, m18314d(str, objArr), th);
    }

    /* renamed from: b */
    public static void m18312b(String str, Object... objArr) {
        Log.d(f13780b, m18314d(str, objArr));
    }

    /* renamed from: c */
    public static void m18313c(String str, Object... objArr) {
        Log.e(f13780b, m18314d(str, objArr));
    }

    /* renamed from: d */
    private static String m18314d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (!stackTrace[i].getClass().equals(C3504dv.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}

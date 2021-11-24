package com.facebook.ads.internal.p066h;

import android.content.Context;
import android.os.Process;
import com.facebook.ads.internal.p077s.p078a.C1801l;
import com.facebook.ads.internal.p077s.p078a.C1804n;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.h.b */
public class C1701b implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final UncaughtExceptionHandler f5604a;

    /* renamed from: b */
    private final Context f5605b;

    /* renamed from: c */
    private final Map<String, String> f5606c;

    public C1701b(UncaughtExceptionHandler uncaughtExceptionHandler, Context context, Map<String, String> map) {
        this.f5604a = uncaughtExceptionHandler;
        if (context != null) {
            this.f5605b = context.getApplicationContext();
            this.f5606c = map;
            return;
        }
        throw new IllegalArgumentException("Missing Context");
    }

    /* renamed from: a */
    private void m8511a(Thread thread, Throwable th) {
        if (this.f5604a != null) {
            this.f5604a.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            String a = C1804n.m8919a(th);
            if (a != null && a.contains("com.facebook.ads")) {
                Map a2 = new C1700a(a, this.f5606c).mo6876a();
                a2.put("subtype", "crash");
                a2.put("subtype_code", "0");
                C1703d.m8521a(new C1702c(C1801l.m8917b(), C1801l.m8918c(), a2), this.f5605b);
            }
        } catch (Exception unused) {
        }
        m8511a(thread, th);
    }
}

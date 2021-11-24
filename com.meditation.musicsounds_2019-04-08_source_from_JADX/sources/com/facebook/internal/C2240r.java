package com.facebook.internal;

import android.util.Log;
import com.facebook.C2189f;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.internal.r */
public class C2240r {

    /* renamed from: a */
    private static final HashMap<String, String> f7226a = new HashMap<>();

    /* renamed from: b */
    private final LoggingBehavior f7227b;

    /* renamed from: c */
    private final String f7228c;

    /* renamed from: d */
    private StringBuilder f7229d;

    /* renamed from: e */
    private int f7230e = 3;

    public C2240r(LoggingBehavior loggingBehavior, String str) {
        C2264y.m10423a(str, "tag");
        this.f7227b = loggingBehavior;
        StringBuilder sb = new StringBuilder();
        sb.append("FacebookSDK.");
        sb.append(str);
        this.f7228c = sb.toString();
        this.f7229d = new StringBuilder();
    }

    /* renamed from: a */
    public static void m10256a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (C2189f.m10084a(loggingBehavior)) {
            String d = m10263d(str2);
            if (!str.startsWith("FacebookSDK.")) {
                StringBuilder sb = new StringBuilder();
                sb.append("FacebookSDK.");
                sb.append(str);
                str = sb.toString();
            }
            Log.println(i, str, d);
            if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m10257a(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        if (C2189f.m10084a(loggingBehavior)) {
            m10256a(loggingBehavior, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m10258a(LoggingBehavior loggingBehavior, String str, String str2) {
        m10256a(loggingBehavior, 3, str, str2);
    }

    /* renamed from: a */
    public static void m10259a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (C2189f.m10084a(loggingBehavior)) {
            m10256a(loggingBehavior, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static synchronized void m10260a(String str) {
        synchronized (C2240r.class) {
            if (!C2189f.m10084a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                m10261a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m10261a(String str, String str2) {
        synchronized (C2240r.class) {
            f7226a.put(str, str2);
        }
    }

    /* renamed from: b */
    private boolean m10262b() {
        return C2189f.m10084a(this.f7227b);
    }

    /* renamed from: d */
    private static synchronized String m10263d(String str) {
        synchronized (C2240r.class) {
            for (Entry entry : f7226a.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public void mo7865a() {
        mo7868b(this.f7229d.toString());
        this.f7229d = new StringBuilder();
    }

    /* renamed from: a */
    public void mo7866a(String str, Object obj) {
        mo7867a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: a */
    public void mo7867a(String str, Object... objArr) {
        if (m10262b()) {
            this.f7229d.append(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo7868b(String str) {
        m10256a(this.f7227b, this.f7230e, this.f7228c, str);
    }

    /* renamed from: c */
    public void mo7869c(String str) {
        if (m10262b()) {
            this.f7229d.append(str);
        }
    }
}

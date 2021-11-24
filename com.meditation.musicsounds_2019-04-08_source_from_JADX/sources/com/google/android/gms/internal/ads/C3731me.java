package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.me */
public class C3731me {
    /* renamed from: a */
    private static String m19169a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m19170a(String str, Throwable th) {
        if (m19171a(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: a */
    public static boolean m19171a(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }

    /* renamed from: b */
    public static void m19172b(String str) {
        if (m19171a(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: b */
    public static void m19173b(String str, Throwable th) {
        if (m19171a(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: c */
    public static void m19174c(String str) {
        if (m19171a(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: c */
    public static void m19175c(String str, Throwable th) {
        if (m19171a(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: d */
    public static void m19176d(String str) {
        if (m19171a(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: d */
    public static void m19177d(String str, Throwable th) {
        if (m19171a(5)) {
            if (th != null) {
                m19175c(m19169a(str), th);
                return;
            }
            m19178e(m19169a(str));
        }
    }

    /* renamed from: e */
    public static void m19178e(String str) {
        if (m19171a(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: f */
    public static void m19179f(String str) {
        m19177d(str, null);
    }
}

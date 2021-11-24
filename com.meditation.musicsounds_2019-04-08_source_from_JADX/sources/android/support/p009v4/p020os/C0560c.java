package android.support.p009v4.p020os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: android.support.v4.os.c */
public final class C0560c {
    /* renamed from: a */
    public static void m2557a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m2558a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}

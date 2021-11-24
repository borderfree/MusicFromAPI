package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.C3266s;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.util.g */
public final class C3302g {

    /* renamed from: a */
    private static final String[] f11194a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static DropBoxManager f11195b = null;

    /* renamed from: c */
    private static boolean f11196c = false;

    /* renamed from: d */
    private static int f11197d = -1;
    @GuardedBy("CrashUtils.class")

    /* renamed from: e */
    private static int f11198e = 0;
    @GuardedBy("CrashUtils.class")

    /* renamed from: f */
    private static int f11199f = 0;

    /* renamed from: a */
    public static boolean m15050a(Context context, Throwable th) {
        return m15051a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m15051a(Context context, Throwable th, int i) {
        try {
            C3266s.m14913a(context);
            C3266s.m14913a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}

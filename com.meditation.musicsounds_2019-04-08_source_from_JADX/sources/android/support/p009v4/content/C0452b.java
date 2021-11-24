package android.support.p009v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.content.b */
public class C0452b {

    /* renamed from: a */
    private static final Object f1363a = new Object();

    /* renamed from: b */
    private static TypedValue f1364b;

    /* renamed from: a */
    public static Drawable m2059a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT < 16) {
            synchronized (f1363a) {
                if (f1364b == null) {
                    f1364b = new TypedValue();
                }
                context.getResources().getValue(i, f1364b, true);
                i = f1364b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m2060a(java.io.File r4) {
        /*
            java.lang.Class<android.support.v4.content.b> r0 = android.support.p009v4.content.C0452b.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r4
        L_0x0017:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r2.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0036 }
            r2.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0036 }
            r4 = 0
            monitor-exit(r0)
            return r4
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.content.C0452b.m2060a(java.io.File):java.io.File");
    }

    /* renamed from: a */
    public static void m2061a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m2062a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: a */
    public static File[] m2063a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: a */
    public static File[] m2064a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: b */
    public static int m2065b(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static ColorStateList m2066b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static File m2067b(Context context) {
        return VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : m2060a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: c */
    public static int m2068c(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static boolean m2069c(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }
}

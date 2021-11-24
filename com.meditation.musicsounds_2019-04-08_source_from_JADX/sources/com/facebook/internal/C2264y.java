package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.C2189f;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.y */
public final class C2264y {

    /* renamed from: a */
    private static final String f7274a = "com.facebook.internal.y";

    /* renamed from: a */
    public static void m10419a() {
        if (!C2189f.m10083a()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: a */
    public static void m10420a(Context context) {
        m10421a(context, true);
    }

    /* renamed from: a */
    public static void m10421a(Context context, boolean z) {
        m10422a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (!z) {
            Log.w(f7274a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    /* renamed from: a */
    public static void m10422a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m10423a(String str, String str2) {
        if (C2258x.m10392a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument '");
            sb.append(str2);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> void m10424a(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Container '");
            sb.append(str);
            sb.append("' cannot be empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static String m10425b() {
        String j = C2189f.m10096j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* renamed from: b */
    public static void m10426b(Context context) {
        m10427b(context, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10427b(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            m10422a(r3, r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.facebook.FacebookActivity"
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 != 0) goto L_0x002d
            if (r4 != 0) goto L_0x0025
            java.lang.String r3 = f7274a
            java.lang.String r4 = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            android.util.Log.w(r3, r4)
            goto L_0x002d
        L_0x0025:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            r3.<init>(r4)
            throw r3
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2264y.m10427b(android.content.Context, boolean):void");
    }

    /* renamed from: b */
    public static <T> void m10428b(Collection<T> collection, String str) {
        m10422a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Container '");
                sb.append(str);
                sb.append("' cannot contain null values");
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* renamed from: c */
    public static String m10429c() {
        String l = C2189f.m10098l();
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: c */
    public static <T> void m10430c(Collection<T> collection, String str) {
        m10428b(collection, str);
        m10424a(collection, str);
    }

    /* renamed from: c */
    public static boolean m10431c(Context context) {
        List<ResolveInfo> list;
        m10422a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder sb = new StringBuilder();
            sb.append("fb");
            sb.append(C2189f.m10096j());
            sb.append("://authorize");
            intent.setData(Uri.parse(sb.toString()));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        boolean z = false;
        if (list != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }

    /* renamed from: d */
    public static void m10432d(Context context) {
        m10422a((Object) context, "context");
        String b = m10425b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("com.facebook.app.FacebookContentProvider");
            sb.append(b);
            String sb2 = sb.toString();
            if (packageManager.resolveContentProvider(sb2, 0) == null) {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{sb2}));
            }
        }
    }
}

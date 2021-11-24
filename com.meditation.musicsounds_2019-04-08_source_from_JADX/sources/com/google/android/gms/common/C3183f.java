package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.facebook.ads.internal.p065g.C1694e;
import com.google.android.gms.common.C3185h.C3186a;
import com.google.android.gms.common.internal.C3222at;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3299d;
import com.google.android.gms.common.util.C3304i;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.common.util.C3314s;
import com.google.android.gms.common.util.C3317v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.f */
public class C3183f {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static boolean zzag = false;
    private static boolean zzah = false;
    private static boolean zzai = false;
    private static boolean zzaj = false;
    private static final AtomicBoolean zzak = new AtomicBoolean();

    C3183f() {
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzak.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) {
        int b = C3182e.m14660b().mo11117b(context, i);
        if (b != 0) {
            Intent a = C3182e.m14660b().mo11111a(context, b, C1694e.f5581a);
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(b);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a == null) {
                throw new GooglePlayServicesNotAvailableException(b);
            }
            throw new GooglePlayServicesRepairableException(b, "Google Play Services not available", a);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        C3266s.m14919a(true);
        return C3299d.m15034a(context, context.getPackageName());
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C3182e.m14660b().mo11109a(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.m13974a(i);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return C3182e.m14660b().mo11111a((Context) null, i, (String) null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zzaj) {
            try {
                PackageInfo b = C3181c.m14658a(context).mo11129b("com.google.android.gms", 64);
                C3184g.m14674a(context);
                if (b == null || C3184g.m14677a(b, false) || !C3184g.m14677a(b, true)) {
                    zzai = false;
                } else {
                    zzai = true;
                }
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                zzaj = true;
                throw th;
            }
            zzaj = true;
        }
        return zzai || !C3304i.m15056a();
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        try {
            context.getResources().getString(C3186a.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzak.get()) {
            int b = C3222at.m14747b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                int i2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return zza(context, !C3304i.m15058b(context) && !C3304i.m15060d(context), i);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return C3314s.m15088a(context, i);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        if (C3309n.m15074f()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return C3304i.m15059c(context);
    }

    @TargetApi(21)
    static boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C3309n.m15077i()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        if (i != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return C3314s.m15089a(context, i, str);
    }

    private static int zza(Context context, boolean z, int i) {
        String str;
        String str2;
        C3266s.m14923b(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                str = "GooglePlayServicesUtil";
                str2 = "Google Play Store is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C3184g.m14674a(context);
            if (!C3184g.m14677a(packageInfo2, true)) {
                str = "GooglePlayServicesUtil";
                str2 = "Google Play services signature invalid.";
            } else if (z && (!C3184g.m14677a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                str = "GooglePlayServicesUtil";
                str2 = "Google Play Store signature invalid.";
            } else if (C3317v.m15106a(packageInfo2.versionCode) < C3317v.m15106a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            Log.w(str, str2);
            return 9;
        } catch (NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }
}

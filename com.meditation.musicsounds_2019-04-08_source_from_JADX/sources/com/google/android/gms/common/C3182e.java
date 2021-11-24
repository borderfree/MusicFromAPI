package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3213ak;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3304i;

/* renamed from: com.google.android.gms.common.e */
public class C3182e {

    /* renamed from: a */
    private static final C3182e f10965a = new C3182e();

    /* renamed from: b */
    public static final int f10966b = C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    C3182e() {
    }

    /* renamed from: b */
    public static C3182e m14660b() {
        return f10965a;
    }

    /* renamed from: b */
    private static String m14661b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f10966b);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C3181c.m14658a(context).mo11129b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo11106a(Context context) {
        return mo11117b(context, f10966b);
    }

    /* renamed from: a */
    public PendingIntent mo11109a(Context context, int i, int i2) {
        return mo11131a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo11131a(Context context, int i, int i2, String str) {
        Intent a = mo11111a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: a */
    public Intent mo11111a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !C3304i.m15058b(context)) ? C3213ak.m14730a("com.google.android.gms", m14661b(context, str)) : C3213ak.m14728a();
            case 3:
                return C3213ak.m14729a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* renamed from: a */
    public boolean mo11114a(int i) {
        return C3183f.isUserRecoverableError(i);
    }

    /* renamed from: a */
    public boolean mo11132a(Context context, String str) {
        return C3183f.isUninstalledAppPossiblyUpdating(context, str);
    }

    /* renamed from: b */
    public int mo11117b(Context context, int i) {
        int isGooglePlayServicesAvailable = C3183f.isGooglePlayServicesAvailable(context, i);
        if (C3183f.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    /* renamed from: b */
    public String mo11118b(int i) {
        return C3183f.getErrorString(i);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo11133c(int i) {
        return mo11111a((Context) null, i, (String) null);
    }

    /* renamed from: c */
    public void mo11134c(Context context) {
        C3183f.cancelAvailabilityErrorNotifications(context);
    }

    /* renamed from: c */
    public boolean mo11135c(Context context, int i) {
        return C3183f.isPlayServicesPossiblyUpdating(context, i);
    }

    /* renamed from: d */
    public int mo11136d(Context context) {
        return C3183f.getApkVersion(context);
    }
}

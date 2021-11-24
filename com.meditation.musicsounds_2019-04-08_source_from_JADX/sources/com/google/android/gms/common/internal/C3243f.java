package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.p009v4.p019g.C0510m;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3185h.C3186a;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3304i;
import com.google.android.gms.p115a.C2838a.C2840b;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.f */
public final class C3243f {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C0510m<String, String> f11089a = new C0510m<>();

    /* renamed from: a */
    public static String m14850a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3181c.m14658a(context).mo11130b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        android.util.Log.e(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14851a(android.content.Context r3, int r4) {
        /*
            android.content.res.Resources r0 = r3.getResources()
            r1 = 20
            if (r4 == r1) goto L_0x0081
            r1 = 0
            switch(r4) {
                case 1: goto L_0x007a;
                case 2: goto L_0x0073;
                case 3: goto L_0x006c;
                case 4: goto L_0x006b;
                case 5: goto L_0x005d;
                case 6: goto L_0x006b;
                case 7: goto L_0x004f;
                case 8: goto L_0x004a;
                case 9: goto L_0x0045;
                case 10: goto L_0x0040;
                case 11: goto L_0x003b;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r4) {
                case 16: goto L_0x0036;
                case 17: goto L_0x0028;
                case 18: goto L_0x006b;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r3 = "GoogleApiAvailability"
            r0 = 33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Unexpected error code "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x0024:
            android.util.Log.e(r3, r4)
            return r1
        L_0x0028:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r3 = m14852a(r3, r4)
            return r3
        L_0x0036:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "One of the API components you attempted to connect to is not available."
            goto L_0x0024
        L_0x003b:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "The application is not licensed to the user."
            goto L_0x0024
        L_0x0040:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "Developer error occurred. Please see logs for detailed information"
            goto L_0x0024
        L_0x0045:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "Google Play services is invalid. Cannot recover."
            goto L_0x0024
        L_0x004a:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "Internal error occurred. Please see logs for detailed information"
            goto L_0x0024
        L_0x004f:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_network_error_title"
            java.lang.String r3 = m14852a(r3, r4)
            return r3
        L_0x005d:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_invalid_account_title"
            java.lang.String r3 = m14852a(r3, r4)
            return r3
        L_0x006b:
            return r1
        L_0x006c:
            int r3 = com.google.android.gms.p115a.C2838a.C2840b.common_google_play_services_enable_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L_0x0073:
            int r3 = com.google.android.gms.p115a.C2838a.C2840b.common_google_play_services_update_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L_0x007a:
            int r3 = com.google.android.gms.p115a.C2838a.C2840b.common_google_play_services_install_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L_0x0081:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_restricted_profile_title"
            java.lang.String r3 = m14852a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3243f.m14851a(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    private static String m14852a(Context context, String str) {
        synchronized (f11089a) {
            String str2 = (String) f11089a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                String valueOf = String.valueOf(str);
                Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String str5 = "GoogleApiAvailability";
                String str6 = "Got empty resource: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
                return null;
            }
            f11089a.put(str, string);
            return string;
        }
    }

    /* renamed from: a */
    private static String m14853a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m14852a(context, str);
        if (a == null) {
            a = resources.getString(C3186a.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: b */
    public static String m14854b(Context context) {
        return context.getResources().getString(C2840b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: b */
    public static String m14855b(Context context, int i) {
        String a = i == 6 ? m14852a(context, "common_google_play_services_resolution_required_title") : m14851a(context, i);
        return a == null ? context.getResources().getString(C2840b.common_google_play_services_notification_ticker) : a;
    }

    /* renamed from: c */
    public static String m14856c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m14850a(context);
        if (i == 5) {
            return m14853a(context, "common_google_play_services_invalid_account_text", a);
        }
        if (i == 7) {
            return m14853a(context, "common_google_play_services_network_error_text", a);
        }
        if (i == 9) {
            return resources.getString(C2840b.common_google_play_services_unsupported_text, new Object[]{a});
        } else if (i == 20) {
            return m14853a(context, "common_google_play_services_restricted_profile_text", a);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(C2840b.common_google_play_services_install_text, new Object[]{a});
                case 2:
                    if (C3304i.m15058b(context)) {
                        return resources.getString(C2840b.common_google_play_services_wear_update_text);
                    }
                    return resources.getString(C2840b.common_google_play_services_update_text, new Object[]{a});
                case 3:
                    return resources.getString(C2840b.common_google_play_services_enable_text, new Object[]{a});
                default:
                    switch (i) {
                        case 16:
                            return m14853a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m14853a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C2840b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C3186a.common_google_play_services_unknown_issue, new Object[]{a});
                    }
            }
        }
    }

    /* renamed from: d */
    public static String m14857d(Context context, int i) {
        return i == 6 ? m14853a(context, "common_google_play_services_resolution_required_text", m14850a(context)) : m14856c(context, i);
    }

    /* renamed from: e */
    public static String m14858e(Context context, int i) {
        int i2;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i2 = C2840b.common_google_play_services_install_button;
                break;
            case 2:
                i2 = C2840b.common_google_play_services_update_button;
                break;
            case 3:
                i2 = C2840b.common_google_play_services_enable_button;
                break;
            default:
                i2 = 17039370;
                break;
        }
        return resources.getString(i2);
    }
}

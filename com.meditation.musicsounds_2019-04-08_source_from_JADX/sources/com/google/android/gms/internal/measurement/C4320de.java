package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.de */
public class C4320de {

    /* renamed from: a */
    private static volatile UserManager f16012a;

    /* renamed from: b */
    private static volatile boolean f16013b = (!m21242a());

    private C4320de() {
    }

    /* renamed from: a */
    public static boolean m21242a() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m21243a(Context context) {
        return !m21242a() || m21244b(context);
    }

    @TargetApi(24)
    /* renamed from: b */
    private static boolean m21244b(Context context) {
        boolean z = f16013b;
        if (!z) {
            boolean z2 = z;
            int i = 1;
            while (true) {
                if (i > 2) {
                    break;
                }
                UserManager c = m21245c(context);
                if (c == null) {
                    f16013b = true;
                    return true;
                }
                try {
                    if (!c.isUserUnlocked()) {
                        if (c.isUserRunning(Process.myUserHandle())) {
                            z2 = false;
                            f16013b = z2;
                        }
                    }
                    z2 = true;
                    f16013b = z2;
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked", e);
                    f16012a = null;
                    i++;
                }
            }
            z = z2;
            if (z) {
                f16012a = null;
            }
        }
        return z;
    }

    @TargetApi(24)
    /* renamed from: c */
    private static UserManager m21245c(Context context) {
        UserManager userManager = f16012a;
        if (userManager == null) {
            synchronized (C4320de.class) {
                userManager = f16012a;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    f16012a = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}

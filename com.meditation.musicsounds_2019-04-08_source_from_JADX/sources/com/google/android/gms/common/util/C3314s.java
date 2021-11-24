package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C3184g;
import com.google.android.gms.common.p123d.C3181c;

/* renamed from: com.google.android.gms.common.util.s */
public final class C3314s {
    /* renamed from: a */
    public static boolean m15088a(Context context, int i) {
        if (!m15089a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C3184g.m14674a(context).mo11138a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m15089a(Context context, int i, String str) {
        return C3181c.m14658a(context).mo11127a(i, str);
    }
}

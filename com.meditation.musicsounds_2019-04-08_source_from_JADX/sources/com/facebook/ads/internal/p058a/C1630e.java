package com.facebook.ads.internal.p058a;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.a.e */
public class C1630e {
    /* renamed from: a */
    public static boolean m8178a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}

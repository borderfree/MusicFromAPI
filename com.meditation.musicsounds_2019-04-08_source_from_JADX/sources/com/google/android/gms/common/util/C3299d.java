package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.common.p123d.C3181c;

/* renamed from: com.google.android.gms.common.util.d */
public class C3299d {
    /* renamed from: a */
    public static int m15034a(Context context, String str) {
        PackageInfo c = m15037c(context, str);
        if (c == null || c.applicationInfo == null) {
            return -1;
        }
        Bundle bundle = c.applicationInfo.metaData;
        if (bundle == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* renamed from: a */
    public static boolean m15035a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m15036b(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C3181c.m14658a(context).mo11124a(str, 0).flags & 2097152) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: c */
    private static PackageInfo m15037c(Context context, String str) {
        try {
            return C3181c.m14658a(context).mo11129b(str, 128);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}

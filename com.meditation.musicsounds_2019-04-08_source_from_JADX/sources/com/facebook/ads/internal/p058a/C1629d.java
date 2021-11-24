package com.facebook.ads.internal.p058a;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.a.d */
public enum C1629d {
    NONE,
    INSTALLED,
    NOT_INSTALLED;

    /* renamed from: a */
    public static C1629d m8177a(String str) {
        if (TextUtils.isEmpty(str)) {
            return NONE;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return NONE;
        }
    }
}

package com.bumptech.glide.load.p042a.p043a;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.a.a.b */
public final class C1264b {
    /* renamed from: a */
    public static boolean m6730a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m6731a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m6732b(Uri uri) {
        return m6731a(uri) && m6734d(uri);
    }

    /* renamed from: c */
    public static boolean m6733c(Uri uri) {
        return m6731a(uri) && !m6734d(uri);
    }

    /* renamed from: d */
    private static boolean m6734d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}

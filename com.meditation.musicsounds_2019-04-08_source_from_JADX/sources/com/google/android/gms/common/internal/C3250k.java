package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C3250k {

    /* renamed from: a */
    private static final int f11108a = 15;

    /* renamed from: b */
    private static final String f11109b = null;

    /* renamed from: c */
    private final String f11110c;

    /* renamed from: d */
    private final String f11111d;

    public C3250k(String str) {
        this(str, null);
    }

    public C3250k(String str, String str2) {
        C3266s.m14914a(str, (Object) "log tag cannot be null");
        C3266s.m14925b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f11110c = str;
        if (str2 == null || str2.length() <= 0) {
            this.f11111d = null;
        } else {
            this.f11111d = str2;
        }
    }
}

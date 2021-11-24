package com.bumptech.glide.p040g;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.g.i */
public final class C1257i {
    /* renamed from: a */
    public static <T> T m6691a(T t) {
        return m6692a(t, "Argument must not be null");
    }

    /* renamed from: a */
    public static <T> T m6692a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m6693a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m6694a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public static void m6695a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}

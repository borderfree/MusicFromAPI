package com.google.sczxing.p138a.p139a;

import android.content.Intent;
import java.lang.reflect.Method;

/* renamed from: com.google.sczxing.a.a.a */
public final class C4981a {

    /* renamed from: a */
    public static final String f17819a = null;

    /* renamed from: b */
    public static final Method f17820b;

    /* renamed from: c */
    private static final String f17821c = "a";

    static {
        Method method;
        try {
            method = Intent.class.getMethod("setPackage", new Class[]{String.class});
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        f17820b = method;
    }

    private C4981a() {
    }

    /* renamed from: a */
    public static C4982b m24719a(int i, int i2, Intent intent) {
        if (i == 49374) {
            return i2 == -1 ? new C4982b(intent.getStringExtra("SCAN_RESULT"), intent.getStringExtra("SCAN_RESULT_FORMAT")) : new C4982b(null, null);
        }
        return null;
    }
}

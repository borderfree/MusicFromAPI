package com.facebook.ads.internal.p077s.p078a;

import java.util.Locale;

/* renamed from: com.facebook.ads.internal.s.a.o */
public class C1805o {
    /* renamed from: a */
    public static String m8920a(double d) {
        return String.format(Locale.US, "%.3f", new Object[]{Double.valueOf(d)});
    }

    @Deprecated
    /* renamed from: a */
    public static String m8921a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return m8920a(d / 1000.0d);
    }
}

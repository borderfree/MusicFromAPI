package com.facebook.ads.internal.p077s.p078a;

import java.util.UUID;

/* renamed from: com.facebook.ads.internal.s.a.l */
public class C1801l {

    /* renamed from: a */
    private static final String f5867a = "l";

    /* renamed from: b */
    private static volatile boolean f5868b = false;

    /* renamed from: c */
    private static double f5869c;

    /* renamed from: d */
    private static String f5870d;

    /* renamed from: a */
    public static void m8916a() {
        if (!f5868b) {
            synchronized (f5867a) {
                if (!f5868b) {
                    f5868b = true;
                    double currentTimeMillis = (double) System.currentTimeMillis();
                    Double.isNaN(currentTimeMillis);
                    f5869c = currentTimeMillis / 1000.0d;
                    f5870d = UUID.randomUUID().toString();
                }
            }
        }
    }

    /* renamed from: b */
    public static double m8917b() {
        return f5869c;
    }

    /* renamed from: c */
    public static String m8918c() {
        return f5870d;
    }
}

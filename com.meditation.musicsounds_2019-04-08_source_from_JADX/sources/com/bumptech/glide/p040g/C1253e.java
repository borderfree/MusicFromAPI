package com.bumptech.glide.p040g;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.g.e */
public final class C1253e {

    /* renamed from: a */
    private static final double f4467a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f4467a = d;
    }

    /* renamed from: a */
    public static double m6676a(long j) {
        double a = (double) (m6677a() - j);
        double d = f4467a;
        Double.isNaN(a);
        return a * d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m6677a() {
        return VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}

package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.u */
public final class C3316u {

    /* renamed from: a */
    private static final IntentFilter f11220a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f11221b;

    /* renamed from: c */
    private static float f11222c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m15104a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f11220a);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C3309n.m15076h() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 1;
        }
        return (i << 1) | i2;
    }

    /* renamed from: b */
    public static synchronized float m15105b(Context context) {
        synchronized (C3316u.class) {
            if (SystemClock.elapsedRealtime() - f11221b >= 60000 || Float.isNaN(f11222c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f11220a);
                if (registerReceiver != null) {
                    f11222c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f11221b = SystemClock.elapsedRealtime();
                float f = f11222c;
                return f;
            }
            float f2 = f11222c;
            return f2;
        }
    }
}

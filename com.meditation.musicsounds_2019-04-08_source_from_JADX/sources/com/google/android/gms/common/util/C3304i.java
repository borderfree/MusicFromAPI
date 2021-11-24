package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C3304i {

    /* renamed from: a */
    private static Boolean f11201a;

    /* renamed from: b */
    private static Boolean f11202b;

    /* renamed from: c */
    private static Boolean f11203c;

    /* renamed from: a */
    public static boolean m15056a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m15057a(Context context) {
        if (f11201a == null) {
            f11201a = Boolean.valueOf(C3309n.m15076h() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f11201a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: b */
    public static boolean m15058b(Context context) {
        return m15057a(context) && (!C3309n.m15079k() || (m15059c(context) && !C3309n.m15080l()));
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m15059c(Context context) {
        if (f11202b == null) {
            f11202b = Boolean.valueOf(C3309n.m15077i() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f11202b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m15060d(Context context) {
        if (f11203c == null) {
            f11203c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f11203c.booleanValue();
    }
}

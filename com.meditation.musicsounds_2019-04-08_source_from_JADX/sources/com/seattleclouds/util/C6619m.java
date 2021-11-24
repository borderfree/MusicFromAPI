package com.seattleclouds.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.seattleclouds.util.m */
public class C6619m {

    /* renamed from: a */
    private static Boolean f23338a;

    /* renamed from: a */
    public static int m32014a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @TargetApi(13)
    /* renamed from: a */
    public static Point m32015a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        return new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
    }

    /* renamed from: a */
    public static boolean m32016a() {
        return Build.MODEL.equals("Kindle Fire");
    }

    /* renamed from: b */
    public static int m32017b(Context context) {
        return m32015a(context).x;
    }

    /* renamed from: b */
    public static int m32018b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static boolean m32019b() {
        return VERSION.SDK_INT >= 19;
    }

    /* renamed from: c */
    public static int m32020c(Context context) {
        return m32015a(context).y;
    }

    /* renamed from: c */
    public static boolean m32021c() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: d */
    public static int m32022d(Context context) {
        Point a = m32015a(context);
        return Math.min(a.x, a.y);
    }

    /* renamed from: e */
    public static boolean m32023e(Context context) {
        if (f23338a == null) {
            if (context == null) {
                return false;
            }
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 128);
                f23338a = Boolean.valueOf(true);
            } catch (NameNotFoundException unused) {
                f23338a = Boolean.valueOf(false);
            }
        }
        return f23338a.booleanValue();
    }

    /* renamed from: f */
    public static boolean m32024f(Context context) {
        return m32018b(context, (float) m32022d(context)) >= 552;
    }

    /* renamed from: g */
    public static boolean m32025g(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* renamed from: h */
    public static boolean m32026h(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
            z = true;
        }
        return z;
    }
}

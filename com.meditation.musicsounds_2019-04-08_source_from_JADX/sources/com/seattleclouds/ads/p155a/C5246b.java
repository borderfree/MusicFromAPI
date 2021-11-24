package com.seattleclouds.ads.p155a;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.seattleclouds.App;
import java.lang.reflect.Method;

/* renamed from: com.seattleclouds.ads.a.b */
public class C5246b {

    /* renamed from: a */
    private static boolean f18808a = true;

    /* renamed from: b */
    private static boolean f18809b;

    /* renamed from: a */
    public static int m26185a(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return 0;
        }
        if (trim.equalsIgnoreCase("smart_wall")) {
            return 203;
        }
        if (trim.equalsIgnoreCase("overlay")) {
            return 204;
        }
        if (trim.equalsIgnoreCase("video")) {
            return 205;
        }
        if (trim.equalsIgnoreCase("app_wall")) {
            return 206;
        }
        return trim.equalsIgnoreCase("interstitial") ? 208 : 0;
    }

    /* renamed from: a */
    public static View m26186a(Activity activity, LinearLayout linearLayout, int i) {
        Method a = App.m25615a("com.seattleclouds.ads.airpush.AirPushManager", "showAdBanner", (Class<?>[]) new Class[]{Activity.class, LinearLayout.class, Integer.TYPE});
        if (a == null) {
            return null;
        }
        return (View) App.m25613a(a, (Object) null, activity, linearLayout, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m26187a() {
        if (f18809b) {
            Method a = App.m25615a("com.seattleclouds.ads.airpush.AirPushManager", "destroyInstance", (Class<?>[]) new Class[0]);
            if (a != null) {
                App.m25613a(a, (Object) null, new Object[0]);
            }
            f18809b = false;
        }
    }

    /* renamed from: a */
    public static void m26188a(Activity activity) {
        if (f18808a && !f18809b) {
            Class s = App.m25677s("com.seattleclouds.ads.airpush.AirPushManager");
            if (s == null) {
                f18808a = false;
                return;
            }
            try {
                Method method = s.getMethod("createInstance", new Class[]{Activity.class});
                f18809b = true;
                try {
                    method.invoke(null, new Object[]{activity});
                } catch (Exception e) {
                    Log.i("AirPush", "init", e);
                    f18808a = false;
                }
            } catch (NoSuchMethodException e2) {
                Log.i("AirPush", "init", e2);
                f18808a = false;
            }
        }
    }

    /* renamed from: a */
    public static void m26189a(View view) {
        Method a = App.m25615a("com.seattleclouds.ads.airpush.AirPushManager", "stopAdView", (Class<?>[]) new Class[]{View.class});
        if (a != null) {
            App.m25613a(a, (Object) null, view);
        }
    }

    /* renamed from: b */
    public static C5245a m26190b() {
        Method a = App.m25615a("com.seattleclouds.ads.airpush.AirPushManager", "getInstance", (Class<?>[]) new Class[0]);
        if (a == null) {
            return null;
        }
        try {
            return (C5245a) App.m25613a(a, (Object) null, new Object[0]);
        } catch (IllegalStateException e) {
            Log.i("AirPush", "get", e);
            return null;
        }
    }
}

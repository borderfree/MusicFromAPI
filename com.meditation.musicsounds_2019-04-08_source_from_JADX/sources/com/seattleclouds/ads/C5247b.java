package com.seattleclouds.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.seattleclouds.App;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.seattleclouds.ads.b */
public class C5247b {
    /* renamed from: a */
    public static Object m26191a(Context context) {
        Method a = App.m25615a("com.seattleclouds.ads.InterstitialAdManager", "getInstance", (Class<?>[]) new Class[]{Context.class});
        if (a == null) {
            return null;
        }
        return App.m25613a(a, (Object) null, context);
    }

    /* renamed from: a */
    public static void m26192a(Activity activity) {
        if (!C5260d.m26241a().mo17273c()) {
            Method a = App.m25615a("com.seattleclouds.ads.InterstitialAdManager", "displayInterstitial", (Class<?>[]) new Class[]{Activity.class});
            if (a != null) {
                Object a2 = m26191a((Context) activity);
                if (a2 != null) {
                    try {
                        a.invoke(a2, new Object[]{activity});
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m26193a(Activity activity, Bundle bundle) {
        if (!C5260d.m26241a().mo17273c()) {
            Method a = App.m25615a("com.seattleclouds.ads.InterstitialAdManager", "displayInterstitial", (Class<?>[]) new Class[]{Activity.class, Bundle.class});
            if (a != null) {
                Object a2 = m26191a((Context) activity);
                if (a2 != null) {
                    try {
                        a.invoke(a2, new Object[]{activity, bundle});
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m26194b(Activity activity) {
        Method a = App.m25615a("com.seattleclouds.ads.InterstitialAdManager", "initAirPush", (Class<?>[]) new Class[]{Activity.class});
        if (a != null) {
            Object a2 = m26191a((Context) activity);
            if (a2 != null) {
                try {
                    a.invoke(a2, new Object[]{activity});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m26195b(Context context) {
        Method a = App.m25615a("com.seattleclouds.ads.InterstitialAdManager", "preloadInterstitial", (Class<?>[]) new Class[0]);
        if (a != null) {
            Object a2 = m26191a(context);
            if (a2 != null) {
                try {
                    a.invoke(a2, new Object[0]);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m26196c(Activity activity) {
        Method a = App.m25615a("com.seattleclouds.ads.InterstitialAdManager", "deInitAirPush", (Class<?>[]) new Class[0]);
        if (a != null) {
            Object a2 = m26191a((Context) activity);
            if (a2 != null) {
                try {
                    a.invoke(a2, new Object[0]);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}

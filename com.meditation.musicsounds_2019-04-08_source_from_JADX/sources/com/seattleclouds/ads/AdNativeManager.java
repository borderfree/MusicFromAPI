package com.seattleclouds.ads;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;

public class AdNativeManager {

    /* renamed from: a */
    public static int f18772a = 100;

    public enum NativeAdsAlignmentType {
        NATIVE_ADS_TOP,
        NATIVE_ADS_BOTTOM
    }

    /* renamed from: a */
    public static int m26106a(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        Object a = App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilNativeListView", "getIndex", (Class<?>[]) new Class[]{Integer.TYPE}), obj, Integer.valueOf(i));
        return a instanceof Integer ? ((Integer) a).intValue() : i;
    }

    /* renamed from: a */
    public static View m26107a(Object obj, int i, int i2) {
        if (obj == null) {
            return null;
        }
        Object a = App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilNativeListView", "getView", (Class<?>[]) new Class[]{Integer.TYPE, Integer.TYPE}), obj, Integer.valueOf(i), Integer.valueOf(i2));
        if (a instanceof View) {
            return (View) a;
        }
        return null;
    }

    /* renamed from: a */
    public static LinearLayout m26108a(Activity activity, C5230aa aaVar) {
        if (aaVar == null || activity == null) {
            return null;
        }
        int s = aaVar.mo17184s();
        int t = aaVar.mo17187t();
        if (s == 100) {
            s = App.f18501c.mo16987v();
        }
        if (t == 100) {
            t = App.f18501c.mo16988w();
        }
        if (s != 8 && t != 8) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setBackgroundColor(0);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        linearLayout.setVisibility(8);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(1);
        layoutTransition.setStartDelay(2, 0);
        linearLayout.setLayoutTransition(layoutTransition);
        return linearLayout;
    }

    /* renamed from: a */
    public static NativeAdsAlignmentType m26109a(C5230aa aaVar) {
        int s = aaVar != null ? aaVar.mo17184s() : 0;
        if (s == 100) {
            s = App.f18501c.mo16987v();
        }
        return s == 8 ? NativeAdsAlignmentType.NATIVE_ADS_TOP : NativeAdsAlignmentType.NATIVE_ADS_BOTTOM;
    }

    /* renamed from: a */
    public static Object m26110a(Activity activity, C0926a aVar, int i, int i2) {
        return App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilNative", "createNativeAds", (Class<?>[]) new Class[]{Activity.class, C0926a.class, Integer.TYPE, Integer.TYPE}), (Object) null, activity, aVar, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static void m26111a(Activity activity, LinearLayout linearLayout, int i) {
        App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilNative", "createNativeAds", (Class<?>[]) new Class[]{Activity.class, LinearLayout.class, Integer.TYPE}), (Object) null, activity, linearLayout, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static boolean m26112a(Object obj) {
        if (obj == null) {
            return false;
        }
        Object a = App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilNativeListView", "isNativeAdsLoad", (Class<?>[]) new Class[0]), obj, new Object[0]);
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public static int m26113b(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        Object a = App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilNativeListView", "getCount", (Class<?>[]) new Class[]{Integer.TYPE}), obj, Integer.valueOf(i));
        return a instanceof Integer ? ((Integer) a).intValue() : i;
    }
}

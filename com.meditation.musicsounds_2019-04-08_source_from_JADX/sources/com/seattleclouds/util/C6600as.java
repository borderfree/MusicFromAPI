package com.seattleclouds.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.widget.TabLayout;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.widget.ActionBarOverlayLayout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.bitmapfun.C2429g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.seattleclouds.util.as */
public class C6600as {

    /* renamed from: a */
    private static final AtomicInteger f23319a = new AtomicInteger(1);

    /* renamed from: a */
    public static int m31942a() {
        int i;
        int i2;
        if (VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f23319a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f23319a.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static int m31943a(Context context, View view, View view2, View view3, int i) {
        int c = C6619m.m32020c(context);
        int b = C6619m.m32017b(context);
        int measuredWidth = view3.getMeasuredWidth();
        int measuredHeight = view3.getMeasuredHeight();
        int measuredHeight2 = view2.getMeasuredHeight();
        if (i == -1) {
            i = measuredHeight > measuredWidth ? measuredHeight : b - (c - measuredHeight2);
        } else if (measuredHeight2 > i) {
            i = measuredHeight2;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        return i;
    }

    /* renamed from: a */
    public static void m31944a(Activity activity, View view) {
        m31948b(activity, view);
        if (activity != null) {
            view.clearFocus();
        }
    }

    /* renamed from: a */
    public static void m31945a(TabLayout tabLayout, int i) {
        try {
            Field declaredField = tabLayout.getClass().getDeclaredField("mTabStrip");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tabLayout);
            C6575ad.m31825a(obj.getClass(), "setSelectedIndicatorColor").invoke(obj, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("ViewUtil", "Failed to setTabIndicatorColor via reflection", e);
        }
    }

    /* renamed from: a */
    public static void m31946a(C0767e eVar) {
        if (C6619m.m32021c()) {
            eVar.mo3083i().mo2985a(0.0f);
        }
        View findViewById = eVar.findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            ((FrameLayout) findViewById).setForeground(null);
        }
        while (findViewById.getParent() != null) {
            findViewById = (View) findViewById.getParent();
            if (findViewById instanceof ActionBarOverlayLayout) {
                ((ActionBarOverlayLayout) findViewById).setWillNotDraw(true);
                return;
            }
        }
    }

    @TargetApi(12)
    /* renamed from: a */
    public static void m31947a(View view, final View view2, int i) {
        if (!C2429g.m11310d()) {
            view.setVisibility(0);
            view2.setVisibility(8);
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        long j = (long) i;
        view.animate().alpha(1.0f).setDuration(j).setListener(null);
        view2.animate().alpha(0.0f).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view2.setVisibility(8);
            }
        });
    }

    /* renamed from: b */
    public static void m31948b(Activity activity, View view) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }
}

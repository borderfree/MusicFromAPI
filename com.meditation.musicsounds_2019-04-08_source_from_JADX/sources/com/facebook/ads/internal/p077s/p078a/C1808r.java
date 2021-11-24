package com.facebook.ads.internal.p077s.p078a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.s.a.r */
public class C1808r {

    /* renamed from: a */
    public static final DisplayMetrics f5898a = Resources.getSystem().getDisplayMetrics();

    /* renamed from: b */
    public static final float f5899b = f5898a.density;

    /* renamed from: c */
    private static final AtomicInteger f5900c = new AtomicInteger(1);

    /* renamed from: a */
    public static int m8929a() {
        int i;
        int i2;
        do {
            i = f5900c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f5900c.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static int m8930a(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, f5898a);
    }

    /* renamed from: a */
    public static void m8931a(View view) {
        view.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : m8929a());
    }

    /* renamed from: a */
    public static void m8932a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    /* renamed from: a */
    public static void m8933a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m8934a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT > 19) {
            m8935a(viewGroup, 200);
        }
    }

    /* renamed from: a */
    public static void m8935a(ViewGroup viewGroup, int i) {
        if (VERSION.SDK_INT > 19) {
            m8937a(viewGroup, (Transition) new AutoTransition(), i);
        }
    }

    /* renamed from: a */
    public static void m8936a(ViewGroup viewGroup, Transition transition) {
        if (VERSION.SDK_INT > 19) {
            m8937a(viewGroup, transition, 200);
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private static void m8937a(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration((long) i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    /* renamed from: a */
    public static void m8938a(TextView textView, boolean z, int i) {
        Typeface typeface;
        Typeface typeface2;
        int i2 = 0;
        if (!z) {
            typeface2 = Typeface.SANS_SERIF;
        } else if (VERSION.SDK_INT >= 21) {
            typeface = Typeface.create("sans-serif-medium", 0);
            textView.setTypeface(typeface);
            textView.setTextSize(2, (float) i);
        } else {
            typeface2 = Typeface.SANS_SERIF;
            i2 = 1;
        }
        typeface = Typeface.create(typeface2, i2);
        textView.setTypeface(typeface);
        textView.setTextSize(2, (float) i);
    }

    /* renamed from: a */
    public static void m8939a(View... viewArr) {
        for (View b : viewArr) {
            m8940b(b);
        }
    }

    /* renamed from: b */
    public static void m8940b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: c */
    public static void m8941c(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            m8934a((ViewGroup) parent);
        }
    }
}

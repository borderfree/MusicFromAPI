package com.seattleclouds.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p007d.p008a.C0079i;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.widget.C1108h;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: com.seattleclouds.util.g */
public class C6611g {
    /* renamed from: a */
    public static Drawable m31973a(Context context, int i) {
        return VERSION.SDK_INT < 23 ? C0079i.m215a(context.getResources(), i, context.getTheme()) : context.getResources().getDrawable(i, context.getTheme());
    }

    /* renamed from: a */
    public static Drawable m31974a(Context context, int i, int i2) {
        return m31975a(C0452b.m2059a(context, i), i2);
    }

    /* renamed from: a */
    public static Drawable m31975a(Drawable drawable, int i) {
        Drawable g = C0311a.m1186g(drawable.mutate());
        C0311a.m1173a(g, i);
        return g;
    }

    /* renamed from: a */
    public static Drawable m31976a(Drawable drawable, ColorStateList colorStateList) {
        Drawable g = C0311a.m1186g(drawable.mutate());
        C0311a.m1175a(g, colorStateList);
        return g;
    }

    /* renamed from: a */
    public static void m31977a(Context context, int i, TextView textView) {
        if (VERSION.SDK_INT < 23) {
            textView.setTextAppearance(context, i);
        } else {
            textView.setTextAppearance(i);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public static void m31978a(View view, Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public static void m31979a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: a */
    public static void m31980a(Button button, ColorStateList colorStateList) {
        if (VERSION.SDK_INT != 21 || !(button instanceof C1108h)) {
            C0626s.m2840a((View) button, colorStateList);
        } else {
            ((C1108h) button).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31981a(android.widget.EditText r5, int r6) {
        /*
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            java.lang.String r1 = "mCursorDrawableRes"
            java.lang.Object r0 = com.seattleclouds.util.C6575ad.m31824a(r0, r5, r1)     // Catch:{ Throwable -> 0x0046 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Throwable -> 0x0046 }
            int r0 = r0.intValue()     // Catch:{ Throwable -> 0x0046 }
            android.content.Context r1 = r5.getContext()
            r2 = 2
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            android.graphics.drawable.Drawable r3 = android.support.p009v4.content.C0452b.m2059a(r1, r0)
            r4 = 0
            r2[r4] = r3
            android.graphics.drawable.Drawable r0 = android.support.p009v4.content.C0452b.m2059a(r1, r0)
            r1 = 1
            r2[r1] = r0
            r0 = r2[r4]
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r6, r3)
            r0 = r2[r1]
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r6, r1)
            java.lang.Class<android.widget.TextView> r6 = android.widget.TextView.class
            java.lang.String r0 = "mEditor"
            java.lang.Object r6 = com.seattleclouds.util.C6575ad.m31824a(r6, r5, r0)     // Catch:{ Throwable -> 0x003f }
            java.lang.String r0 = "mCursorDrawable"
            com.seattleclouds.util.C6575ad.m31827a(r6, r0, r2)     // Catch:{ Throwable -> 0x003f }
            goto L_0x0046
        L_0x003f:
            java.lang.Class<android.widget.TextView> r6 = android.widget.TextView.class
            java.lang.String r0 = "mCursorDrawable"
            com.seattleclouds.util.C6575ad.m31826a(r6, r5, r0, r2)     // Catch:{  }
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6611g.m31981a(android.widget.EditText, int):void");
    }

    /* renamed from: b */
    public static void m31982b(EditText editText, int i) {
        Drawable[] c = m31983c(editText, i);
        if (c != null) {
            try {
                Object a = C6575ad.m31824a(TextView.class, (Object) editText, "mEditor");
                C6575ad.m31827a(a, "mSelectHandleLeft", (Object) c[0]);
                C6575ad.m31827a(a, "mSelectHandleCenter", (Object) c[1]);
                C6575ad.m31827a(a, "mSelectHandleRight", (Object) c[2]);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static Drawable[] m31983c(EditText editText, int i) {
        Drawable[] drawableArr = new Drawable[3];
        Class<TextView> cls = TextView.class;
        try {
            drawableArr[0] = m31974a(editText.getContext(), ((Integer) C6575ad.m31824a(cls, (Object) editText, "mTextSelectHandleLeftRes")).intValue(), i);
            drawableArr[1] = m31974a(editText.getContext(), ((Integer) C6575ad.m31824a(cls, (Object) editText, "mTextSelectHandleRes")).intValue(), i);
            drawableArr[2] = m31974a(editText.getContext(), ((Integer) C6575ad.m31824a(cls, (Object) editText, "mTextSelectHandleRightRes")).intValue(), i);
            return drawableArr;
        } catch (Throwable unused) {
            return null;
        }
    }
}

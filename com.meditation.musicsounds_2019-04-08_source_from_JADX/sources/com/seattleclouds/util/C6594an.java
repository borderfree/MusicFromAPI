package com.seattleclouds.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p007d.p008a.C0079i;
import android.support.p009v4.p010a.C0310a;
import android.util.TypedValue;

/* renamed from: com.seattleclouds.util.an */
public class C6594an {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f23309a = new ThreadLocal<>();

    /* renamed from: b */
    private static final int[] f23310b = new int[1];

    /* renamed from: a */
    public static int m31917a(Context context, int i) {
        f23310b[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f23310b);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static int m31918a(Context context, int i, float f) {
        int a = m31917a(context, i);
        return C0310a.m1169b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    private static TypedValue m31919a() {
        TypedValue typedValue = (TypedValue) f23309a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f23309a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static ColorStateList m31920b(Context context, int i) {
        f23310b[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f23310b);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static boolean m31921c(Context context, int i) {
        f23310b[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f23310b);
        try {
            return obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static int m31922d(Context context, int i) {
        TypedValue a = m31919a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return C6610f.m31968a(i, a.getFloat());
    }

    /* renamed from: e */
    public static int m31923e(Context context, int i) {
        ColorStateList b = m31920b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(C6610f.f23326b, b.getDefaultColor());
        }
        TypedValue a = m31919a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m31918a(context, i, a.getFloat());
    }

    /* renamed from: f */
    public static Drawable m31924f(Context context, int i) {
        f23310b[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f23310b);
        try {
            return obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: g */
    public static Drawable m31925g(Context context, int i) {
        f23310b[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f23310b);
        try {
            return C0079i.m215a(context.getResources(), obtainStyledAttributes.getResourceId(0, 0), context.getTheme());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

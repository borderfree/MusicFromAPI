package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p009v4.p010a.C0310a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bf */
class C1073bf {

    /* renamed from: a */
    static final int[] f3731a = {-16842910};

    /* renamed from: b */
    static final int[] f3732b = {16842908};

    /* renamed from: c */
    static final int[] f3733c = {16843518};

    /* renamed from: d */
    static final int[] f3734d = {16842919};

    /* renamed from: e */
    static final int[] f3735e = {16842912};

    /* renamed from: f */
    static final int[] f3736f = {16842913};

    /* renamed from: g */
    static final int[] f3737g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f3738h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f3739i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f3740j = new int[1];

    /* renamed from: a */
    public static int m5869a(Context context, int i) {
        f3740j[0] = i;
        C1078bk a = C1078bk.m5880a(context, (AttributeSet) null, f3740j);
        try {
            return a.mo5360b(0, 0);
        } finally {
            a.mo5358a();
        }
    }

    /* renamed from: a */
    static int m5870a(Context context, int i, float f) {
        int a = m5869a(context, i);
        return C0310a.m1169b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    private static TypedValue m5871a() {
        TypedValue typedValue = (TypedValue) f3739i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f3739i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static ColorStateList m5872b(Context context, int i) {
        f3740j[0] = i;
        C1078bk a = C1078bk.m5880a(context, (AttributeSet) null, f3740j);
        try {
            return a.mo5367e(0);
        } finally {
            a.mo5358a();
        }
    }

    /* renamed from: c */
    public static int m5873c(Context context, int i) {
        ColorStateList b = m5872b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f3731a, b.getDefaultColor());
        }
        TypedValue a = m5871a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m5870a(context, i, a.getFloat());
    }
}

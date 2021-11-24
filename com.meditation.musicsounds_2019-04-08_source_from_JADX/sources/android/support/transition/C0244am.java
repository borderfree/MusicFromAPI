package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0626s;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.transition.am */
class C0244am {

    /* renamed from: a */
    static final Property<View, Float> f713a = new Property<View, Float>(Float.class, "translationAlpha") {
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0244am.m949c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C0244am.m943a(view, f.floatValue());
        }
    };

    /* renamed from: b */
    static final Property<View, Rect> f714b = new Property<View, Rect>(Rect.class, "clipBounds") {
        /* renamed from: a */
        public Rect get(View view) {
            return C0626s.m2882y(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C0626s.m2842a(view, rect);
        }
    };

    /* renamed from: c */
    private static final C0252as f715c;

    /* renamed from: d */
    private static Field f716d;

    /* renamed from: e */
    private static boolean f717e;

    static {
        C0252as anVar = VERSION.SDK_INT >= 22 ? new C0251ar() : VERSION.SDK_INT >= 21 ? new C0250aq() : VERSION.SDK_INT >= 19 ? new C0249ap() : VERSION.SDK_INT >= 18 ? new C0248ao() : new C0247an();
        f715c = anVar;
    }

    /* renamed from: a */
    static C0243al m941a(View view) {
        return f715c.mo1004a(view);
    }

    /* renamed from: a */
    private static void m942a() {
        if (!f717e) {
            try {
                f716d = View.class.getDeclaredField("mViewFlags");
                f716d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f717e = true;
        }
    }

    /* renamed from: a */
    static void m943a(View view, float f) {
        f715c.mo1005a(view, f);
    }

    /* renamed from: a */
    static void m944a(View view, int i) {
        m942a();
        if (f716d != null) {
            try {
                f716d.setInt(view, i | (f716d.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    static void m945a(View view, int i, int i2, int i3, int i4) {
        f715c.mo1006a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    static void m946a(View view, Matrix matrix) {
        f715c.mo1007a(view, matrix);
    }

    /* renamed from: b */
    static C0259aw m947b(View view) {
        return f715c.mo1008b(view);
    }

    /* renamed from: b */
    static void m948b(View view, Matrix matrix) {
        f715c.mo1009b(view, matrix);
    }

    /* renamed from: c */
    static float m949c(View view) {
        return f715c.mo1010c(view);
    }

    /* renamed from: d */
    static void m950d(View view) {
        f715c.mo1011d(view);
    }

    /* renamed from: e */
    static void m951e(View view) {
        f715c.mo1012e(view);
    }
}

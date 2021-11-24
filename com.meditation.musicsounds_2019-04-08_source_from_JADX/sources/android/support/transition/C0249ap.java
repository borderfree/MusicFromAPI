package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ap */
class C0249ap extends C0248ao {

    /* renamed from: a */
    private static Method f718a;

    /* renamed from: b */
    private static boolean f719b;

    /* renamed from: c */
    private static Method f720c;

    /* renamed from: d */
    private static boolean f721d;

    C0249ap() {
    }

    /* renamed from: a */
    private void m967a() {
        if (!f719b) {
            try {
                f718a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f718a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f719b = true;
        }
    }

    /* renamed from: b */
    private void m968b() {
        if (!f721d) {
            try {
                f720c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f720c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f721d = true;
        }
    }

    /* renamed from: a */
    public void mo1005a(View view, float f) {
        m967a();
        if (f718a != null) {
            try {
                f718a.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: c */
    public float mo1010c(View view) {
        m968b();
        if (f720c != null) {
            try {
                return ((Float) f720c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo1010c(view);
    }

    /* renamed from: d */
    public void mo1011d(View view) {
    }

    /* renamed from: e */
    public void mo1012e(View view) {
    }
}

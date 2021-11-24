package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.aq */
class C0250aq extends C0249ap {

    /* renamed from: a */
    private static Method f722a;

    /* renamed from: b */
    private static boolean f723b;

    /* renamed from: c */
    private static Method f724c;

    /* renamed from: d */
    private static boolean f725d;

    C0250aq() {
    }

    /* renamed from: a */
    private void m973a() {
        if (!f723b) {
            try {
                f722a = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f722a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f723b = true;
        }
    }

    /* renamed from: b */
    private void m974b() {
        if (!f725d) {
            try {
                f724c = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f724c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f725d = true;
        }
    }

    /* renamed from: a */
    public void mo1007a(View view, Matrix matrix) {
        m973a();
        if (f722a != null) {
            try {
                f722a.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public void mo1009b(View view, Matrix matrix) {
        m974b();
        if (f724c != null) {
            try {
                f724c.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}

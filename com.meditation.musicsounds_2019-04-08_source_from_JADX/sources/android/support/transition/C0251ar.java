package android.support.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ar */
class C0251ar extends C0250aq {

    /* renamed from: a */
    private static Method f726a;

    /* renamed from: b */
    private static boolean f727b;

    C0251ar() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m977a() {
        if (!f727b) {
            try {
                f726a = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f726a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f727b = true;
        }
    }

    /* renamed from: a */
    public void mo1006a(View view, int i, int i2, int i3, int i4) {
        m977a();
        if (f726a != null) {
            try {
                f726a.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}

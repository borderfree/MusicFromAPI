package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ah */
class C0238ah extends C0236ag {

    /* renamed from: a */
    private static Method f704a;

    /* renamed from: b */
    private static boolean f705b;

    C0238ah() {
    }

    /* renamed from: a */
    private void m922a() {
        if (!f705b) {
            try {
                f704a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f704a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f705b = true;
        }
    }

    /* renamed from: a */
    public C0234ae mo982a(ViewGroup viewGroup) {
        return new C0233ad(viewGroup);
    }

    /* renamed from: a */
    public void mo983a(ViewGroup viewGroup, boolean z) {
        String str;
        String str2;
        m922a();
        if (f704a != null) {
            try {
                f704a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
                return;
            } catch (IllegalAccessException e) {
                e = e;
                str = "ViewUtilsApi18";
                str2 = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e2) {
                e = e2;
                str = "ViewUtilsApi18";
                str2 = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i(str, str2, e);
    }
}

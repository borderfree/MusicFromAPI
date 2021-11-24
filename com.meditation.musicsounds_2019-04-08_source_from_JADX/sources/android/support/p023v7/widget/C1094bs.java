package android.support.p023v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0626s;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.bs */
public class C1094bs {

    /* renamed from: a */
    private static Method f3809a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f3809a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f3809a.isAccessible()) {
                    f3809a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m6003a(View view, Rect rect, Rect rect2) {
        if (f3809a != null) {
            try {
                f3809a.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m6004a(View view) {
        return C0626s.m2861e(view) == 1;
    }

    /* renamed from: b */
    public static void m6005b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            }
        }
    }
}

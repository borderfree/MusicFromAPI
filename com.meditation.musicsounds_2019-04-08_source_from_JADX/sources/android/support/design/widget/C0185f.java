package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.design.widget.f */
class C0185f {

    /* renamed from: a */
    private static Method f571a;

    /* renamed from: b */
    private static boolean f572b;

    /* renamed from: a */
    static boolean m721a(DrawableContainer drawableContainer, ConstantState constantState) {
        return m722b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m722b(DrawableContainer drawableContainer, ConstantState constantState) {
        if (!f572b) {
            try {
                f571a = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f571a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }
            f572b = true;
        }
        if (f571a != null) {
            try {
                f571a.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}

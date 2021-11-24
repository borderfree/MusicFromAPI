package android.support.p009v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.view.t */
public final class C0638t {

    /* renamed from: a */
    private static Method f1801a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f1801a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static float m2986a(ViewConfiguration viewConfiguration, Context context) {
        return VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : m2989c(viewConfiguration, context);
    }

    @Deprecated
    /* renamed from: a */
    public static int m2987a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: b */
    public static float m2988b(ViewConfiguration viewConfiguration, Context context) {
        return VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : m2989c(viewConfiguration, context);
    }

    /* renamed from: c */
    private static float m2989c(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25 && f1801a != null) {
            try {
                return (float) ((Integer) f1801a.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}

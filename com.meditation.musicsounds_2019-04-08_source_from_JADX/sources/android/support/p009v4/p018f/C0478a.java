package android.support.p009v4.p018f;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: android.support.v4.f.a */
public final class C0478a {

    /* renamed from: a */
    private static Method f1438a;

    /* renamed from: b */
    private static Method f1439b;

    static {
        if (VERSION.SDK_INT >= 21) {
            try {
                f1439b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f1438a = cls.getMethod("getScript", new Class[]{String.class});
                    f1439b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception e2) {
                f1438a = null;
                f1439b = null;
                Log.w("ICUCompat", e2);
            }
        }
    }

    /* renamed from: a */
    private static String m2148a(String str) {
        try {
            if (f1438a != null) {
                return (String) f1438a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: a */
    public static String m2149a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f1439b.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String b = m2150b(locale);
            if (b != null) {
                return m2148a(b);
            }
            return null;
        }
    }

    /* renamed from: b */
    private static String m2150b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f1439b != null) {
                return (String) f1439b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }
}

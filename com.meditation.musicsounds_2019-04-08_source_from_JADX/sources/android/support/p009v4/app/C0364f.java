package android.support.p009v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.f */
public final class C0364f {

    /* renamed from: android.support.v4.app.f$a */
    static class C0365a {

        /* renamed from: a */
        private static Method f1059a;

        /* renamed from: b */
        private static boolean f1060b;

        /* renamed from: c */
        private static Method f1061c;

        /* renamed from: d */
        private static boolean f1062d;

        /* renamed from: a */
        public static IBinder m1535a(Bundle bundle, String str) {
            if (!f1060b) {
                try {
                    f1059a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1059a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1060b = true;
            }
            if (f1059a != null) {
                try {
                    return (IBinder) f1059a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f1059a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1536a(Bundle bundle, String str, IBinder iBinder) {
            if (!f1062d) {
                try {
                    f1061c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1061c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f1062d = true;
            }
            if (f1061c != null) {
                try {
                    f1061c.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f1061c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m1533a(Bundle bundle, String str) {
        return VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0365a.m1535a(bundle, str);
    }

    /* renamed from: a */
    public static void m1534a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0365a.m1536a(bundle, str, iBinder);
        }
    }
}

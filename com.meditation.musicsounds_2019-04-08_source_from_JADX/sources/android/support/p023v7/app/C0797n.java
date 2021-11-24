package android.support.p023v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.n */
class C0797n {

    /* renamed from: a */
    private static Field f2331a;

    /* renamed from: b */
    private static boolean f2332b;

    /* renamed from: c */
    private static Class f2333c;

    /* renamed from: d */
    private static boolean f2334d;

    /* renamed from: e */
    private static Field f2335e;

    /* renamed from: f */
    private static boolean f2336f;

    /* renamed from: g */
    private static Field f2337g;

    /* renamed from: h */
    private static boolean f2338h;

    /* renamed from: a */
    static boolean m3744a(Resources resources) {
        if (VERSION.SDK_INT >= 24) {
            return m3748d(resources);
        }
        if (VERSION.SDK_INT >= 23) {
            return m3747c(resources);
        }
        if (VERSION.SDK_INT >= 21) {
            return m3746b(resources);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3745a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2334d) {
            try {
                f2333c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2334d = true;
        }
        if (f2333c == null) {
            return false;
        }
        if (!f2336f) {
            try {
                f2335e = f2333c.getDeclaredField("mUnthemedEntries");
                f2335e.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2336f = true;
        }
        if (f2335e == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) f2335e.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    /* renamed from: b */
    private static boolean m3746b(Resources resources) {
        Map map;
        if (!f2332b) {
            try {
                f2331a = Resources.class.getDeclaredField("mDrawableCache");
                f2331a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2332b = true;
        }
        if (f2331a != null) {
            try {
                map = (Map) f2331a.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m3747c(android.content.res.Resources r4) {
        /*
            boolean r0 = f2332b
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0015 }
            f2331a = r0     // Catch:{ NoSuchFieldException -> 0x0015 }
            java.lang.reflect.Field r0 = f2331a     // Catch:{ NoSuchFieldException -> 0x0015 }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r0 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r2, r3, r0)
        L_0x001d:
            f2332b = r1
        L_0x001f:
            r0 = 0
            java.lang.reflect.Field r2 = f2331a
            if (r2 == 0) goto L_0x0033
            java.lang.reflect.Field r2 = f2331a     // Catch:{ IllegalAccessException -> 0x002b }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ IllegalAccessException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r4 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r2, r3, r4)
        L_0x0033:
            r4 = r0
        L_0x0034:
            r0 = 0
            if (r4 != 0) goto L_0x0038
            return r0
        L_0x0038:
            if (r4 == 0) goto L_0x0041
            boolean r4 = m3745a(r4)
            if (r4 == 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.app.C0797n.m3747c(android.content.res.Resources):boolean");
    }

    /* renamed from: d */
    private static boolean m3748d(Resources resources) {
        Object obj;
        Object obj2;
        boolean z = true;
        if (!f2338h) {
            try {
                f2337g = Resources.class.getDeclaredField("mResourcesImpl");
                f2337g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2338h = true;
        }
        if (f2337g == null) {
            return false;
        }
        try {
            obj = f2337g.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f2332b) {
            try {
                f2331a = obj.getClass().getDeclaredField("mDrawableCache");
                f2331a.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f2332b = true;
        }
        if (f2331a != null) {
            try {
                obj2 = f2331a.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
            if (obj2 == null || !m3745a(obj2)) {
                z = false;
            }
            return z;
        }
        obj2 = null;
        z = false;
        return z;
    }
}

package com.facebook.ads.internal.p077s.p078a;

import android.app.Activity;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.a.a */
public class C1785a {
    /* renamed from: a */
    public static Activity m8872a() {
        try {
            return m8873b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Activity m8873b() {
        Class cls = Class.forName("android.app.ActivityThread");
        Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(invoke);
        if (map == null) {
            return null;
        }
        for (Object next : map.values()) {
            Class cls2 = next.getClass();
            Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(next)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(next);
            }
        }
        return null;
    }
}

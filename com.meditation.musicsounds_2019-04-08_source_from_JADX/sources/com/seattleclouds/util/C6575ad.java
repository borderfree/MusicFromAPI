package com.seattleclouds.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.seattleclouds.util.ad */
public class C6575ad {
    /* renamed from: a */
    public static Object m31824a(Class<?> cls, Object obj, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: a */
    public static Method m31825a(Class<?> cls, String str) {
        Method method;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int i = 0;
        while (true) {
            if (i >= declaredMethods.length) {
                method = null;
                break;
            } else if (declaredMethods[i].getName().equals(str)) {
                method = declaredMethods[i];
                method.setAccessible(true);
                break;
            } else {
                i++;
            }
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException();
    }

    /* renamed from: a */
    public static void m31826a(Class<?> cls, Object obj, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    /* renamed from: a */
    public static void m31827a(Object obj, String str, Object obj2) {
        m31826a(obj.getClass(), obj, str, obj2);
    }
}

package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.d */
public final class C3327d<T> extends C3324a {

    /* renamed from: a */
    private final T f11234a;

    private C3327d(T t) {
        this.f11234a = t;
    }

    /* renamed from: a */
    public static <T> C3323b m15136a(T t) {
        return new C3327d(t);
    }

    /* renamed from: a */
    public static <T> T m15137a(C3323b bVar) {
        if (bVar instanceof C3327d) {
            return ((C3327d) bVar).f11234a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}

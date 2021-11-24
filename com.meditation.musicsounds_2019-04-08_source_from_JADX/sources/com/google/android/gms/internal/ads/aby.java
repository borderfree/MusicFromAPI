package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class aby {

    /* renamed from: a */
    private static final aby f11427a = new aby();

    /* renamed from: b */
    private final acf f11428b;

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, ace<?>> f11429c = new ConcurrentHashMap();

    private aby() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        acf acf = null;
        for (int i = 0; i <= 0; i++) {
            acf = m15555a(strArr[0]);
            if (acf != null) {
                break;
            }
        }
        if (acf == null) {
            acf = new abb();
        }
        this.f11428b = acf;
    }

    /* renamed from: a */
    public static aby m15554a() {
        return f11427a;
    }

    /* renamed from: a */
    private static acf m15555a(String str) {
        try {
            return (acf) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> ace<T> mo11567a(Class<T> cls) {
        aak.m15383a(cls, "messageType");
        ace<T> ace = (ace) this.f11429c.get(cls);
        if (ace != null) {
            return ace;
        }
        ace<T> a = this.f11428b.mo11540a(cls);
        aak.m15383a(cls, "messageType");
        aak.m15383a(a, "schema");
        ace ace2 = (ace) this.f11429c.putIfAbsent(cls, a);
        return ace2 != null ? ace2 : a;
    }

    /* renamed from: a */
    public final <T> ace<T> mo11568a(T t) {
        return mo11567a(t.getClass());
    }
}

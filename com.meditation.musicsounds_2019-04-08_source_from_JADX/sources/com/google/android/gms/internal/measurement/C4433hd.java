package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.hd */
final class C4433hd {

    /* renamed from: a */
    private static final C4433hd f16205a = new C4433hd();

    /* renamed from: b */
    private final C4438hi f16206b = new C4409gg();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C4437hh<?>> f16207c = new ConcurrentHashMap();

    private C4433hd() {
    }

    /* renamed from: a */
    public static C4433hd m21780a() {
        return f16205a;
    }

    /* renamed from: a */
    public final <T> C4437hh<T> mo14585a(Class<T> cls) {
        C4390fo.m21609a(cls, "messageType");
        C4437hh<T> hhVar = (C4437hh) this.f16207c.get(cls);
        if (hhVar != null) {
            return hhVar;
        }
        C4437hh<T> a = this.f16206b.mo14558a(cls);
        C4390fo.m21609a(cls, "messageType");
        C4390fo.m21609a(a, "schema");
        C4437hh hhVar2 = (C4437hh) this.f16207c.putIfAbsent(cls, a);
        return hhVar2 != null ? hhVar2 : a;
    }

    /* renamed from: a */
    public final <T> C4437hh<T> mo14586a(T t) {
        return mo14585a(t.getClass());
    }
}

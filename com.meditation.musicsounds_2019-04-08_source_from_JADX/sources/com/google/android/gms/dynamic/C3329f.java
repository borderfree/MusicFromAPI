package com.google.android.gms.dynamic;

import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.f */
final class C3329f implements C3328e<T> {

    /* renamed from: a */
    private final /* synthetic */ C3321a f11235a;

    C3329f(C3321a aVar) {
        this.f11235a = aVar;
    }

    /* renamed from: a */
    public final void mo11349a(T t) {
        this.f11235a.f11230a = t;
        Iterator it = this.f11235a.f11232c.iterator();
        while (it.hasNext()) {
            ((C3322a) it.next()).mo11342a(this.f11235a.f11230a);
        }
        this.f11235a.f11232c.clear();
        this.f11235a.f11231b = null;
    }
}

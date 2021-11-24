package com.bumptech.glide.load.resource.p054e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.e.f */
public class C1567f {

    /* renamed from: a */
    private final List<C1568a<?, ?>> f5073a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.e.f$a */
    private static final class C1568a<Z, R> {

        /* renamed from: a */
        final C1566e<Z, R> f5074a;

        /* renamed from: b */
        private final Class<Z> f5075b;

        /* renamed from: c */
        private final Class<R> f5076c;

        C1568a(Class<Z> cls, Class<R> cls2, C1566e<Z, R> eVar) {
            this.f5075b = cls;
            this.f5076c = cls2;
            this.f5074a = eVar;
        }

        /* renamed from: a */
        public boolean mo6413a(Class<?> cls, Class<?> cls2) {
            return this.f5075b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f5076c);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> C1566e<Z, R> mo6410a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1569g.m7749a();
        }
        for (C1568a aVar : this.f5073a) {
            if (aVar.mo6413a(cls, cls2)) {
                return aVar.f5074a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No transcoder registered to transcode from ");
        sb.append(cls);
        sb.append(" to ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public synchronized <Z, R> void mo6411a(Class<Z> cls, Class<R> cls2, C1566e<Z, R> eVar) {
        this.f5073a.add(new C1568a(cls, cls2, eVar));
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo6412b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1568a a : this.f5073a) {
            if (a.mo6413a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}

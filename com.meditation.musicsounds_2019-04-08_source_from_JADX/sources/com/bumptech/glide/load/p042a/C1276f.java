package com.bumptech.glide.load.p042a;

import com.bumptech.glide.load.p042a.C1274e.C1275a;
import com.bumptech.glide.p040g.C1257i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.f */
public class C1276f {

    /* renamed from: b */
    private static final C1275a<?> f4504b = new C1275a<Object>() {
        /* renamed from: a */
        public C1274e<Object> mo5949a(Object obj) {
            return new C1278a(obj);
        }

        /* renamed from: a */
        public Class<Object> mo5950a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };

    /* renamed from: a */
    private final Map<Class<?>, C1275a<?>> f4505a = new HashMap();

    /* renamed from: com.bumptech.glide.load.a.f$a */
    private static final class C1278a implements C1274e<Object> {

        /* renamed from: a */
        private final Object f4506a;

        C1278a(Object obj) {
            this.f4506a = obj;
        }

        /* renamed from: a */
        public Object mo5947a() {
            return this.f4506a;
        }

        /* renamed from: b */
        public void mo5948b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> C1274e<T> mo5951a(T t) {
        C1275a aVar;
        C1257i.m6691a(t);
        aVar = (C1275a) this.f4505a.get(t.getClass());
        if (aVar == null) {
            Iterator it = this.f4505a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1275a aVar2 = (C1275a) it.next();
                if (aVar2.mo5950a().isAssignableFrom(t.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f4504b;
        }
        return aVar.mo5949a(t);
    }

    /* renamed from: a */
    public synchronized void mo5952a(C1275a<?> aVar) {
        this.f4505a.put(aVar.mo5950a(), aVar);
    }
}

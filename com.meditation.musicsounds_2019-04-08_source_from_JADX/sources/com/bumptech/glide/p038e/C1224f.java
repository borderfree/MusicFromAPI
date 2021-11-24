package com.bumptech.glide.p038e;

import com.bumptech.glide.load.C1489g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.f */
public class C1224f {

    /* renamed from: a */
    private final List<C1225a<?>> f4407a = new ArrayList();

    /* renamed from: com.bumptech.glide.e.f$a */
    private static final class C1225a<T> {

        /* renamed from: a */
        final C1489g<T> f4408a;

        /* renamed from: b */
        private final Class<T> f4409b;

        C1225a(Class<T> cls, C1489g<T> gVar) {
            this.f4409b = cls;
            this.f4408a = gVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5830a(Class<?> cls) {
            return this.f4409b.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> C1489g<Z> mo5828a(Class<Z> cls) {
        int size = this.f4407a.size();
        for (int i = 0; i < size; i++) {
            C1225a aVar = (C1225a) this.f4407a.get(i);
            if (aVar.mo5830a(cls)) {
                return aVar.f4408a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <Z> void mo5829a(Class<Z> cls, C1489g<Z> gVar) {
        this.f4407a.add(new C1225a(cls, gVar));
    }
}

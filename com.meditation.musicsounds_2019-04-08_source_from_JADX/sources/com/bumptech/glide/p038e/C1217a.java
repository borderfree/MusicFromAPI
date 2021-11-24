package com.bumptech.glide.p038e;

import com.bumptech.glide.load.C1261a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.a */
public class C1217a {

    /* renamed from: a */
    private final List<C1218a<?>> f4393a = new ArrayList();

    /* renamed from: com.bumptech.glide.e.a$a */
    private static final class C1218a<T> {

        /* renamed from: a */
        final C1261a<T> f4394a;

        /* renamed from: b */
        private final Class<T> f4395b;

        C1218a(Class<T> cls, C1261a<T> aVar) {
            this.f4395b = cls;
            this.f4394a = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5815a(Class<?> cls) {
            return this.f4395b.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> C1261a<T> mo5813a(Class<T> cls) {
        for (C1218a aVar : this.f4393a) {
            if (aVar.mo5815a(cls)) {
                return aVar.f4394a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void mo5814a(Class<T> cls, C1261a<T> aVar) {
        this.f4393a.add(new C1218a(cls, aVar));
    }
}

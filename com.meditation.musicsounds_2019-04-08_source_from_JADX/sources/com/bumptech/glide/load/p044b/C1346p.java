package com.bumptech.glide.load.p044b;

import android.support.p009v4.p019g.C0505k.C0506a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.p */
public class C1346p {

    /* renamed from: a */
    private final C1351r f4588a;

    /* renamed from: b */
    private final C1347a f4589b;

    /* renamed from: com.bumptech.glide.load.b.p$a */
    private static class C1347a {

        /* renamed from: a */
        private final Map<Class<?>, C1348a<?>> f4590a = new HashMap();

        /* renamed from: com.bumptech.glide.load.b.p$a$a */
        private static class C1348a<Model> {

            /* renamed from: a */
            final List<C1343n<Model, ?>> f4591a;

            public C1348a(List<C1343n<Model, ?>> list) {
                this.f4591a = list;
            }
        }

        C1347a() {
        }

        /* renamed from: a */
        public <Model> List<C1343n<Model, ?>> mo6034a(Class<Model> cls) {
            C1348a aVar = (C1348a) this.f4590a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f4591a;
        }

        /* renamed from: a */
        public void mo6035a() {
            this.f4590a.clear();
        }

        /* renamed from: a */
        public <Model> void mo6036a(Class<Model> cls, List<C1343n<Model, ?>> list) {
            if (((C1348a) this.f4590a.put(cls, new C1348a(list))) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Already cached loaders for model: ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public C1346p(C0506a<List<Throwable>> aVar) {
        this(new C1351r(aVar));
    }

    private C1346p(C1351r rVar) {
        this.f4589b = new C1347a();
        this.f4588a = rVar;
    }

    /* renamed from: b */
    private static <A> Class<A> m6967b(A a) {
        return a.getClass();
    }

    /* renamed from: b */
    private <A> List<C1343n<A, ?>> m6968b(Class<A> cls) {
        List<C1343n<A, ?>> a = this.f4589b.mo6034a(cls);
        if (a != null) {
            return a;
        }
        List<C1343n<A, ?>> unmodifiableList = Collections.unmodifiableList(this.f4588a.mo6039a(cls));
        this.f4589b.mo6036a(cls, unmodifiableList);
        return unmodifiableList;
    }

    /* renamed from: a */
    public synchronized List<Class<?>> mo6031a(Class<?> cls) {
        return this.f4588a.mo6041b(cls);
    }

    /* renamed from: a */
    public synchronized <A> List<C1343n<A, ?>> mo6032a(A a) {
        ArrayList arrayList;
        List b = m6968b(m6967b(a));
        int size = b.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            C1343n nVar = (C1343n) b.get(i);
            if (nVar.mo5973a(a)) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo6033a(Class<Model> cls, Class<Data> cls2, C1345o<? extends Model, ? extends Data> oVar) {
        this.f4588a.mo6040a(cls, cls2, oVar);
        this.f4589b.mo6035a();
    }
}

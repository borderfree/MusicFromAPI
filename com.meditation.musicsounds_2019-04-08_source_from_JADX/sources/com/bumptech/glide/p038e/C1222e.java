package com.bumptech.glide.p038e;

import com.bumptech.glide.load.C1488f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.e.e */
public class C1222e {

    /* renamed from: a */
    private final List<String> f4402a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C1223a<?, ?>>> f4403b = new HashMap();

    /* renamed from: com.bumptech.glide.e.e$a */
    private static class C1223a<T, R> {

        /* renamed from: a */
        final Class<R> f4404a;

        /* renamed from: b */
        final C1488f<T, R> f4405b;

        /* renamed from: c */
        private final Class<T> f4406c;

        public C1223a(Class<T> cls, Class<R> cls2, C1488f<T, R> fVar) {
            this.f4406c = cls;
            this.f4404a = cls2;
            this.f4405b = fVar;
        }

        /* renamed from: a */
        public boolean mo5827a(Class<?> cls, Class<?> cls2) {
            return this.f4406c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4404a);
        }
    }

    /* renamed from: a */
    private synchronized List<C1223a<?, ?>> m6587a(String str) {
        List<C1223a<?, ?>> list;
        if (!this.f4402a.contains(str)) {
            this.f4402a.add(str);
        }
        list = (List) this.f4403b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f4403b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> List<C1488f<T, R>> mo5823a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f4402a) {
            List<C1223a> list = (List) this.f4403b.get(str);
            if (list != null) {
                for (C1223a aVar : list) {
                    if (aVar.mo5827a(cls, cls2)) {
                        arrayList.add(aVar.f4405b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo5824a(String str, C1488f<T, R> fVar, Class<T> cls, Class<R> cls2) {
        m6587a(str).add(new C1223a(cls, cls2, fVar));
    }

    /* renamed from: a */
    public synchronized void mo5825a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f4402a);
        this.f4402a.clear();
        this.f4402a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f4402a.add(str);
            }
        }
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo5826b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f4402a) {
            List<C1223a> list = (List) this.f4403b.get(str);
            if (list != null) {
                for (C1223a aVar : list) {
                    if (aVar.mo5827a(cls, cls2) && !arrayList.contains(aVar.f4404a)) {
                        arrayList.add(aVar.f4404a);
                    }
                }
            }
        }
        return arrayList;
    }
}

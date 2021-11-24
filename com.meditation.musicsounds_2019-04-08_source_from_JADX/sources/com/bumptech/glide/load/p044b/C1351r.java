package com.bumptech.glide.load.p044b;

import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p040g.C1257i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.r */
public class C1351r {

    /* renamed from: a */
    private static final C1354c f4600a = new C1354c();

    /* renamed from: b */
    private static final C1343n<Object, Object> f4601b = new C1352a();

    /* renamed from: c */
    private final List<C1353b<?, ?>> f4602c;

    /* renamed from: d */
    private final C1354c f4603d;

    /* renamed from: e */
    private final Set<C1353b<?, ?>> f4604e;

    /* renamed from: f */
    private final C0506a<List<Throwable>> f4605f;

    /* renamed from: com.bumptech.glide.load.b.r$a */
    private static class C1352a implements C1343n<Object, Object> {
        C1352a() {
        }

        /* renamed from: a */
        public C1344a<Object> mo5971a(Object obj, int i, int i2, C1379e eVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo5973a(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.r$b */
    private static class C1353b<Model, Data> {

        /* renamed from: a */
        final Class<Data> f4606a;

        /* renamed from: b */
        final C1345o<? extends Model, ? extends Data> f4607b;

        /* renamed from: c */
        private final Class<Model> f4608c;

        public C1353b(Class<Model> cls, Class<Data> cls2, C1345o<? extends Model, ? extends Data> oVar) {
            this.f4608c = cls;
            this.f4606a = cls2;
            this.f4607b = oVar;
        }

        /* renamed from: a */
        public boolean mo6042a(Class<?> cls) {
            return this.f4608c.isAssignableFrom(cls);
        }

        /* renamed from: a */
        public boolean mo6043a(Class<?> cls, Class<?> cls2) {
            return mo6042a(cls) && this.f4606a.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.r$c */
    static class C1354c {
        C1354c() {
        }

        /* renamed from: a */
        public <Model, Data> C1349q<Model, Data> mo6044a(List<C1343n<Model, Data>> list, C0506a<List<Throwable>> aVar) {
            return new C1349q<>(list, aVar);
        }
    }

    public C1351r(C0506a<List<Throwable>> aVar) {
        this(aVar, f4600a);
    }

    C1351r(C0506a<List<Throwable>> aVar, C1354c cVar) {
        this.f4602c = new ArrayList();
        this.f4604e = new HashSet();
        this.f4605f = aVar;
        this.f4603d = cVar;
    }

    /* renamed from: a */
    private static <Model, Data> C1343n<Model, Data> m6985a() {
        return f4601b;
    }

    /* renamed from: a */
    private <Model, Data> C1343n<Model, Data> m6986a(C1353b<?, ?> bVar) {
        return (C1343n) C1257i.m6691a(bVar.f4607b.mo5975a(this));
    }

    /* renamed from: a */
    private <Model, Data> void m6987a(Class<Model> cls, Class<Data> cls2, C1345o<? extends Model, ? extends Data> oVar, boolean z) {
        this.f4602c.add(z ? this.f4602c.size() : 0, new C1353b(cls, cls2, oVar));
    }

    /* renamed from: a */
    public synchronized <Model, Data> C1343n<Model, Data> mo6038a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1353b bVar : this.f4602c) {
                if (this.f4604e.contains(bVar)) {
                    z = true;
                } else if (bVar.mo6043a(cls, cls2)) {
                    this.f4604e.add(bVar);
                    arrayList.add(m6986a(bVar));
                    this.f4604e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f4603d.mo6044a(arrayList, this.f4605f);
            } else if (arrayList.size() == 1) {
                return (C1343n) arrayList.get(0);
            } else if (z) {
                return m6985a();
            } else {
                throw new NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f4604e.clear();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model> List<C1343n<Model, ?>> mo6039a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1353b bVar : this.f4602c) {
                if (!this.f4604e.contains(bVar)) {
                    if (bVar.mo6042a(cls)) {
                        this.f4604e.add(bVar);
                        arrayList.add(m6986a(bVar));
                        this.f4604e.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f4604e.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model, Data> void mo6040a(Class<Model> cls, Class<Data> cls2, C1345o<? extends Model, ? extends Data> oVar) {
        m6987a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<Class<?>> mo6041b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1353b bVar : this.f4602c) {
            if (!arrayList.contains(bVar.f4606a) && bVar.mo6042a(cls)) {
                arrayList.add(bVar.f4606a);
            }
        }
        return arrayList;
    }
}

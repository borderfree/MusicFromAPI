package com.bumptech.glide.load.engine;

import com.bumptech.glide.C1216e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1261a;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p047b.C1417a;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.load.resource.C1495b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.engine.f */
final class C1453f<Transcode> {

    /* renamed from: a */
    private final List<C1344a<?>> f4804a = new ArrayList();

    /* renamed from: b */
    private final List<C1375c> f4805b = new ArrayList();

    /* renamed from: c */
    private C1216e f4806c;

    /* renamed from: d */
    private Object f4807d;

    /* renamed from: e */
    private int f4808e;

    /* renamed from: f */
    private int f4809f;

    /* renamed from: g */
    private Class<?> f4810g;

    /* renamed from: h */
    private C1384d f4811h;

    /* renamed from: i */
    private C1379e f4812i;

    /* renamed from: j */
    private Map<Class<?>, C1490h<?>> f4813j;

    /* renamed from: k */
    private Class<Transcode> f4814k;

    /* renamed from: l */
    private boolean f4815l;

    /* renamed from: m */
    private boolean f4816m;

    /* renamed from: n */
    private C1375c f4817n;

    /* renamed from: o */
    private Priority f4818o;

    /* renamed from: p */
    private C1456h f4819p;

    /* renamed from: q */
    private boolean f4820q;

    /* renamed from: r */
    private boolean f4821r;

    C1453f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <X> C1261a<X> mo6216a(X x) {
        return this.f4806c.mo5810d().mo5680a(x);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C1343n<File, ?>> mo6217a(File file) {
        return this.f4806c.mo5810d().mo5687c(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6218a() {
        this.f4806c = null;
        this.f4807d = null;
        this.f4817n = null;
        this.f4810g = null;
        this.f4814k = null;
        this.f4812i = null;
        this.f4818o = null;
        this.f4813j = null;
        this.f4819p = null;
        this.f4804a.clear();
        this.f4815l = false;
        this.f4805b.clear();
        this.f4816m = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <R> void mo6219a(C1216e eVar, Object obj, C1375c cVar, int i, int i2, C1456h hVar, Class<?> cls, Class<R> cls2, Priority priority, C1379e eVar2, Map<Class<?>, C1490h<?>> map, boolean z, boolean z2, C1384d dVar) {
        this.f4806c = eVar;
        this.f4807d = obj;
        this.f4817n = cVar;
        this.f4808e = i;
        this.f4809f = i2;
        this.f4819p = hVar;
        this.f4810g = cls;
        this.f4811h = dVar;
        this.f4814k = cls2;
        this.f4818o = priority;
        this.f4812i = eVar2;
        this.f4813j = map;
        this.f4820q = z;
        this.f4821r = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6220a(C1375c cVar) {
        List m = mo6237m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            if (((C1344a) m.get(i)).f4585a.equals(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6221a(C1482s<?> sVar) {
        return this.f4806c.mo5810d().mo5683a(sVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6222a(Class<?> cls) {
        return mo6224b(cls) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1417a mo6223b() {
        return this.f4811h.mo6084a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <Data> C1479q<Data, ?, Transcode> mo6224b(Class<Data> cls) {
        return this.f4806c.mo5810d().mo5681a(cls, this.f4810g, this.f4814k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <Z> C1489g<Z> mo6225b(C1482s<Z> sVar) {
        return this.f4806c.mo5810d().mo5685b(sVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1456h mo6226c() {
        return this.f4819p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public <Z> C1490h<Z> mo6227c(Class<Z> cls) {
        C1490h<Z> hVar = (C1490h) this.f4813j.get(cls);
        if (hVar == null) {
            Iterator it = this.f4813j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hVar = (C1490h) entry.getValue();
                    break;
                }
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (!this.f4813j.isEmpty() || !this.f4820q) {
            return C1495b.m7470a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Priority mo6228d() {
        return this.f4818o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1379e mo6229e() {
        return this.f4812i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C1375c mo6230f() {
        return this.f4817n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo6231g() {
        return this.f4808e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo6232h() {
        return this.f4809f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C1393b mo6233i() {
        return this.f4806c.mo5812f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Class<?> mo6234j() {
        return this.f4814k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public List<Class<?>> mo6235k() {
        return this.f4806c.mo5810d().mo5686b(this.f4807d.getClass(), this.f4810g, this.f4814k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo6236l() {
        return this.f4821r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public List<C1344a<?>> mo6237m() {
        if (!this.f4815l) {
            this.f4815l = true;
            this.f4804a.clear();
            List c = this.f4806c.mo5810d().mo5687c(this.f4807d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C1344a a = ((C1343n) c.get(i)).mo5971a(this.f4807d, this.f4808e, this.f4809f, this.f4812i);
                if (a != null) {
                    this.f4804a.add(a);
                }
            }
        }
        return this.f4804a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public List<C1375c> mo6238n() {
        if (!this.f4816m) {
            this.f4816m = true;
            this.f4805b.clear();
            List m = mo6237m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                C1344a aVar = (C1344a) m.get(i);
                if (!this.f4805b.contains(aVar.f4585a)) {
                    this.f4805b.add(aVar.f4585a);
                }
                for (int i2 = 0; i2 < aVar.f4586b.size(); i2++) {
                    if (!this.f4805b.contains(aVar.f4586b.get(i2))) {
                        this.f4805b.add(aVar.f4586b.get(i2));
                    }
                }
            }
        }
        return this.f4805b;
    }
}

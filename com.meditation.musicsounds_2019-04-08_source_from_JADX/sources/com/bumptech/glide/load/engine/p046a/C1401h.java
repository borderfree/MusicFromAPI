package com.bumptech.glide.load.engine.p046a;

import com.bumptech.glide.load.engine.p046a.C1411m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.a.h */
class C1401h<K extends C1411m, V> {

    /* renamed from: a */
    private final C1402a<K, V> f4701a = new C1402a<>();

    /* renamed from: b */
    private final Map<K, C1402a<K, V>> f4702b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.a.h$a */
    private static class C1402a<K, V> {

        /* renamed from: a */
        final K f4703a;

        /* renamed from: b */
        C1402a<K, V> f4704b;

        /* renamed from: c */
        C1402a<K, V> f4705c;

        /* renamed from: d */
        private List<V> f4706d;

        C1402a() {
            this(null);
        }

        C1402a(K k) {
            this.f4705c = this;
            this.f4704b = this;
            this.f4703a = k;
        }

        /* renamed from: a */
        public V mo6149a() {
            int b = mo6151b();
            if (b > 0) {
                return this.f4706d.remove(b - 1);
            }
            return null;
        }

        /* renamed from: a */
        public void mo6150a(V v) {
            if (this.f4706d == null) {
                this.f4706d = new ArrayList();
            }
            this.f4706d.add(v);
        }

        /* renamed from: b */
        public int mo6151b() {
            if (this.f4706d != null) {
                return this.f4706d.size();
            }
            return 0;
        }
    }

    C1401h() {
    }

    /* renamed from: a */
    private void m7157a(C1402a<K, V> aVar) {
        m7160d(aVar);
        aVar.f4705c = this.f4701a;
        aVar.f4704b = this.f4701a.f4704b;
        m7159c(aVar);
    }

    /* renamed from: b */
    private void m7158b(C1402a<K, V> aVar) {
        m7160d(aVar);
        aVar.f4705c = this.f4701a.f4705c;
        aVar.f4704b = this.f4701a;
        m7159c(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m7159c(C1402a<K, V> aVar) {
        aVar.f4704b.f4705c = aVar;
        aVar.f4705c.f4704b = aVar;
    }

    /* renamed from: d */
    private static <K, V> void m7160d(C1402a<K, V> aVar) {
        aVar.f4705c.f4704b = aVar.f4704b;
        aVar.f4704b.f4705c = aVar.f4705c;
    }

    /* renamed from: a */
    public V mo6145a() {
        C1402a<K, V> aVar = this.f4701a;
        while (true) {
            aVar = aVar.f4705c;
            if (aVar.equals(this.f4701a)) {
                return null;
            }
            V a = aVar.mo6149a();
            if (a != null) {
                return a;
            }
            m7160d(aVar);
            this.f4702b.remove(aVar.f4703a);
            ((C1411m) aVar.f4703a).mo6128a();
        }
    }

    /* renamed from: a */
    public V mo6146a(K k) {
        C1402a aVar = (C1402a) this.f4702b.get(k);
        if (aVar == null) {
            aVar = new C1402a(k);
            this.f4702b.put(k, aVar);
        } else {
            k.mo6128a();
        }
        m7157a(aVar);
        return aVar.mo6149a();
    }

    /* renamed from: a */
    public void mo6147a(K k, V v) {
        C1402a aVar = (C1402a) this.f4702b.get(k);
        if (aVar == null) {
            aVar = new C1402a(k);
            m7158b(aVar);
            this.f4702b.put(k, aVar);
        } else {
            k.mo6128a();
        }
        aVar.mo6150a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1402a<K, V> aVar = this.f4701a.f4704b; !aVar.equals(this.f4701a); aVar = aVar.f4704b) {
            z = true;
            sb.append('{');
            sb.append(aVar.f4703a);
            sb.append(':');
            sb.append(aVar.mo6151b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

package android.support.p009v4.p019g;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.g.a */
public class C0488a<K, V> extends C0510m<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0497h<K, V> f1454a;

    public C0488a() {
    }

    public C0488a(int i) {
        super(i);
    }

    public C0488a(C0510m mVar) {
        super(mVar);
    }

    /* renamed from: b */
    private C0497h<K, V> m2164b() {
        if (this.f1454a == null) {
            this.f1454a = new C0497h<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1883a() {
                    return C0488a.this.f1511h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1884a(Object obj) {
                    return C0488a.this.mo2004a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1885a(int i, int i2) {
                    return C0488a.this.f1510g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public V mo1886a(int i, V v) {
                    return C0488a.this.mo2006a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1887a(int i) {
                    C0488a.this.mo2015d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1888a(K k, V v) {
                    C0488a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1889b(Object obj) {
                    return C0488a.this.mo2009b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<K, V> mo1890b() {
                    return C0488a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1891c() {
                    C0488a.this.clear();
                }
            };
        }
        return this.f1454a;
    }

    /* renamed from: a */
    public boolean mo1878a(Collection<?> collection) {
        return C0497h.m2226c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m2164b().mo1938d();
    }

    public Set<K> keySet() {
        return m2164b().mo1939e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo2007a(this.f1511h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m2164b().mo1940f();
    }
}

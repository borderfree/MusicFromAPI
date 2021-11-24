package android.support.p009v4.p019g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.g.h */
abstract class C0497h<K, V> {

    /* renamed from: b */
    C0499b f1485b;

    /* renamed from: c */
    C0500c f1486c;

    /* renamed from: d */
    C0502e f1487d;

    /* renamed from: android.support.v4.g.h$a */
    final class C0498a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1488a;

        /* renamed from: b */
        int f1489b;

        /* renamed from: c */
        int f1490c;

        /* renamed from: d */
        boolean f1491d = false;

        C0498a(int i) {
            this.f1488a = i;
            this.f1489b = C0497h.this.mo1883a();
        }

        public boolean hasNext() {
            return this.f1490c < this.f1489b;
        }

        public T next() {
            if (hasNext()) {
                T a = C0497h.this.mo1885a(this.f1490c, this.f1488a);
                this.f1490c++;
                this.f1491d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1491d) {
                this.f1490c--;
                this.f1489b--;
                this.f1491d = false;
                C0497h.this.mo1887a(this.f1490c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.g.h$b */
    final class C0499b implements Set<Entry<K, V>> {
        C0499b() {
        }

        /* renamed from: a */
        public boolean add(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = C0497h.this.mo1883a();
            for (Entry entry : collection) {
                C0497h.this.mo1888a(entry.getKey(), entry.getValue());
            }
            return a != C0497h.this.mo1883a();
        }

        public void clear() {
            C0497h.this.mo1891c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0497h.this.mo1884a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0492c.m2198a(C0497h.this.mo1885a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0497h.m2224a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0497h.this.mo1883a() - 1; a >= 0; a--) {
                Object a2 = C0497h.this.mo1885a(a, 0);
                Object a3 = C0497h.this.mo1885a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0497h.this.mo1883a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0501d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0497h.this.mo1883a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.g.h$c */
    final class C0500c implements Set<K> {
        C0500c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0497h.this.mo1891c();
        }

        public boolean contains(Object obj) {
            return C0497h.this.mo1884a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0497h.m2223a(C0497h.this.mo1890b(), collection);
        }

        public boolean equals(Object obj) {
            return C0497h.m2224a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0497h.this.mo1883a() - 1; a >= 0; a--) {
                Object a2 = C0497h.this.mo1885a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0497h.this.mo1883a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0498a(0);
        }

        public boolean remove(Object obj) {
            int a = C0497h.this.mo1884a(obj);
            if (a < 0) {
                return false;
            }
            C0497h.this.mo1887a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0497h.m2225b(C0497h.this.mo1890b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0497h.m2226c(C0497h.this.mo1890b(), collection);
        }

        public int size() {
            return C0497h.this.mo1883a();
        }

        public Object[] toArray() {
            return C0497h.this.mo1937b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0497h.this.mo1936a(tArr, 0);
        }
    }

    /* renamed from: android.support.v4.g.h$d */
    final class C0501d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f1495a;

        /* renamed from: b */
        int f1496b;

        /* renamed from: c */
        boolean f1497c = false;

        C0501d() {
            this.f1495a = C0497h.this.mo1883a() - 1;
            this.f1496b = -1;
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            if (hasNext()) {
                this.f1496b++;
                this.f1497c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (this.f1497c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C0492c.m2198a(entry.getKey(), C0497h.this.mo1885a(this.f1496b, 0)) && C0492c.m2198a(entry.getValue(), C0497h.this.mo1885a(this.f1496b, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f1497c) {
                return C0497h.this.mo1885a(this.f1496b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1497c) {
                return C0497h.this.mo1885a(this.f1496b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f1496b < this.f1495a;
        }

        public int hashCode() {
            if (this.f1497c) {
                int i = 0;
                Object a = C0497h.this.mo1885a(this.f1496b, 0);
                Object a2 = C0497h.this.mo1885a(this.f1496b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f1497c) {
                C0497h.this.mo1887a(this.f1496b);
                this.f1496b--;
                this.f1495a--;
                this.f1497c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f1497c) {
                return C0497h.this.mo1886a(this.f1496b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.g.h$e */
    final class C0502e implements Collection<V> {
        C0502e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0497h.this.mo1891c();
        }

        public boolean contains(Object obj) {
            return C0497h.this.mo1889b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0497h.this.mo1883a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0498a(1);
        }

        public boolean remove(Object obj) {
            int b = C0497h.this.mo1889b(obj);
            if (b < 0) {
                return false;
            }
            C0497h.this.mo1887a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = C0497h.this.mo1883a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0497h.this.mo1885a(i, 1))) {
                    C0497h.this.mo1887a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = C0497h.this.mo1883a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0497h.this.mo1885a(i, 1))) {
                    C0497h.this.mo1887a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0497h.this.mo1883a();
        }

        public Object[] toArray() {
            return C0497h.this.mo1937b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0497h.this.mo1936a(tArr, 1);
        }
    }

    C0497h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m2223a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m2224a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m2225b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m2226c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1883a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1884a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1885a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1886a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1887a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1888a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo1936a(T[] tArr, int i) {
        int a = mo1883a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo1885a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1889b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo1890b();

    /* renamed from: b */
    public Object[] mo1937b(int i) {
        int a = mo1883a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo1885a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo1891c();

    /* renamed from: d */
    public Set<Entry<K, V>> mo1938d() {
        if (this.f1485b == null) {
            this.f1485b = new C0499b<>();
        }
        return this.f1485b;
    }

    /* renamed from: e */
    public Set<K> mo1939e() {
        if (this.f1486c == null) {
            this.f1486c = new C0500c<>();
        }
        return this.f1486c;
    }

    /* renamed from: f */
    public Collection<V> mo1940f() {
        if (this.f1487d == null) {
            this.f1487d = new C0502e<>();
        }
        return this.f1487d;
    }
}

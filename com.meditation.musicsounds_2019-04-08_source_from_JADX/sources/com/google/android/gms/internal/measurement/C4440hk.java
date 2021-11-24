package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.hk */
class C4440hk<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f16218a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C4447hr> f16219b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f16220c;

    /* renamed from: d */
    private boolean f16221d;

    /* renamed from: e */
    private volatile C4449ht f16222e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f16223f;

    /* renamed from: g */
    private volatile C4443hn f16224g;

    private C4440hk(int i) {
        this.f16218a = i;
        this.f16219b = Collections.emptyList();
        this.f16220c = Collections.emptyMap();
        this.f16223f = Collections.emptyMap();
    }

    /* synthetic */ C4440hk(int i, C4441hl hlVar) {
        this(i);
    }

    /* renamed from: a */
    private final int m21898a(K k) {
        int size = this.f16219b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C4447hr) this.f16219b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C4447hr) this.f16219b.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    static <FieldDescriptorType extends C4378fh<FieldDescriptorType>> C4440hk<FieldDescriptorType, Object> m21899a(int i) {
        return new C4441hl(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m21903c(int i) {
        m21906f();
        V value = ((C4447hr) this.f16219b.remove(i)).getValue();
        if (!this.f16220c.isEmpty()) {
            Iterator it = m21907g().entrySet().iterator();
            this.f16219b.add(new C4447hr(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m21906f() {
        if (this.f16221d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m21907g() {
        m21906f();
        if (this.f16220c.isEmpty() && !(this.f16220c instanceof TreeMap)) {
            this.f16220c = new TreeMap();
            this.f16223f = ((TreeMap) this.f16220c).descendingMap();
        }
        return (SortedMap) this.f16220c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m21906f();
        int a = m21898a(k);
        if (a >= 0) {
            return ((C4447hr) this.f16219b.get(a)).setValue(v);
        }
        m21906f();
        if (this.f16219b.isEmpty() && !(this.f16219b instanceof ArrayList)) {
            this.f16219b = new ArrayList(this.f16218a);
        }
        int i = -(a + 1);
        if (i >= this.f16218a) {
            return m21907g().put(k, v);
        }
        if (this.f16219b.size() == this.f16218a) {
            C4447hr hrVar = (C4447hr) this.f16219b.remove(this.f16218a - 1);
            m21907g().put((Comparable) hrVar.getKey(), hrVar.getValue());
        }
        this.f16219b.add(i, new C4447hr(this, k, v));
        return null;
    }

    /* renamed from: a */
    public void mo14592a() {
        if (!this.f16221d) {
            this.f16220c = this.f16220c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16220c);
            this.f16223f = this.f16223f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16223f);
            this.f16221d = true;
        }
    }

    /* renamed from: b */
    public final Entry<K, V> mo14593b(int i) {
        return (Entry) this.f16219b.get(i);
    }

    /* renamed from: b */
    public final boolean mo14594b() {
        return this.f16221d;
    }

    /* renamed from: c */
    public final int mo14595c() {
        return this.f16219b.size();
    }

    public void clear() {
        m21906f();
        if (!this.f16219b.isEmpty()) {
            this.f16219b.clear();
        }
        if (!this.f16220c.isEmpty()) {
            this.f16220c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m21898a((K) comparable) >= 0 || this.f16220c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo14598d() {
        return this.f16220c.isEmpty() ? C4444ho.m21917a() : this.f16220c.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo14599e() {
        if (this.f16224g == null) {
            this.f16224g = new C4443hn(this, null);
        }
        return this.f16224g;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f16222e == null) {
            this.f16222e = new C4449ht(this, null);
        }
        return this.f16222e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4440hk)) {
            return super.equals(obj);
        }
        C4440hk hkVar = (C4440hk) obj;
        int size = size();
        if (size != hkVar.size()) {
            return false;
        }
        int c = mo14595c();
        if (c != hkVar.mo14595c()) {
            return entrySet().equals(hkVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo14593b(i).equals(hkVar.mo14593b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f16220c.equals(hkVar.f16220c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m21898a((K) comparable);
        return a >= 0 ? ((C4447hr) this.f16219b.get(a)).getValue() : this.f16220c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo14595c(); i2++) {
            i += ((C4447hr) this.f16219b.get(i2)).hashCode();
        }
        return this.f16220c.size() > 0 ? i + this.f16220c.hashCode() : i;
    }

    public V remove(Object obj) {
        m21906f();
        Comparable comparable = (Comparable) obj;
        int a = m21898a((K) comparable);
        if (a >= 0) {
            return m21903c(a);
        }
        if (this.f16220c.isEmpty()) {
            return null;
        }
        return this.f16220c.remove(comparable);
    }

    public int size() {
        return this.f16219b.size() + this.f16220c.size();
    }
}

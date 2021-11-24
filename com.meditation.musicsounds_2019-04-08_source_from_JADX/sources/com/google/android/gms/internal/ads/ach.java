package com.google.android.gms.internal.ads;

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

class ach<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f11473a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<aco> f11474b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f11475c;

    /* renamed from: d */
    private boolean f11476d;

    /* renamed from: e */
    private volatile acq f11477e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f11478f;

    /* renamed from: g */
    private volatile ack f11479g;

    private ach(int i) {
        this.f11473a = i;
        this.f11474b = Collections.emptyList();
        this.f11475c = Collections.emptyMap();
        this.f11478f = Collections.emptyMap();
    }

    /* synthetic */ ach(int i, aci aci) {
        this(i);
    }

    /* renamed from: a */
    private final int m15712a(K k) {
        int size = this.f11474b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((aco) this.f11474b.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((aco) this.f11474b.get(i2)).getKey());
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
    static <FieldDescriptorType extends aae<FieldDescriptorType>> ach<FieldDescriptorType, Object> m15713a(int i) {
        return new aci(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m15717c(int i) {
        m15720f();
        V value = ((aco) this.f11474b.remove(i)).getValue();
        if (!this.f11475c.isEmpty()) {
            Iterator it = m15721g().entrySet().iterator();
            this.f11474b.add(new aco(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m15720f() {
        if (this.f11476d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m15721g() {
        m15720f();
        if (this.f11475c.isEmpty() && !(this.f11475c instanceof TreeMap)) {
            this.f11475c = new TreeMap();
            this.f11478f = ((TreeMap) this.f11475c).descendingMap();
        }
        return (SortedMap) this.f11475c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m15720f();
        int a = m15712a(k);
        if (a >= 0) {
            return ((aco) this.f11474b.get(a)).setValue(v);
        }
        m15720f();
        if (this.f11474b.isEmpty() && !(this.f11474b instanceof ArrayList)) {
            this.f11474b = new ArrayList(this.f11473a);
        }
        int i = -(a + 1);
        if (i >= this.f11473a) {
            return m15721g().put(k, v);
        }
        if (this.f11474b.size() == this.f11473a) {
            aco aco = (aco) this.f11474b.remove(this.f11473a - 1);
            m15721g().put((Comparable) aco.getKey(), aco.getValue());
        }
        this.f11474b.add(i, new aco(this, k, v));
        return null;
    }

    /* renamed from: a */
    public void mo11640a() {
        if (!this.f11476d) {
            this.f11475c = this.f11475c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11475c);
            this.f11478f = this.f11478f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11478f);
            this.f11476d = true;
        }
    }

    /* renamed from: b */
    public final Entry<K, V> mo11641b(int i) {
        return (Entry) this.f11474b.get(i);
    }

    /* renamed from: b */
    public final boolean mo11642b() {
        return this.f11476d;
    }

    /* renamed from: c */
    public final int mo11643c() {
        return this.f11474b.size();
    }

    public void clear() {
        m15720f();
        if (!this.f11474b.isEmpty()) {
            this.f11474b.clear();
        }
        if (!this.f11475c.isEmpty()) {
            this.f11475c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m15712a((K) comparable) >= 0 || this.f11475c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo11646d() {
        return this.f11475c.isEmpty() ? acl.m15731a() : this.f11475c.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo11647e() {
        if (this.f11479g == null) {
            this.f11479g = new ack(this, null);
        }
        return this.f11479g;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f11477e == null) {
            this.f11477e = new acq(this, null);
        }
        return this.f11477e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ach)) {
            return super.equals(obj);
        }
        ach ach = (ach) obj;
        int size = size();
        if (size != ach.size()) {
            return false;
        }
        int c = mo11643c();
        if (c != ach.mo11643c()) {
            return entrySet().equals(ach.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo11641b(i).equals(ach.mo11641b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f11475c.equals(ach.f11475c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m15712a((K) comparable);
        return a >= 0 ? ((aco) this.f11474b.get(a)).getValue() : this.f11475c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo11643c(); i2++) {
            i += ((aco) this.f11474b.get(i2)).hashCode();
        }
        return this.f11475c.size() > 0 ? i + this.f11475c.hashCode() : i;
    }

    public V remove(Object obj) {
        m15720f();
        Comparable comparable = (Comparable) obj;
        int a = m15712a((K) comparable);
        if (a >= 0) {
            return m15717c(a);
        }
        if (this.f11475c.isEmpty()) {
            return null;
        }
        return this.f11475c.remove(comparable);
    }

    public int size() {
        return this.f11474b.size() + this.f11475c.size();
    }
}

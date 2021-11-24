package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ht */
class C4449ht extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C4440hk f16238a;

    private C4449ht(C4440hk hkVar) {
        this.f16238a = hkVar;
    }

    /* synthetic */ C4449ht(C4440hk hkVar, C4441hl hlVar) {
        this(hkVar);
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f16238a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f16238a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f16238a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C4448hs(this.f16238a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f16238a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f16238a.size();
    }
}

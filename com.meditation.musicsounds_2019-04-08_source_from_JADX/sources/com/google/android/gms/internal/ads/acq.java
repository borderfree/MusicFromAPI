package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class acq extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ ach f11493a;

    private acq(ach ach) {
        this.f11493a = ach;
    }

    /* synthetic */ acq(ach ach, aci aci) {
        this(ach);
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f11493a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f11493a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f11493a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new acp(this.f11493a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f11493a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f11493a.size();
    }
}

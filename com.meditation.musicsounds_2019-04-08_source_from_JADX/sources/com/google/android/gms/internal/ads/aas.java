package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class aas<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f11373a;

    public aas(Iterator<Entry<K, Object>> it) {
        this.f11373a = it;
    }

    public final boolean hasNext() {
        return this.f11373a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f11373a.next();
        return entry.getValue() instanceof aao ? new aaq(entry) : entry;
    }

    public final void remove() {
        this.f11373a.remove();
    }
}

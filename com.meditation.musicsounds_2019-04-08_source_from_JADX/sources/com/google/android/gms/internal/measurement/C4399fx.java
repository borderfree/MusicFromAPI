package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.fx */
final class C4399fx<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f16142a;

    public C4399fx(Iterator<Entry<K, Object>> it) {
        this.f16142a = it;
    }

    public final boolean hasNext() {
        return this.f16142a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f16142a.next();
        return entry.getValue() instanceof C4395ft ? new C4398fw(entry) : entry;
    }

    public final void remove() {
        this.f16142a.remove();
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hm */
final class C4442hm implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f16225a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f16226b;

    /* renamed from: c */
    private final /* synthetic */ C4440hk f16227c;

    private C4442hm(C4440hk hkVar) {
        this.f16227c = hkVar;
        this.f16225a = this.f16227c.f16219b.size();
    }

    /* synthetic */ C4442hm(C4440hk hkVar, C4441hl hlVar) {
        this(hkVar);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m21916a() {
        if (this.f16226b == null) {
            this.f16226b = this.f16227c.f16223f.entrySet().iterator();
        }
        return this.f16226b;
    }

    public final boolean hasNext() {
        return (this.f16225a > 0 && this.f16225a <= this.f16227c.f16219b.size()) || m21916a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m21916a().hasNext()) {
            obj = m21916a().next();
        } else {
            List b = this.f16227c.f16219b;
            int i = this.f16225a - 1;
            this.f16225a = i;
            obj = b.get(i);
        }
        return (Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class acj implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f11480a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f11481b;

    /* renamed from: c */
    private final /* synthetic */ ach f11482c;

    private acj(ach ach) {
        this.f11482c = ach;
        this.f11480a = this.f11482c.f11474b.size();
    }

    /* synthetic */ acj(ach ach, aci aci) {
        this(ach);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m15730a() {
        if (this.f11481b == null) {
            this.f11481b = this.f11482c.f11478f.entrySet().iterator();
        }
        return this.f11481b;
    }

    public final boolean hasNext() {
        return (this.f11480a > 0 && this.f11480a <= this.f11482c.f11474b.size()) || m15730a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m15730a().hasNext()) {
            obj = m15730a().next();
        } else {
            List b = this.f11482c.f11474b;
            int i = this.f11480a - 1;
            this.f11480a = i;
            obj = b.get(i);
        }
        return (Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

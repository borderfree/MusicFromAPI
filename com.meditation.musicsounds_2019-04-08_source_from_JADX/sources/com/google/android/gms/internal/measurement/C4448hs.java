package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hs */
final class C4448hs implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f16234a;

    /* renamed from: b */
    private boolean f16235b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f16236c;

    /* renamed from: d */
    private final /* synthetic */ C4440hk f16237d;

    private C4448hs(C4440hk hkVar) {
        this.f16237d = hkVar;
        this.f16234a = -1;
    }

    /* synthetic */ C4448hs(C4440hk hkVar, C4441hl hlVar) {
        this(hkVar);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m21920a() {
        if (this.f16236c == null) {
            this.f16236c = this.f16237d.f16220c.entrySet().iterator();
        }
        return this.f16236c;
    }

    public final boolean hasNext() {
        return this.f16234a + 1 < this.f16237d.f16219b.size() || (!this.f16237d.f16220c.isEmpty() && m21920a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f16235b = true;
        int i = this.f16234a + 1;
        this.f16234a = i;
        return (Entry) (i < this.f16237d.f16219b.size() ? this.f16237d.f16219b.get(this.f16234a) : m21920a().next());
    }

    public final void remove() {
        if (this.f16235b) {
            this.f16235b = false;
            this.f16237d.m21906f();
            if (this.f16234a < this.f16237d.f16219b.size()) {
                C4440hk hkVar = this.f16237d;
                int i = this.f16234a;
                this.f16234a = i - 1;
                hkVar.m21903c(i);
                return;
            }
            m21920a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

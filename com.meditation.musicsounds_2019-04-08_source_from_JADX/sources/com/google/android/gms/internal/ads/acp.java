package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class acp implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f11489a;

    /* renamed from: b */
    private boolean f11490b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f11491c;

    /* renamed from: d */
    private final /* synthetic */ ach f11492d;

    private acp(ach ach) {
        this.f11492d = ach;
        this.f11489a = -1;
    }

    /* synthetic */ acp(ach ach, aci aci) {
        this(ach);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m15734a() {
        if (this.f11491c == null) {
            this.f11491c = this.f11492d.f11475c.entrySet().iterator();
        }
        return this.f11491c;
    }

    public final boolean hasNext() {
        return this.f11489a + 1 < this.f11492d.f11474b.size() || (!this.f11492d.f11475c.isEmpty() && m15734a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f11490b = true;
        int i = this.f11489a + 1;
        this.f11489a = i;
        return (Entry) (i < this.f11492d.f11474b.size() ? this.f11492d.f11474b.get(this.f11489a) : m15734a().next());
    }

    public final void remove() {
        if (this.f11490b) {
            this.f11490b = false;
            this.f11492d.m15720f();
            if (this.f11489a < this.f11492d.f11474b.size()) {
                ach ach = this.f11492d;
                int i = this.f11489a;
                this.f11489a = i - 1;
                ach.m15717c(i);
                return;
            }
            m15734a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.id */
final class C4460id implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f16254a = this.f16256c.f16253a.listIterator(this.f16255b);

    /* renamed from: b */
    private final /* synthetic */ int f16255b;

    /* renamed from: c */
    private final /* synthetic */ C4459ic f16256c;

    C4460id(C4459ic icVar, int i) {
        this.f16256c = icVar;
        this.f16255b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f16254a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f16254a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f16254a.next();
    }

    public final int nextIndex() {
        return this.f16254a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f16254a.previous();
    }

    public final int previousIndex() {
        return this.f16254a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

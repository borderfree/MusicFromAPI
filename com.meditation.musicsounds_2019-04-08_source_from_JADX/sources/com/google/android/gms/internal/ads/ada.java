package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class ada implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f11506a = this.f11508c.f11505a.listIterator(this.f11507b);

    /* renamed from: b */
    private final /* synthetic */ int f11507b;

    /* renamed from: c */
    private final /* synthetic */ acz f11508c;

    ada(acz acz, int i) {
        this.f11508c = acz;
        this.f11507b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f11506a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f11506a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f11506a.next();
    }

    public final int nextIndex() {
        return this.f11506a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f11506a.previous();
    }

    public final int previousIndex() {
        return this.f11506a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

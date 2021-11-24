package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ie */
final class C4461ie implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f16257a = this.f16258b.f16253a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C4459ic f16258b;

    C4461ie(C4459ic icVar) {
        this.f16258b = icVar;
    }

    public final boolean hasNext() {
        return this.f16257a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f16257a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

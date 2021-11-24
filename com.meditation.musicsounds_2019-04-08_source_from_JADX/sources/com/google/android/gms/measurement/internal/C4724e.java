package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.e */
final class C4724e implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f17004a = this.f17005b.f17251a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzad f17005b;

    C4724e(zzad zzad) {
        this.f17005b = zzad;
    }

    public final boolean hasNext() {
        return this.f17004a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f17004a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

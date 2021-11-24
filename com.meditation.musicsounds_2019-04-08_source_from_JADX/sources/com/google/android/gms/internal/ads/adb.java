package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class adb implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f11509a = this.f11510b.f11505a.iterator();

    /* renamed from: b */
    private final /* synthetic */ acz f11510b;

    adb(acz acz) {
        this.f11510b = acz;
    }

    public final boolean hasNext() {
        return this.f11509a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f11509a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

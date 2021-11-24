package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ic */
public final class C4459ic extends AbstractList<String> implements C4403ga, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4403ga f16253a;

    public C4459ic(C4403ga gaVar) {
        this.f16253a = gaVar;
    }

    /* renamed from: a */
    public final void mo14529a(zzte zzte) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object mo14530b(int i) {
        return this.f16253a.mo14530b(i);
    }

    /* renamed from: d */
    public final List<?> mo14531d() {
        return this.f16253a.mo14531d();
    }

    /* renamed from: e */
    public final C4403ga mo14532e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f16253a.get(i);
    }

    public final Iterator<String> iterator() {
        return new C4461ie(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C4460id(this, i);
    }

    public final int size() {
        return this.f16253a.size();
    }
}

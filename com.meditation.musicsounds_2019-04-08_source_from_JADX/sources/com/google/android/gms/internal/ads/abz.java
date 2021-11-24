package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class abz<E> extends C4113zb<E> {

    /* renamed from: a */
    private static final abz<Object> f11430a;

    /* renamed from: b */
    private final List<E> f11431b;

    static {
        abz<Object> abz = new abz<>();
        f11430a = abz;
        abz.mo11502b();
    }

    abz() {
        this(new ArrayList(10));
    }

    private abz(List<E> list) {
        this.f11431b = list;
    }

    /* renamed from: d */
    public static <E> abz<E> m15558d() {
        return f11430a;
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f11431b);
            return new abz(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo13833c();
        this.f11431b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f11431b.get(i);
    }

    public final E remove(int i) {
        mo13833c();
        E remove = this.f11431b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo13833c();
        E e2 = this.f11431b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f11431b.size();
    }
}

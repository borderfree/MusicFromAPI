package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.he */
final class C4434he<E> extends C4347ee<E> {

    /* renamed from: a */
    private static final C4434he<Object> f16208a;

    /* renamed from: b */
    private final List<E> f16209b;

    static {
        C4434he<Object> heVar = new C4434he<>();
        f16208a = heVar;
        heVar.mo14312b();
    }

    C4434he() {
        this(new ArrayList(10));
    }

    private C4434he(List<E> list) {
        this.f16209b = list;
    }

    /* renamed from: d */
    public static <E> C4434he<E> m21783d() {
        return f16208a;
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f16209b);
            return new C4434he(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo14313c();
        this.f16209b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f16209b.get(i);
    }

    public final E remove(int i) {
        mo14313c();
        E remove = this.f16209b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo14313c();
        E e2 = this.f16209b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f16209b.size();
    }
}

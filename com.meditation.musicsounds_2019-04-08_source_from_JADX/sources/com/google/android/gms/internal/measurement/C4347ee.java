package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ee */
abstract class C4347ee<E> extends AbstractList<E> implements C4394fs<E> {

    /* renamed from: a */
    private boolean f16056a = true;

    C4347ee() {
    }

    /* renamed from: a */
    public boolean mo14307a() {
        return this.f16056a;
    }

    public void add(int i, E e) {
        mo14313c();
        super.add(i, e);
    }

    public boolean add(E e) {
        mo14313c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo14313c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo14313c();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo14312b() {
        this.f16056a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo14313c() {
        if (!this.f16056a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo14313c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        mo14313c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo14313c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo14313c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo14313c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo14313c();
        return super.set(i, e);
    }
}

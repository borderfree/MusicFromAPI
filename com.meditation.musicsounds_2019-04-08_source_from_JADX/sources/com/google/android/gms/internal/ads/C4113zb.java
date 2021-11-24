package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zb */
abstract class C4113zb<E> extends AbstractList<E> implements aan<E> {

    /* renamed from: a */
    private boolean f15162a = true;

    C4113zb() {
    }

    /* renamed from: a */
    public boolean mo11501a() {
        return this.f15162a;
    }

    public void add(int i, E e) {
        mo13833c();
        super.add(i, e);
    }

    public boolean add(E e) {
        mo13833c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo13833c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo13833c();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo11502b() {
        this.f15162a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo13833c() {
        if (!this.f15162a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo13833c();
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
        mo13833c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo13833c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo13833c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo13833c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo13833c();
        return super.set(i, e);
    }
}

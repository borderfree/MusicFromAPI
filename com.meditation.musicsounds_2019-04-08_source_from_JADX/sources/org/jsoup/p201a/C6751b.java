package org.jsoup.p201a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jsoup.nodes.C6766f;

/* renamed from: org.jsoup.a.b */
public class C6751b implements Cloneable, List<C6766f> {

    /* renamed from: a */
    private List<C6766f> f23713a;

    public C6751b() {
        this.f23713a = new ArrayList();
    }

    public C6751b(List<C6766f> list) {
        this.f23713a = list;
    }

    /* renamed from: a */
    public C6751b clone() {
        ArrayList arrayList = new ArrayList();
        for (C6766f f : this.f23713a) {
            arrayList.add(f.mo21231g());
        }
        return new C6751b(arrayList);
    }

    /* renamed from: a */
    public C6766f get(int i) {
        return (C6766f) this.f23713a.get(i);
    }

    /* renamed from: a */
    public C6766f set(int i, C6766f fVar) {
        return (C6766f) this.f23713a.set(i, fVar);
    }

    /* renamed from: a */
    public boolean add(C6766f fVar) {
        return this.f23713a.add(fVar);
    }

    public boolean addAll(int i, Collection<? extends C6766f> collection) {
        return this.f23713a.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends C6766f> collection) {
        return this.f23713a.addAll(collection);
    }

    /* renamed from: b */
    public String mo21187b() {
        StringBuilder sb = new StringBuilder();
        for (C6766f fVar : this.f23713a) {
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(fVar.mo21223C_());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C6766f remove(int i) {
        return (C6766f) this.f23713a.remove(i);
    }

    /* renamed from: b */
    public void add(int i, C6766f fVar) {
        this.f23713a.add(i, fVar);
    }

    public void clear() {
        this.f23713a.clear();
    }

    public boolean contains(Object obj) {
        return this.f23713a.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f23713a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f23713a.equals(obj);
    }

    public int hashCode() {
        return this.f23713a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f23713a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f23713a.isEmpty();
    }

    public Iterator<C6766f> iterator() {
        return this.f23713a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f23713a.lastIndexOf(obj);
    }

    public ListIterator<C6766f> listIterator() {
        return this.f23713a.listIterator();
    }

    public ListIterator<C6766f> listIterator(int i) {
        return this.f23713a.listIterator(i);
    }

    public boolean remove(Object obj) {
        return this.f23713a.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f23713a.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f23713a.retainAll(collection);
    }

    public int size() {
        return this.f23713a.size();
    }

    public List<C6766f> subList(int i, int i2) {
        return this.f23713a.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f23713a.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f23713a.toArray(tArr);
    }

    public String toString() {
        return mo21187b();
    }
}

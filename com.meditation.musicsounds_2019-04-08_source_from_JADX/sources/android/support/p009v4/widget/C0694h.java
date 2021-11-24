package android.support.p009v4.widget;

import android.support.p009v4.p019g.C0505k.C0506a;
import android.support.p009v4.p019g.C0505k.C0507b;
import android.support.p009v4.p019g.C0510m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.widget.h */
public final class C0694h<T> {

    /* renamed from: a */
    private final C0506a<ArrayList<T>> f2037a = new C0507b(10);

    /* renamed from: b */
    private final C0510m<T, ArrayList<T>> f2038b = new C0510m<>();

    /* renamed from: c */
    private final ArrayList<T> f2039c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2040d = new HashSet<>();

    /* renamed from: a */
    private void m3279a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f2038b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m3279a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m3280a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2037a.mo2002a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m3281c() {
        ArrayList<T> arrayList = (ArrayList) this.f2037a.mo2001a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: a */
    public void mo2884a() {
        int size = this.f2038b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f2038b.mo2011c(i);
            if (arrayList != null) {
                m3280a(arrayList);
            }
        }
        this.f2038b.clear();
    }

    /* renamed from: a */
    public void mo2885a(T t) {
        if (!this.f2038b.containsKey(t)) {
            this.f2038b.put(t, null);
        }
    }

    /* renamed from: a */
    public void mo2886a(T t, T t2) {
        if (!this.f2038b.containsKey(t) || !this.f2038b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f2038b.get(t);
        if (arrayList == null) {
            arrayList = m3281c();
            this.f2038b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public ArrayList<T> mo2887b() {
        this.f2039c.clear();
        this.f2040d.clear();
        int size = this.f2038b.size();
        for (int i = 0; i < size; i++) {
            m3279a(this.f2038b.mo2010b(i), this.f2039c, this.f2040d);
        }
        return this.f2039c;
    }

    /* renamed from: b */
    public boolean mo2888b(T t) {
        return this.f2038b.containsKey(t);
    }

    /* renamed from: c */
    public List mo2889c(T t) {
        return (List) this.f2038b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2890d(T t) {
        int size = this.f2038b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f2038b.mo2011c(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2038b.mo2010b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2891e(T t) {
        int size = this.f2038b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f2038b.mo2011c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }
}

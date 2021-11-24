package com.facebook.ads.internal.p070l;

import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p070l.C1720f;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.internal.l.e */
public class C1719e<T extends C1720f, E extends C1718d> {

    /* renamed from: a */
    private final Map<Class<E>, List<WeakReference<T>>> f5656a = new HashMap();

    /* renamed from: b */
    private final Queue<E> f5657b = new ArrayDeque();

    /* renamed from: a */
    private void m8605a(List<WeakReference<T>> list) {
        if (list != null) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                WeakReference weakReference = (WeakReference) list.get(i2);
                if (weakReference.get() != null) {
                    int i3 = i + 1;
                    list.set(i, weakReference);
                    i = i3;
                }
            }
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
        }
    }

    /* renamed from: b */
    private void m8606b(E e) {
        if (this.f5656a != null) {
            List list = (List) this.f5656a.get(e.getClass());
            if (list != null) {
                m8605a(list);
                if (!list.isEmpty()) {
                    for (WeakReference weakReference : new ArrayList(list)) {
                        C1720f fVar = (C1720f) weakReference.get();
                        if (fVar != null && fVar.mo6910b(e)) {
                            fVar.mo6765a(e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo6905a(E e) {
        if (this.f5657b.isEmpty()) {
            this.f5657b.add(e);
            while (!this.f5657b.isEmpty()) {
                m8606b((E) (C1718d) this.f5657b.peek());
                this.f5657b.remove();
            }
        } else {
            this.f5657b.add(e);
        }
    }

    /* renamed from: a */
    public synchronized void mo6906a(T... tArr) {
        if (tArr != null) {
            for (T a : tArr) {
                mo6907a(a);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo6907a(T t) {
        if (t == null) {
            return false;
        }
        Class a = t.mo6764a();
        if (this.f5656a.get(a) == null) {
            this.f5656a.put(a, new ArrayList());
        }
        List list = (List) this.f5656a.get(a);
        m8605a(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference(t));
    }

    /* renamed from: b */
    public synchronized void mo6908b(T... tArr) {
        if (tArr != null) {
            for (T b : tArr) {
                mo6909b(b);
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean mo6909b(T t) {
        if (t == null) {
            return false;
        }
        List list = (List) this.f5656a.get(t.mo6764a());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                ((WeakReference) list.get(i)).clear();
                return true;
            }
        }
        return false;
    }
}

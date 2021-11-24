package com.google.android.gms.internal.p130e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.e.e */
final class C4177e {

    /* renamed from: a */
    private final ConcurrentHashMap<C4178f, List<Throwable>> f15615a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f15616b = new ReferenceQueue<>();

    C4177e() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14019a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f15616b.poll();
            if (poll == null) {
                break;
            }
            this.f15615a.remove(poll);
        }
        List<Throwable> list = (List) this.f15615a.get(new C4178f(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f15615a.putIfAbsent(new C4178f(th, this.f15616b), vector);
        return list2 == null ? vector : list2;
    }
}

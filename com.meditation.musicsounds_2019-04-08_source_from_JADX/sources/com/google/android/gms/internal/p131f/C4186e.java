package com.google.android.gms.internal.p131f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.f.e */
final class C4186e {

    /* renamed from: a */
    private final ConcurrentHashMap<C4187f, List<Throwable>> f15625a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f15626b = new ReferenceQueue<>();

    C4186e() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14026a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f15626b.poll();
            if (poll == null) {
                break;
            }
            this.f15625a.remove(poll);
        }
        List<Throwable> list = (List) this.f15625a.get(new C4187f(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f15625a.putIfAbsent(new C4187f(th, this.f15626b), vector);
        return list2 == null ? vector : list2;
    }
}

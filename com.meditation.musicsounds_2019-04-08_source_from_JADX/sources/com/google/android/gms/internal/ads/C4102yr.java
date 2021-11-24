package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.yr */
final class C4102yr {

    /* renamed from: a */
    private final ConcurrentHashMap<C4103ys, List<Throwable>> f15085a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f15086b = new ReferenceQueue<>();

    C4102yr() {
    }

    /* renamed from: a */
    public final List<Throwable> mo13828a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f15086b.poll();
            if (poll != null) {
                this.f15085a.remove(poll);
            } else {
                return (List) this.f15085a.get(new C4103ys(th, null));
            }
        }
    }
}

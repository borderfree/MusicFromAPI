package com.bumptech.glide.load.engine.p046a;

import com.bumptech.glide.load.engine.p046a.C1411m;
import com.bumptech.glide.p040g.C1258j;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.engine.a.d */
abstract class C1397d<T extends C1411m> {

    /* renamed from: a */
    private final Queue<T> f4700a = C1258j.m6706a(20);

    C1397d() {
    }

    /* renamed from: a */
    public void mo6136a(T t) {
        if (this.f4700a.size() < 20) {
            this.f4700a.offer(t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo6135b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public T mo6137c() {
        T t = (C1411m) this.f4700a.poll();
        return t == null ? mo6135b() : t;
    }
}

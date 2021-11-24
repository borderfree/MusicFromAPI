package com.facebook.ads.internal.p077s.p078a;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.s.a.s */
public abstract class C1809s<T> implements Runnable {

    /* renamed from: a */
    private final WeakReference<T> f5901a;

    public C1809s(T t) {
        this.f5901a = new WeakReference<>(t);
    }

    /* renamed from: a */
    public T mo7072a() {
        return this.f5901a.get();
    }
}

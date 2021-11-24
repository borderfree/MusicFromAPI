package com.google.firebase.components;

import com.google.firebase.p135b.C4896a;

/* renamed from: com.google.firebase.components.n */
final class C4915n<T> implements C4896a<T> {

    /* renamed from: a */
    private static final Object f17659a = new Object();

    /* renamed from: b */
    private volatile Object f17660b = f17659a;

    /* renamed from: c */
    private volatile C4896a<T> f17661c;

    C4915n(C4904c<T> cVar, C4903b bVar) {
        this.f17661c = C4916o.m24493a(cVar, bVar);
    }

    /* renamed from: a */
    public final T mo16107a() {
        T t = this.f17660b;
        if (t == f17659a) {
            synchronized (this) {
                t = this.f17660b;
                if (t == f17659a) {
                    t = this.f17661c.mo16107a();
                    this.f17660b = t;
                    this.f17661c = null;
                }
            }
        }
        return t;
    }
}

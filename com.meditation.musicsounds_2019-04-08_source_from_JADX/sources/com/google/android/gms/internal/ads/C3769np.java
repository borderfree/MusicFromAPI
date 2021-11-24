package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.np */
public class C3769np<T> implements C3765nl<T> {

    /* renamed from: a */
    private final Object f14494a = new Object();

    /* renamed from: b */
    private int f14495b = 0;

    /* renamed from: c */
    private final BlockingQueue<C3770nq> f14496c = new LinkedBlockingQueue();

    /* renamed from: d */
    private T f14497d;

    /* renamed from: a */
    public final void mo13303a() {
        synchronized (this.f14494a) {
            if (this.f14495b == 0) {
                this.f14495b = -1;
                for (C3770nq nqVar : this.f14496c) {
                    nqVar.f14499b.mo11977a();
                }
                this.f14496c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: a */
    public final void mo13301a(C3768no<T> noVar, C3766nm nmVar) {
        synchronized (this.f14494a) {
            if (this.f14495b == 1) {
                noVar.mo11976a(this.f14497d);
            } else if (this.f14495b == -1) {
                nmVar.mo11977a();
            } else if (this.f14495b == 0) {
                this.f14496c.add(new C3770nq(this, noVar, nmVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo13302a(T t) {
        synchronized (this.f14494a) {
            if (this.f14495b == 0) {
                this.f14497d = t;
                this.f14495b = 1;
                for (C3770nq nqVar : this.f14496c) {
                    nqVar.f14498a.mo11976a(t);
                }
                this.f14496c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: b */
    public final int mo13304b() {
        return this.f14495b;
    }
}

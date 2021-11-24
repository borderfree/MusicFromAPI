package com.bumptech.glide.load.p044b;

import com.bumptech.glide.p040g.C1254f;
import com.bumptech.glide.p040g.C1258j;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.b.m */
public class C1340m<A, B> {

    /* renamed from: a */
    private final C1254f<C1342a<A>, B> f4579a;

    /* renamed from: com.bumptech.glide.load.b.m$a */
    static final class C1342a<A> {

        /* renamed from: a */
        private static final Queue<C1342a<?>> f4581a = C1258j.m6706a(0);

        /* renamed from: b */
        private int f4582b;

        /* renamed from: c */
        private int f4583c;

        /* renamed from: d */
        private A f4584d;

        private C1342a() {
        }

        /* renamed from: a */
        static <A> C1342a<A> m6961a(A a, int i, int i2) {
            C1342a<A> aVar;
            synchronized (f4581a) {
                aVar = (C1342a) f4581a.poll();
            }
            if (aVar == null) {
                aVar = new C1342a<>();
            }
            aVar.m6962b(a, i, i2);
            return aVar;
        }

        /* renamed from: b */
        private void m6962b(A a, int i, int i2) {
            this.f4584d = a;
            this.f4583c = i;
            this.f4582b = i2;
        }

        /* renamed from: a */
        public void mo6028a() {
            synchronized (f4581a) {
                f4581a.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1342a)) {
                return false;
            }
            C1342a aVar = (C1342a) obj;
            return this.f4583c == aVar.f4583c && this.f4582b == aVar.f4582b && this.f4584d.equals(aVar.f4584d);
        }

        public int hashCode() {
            return (((this.f4582b * 31) + this.f4583c) * 31) + this.f4584d.hashCode();
        }
    }

    public C1340m() {
        this(250);
    }

    public C1340m(long j) {
        this.f4579a = new C1254f<C1342a<A>, B>(j) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo5898a(C1342a<A> aVar, B b) {
                aVar.mo6028a();
            }
        };
    }

    /* renamed from: a */
    public B mo6025a(A a, int i, int i2) {
        C1342a a2 = C1342a.m6961a(a, i, i2);
        B b = this.f4579a.mo5900b(a2);
        a2.mo6028a();
        return b;
    }

    /* renamed from: a */
    public void mo6026a(A a, int i, int i2, B b) {
        this.f4579a.mo5901b(C1342a.m6961a(a, i, i2), b);
    }
}

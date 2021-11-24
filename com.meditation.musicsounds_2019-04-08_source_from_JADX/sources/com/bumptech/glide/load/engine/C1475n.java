package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.p040g.C1257i;

/* renamed from: com.bumptech.glide.load.engine.n */
class C1475n<Z> implements C1482s<Z> {

    /* renamed from: a */
    private final boolean f4890a;

    /* renamed from: b */
    private final boolean f4891b;

    /* renamed from: c */
    private C1476a f4892c;

    /* renamed from: d */
    private C1375c f4893d;

    /* renamed from: e */
    private int f4894e;

    /* renamed from: f */
    private boolean f4895f;

    /* renamed from: g */
    private final C1482s<Z> f4896g;

    /* renamed from: com.bumptech.glide.load.engine.n$a */
    interface C1476a {
        /* renamed from: a */
        void mo6246a(C1375c cVar, C1475n<?> nVar);
    }

    C1475n(C1482s<Z> sVar, boolean z, boolean z2) {
        this.f4896g = (C1482s) C1257i.m6691a(sVar);
        this.f4890a = z;
        this.f4891b = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1482s<Z> mo6268a() {
        return this.f4896g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6269a(C1375c cVar, C1476a aVar) {
        this.f4893d = cVar;
        this.f4892c = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6270b() {
        return this.f4890a;
    }

    /* renamed from: c */
    public Class<Z> mo6271c() {
        return this.f4896g.mo6271c();
    }

    /* renamed from: d */
    public Z mo6272d() {
        return this.f4896g.mo6272d();
    }

    /* renamed from: e */
    public int mo6273e() {
        return this.f4896g.mo6273e();
    }

    /* renamed from: f */
    public void mo6274f() {
        if (this.f4894e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f4895f) {
            this.f4895f = true;
            if (this.f4891b) {
                this.f4896g.mo6274f();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo6275g() {
        if (this.f4895f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f4894e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo6276h() {
        if (this.f4894e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f4894e - 1;
            this.f4894e = i;
            if (i == 0) {
                this.f4892c.mo6246a(this.f4893d, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineResource{isCacheable=");
        sb.append(this.f4890a);
        sb.append(", listener=");
        sb.append(this.f4892c);
        sb.append(", key=");
        sb.append(this.f4893d);
        sb.append(", acquired=");
        sb.append(this.f4894e);
        sb.append(", isRecycled=");
        sb.append(this.f4895f);
        sb.append(", resource=");
        sb.append(this.f4896g);
        sb.append('}');
        return sb.toString();
    }
}

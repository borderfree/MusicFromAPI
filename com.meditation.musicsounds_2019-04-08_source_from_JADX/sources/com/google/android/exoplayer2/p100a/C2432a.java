package com.google.android.exoplayer2.p100a;

/* renamed from: com.google.android.exoplayer2.a.a */
public abstract class C2432a {

    /* renamed from: a */
    private int f7767a;

    /* renamed from: a */
    public void mo8641a() {
        this.f7767a = 0;
    }

    /* renamed from: a_ */
    public final void mo8642a_(int i) {
        this.f7767a = i;
    }

    /* renamed from: b */
    public final void mo8643b(int i) {
        this.f7767a = i | this.f7767a;
    }

    /* renamed from: c */
    public final void mo8644c(int i) {
        this.f7767a = (i ^ -1) & this.f7767a;
    }

    /* renamed from: c */
    public final boolean mo8645c() {
        return mo8647d(4);
    }

    /* renamed from: d */
    public final boolean mo8646d() {
        return mo8647d(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo8647d(int i) {
        return (this.f7767a & i) == i;
    }

    /* renamed from: g_ */
    public final boolean mo8648g_() {
        return mo8647d(Integer.MIN_VALUE);
    }
}

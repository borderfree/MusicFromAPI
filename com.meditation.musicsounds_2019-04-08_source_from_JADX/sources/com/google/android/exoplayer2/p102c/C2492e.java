package com.google.android.exoplayer2.p102c;

/* renamed from: com.google.android.exoplayer2.c.e */
public final class C2492e {

    /* renamed from: a */
    public final int f8063a;

    /* renamed from: b */
    public final int f8064b;

    /* renamed from: c */
    public final int f8065c;

    /* renamed from: d */
    public final int f8066d;

    /* renamed from: e */
    public final int f8067e;

    /* renamed from: f */
    public final int f8068f;

    /* renamed from: g */
    public final int f8069g;

    /* renamed from: h */
    public final long f8070h;

    public C2492e(byte[] bArr, int i) {
        C2499j jVar = new C2499j(bArr);
        jVar.mo8808a(i * 8);
        this.f8063a = jVar.mo8814c(16);
        this.f8064b = jVar.mo8814c(16);
        this.f8065c = jVar.mo8814c(24);
        this.f8066d = jVar.mo8814c(24);
        this.f8067e = jVar.mo8814c(20);
        this.f8068f = jVar.mo8814c(3) + 1;
        this.f8069g = jVar.mo8814c(5) + 1;
        this.f8070h = (long) jVar.mo8814c(36);
    }

    /* renamed from: a */
    public int mo8801a() {
        return this.f8069g * this.f8067e;
    }

    /* renamed from: b */
    public long mo8802b() {
        return (this.f8070h * 1000000) / ((long) this.f8067e);
    }
}

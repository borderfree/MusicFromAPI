package com.google.android.exoplayer2.extractor.p108f;

/* renamed from: com.google.android.exoplayer2.extractor.f.b */
final class C2642b {

    /* renamed from: a */
    private final int f8971a;

    /* renamed from: b */
    private final int f8972b;

    /* renamed from: c */
    private final int f8973c;

    /* renamed from: d */
    private final int f8974d;

    /* renamed from: e */
    private final int f8975e;

    /* renamed from: f */
    private final int f8976f;

    /* renamed from: g */
    private long f8977g;

    /* renamed from: h */
    private long f8978h;

    public C2642b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f8971a = i;
        this.f8972b = i2;
        this.f8973c = i3;
        this.f8974d = i4;
        this.f8975e = i5;
        this.f8976f = i6;
    }

    /* renamed from: a */
    public long mo9102a() {
        return ((this.f8978h / ((long) this.f8974d)) * 1000000) / ((long) this.f8972b);
    }

    /* renamed from: a */
    public long mo9103a(long j) {
        return Math.min((((j * ((long) this.f8973c)) / 1000000) / ((long) this.f8974d)) * ((long) this.f8974d), this.f8978h - ((long) this.f8974d)) + this.f8977g;
    }

    /* renamed from: a */
    public void mo9104a(long j, long j2) {
        this.f8977g = j;
        this.f8978h = j2;
    }

    /* renamed from: b */
    public int mo9105b() {
        return this.f8974d;
    }

    /* renamed from: b */
    public long mo9106b(long j) {
        return (j * 1000000) / ((long) this.f8973c);
    }

    /* renamed from: c */
    public int mo9107c() {
        return this.f8972b * this.f8975e * this.f8971a;
    }

    /* renamed from: d */
    public int mo9108d() {
        return this.f8972b;
    }

    /* renamed from: e */
    public int mo9109e() {
        return this.f8971a;
    }

    /* renamed from: f */
    public boolean mo9110f() {
        return (this.f8977g == 0 || this.f8978h == 0) ? false : true;
    }

    /* renamed from: g */
    public int mo9111g() {
        return this.f8976f;
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zm */
public abstract class C4124zm {

    /* renamed from: f */
    private static volatile boolean f15176f = true;

    /* renamed from: a */
    int f15177a;

    /* renamed from: b */
    int f15178b;

    /* renamed from: c */
    C4127zp f15179c;

    /* renamed from: d */
    private int f15180d;

    /* renamed from: e */
    private boolean f15181e;

    private C4124zm() {
        this.f15178b = 100;
        this.f15180d = Integer.MAX_VALUE;
        this.f15181e = false;
    }

    /* renamed from: a */
    public static long m20432a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static C4124zm m20433a(byte[] bArr, int i, int i2, boolean z) {
        C4126zo zoVar = new C4126zo(bArr, i, i2, z);
        try {
            zoVar.mo13850c(i2);
            return zoVar;
        } catch (zzbbu e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public static int m20434f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo13845a();

    /* renamed from: a */
    public abstract void mo13846a(int i);

    /* renamed from: b */
    public abstract double mo13847b();

    /* renamed from: b */
    public abstract boolean mo13848b(int i);

    /* renamed from: c */
    public abstract float mo13849c();

    /* renamed from: c */
    public abstract int mo13850c(int i);

    /* renamed from: d */
    public abstract long mo13851d();

    /* renamed from: d */
    public abstract void mo13852d(int i);

    /* renamed from: e */
    public abstract long mo13853e();

    /* renamed from: e */
    public abstract void mo13854e(int i);

    /* renamed from: f */
    public abstract int mo13855f();

    /* renamed from: g */
    public abstract long mo13856g();

    /* renamed from: h */
    public abstract int mo13857h();

    /* renamed from: i */
    public abstract boolean mo13858i();

    /* renamed from: j */
    public abstract String mo13859j();

    /* renamed from: k */
    public abstract String mo13860k();

    /* renamed from: l */
    public abstract zzbah mo13861l();

    /* renamed from: m */
    public abstract int mo13862m();

    /* renamed from: n */
    public abstract int mo13863n();

    /* renamed from: o */
    public abstract int mo13864o();

    /* renamed from: p */
    public abstract long mo13865p();

    /* renamed from: q */
    public abstract int mo13866q();

    /* renamed from: r */
    public abstract long mo13867r();

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo13868s();

    /* renamed from: t */
    public abstract boolean mo13869t();

    /* renamed from: u */
    public abstract int mo13870u();
}

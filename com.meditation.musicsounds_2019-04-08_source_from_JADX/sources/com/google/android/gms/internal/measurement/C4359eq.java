package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.eq */
public abstract class C4359eq {

    /* renamed from: a */
    int f16067a;

    /* renamed from: b */
    int f16068b;

    /* renamed from: c */
    C4362et f16069c;

    /* renamed from: d */
    private int f16070d;

    /* renamed from: e */
    private boolean f16071e;

    private C4359eq() {
        this.f16068b = 100;
        this.f16070d = Integer.MAX_VALUE;
        this.f16071e = false;
    }

    /* renamed from: a */
    public static C4359eq m21335a(byte[] bArr, int i, int i2) {
        return m21336a(bArr, i, i2, false);
    }

    /* renamed from: a */
    static C4359eq m21336a(byte[] bArr, int i, int i2, boolean z) {
        C4361es esVar = new C4361es(bArr, i, i2, false);
        try {
            esVar.mo14343d(i2);
            return esVar;
        } catch (zzuv e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public abstract int mo14336a();

    /* renamed from: a */
    public abstract <T extends C4419gq> T mo14337a(C4431hb<T> hbVar, C4371fb fbVar);

    /* renamed from: a */
    public abstract void mo14338a(int i);

    /* renamed from: b */
    public abstract double mo14339b();

    /* renamed from: b */
    public abstract boolean mo14340b(int i);

    /* renamed from: c */
    public abstract float mo14341c();

    /* renamed from: c */
    public final int mo14342c(int i) {
        if (i >= 0) {
            int i2 = this.f16068b;
            this.f16068b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public abstract int mo14343d(int i);

    /* renamed from: d */
    public abstract long mo14344d();

    /* renamed from: e */
    public abstract long mo14345e();

    /* renamed from: e */
    public abstract void mo14346e(int i);

    /* renamed from: f */
    public abstract int mo14347f();

    /* renamed from: f */
    public abstract void mo14348f(int i);

    /* renamed from: g */
    public abstract long mo14349g();

    /* renamed from: h */
    public abstract int mo14350h();

    /* renamed from: i */
    public abstract boolean mo14351i();

    /* renamed from: j */
    public abstract String mo14352j();

    /* renamed from: k */
    public abstract String mo14353k();

    /* renamed from: l */
    public abstract zzte mo14354l();

    /* renamed from: m */
    public abstract int mo14355m();

    /* renamed from: n */
    public abstract int mo14356n();

    /* renamed from: o */
    public abstract int mo14357o();

    /* renamed from: p */
    public abstract long mo14358p();

    /* renamed from: q */
    public abstract int mo14359q();

    /* renamed from: r */
    public abstract long mo14360r();

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo14361s();

    /* renamed from: t */
    public abstract boolean mo14362t();

    /* renamed from: u */
    public abstract int mo14363u();
}

package com.google.android.gms.internal.ads;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rl */
public final class C3873rl {

    /* renamed from: a */
    public final int f14813a;

    /* renamed from: b */
    public final int f14814b;

    /* renamed from: c */
    private final int f14815c;

    private C3873rl(int i, int i2, int i3) {
        this.f14815c = i;
        this.f14814b = i2;
        this.f14813a = i3;
    }

    /* renamed from: a */
    public static C3873rl m19690a() {
        return new C3873rl(0, 0, 0);
    }

    /* renamed from: a */
    public static C3873rl m19691a(int i, int i2) {
        return new C3873rl(1, i, i2);
    }

    /* renamed from: a */
    public static C3873rl m19692a(zzjn zzjn) {
        return zzjn.f15502d ? new C3873rl(3, 0, 0) : zzjn.f15507i ? new C3873rl(2, 0, 0) : zzjn.f15506h ? m19690a() : m19691a(zzjn.f15504f, zzjn.f15501c);
    }

    /* renamed from: b */
    public static C3873rl m19693b() {
        return new C3873rl(4, 0, 0);
    }

    /* renamed from: c */
    public final boolean mo13606c() {
        return this.f14815c == 2;
    }

    /* renamed from: d */
    public final boolean mo13607d() {
        return this.f14815c == 3;
    }

    /* renamed from: e */
    public final boolean mo13608e() {
        return this.f14815c == 0;
    }

    /* renamed from: f */
    public final boolean mo13609f() {
        return this.f14815c == 4;
    }
}

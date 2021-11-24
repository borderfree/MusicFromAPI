package com.google.zxing.common.p143a;

/* renamed from: com.google.zxing.common.a.a */
public final class C5036a {

    /* renamed from: a */
    public static final C5036a f17953a = new C5036a(4201, 4096, 1);

    /* renamed from: b */
    public static final C5036a f17954b = new C5036a(1033, 1024, 1);

    /* renamed from: c */
    public static final C5036a f17955c = new C5036a(67, 64, 1);

    /* renamed from: d */
    public static final C5036a f17956d = new C5036a(19, 16, 1);

    /* renamed from: e */
    public static final C5036a f17957e = new C5036a(285, 256, 0);

    /* renamed from: f */
    public static final C5036a f17958f;

    /* renamed from: g */
    public static final C5036a f17959g;

    /* renamed from: h */
    public static final C5036a f17960h = f17955c;

    /* renamed from: i */
    private final int[] f17961i;

    /* renamed from: j */
    private final int[] f17962j;

    /* renamed from: k */
    private final C5037b f17963k;

    /* renamed from: l */
    private final C5037b f17964l;

    /* renamed from: m */
    private final int f17965m;

    /* renamed from: n */
    private final int f17966n;

    /* renamed from: o */
    private final int f17967o;

    static {
        C5036a aVar = new C5036a(301, 256, 1);
        f17958f = aVar;
        f17959g = aVar;
    }

    public C5036a(int i, int i2, int i3) {
        this.f17966n = i;
        this.f17965m = i2;
        this.f17967o = i3;
        this.f17961i = new int[i2];
        this.f17962j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f17961i[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f17962j[this.f17961i[i6]] = i6;
        }
        this.f17963k = new C5037b(this, new int[]{0});
        this.f17964l = new C5037b(this, new int[]{1});
    }

    /* renamed from: b */
    static int m24953b(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo16408a(int i) {
        return this.f17961i[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5037b mo16409a() {
        return this.f17963k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5037b mo16410a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f17963k;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C5037b(this, iArr);
        }
    }

    /* renamed from: b */
    public int mo16411b() {
        return this.f17967o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo16412b(int i) {
        if (i != 0) {
            return this.f17962j[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo16413c(int i) {
        if (i != 0) {
            return this.f17961i[(this.f17965m - this.f17962j[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo16414c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        return this.f17961i[(this.f17962j[i] + this.f17962j[i2]) % (this.f17965m - 1)];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f17966n));
        sb.append(',');
        sb.append(this.f17965m);
        sb.append(')');
        return sb.toString();
    }
}

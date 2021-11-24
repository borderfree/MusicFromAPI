package com.google.android.exoplayer2.p102c;

/* renamed from: com.google.android.exoplayer2.c.l */
public final class C2501l {

    /* renamed from: a */
    private byte[] f8097a;

    /* renamed from: b */
    private int f8098b;

    /* renamed from: c */
    private int f8099c;

    /* renamed from: d */
    private int f8100d;

    public C2501l(byte[] bArr, int i, int i2) {
        mo8855a(bArr, i, i2);
    }

    /* renamed from: d */
    private boolean m11756d(int i) {
        return 2 <= i && i < this.f8098b && this.f8097a[i] == 3 && this.f8097a[i + -2] == 0 && this.f8097a[i - 1] == 0;
    }

    /* renamed from: e */
    private int m11757e() {
        int i = 0;
        int i2 = 0;
        while (!mo8856a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo8860c(i2);
        }
        return i3 + i;
    }

    /* renamed from: f */
    private void m11758f() {
        C2488a.m11668b(this.f8099c >= 0 && this.f8100d >= 0 && this.f8100d < 8 && (this.f8099c < this.f8098b || (this.f8099c == this.f8098b && this.f8100d == 0)));
    }

    /* renamed from: a */
    public void mo8854a(int i) {
        int i2 = this.f8099c;
        this.f8099c += i / 8;
        this.f8100d += i % 8;
        if (this.f8100d > 7) {
            this.f8099c++;
            this.f8100d -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f8099c) {
                m11758f();
                return;
            } else if (m11756d(i2)) {
                this.f8099c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: a */
    public void mo8855a(byte[] bArr, int i, int i2) {
        this.f8097a = bArr;
        this.f8099c = i;
        this.f8098b = i2;
        this.f8100d = 0;
        m11758f();
    }

    /* renamed from: a */
    public boolean mo8856a() {
        return mo8860c(1) == 1;
    }

    /* renamed from: b */
    public boolean mo8857b() {
        int i = this.f8099c;
        int i2 = this.f8100d;
        int i3 = 0;
        while (this.f8099c < this.f8098b && !mo8856a()) {
            i3++;
        }
        boolean z = this.f8099c == this.f8098b;
        this.f8099c = i;
        this.f8100d = i2;
        return !z && mo8858b((i3 * 2) + 1);
    }

    /* renamed from: b */
    public boolean mo8858b(int i) {
        int i2 = this.f8099c;
        int i3 = this.f8099c + (i / 8);
        int i4 = this.f8100d + (i % 8);
        if (i4 > 7) {
            i3++;
            i4 -= 8;
        }
        while (true) {
            i2++;
            if (i2 <= i3 && i3 < this.f8098b) {
                if (m11756d(i2)) {
                    i3++;
                    i2 += 2;
                }
            }
        }
        if (i3 >= this.f8098b) {
            return i3 == this.f8098b && i4 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public int mo8859c() {
        return m11757e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r0 == 8) goto L_0x007e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8860c(int r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r10 / 8
            r2 = 0
        L_0x0007:
            r3 = 255(0xff, float:3.57E-43)
            r4 = 8
            if (r0 >= r1) goto L_0x004a
            int r5 = r9.f8099c
            int r5 = r5 + 1
            boolean r5 = r9.m11756d(r5)
            if (r5 == 0) goto L_0x001c
            int r5 = r9.f8099c
            int r5 = r5 + 2
            goto L_0x0020
        L_0x001c:
            int r5 = r9.f8099c
            int r5 = r5 + 1
        L_0x0020:
            int r6 = r9.f8100d
            if (r6 == 0) goto L_0x003a
            byte[] r6 = r9.f8097a
            int r7 = r9.f8099c
            byte r6 = r6[r7]
            r6 = r6 & r3
            int r7 = r9.f8100d
            int r6 = r6 << r7
            byte[] r7 = r9.f8097a
            byte r7 = r7[r5]
            r7 = r7 & r3
            int r8 = r9.f8100d
            int r4 = r4 - r8
            int r4 = r7 >>> r4
            r4 = r4 | r6
            goto L_0x0040
        L_0x003a:
            byte[] r4 = r9.f8097a
            int r6 = r9.f8099c
            byte r4 = r4[r6]
        L_0x0040:
            int r10 = r10 + -8
            r3 = r3 & r4
            int r3 = r3 << r10
            r2 = r2 | r3
            r9.f8099c = r5
            int r0 = r0 + 1
            goto L_0x0007
        L_0x004a:
            if (r10 <= 0) goto L_0x0094
            int r0 = r9.f8100d
            int r0 = r0 + r10
            int r10 = 8 - r10
            int r10 = r3 >> r10
            byte r10 = (byte) r10
            int r1 = r9.f8099c
            int r1 = r1 + 1
            boolean r1 = r9.m11756d(r1)
            if (r1 == 0) goto L_0x0063
            int r1 = r9.f8099c
            int r1 = r1 + 2
            goto L_0x0067
        L_0x0063:
            int r1 = r9.f8099c
            int r1 = r1 + 1
        L_0x0067:
            if (r0 <= r4) goto L_0x0082
            byte[] r5 = r9.f8097a
            int r6 = r9.f8099c
            byte r5 = r5[r6]
            r5 = r5 & r3
            int r6 = r0 + -8
            int r5 = r5 << r6
            byte[] r6 = r9.f8097a
            byte r6 = r6[r1]
            r3 = r3 & r6
            int r6 = 16 - r0
            int r3 = r3 >> r6
            r3 = r3 | r5
            r10 = r10 & r3
            r10 = r10 | r2
        L_0x007e:
            r9.f8099c = r1
        L_0x0080:
            r2 = r10
            goto L_0x0091
        L_0x0082:
            byte[] r5 = r9.f8097a
            int r6 = r9.f8099c
            byte r5 = r5[r6]
            r3 = r3 & r5
            int r5 = 8 - r0
            int r3 = r3 >> r5
            r10 = r10 & r3
            r10 = r10 | r2
            if (r0 != r4) goto L_0x0080
            goto L_0x007e
        L_0x0091:
            int r0 = r0 % r4
            r9.f8100d = r0
        L_0x0094:
            r9.m11758f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p102c.C2501l.mo8860c(int):int");
    }

    /* renamed from: d */
    public int mo8861d() {
        int e = m11757e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }
}

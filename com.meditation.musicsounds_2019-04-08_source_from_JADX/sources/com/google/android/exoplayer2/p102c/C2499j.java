package com.google.android.exoplayer2.p102c;

/* renamed from: com.google.android.exoplayer2.c.j */
public final class C2499j {

    /* renamed from: a */
    public byte[] f8090a;

    /* renamed from: b */
    private int f8091b;

    /* renamed from: c */
    private int f8092c;

    /* renamed from: d */
    private int f8093d;

    public C2499j() {
    }

    public C2499j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C2499j(byte[] bArr, int i) {
        this.f8090a = bArr;
        this.f8093d = i;
    }

    /* renamed from: f */
    private void m11708f() {
        C2488a.m11668b(this.f8091b >= 0 && this.f8092c >= 0 && this.f8092c < 8 && (this.f8091b < this.f8093d || (this.f8091b == this.f8093d && this.f8092c == 0)));
    }

    /* renamed from: a */
    public int mo8807a() {
        return ((this.f8093d - this.f8091b) * 8) - this.f8092c;
    }

    /* renamed from: a */
    public void mo8808a(int i) {
        this.f8091b = i / 8;
        this.f8092c = i - (this.f8091b * 8);
        m11708f();
    }

    /* renamed from: a */
    public void mo8809a(byte[] bArr, int i) {
        this.f8090a = bArr;
        this.f8091b = 0;
        this.f8092c = 0;
        this.f8093d = i;
    }

    /* renamed from: a */
    public void mo8810a(byte[] bArr, int i, int i2) {
        C2488a.m11668b(this.f8092c == 0);
        System.arraycopy(this.f8090a, this.f8091b, bArr, i, i2);
        this.f8091b += i2;
        m11708f();
    }

    /* renamed from: b */
    public int mo8811b() {
        return (this.f8091b * 8) + this.f8092c;
    }

    /* renamed from: b */
    public void mo8812b(int i) {
        this.f8091b += i / 8;
        this.f8092c += i % 8;
        if (this.f8092c > 7) {
            this.f8091b++;
            this.f8092c -= 8;
        }
        m11708f();
    }

    /* renamed from: c */
    public int mo8813c() {
        C2488a.m11668b(this.f8092c == 0);
        return this.f8091b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r0 == 8) goto L_0x0064;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8814c(int r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r9 / 8
            r2 = 0
        L_0x0007:
            r3 = 255(0xff, float:3.57E-43)
            r4 = 8
            if (r0 >= r1) goto L_0x003f
            int r5 = r8.f8092c
            if (r5 == 0) goto L_0x002b
            byte[] r5 = r8.f8090a
            int r6 = r8.f8091b
            byte r5 = r5[r6]
            r5 = r5 & r3
            int r6 = r8.f8092c
            int r5 = r5 << r6
            byte[] r6 = r8.f8090a
            int r7 = r8.f8091b
            int r7 = r7 + 1
            byte r6 = r6[r7]
            r6 = r6 & r3
            int r7 = r8.f8092c
            int r4 = r4 - r7
            int r4 = r6 >>> r4
            r4 = r4 | r5
            goto L_0x0031
        L_0x002b:
            byte[] r4 = r8.f8090a
            int r5 = r8.f8091b
            byte r4 = r4[r5]
        L_0x0031:
            int r9 = r9 + -8
            r3 = r3 & r4
            int r3 = r3 << r9
            r2 = r2 | r3
            int r3 = r8.f8091b
            int r3 = r3 + 1
            r8.f8091b = r3
            int r0 = r0 + 1
            goto L_0x0007
        L_0x003f:
            if (r9 <= 0) goto L_0x007e
            int r0 = r8.f8092c
            int r0 = r0 + r9
            int r9 = 8 - r9
            int r9 = r3 >> r9
            byte r9 = (byte) r9
            if (r0 <= r4) goto L_0x006c
            byte[] r1 = r8.f8090a
            int r5 = r8.f8091b
            byte r1 = r1[r5]
            r1 = r1 & r3
            int r5 = r0 + -8
            int r1 = r1 << r5
            byte[] r5 = r8.f8090a
            int r6 = r8.f8091b
            int r6 = r6 + 1
            byte r5 = r5[r6]
            r3 = r3 & r5
            int r5 = 16 - r0
            int r3 = r3 >> r5
            r1 = r1 | r3
            r9 = r9 & r1
            r9 = r9 | r2
        L_0x0064:
            int r1 = r8.f8091b
            int r1 = r1 + 1
            r8.f8091b = r1
        L_0x006a:
            r2 = r9
            goto L_0x007b
        L_0x006c:
            byte[] r1 = r8.f8090a
            int r5 = r8.f8091b
            byte r1 = r1[r5]
            r1 = r1 & r3
            int r3 = 8 - r0
            int r1 = r1 >> r3
            r9 = r9 & r1
            r9 = r9 | r2
            if (r0 != r4) goto L_0x006a
            goto L_0x0064
        L_0x007b:
            int r0 = r0 % r4
            r8.f8092c = r0
        L_0x007e:
            r8.m11708f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p102c.C2499j.mo8814c(int):int");
    }

    /* renamed from: d */
    public void mo8815d(int i) {
        C2488a.m11668b(this.f8092c == 0);
        this.f8091b += i;
        m11708f();
    }

    /* renamed from: d */
    public boolean mo8816d() {
        return mo8814c(1) == 1;
    }

    /* renamed from: e */
    public void mo8817e() {
        if (this.f8092c != 0) {
            this.f8092c = 0;
            this.f8091b++;
            m11708f();
        }
    }
}

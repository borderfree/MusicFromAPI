package com.google.android.exoplayer2.p102c;

import java.nio.charset.Charset;

/* renamed from: com.google.android.exoplayer2.c.k */
public final class C2500k {

    /* renamed from: a */
    public byte[] f8094a;

    /* renamed from: b */
    private int f8095b;

    /* renamed from: c */
    private int f8096c;

    public C2500k() {
    }

    public C2500k(int i) {
        this.f8094a = new byte[i];
        this.f8096c = i;
    }

    public C2500k(byte[] bArr) {
        this.f8094a = bArr;
        this.f8096c = bArr.length;
    }

    public C2500k(byte[] bArr, int i) {
        this.f8094a = bArr;
        this.f8096c = i;
    }

    /* renamed from: a */
    public String mo8818a(int i, Charset charset) {
        String str = new String(this.f8094a, this.f8095b, i, charset);
        this.f8095b += i;
        return str;
    }

    /* renamed from: a */
    public void mo8819a() {
        this.f8095b = 0;
        this.f8096c = 0;
    }

    /* renamed from: a */
    public void mo8820a(int i) {
        mo8822a(mo8830e() < i ? new byte[i] : this.f8094a, i);
    }

    /* renamed from: a */
    public void mo8821a(C2499j jVar, int i) {
        mo8823a(jVar.f8090a, 0, i);
        jVar.mo8808a(0);
    }

    /* renamed from: a */
    public void mo8822a(byte[] bArr, int i) {
        this.f8094a = bArr;
        this.f8096c = i;
        this.f8095b = 0;
    }

    /* renamed from: a */
    public void mo8823a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f8094a, this.f8095b, bArr, i, i2);
        this.f8095b += i2;
    }

    /* renamed from: b */
    public int mo8824b() {
        return this.f8096c - this.f8095b;
    }

    /* renamed from: b */
    public void mo8825b(int i) {
        C2488a.m11666a(i >= 0 && i <= this.f8094a.length);
        this.f8096c = i;
    }

    /* renamed from: c */
    public int mo8826c() {
        return this.f8096c;
    }

    /* renamed from: c */
    public void mo8827c(int i) {
        C2488a.m11666a(i >= 0 && i <= this.f8096c);
        this.f8095b = i;
    }

    /* renamed from: d */
    public int mo8828d() {
        return this.f8095b;
    }

    /* renamed from: d */
    public void mo8829d(int i) {
        mo8827c(this.f8095b + i);
    }

    /* renamed from: e */
    public int mo8830e() {
        if (this.f8094a == null) {
            return 0;
        }
        return this.f8094a.length;
    }

    /* renamed from: e */
    public String mo8831e(int i) {
        return mo8818a(i, Charset.defaultCharset());
    }

    /* renamed from: f */
    public char mo8832f() {
        return (char) (((this.f8094a[this.f8095b] & 255) << 8) | (this.f8094a[this.f8095b + 1] & 255));
    }

    /* renamed from: f */
    public String mo8833f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f8095b + i) - 1;
        String str = new String(this.f8094a, this.f8095b, (i2 >= this.f8096c || this.f8094a[i2] != 0) ? i : i - 1);
        this.f8095b += i;
        return str;
    }

    /* renamed from: g */
    public int mo8834g() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public int mo8835h() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: i */
    public int mo8836i() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        byte b = bArr[i] & 255;
        byte[] bArr2 = this.f8094a;
        int i2 = this.f8095b;
        this.f8095b = i2 + 1;
        return b | ((bArr2[i2] & 255) << 8);
    }

    /* renamed from: j */
    public short mo8837j() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    /* renamed from: k */
    public int mo8838k() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        return b | (bArr3[i4] & 255);
    }

    /* renamed from: l */
    public long mo8839l() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f8094a;
        int i2 = this.f8095b;
        this.f8095b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    /* renamed from: m */
    public long mo8840m() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.f8094a;
        int i2 = this.f8095b;
        this.f8095b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        return j3 | ((255 & ((long) bArr4[i4])) << 24);
    }

    /* renamed from: n */
    public int mo8841n() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        byte b2 = b | ((bArr3[i4] & 255) << 8);
        byte[] bArr4 = this.f8094a;
        int i5 = this.f8095b;
        this.f8095b = i5 + 1;
        return b2 | (bArr4[i5] & 255);
    }

    /* renamed from: o */
    public int mo8842o() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        byte b = bArr[i] & 255;
        byte[] bArr2 = this.f8094a;
        int i2 = this.f8095b;
        this.f8095b = i2 + 1;
        byte b2 = b | ((bArr2[i2] & 255) << 8);
        byte[] bArr3 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        byte b3 = b2 | ((bArr3[i3] & 255) << 16);
        byte[] bArr4 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        return b3 | ((bArr4[i4] & 255) << 24);
    }

    /* renamed from: p */
    public long mo8843p() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f8094a;
        int i2 = this.f8095b;
        this.f8095b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.f8094a;
        int i5 = this.f8095b;
        this.f8095b = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.f8094a;
        int i6 = this.f8095b;
        this.f8095b = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.f8094a;
        int i7 = this.f8095b;
        this.f8095b = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.f8094a;
        int i8 = this.f8095b;
        this.f8095b = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    /* renamed from: q */
    public long mo8844q() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.f8094a;
        int i2 = this.f8095b;
        this.f8095b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.f8094a;
        int i4 = this.f8095b;
        this.f8095b = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 24);
        byte[] bArr5 = this.f8094a;
        int i5 = this.f8095b;
        this.f8095b = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 32);
        byte[] bArr6 = this.f8094a;
        int i6 = this.f8095b;
        this.f8095b = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 40);
        byte[] bArr7 = this.f8094a;
        int i7 = this.f8095b;
        this.f8095b = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 48);
        byte[] bArr8 = this.f8094a;
        int i8 = this.f8095b;
        this.f8095b = i8 + 1;
        return j7 | ((255 & ((long) bArr8[i8])) << 56);
    }

    /* renamed from: r */
    public int mo8845r() {
        byte[] bArr = this.f8094a;
        int i = this.f8095b;
        this.f8095b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f8094a;
        int i3 = this.f8095b;
        this.f8095b = i3 + 1;
        byte b = i2 | (bArr2[i3] & 255);
        this.f8095b += 2;
        return b;
    }

    /* renamed from: s */
    public int mo8846s() {
        return (mo8834g() << 21) | (mo8834g() << 14) | (mo8834g() << 7) | mo8834g();
    }

    /* renamed from: t */
    public int mo8847t() {
        int n = mo8841n();
        if (n >= 0) {
            return n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: u */
    public int mo8848u() {
        int o = mo8842o();
        if (o >= 0) {
            return o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    public long mo8849v() {
        long p = mo8843p();
        if (p >= 0) {
            return p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(p);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: w */
    public double mo8850w() {
        return Double.longBitsToDouble(mo8843p());
    }

    /* renamed from: x */
    public String mo8851x() {
        if (mo8824b() == 0) {
            return null;
        }
        int i = this.f8095b;
        while (i < this.f8096c && this.f8094a[i] != 0) {
            i++;
        }
        String str = new String(this.f8094a, this.f8095b, i - this.f8095b);
        this.f8095b = i;
        if (this.f8095b < this.f8096c) {
            this.f8095b++;
        }
        return str;
    }

    /* renamed from: y */
    public String mo8852y() {
        if (mo8824b() == 0) {
            return null;
        }
        int i = this.f8095b;
        while (i < this.f8096c && !C2511s.m11807a((int) this.f8094a[i])) {
            i++;
        }
        if (i - this.f8095b >= 3 && this.f8094a[this.f8095b] == -17 && this.f8094a[this.f8095b + 1] == -69 && this.f8094a[this.f8095b + 2] == -65) {
            this.f8095b += 3;
        }
        String str = new String(this.f8094a, this.f8095b, i - this.f8095b);
        this.f8095b = i;
        if (this.f8095b == this.f8096c) {
            return str;
        }
        if (this.f8094a[this.f8095b] == 13) {
            this.f8095b++;
            if (this.f8095b == this.f8096c) {
                return str;
            }
        }
        if (this.f8094a[this.f8095b] == 10) {
            this.f8095b++;
        }
        return str;
    }

    /* renamed from: z */
    public long mo8853z() {
        int i;
        int i2;
        long j = (long) this.f8094a[this.f8095b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f8094a[this.f8095b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f8095b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }
}

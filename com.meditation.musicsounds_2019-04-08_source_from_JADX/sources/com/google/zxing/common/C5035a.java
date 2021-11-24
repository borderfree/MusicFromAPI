package com.google.zxing.common;

import java.util.Arrays;

/* renamed from: com.google.zxing.common.a */
public final class C5035a implements Cloneable {

    /* renamed from: a */
    private int[] f17951a;

    /* renamed from: b */
    private int f17952b;

    public C5035a() {
        this.f17952b = 0;
        this.f17951a = new int[1];
    }

    C5035a(int[] iArr, int i) {
        this.f17951a = iArr;
        this.f17952b = i;
    }

    /* renamed from: b */
    private void m24942b(int i) {
        if (i > (this.f17951a.length << 5)) {
            int[] c = m24943c(i);
            System.arraycopy(this.f17951a, 0, c, 0, this.f17951a.length);
            this.f17951a = c;
        }
    }

    /* renamed from: c */
    private static int[] m24943c(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public int mo16395a() {
        return this.f17952b;
    }

    /* renamed from: a */
    public void mo16396a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m24942b(this.f17952b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo16399a(z);
            i2--;
        }
    }

    /* renamed from: a */
    public void mo16397a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (mo16400a(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i2 + i5] = (byte) i7;
            i5++;
            i4 = i6;
        }
    }

    /* renamed from: a */
    public void mo16398a(C5035a aVar) {
        int i = aVar.f17952b;
        m24942b(this.f17952b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo16399a(aVar.mo16400a(i2));
        }
    }

    /* renamed from: a */
    public void mo16399a(boolean z) {
        m24942b(this.f17952b + 1);
        if (z) {
            int[] iArr = this.f17951a;
            int i = this.f17952b / 32;
            iArr[i] = iArr[i] | (1 << (this.f17952b & 31));
        }
        this.f17952b++;
    }

    /* renamed from: a */
    public boolean mo16400a(int i) {
        return ((1 << (i & 31)) & this.f17951a[i / 32]) != 0;
    }

    /* renamed from: b */
    public int mo16401b() {
        return (this.f17952b + 7) / 8;
    }

    /* renamed from: b */
    public void mo16402b(C5035a aVar) {
        if (this.f17952b == aVar.f17952b) {
            for (int i = 0; i < this.f17951a.length; i++) {
                int[] iArr = this.f17951a;
                iArr[i] = iArr[i] ^ aVar.f17951a[i];
            }
            return;
        }
        throw new IllegalArgumentException("Sizes don't match");
    }

    /* renamed from: c */
    public C5035a clone() {
        return new C5035a((int[]) this.f17951a.clone(), this.f17952b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5035a)) {
            return false;
        }
        C5035a aVar = (C5035a) obj;
        return this.f17952b == aVar.f17952b && Arrays.equals(this.f17951a, aVar.f17951a);
    }

    public int hashCode() {
        return (this.f17952b * 31) + Arrays.hashCode(this.f17951a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f17952b);
        for (int i = 0; i < this.f17952b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo16400a(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}

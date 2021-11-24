package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* renamed from: com.google.zxing.datamatrix.encoder.e */
public class C5045e {

    /* renamed from: a */
    private final CharSequence f17977a;

    /* renamed from: b */
    private final int f17978b;

    /* renamed from: c */
    private final int f17979c;

    /* renamed from: d */
    private final byte[] f17980d;

    public C5045e(CharSequence charSequence, int i, int i2) {
        this.f17977a = charSequence;
        this.f17979c = i;
        this.f17978b = i2;
        this.f17980d = new byte[(i * i2)];
        Arrays.fill(this.f17980d, -1);
    }

    /* renamed from: a */
    private void m24998a(int i) {
        m25000a(this.f17978b - 1, 0, i, 1);
        m25000a(this.f17978b - 1, 1, i, 2);
        m25000a(this.f17978b - 1, 2, i, 3);
        m25000a(0, this.f17979c - 2, i, 4);
        m25000a(0, this.f17979c - 1, i, 5);
        m25000a(1, this.f17979c - 1, i, 6);
        m25000a(2, this.f17979c - 1, i, 7);
        m25000a(3, this.f17979c - 1, i, 8);
    }

    /* renamed from: a */
    private void m24999a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m25000a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m25000a(i4, i6, i3, 2);
        int i7 = i - 1;
        m25000a(i7, i5, i3, 3);
        m25000a(i7, i6, i3, 4);
        m25000a(i7, i2, i3, 5);
        m25000a(i, i5, i3, 6);
        m25000a(i, i6, i3, 7);
        m25000a(i, i2, i3, 8);
    }

    /* renamed from: a */
    private void m25000a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += this.f17978b;
            i2 += 4 - ((this.f17978b + 4) % 8);
        }
        if (i2 < 0) {
            i2 += this.f17979c;
            i += 4 - ((this.f17979c + 4) % 8);
        }
        boolean z = true;
        if ((this.f17977a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m25001a(i2, i, z);
    }

    /* renamed from: a */
    private void m25001a(int i, int i2, boolean z) {
        this.f17980d[(i2 * this.f17979c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: b */
    private void m25002b(int i) {
        m25000a(this.f17978b - 3, 0, i, 1);
        m25000a(this.f17978b - 2, 0, i, 2);
        m25000a(this.f17978b - 1, 0, i, 3);
        m25000a(0, this.f17979c - 4, i, 4);
        m25000a(0, this.f17979c - 3, i, 5);
        m25000a(0, this.f17979c - 2, i, 6);
        m25000a(0, this.f17979c - 1, i, 7);
        m25000a(1, this.f17979c - 1, i, 8);
    }

    /* renamed from: b */
    private boolean m25003b(int i, int i2) {
        return this.f17980d[(i2 * this.f17979c) + i] >= 0;
    }

    /* renamed from: c */
    private void m25004c(int i) {
        m25000a(this.f17978b - 3, 0, i, 1);
        m25000a(this.f17978b - 2, 0, i, 2);
        m25000a(this.f17978b - 1, 0, i, 3);
        m25000a(0, this.f17979c - 2, i, 4);
        m25000a(0, this.f17979c - 1, i, 5);
        m25000a(1, this.f17979c - 1, i, 6);
        m25000a(2, this.f17979c - 1, i, 7);
        m25000a(3, this.f17979c - 1, i, 8);
    }

    /* renamed from: d */
    private void m25005d(int i) {
        m25000a(this.f17978b - 1, 0, i, 1);
        m25000a(this.f17978b - 1, this.f17979c - 1, i, 2);
        m25000a(0, this.f17979c - 3, i, 3);
        m25000a(0, this.f17979c - 2, i, 4);
        m25000a(0, this.f17979c - 1, i, 5);
        m25000a(1, this.f17979c - 3, i, 6);
        m25000a(1, this.f17979c - 2, i, 7);
        m25000a(1, this.f17979c - 1, i, 8);
    }

    /* renamed from: a */
    public final void mo16446a() {
        int i = 4;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i == this.f17978b && i2 == 0) {
                int i4 = i3 + 1;
                m24998a(i3);
                i3 = i4;
            }
            if (i == this.f17978b - 2 && i2 == 0 && this.f17979c % 4 != 0) {
                int i5 = i3 + 1;
                m25002b(i3);
                i3 = i5;
            }
            if (i == this.f17978b - 2 && i2 == 0 && this.f17979c % 8 == 4) {
                int i6 = i3 + 1;
                m25004c(i3);
                i3 = i6;
            }
            if (i == this.f17978b + 4 && i2 == 2 && this.f17979c % 8 == 0) {
                int i7 = i3 + 1;
                m25005d(i3);
                i3 = i7;
            }
            do {
                if (i < this.f17978b && i2 >= 0 && !m25003b(i2, i)) {
                    int i8 = i3 + 1;
                    m24999a(i, i2, i3);
                    i3 = i8;
                }
                i -= 2;
                i2 += 2;
                if (i < 0) {
                    break;
                }
            } while (i2 < this.f17979c);
            int i9 = i + 1;
            int i10 = i2 + 3;
            do {
                if (i9 >= 0 && i10 < this.f17979c && !m25003b(i10, i9)) {
                    int i11 = i3 + 1;
                    m24999a(i9, i10, i3);
                    i3 = i11;
                }
                i9 += 2;
                i10 -= 2;
                if (i9 >= this.f17978b) {
                    break;
                }
            } while (i10 >= 0);
            i = i9 + 3;
            i2 = i10 + 1;
            if (i >= this.f17978b && i2 >= this.f17979c) {
                break;
            }
        }
        if (!m25003b(this.f17979c - 1, this.f17978b - 1)) {
            m25001a(this.f17979c - 1, this.f17978b - 1, true);
            m25001a(this.f17979c - 2, this.f17978b - 2, true);
        }
    }

    /* renamed from: a */
    public final boolean mo16447a(int i, int i2) {
        return this.f17980d[(i2 * this.f17979c) + i] == 1;
    }
}

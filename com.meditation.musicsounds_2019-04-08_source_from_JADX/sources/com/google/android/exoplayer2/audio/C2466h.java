package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.p102c.C2488a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.h */
final class C2466h {

    /* renamed from: a */
    private final int f7946a;

    /* renamed from: b */
    private final int f7947b;

    /* renamed from: c */
    private final int f7948c;

    /* renamed from: d */
    private final int f7949d;

    /* renamed from: e */
    private final int f7950e = (this.f7949d * 2);

    /* renamed from: f */
    private final short[] f7951f = new short[this.f7950e];

    /* renamed from: g */
    private int f7952g = this.f7950e;

    /* renamed from: h */
    private short[] f7953h;

    /* renamed from: i */
    private int f7954i;

    /* renamed from: j */
    private short[] f7955j;

    /* renamed from: k */
    private int f7956k;

    /* renamed from: l */
    private short[] f7957l;

    /* renamed from: m */
    private int f7958m;

    /* renamed from: n */
    private int f7959n;

    /* renamed from: o */
    private float f7960o;

    /* renamed from: p */
    private float f7961p;

    /* renamed from: q */
    private int f7962q;

    /* renamed from: r */
    private int f7963r;

    /* renamed from: s */
    private int f7964s;

    /* renamed from: t */
    private int f7965t;

    /* renamed from: u */
    private int f7966u;

    /* renamed from: v */
    private int f7967v;

    /* renamed from: w */
    private int f7968w;

    /* renamed from: x */
    private int f7969x;

    public C2466h(int i, int i2) {
        this.f7946a = i;
        this.f7947b = i2;
        this.f7948c = i / 400;
        this.f7949d = i / 65;
        this.f7953h = new short[(this.f7950e * i2)];
        this.f7954i = this.f7950e;
        this.f7955j = new short[(this.f7950e * i2)];
        this.f7956k = this.f7950e;
        this.f7957l = new short[(this.f7950e * i2)];
        this.f7958m = 0;
        this.f7959n = 0;
        this.f7966u = 0;
        this.f7960o = 1.0f;
        this.f7961p = 1.0f;
    }

    /* renamed from: a */
    private int m11564a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f7965t = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        m11568a(i3);
        m11569a(i3, this.f7947b, this.f7955j, this.f7963r, sArr, i, sArr, i + i2);
        this.f7963r += i3;
        return i3;
    }

    /* renamed from: a */
    private int m11565a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f7947b;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.f7968w = i5 / i6;
        this.f7969x = i7 / i8;
        return i6;
    }

    /* renamed from: a */
    private int m11566a(short[] sArr, int i, boolean z) {
        int i2;
        int i3 = this.f7946a > 4000 ? this.f7946a / 4000 : 1;
        if (this.f7947b == 1 && i3 == 1) {
            i2 = m11565a(sArr, i, this.f7948c, this.f7949d);
        } else {
            m11575b(sArr, i, i3);
            int a = m11565a(this.f7951f, 0, this.f7948c / i3, this.f7949d / i3);
            if (i3 != 1) {
                int i4 = a * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                if (i6 < this.f7948c) {
                    i6 = this.f7948c;
                }
                if (i7 > this.f7949d) {
                    i7 = this.f7949d;
                }
                if (this.f7947b == 1) {
                    i2 = m11565a(sArr, i, i6, i7);
                } else {
                    m11575b(sArr, i, 1);
                    i2 = m11565a(this.f7951f, 0, i6, i7);
                }
            } else {
                i2 = a;
            }
        }
        int i8 = m11571a(this.f7968w, this.f7969x, z) ? this.f7966u : i2;
        this.f7967v = this.f7968w;
        this.f7966u = i2;
        return i8;
    }

    /* renamed from: a */
    private void m11567a(float f, int i) {
        if (this.f7963r != i) {
            int i2 = (int) (((float) this.f7946a) / f);
            int i3 = this.f7946a;
            while (true) {
                if (i2 <= 16384 && i3 <= 16384) {
                    break;
                }
                i2 /= 2;
                i3 /= 2;
            }
            m11580e(i);
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 < this.f7964s - 1) {
                    while ((this.f7958m + 1) * i2 > this.f7959n * i3) {
                        m11568a(1);
                        for (int i5 = 0; i5 < this.f7947b; i5++) {
                            this.f7955j[(this.f7963r * this.f7947b) + i5] = m11573b(this.f7957l, (this.f7947b * i4) + i5, i3, i2);
                        }
                        this.f7959n++;
                        this.f7963r++;
                    }
                    this.f7958m++;
                    if (this.f7958m == i3) {
                        this.f7958m = 0;
                        if (this.f7959n != i2) {
                            z = false;
                        }
                        C2488a.m11668b(z);
                        this.f7959n = 0;
                    }
                    i4++;
                } else {
                    m11581f(this.f7964s - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m11568a(int i) {
        if (this.f7963r + i > this.f7954i) {
            this.f7954i += (this.f7954i / 2) + i;
            this.f7955j = Arrays.copyOf(this.f7955j, this.f7954i * this.f7947b);
        }
    }

    /* renamed from: a */
    private static void m11569a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    private void m11570a(short[] sArr, int i, int i2) {
        m11568a(i2);
        System.arraycopy(sArr, i * this.f7947b, this.f7955j, this.f7963r * this.f7947b, this.f7947b * i2);
        this.f7963r += i2;
    }

    /* renamed from: a */
    private boolean m11571a(int i, int i2, boolean z) {
        if (i == 0 || this.f7966u == 0) {
            return false;
        }
        if (z) {
            if (i2 > i * 3 || i * 2 <= this.f7967v * 3) {
                return false;
            }
        } else if (i <= this.f7967v) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m11572b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f7965t = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        m11568a(i4);
        System.arraycopy(sArr, this.f7947b * i, this.f7955j, this.f7963r * this.f7947b, this.f7947b * i2);
        m11569a(i3, this.f7947b, this.f7955j, this.f7963r + i2, sArr, i + i2, sArr, i);
        this.f7963r += i4;
        return i3;
    }

    /* renamed from: b */
    private short m11573b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f7947b];
        int i4 = this.f7959n * i2;
        int i5 = (this.f7958m + 1) * i3;
        int i6 = i5 - i4;
        int i7 = i5 - (this.f7958m * i3);
        return (short) (((s * i6) + ((i7 - i6) * s2)) / i7);
    }

    /* renamed from: b */
    private void m11574b(int i) {
        if (this.f7962q + i > this.f7952g) {
            this.f7952g += (this.f7952g / 2) + i;
            this.f7953h = Arrays.copyOf(this.f7953h, this.f7952g * this.f7947b);
        }
    }

    /* renamed from: b */
    private void m11575b(short[] sArr, int i, int i2) {
        int i3 = this.f7950e / i2;
        int i4 = this.f7947b * i2;
        int i5 = i * this.f7947b;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                i7 += sArr[(i6 * i4) + i5 + i8];
            }
            this.f7951f[i6] = (short) (i7 / i4);
        }
    }

    /* renamed from: c */
    private void m11576c() {
        int i = this.f7963r;
        float f = this.f7960o / this.f7961p;
        double d = (double) f;
        if (d > 1.00001d || d < 0.99999d) {
            m11577c(f);
        } else {
            m11570a(this.f7953h, 0, this.f7962q);
            this.f7962q = 0;
        }
        if (this.f7961p != 1.0f) {
            m11567a(this.f7961p, i);
        }
    }

    /* renamed from: c */
    private void m11577c(float f) {
        int b;
        if (this.f7962q >= this.f7950e) {
            int i = this.f7962q;
            int i2 = 0;
            do {
                if (this.f7965t > 0) {
                    b = m11579d(i2);
                } else {
                    int a = m11566a(this.f7953h, i2, true);
                    b = ((double) f) > 1.0d ? a + m11564a(this.f7953h, i2, f, a) : m11572b(this.f7953h, i2, f, a);
                }
                i2 += b;
            } while (this.f7950e + i2 <= i);
            m11578c(i2);
        }
    }

    /* renamed from: c */
    private void m11578c(int i) {
        int i2 = this.f7962q - i;
        System.arraycopy(this.f7953h, i * this.f7947b, this.f7953h, 0, this.f7947b * i2);
        this.f7962q = i2;
    }

    /* renamed from: d */
    private int m11579d(int i) {
        int min = Math.min(this.f7950e, this.f7965t);
        m11570a(this.f7953h, i, min);
        this.f7965t -= min;
        return min;
    }

    /* renamed from: e */
    private void m11580e(int i) {
        int i2 = this.f7963r - i;
        if (this.f7964s + i2 > this.f7956k) {
            this.f7956k += (this.f7956k / 2) + i2;
            this.f7957l = Arrays.copyOf(this.f7957l, this.f7956k * this.f7947b);
        }
        System.arraycopy(this.f7955j, this.f7947b * i, this.f7957l, this.f7964s * this.f7947b, this.f7947b * i2);
        this.f7963r = i;
        this.f7964s += i2;
    }

    /* renamed from: f */
    private void m11581f(int i) {
        if (i != 0) {
            System.arraycopy(this.f7957l, this.f7947b * i, this.f7957l, 0, (this.f7964s - i) * this.f7947b);
            this.f7964s -= i;
        }
    }

    /* renamed from: a */
    public void mo8751a() {
        int i = this.f7962q;
        int i2 = this.f7963r + ((int) ((((((float) i) / (this.f7960o / this.f7961p)) + ((float) this.f7964s)) / this.f7961p) + 0.5f));
        m11574b((this.f7950e * 2) + i);
        for (int i3 = 0; i3 < this.f7950e * 2 * this.f7947b; i3++) {
            this.f7953h[(this.f7947b * i) + i3] = 0;
        }
        this.f7962q += this.f7950e * 2;
        m11576c();
        if (this.f7963r > i2) {
            this.f7963r = i2;
        }
        this.f7962q = 0;
        this.f7965t = 0;
        this.f7964s = 0;
    }

    /* renamed from: a */
    public void mo8752a(float f) {
        this.f7960o = f;
    }

    /* renamed from: a */
    public void mo8753a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.f7947b;
        int i = this.f7947b * remaining * 2;
        m11574b(remaining);
        shortBuffer.get(this.f7953h, this.f7962q * this.f7947b, i / 2);
        this.f7962q += remaining;
        m11576c();
    }

    /* renamed from: b */
    public int mo8754b() {
        return this.f7963r;
    }

    /* renamed from: b */
    public void mo8755b(float f) {
        this.f7961p = f;
    }

    /* renamed from: b */
    public void mo8756b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f7947b, this.f7963r);
        shortBuffer.put(this.f7955j, 0, this.f7947b * min);
        this.f7963r -= min;
        System.arraycopy(this.f7955j, min * this.f7947b, this.f7955j, 0, this.f7963r * this.f7947b);
    }
}

package com.google.zxing.common;

import java.util.Arrays;

/* renamed from: com.google.zxing.common.b */
public final class C5039b implements Cloneable {

    /* renamed from: a */
    private final int f17972a;

    /* renamed from: b */
    private final int f17973b;

    /* renamed from: c */
    private final int f17974c;

    /* renamed from: d */
    private final int[] f17975d;

    public C5039b(int i) {
        this(i, i);
    }

    public C5039b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f17972a = i;
        this.f17973b = i2;
        this.f17974c = (i + 31) / 32;
        this.f17975d = new int[(this.f17974c * i2)];
    }

    private C5039b(int i, int i2, int i3, int[] iArr) {
        this.f17972a = i;
        this.f17973b = i2;
        this.f17974c = i3;
        this.f17975d = iArr;
    }

    /* renamed from: a */
    private String m24971a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f17973b * (this.f17972a + 1));
        for (int i = 0; i < this.f17973b; i++) {
            for (int i2 = 0; i2 < this.f17972a; i2++) {
                sb.append(mo16429a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo16426a(String str, String str2) {
        return m24971a(str, str2, "\n");
    }

    /* renamed from: a */
    public void mo16427a() {
        int length = this.f17975d.length;
        for (int i = 0; i < length; i++) {
            this.f17975d[i] = 0;
        }
    }

    /* renamed from: a */
    public void mo16428a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f17973b || i5 > this.f17972a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f17974c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f17975d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public boolean mo16429a(int i, int i2) {
        return ((this.f17975d[(i2 * this.f17974c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public int mo16430b() {
        return this.f17972a;
    }

    /* renamed from: b */
    public void mo16431b(int i, int i2) {
        int i3 = (i2 * this.f17974c) + (i / 32);
        int[] iArr = this.f17975d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: c */
    public int mo16432c() {
        return this.f17973b;
    }

    /* renamed from: d */
    public C5039b clone() {
        return new C5039b(this.f17972a, this.f17973b, this.f17974c, (int[]) this.f17975d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5039b)) {
            return false;
        }
        C5039b bVar = (C5039b) obj;
        return this.f17972a == bVar.f17972a && this.f17973b == bVar.f17973b && this.f17974c == bVar.f17974c && Arrays.equals(this.f17975d, bVar.f17975d);
    }

    public int hashCode() {
        return (((((((this.f17972a * 31) + this.f17972a) * 31) + this.f17973b) * 31) + this.f17974c) * 31) + Arrays.hashCode(this.f17975d);
    }

    public String toString() {
        return mo16426a("X ", "  ");
    }
}

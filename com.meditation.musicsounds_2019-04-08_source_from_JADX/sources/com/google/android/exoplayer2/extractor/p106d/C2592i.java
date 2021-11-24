package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.p102c.C2488a;

/* renamed from: com.google.android.exoplayer2.extractor.d.i */
final class C2592i {

    /* renamed from: a */
    public final byte[] f8678a;

    /* renamed from: b */
    private final int f8679b;

    /* renamed from: c */
    private int f8680c;

    /* renamed from: d */
    private int f8681d;

    public C2592i(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C2592i(byte[] bArr, int i) {
        this.f8678a = bArr;
        this.f8679b = i * 8;
    }

    /* renamed from: a */
    public int mo9055a(int i) {
        int i2;
        int i3;
        C2488a.m11668b(mo9057b() + i <= this.f8679b);
        if (i == 0) {
            return 0;
        }
        if (this.f8681d != 0) {
            i3 = Math.min(i, 8 - this.f8681d);
            i2 = (255 >>> (8 - i3)) & (this.f8678a[this.f8680c] >>> this.f8681d);
            this.f8681d += i3;
            if (this.f8681d == 8) {
                this.f8680c++;
                this.f8681d = 0;
            }
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i4 = i - i3;
        if (i4 > 7) {
            int i5 = i4 / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                long j = (long) i2;
                byte[] bArr = this.f8678a;
                int i7 = this.f8680c;
                this.f8680c = i7 + 1;
                i2 = (int) (j | ((((long) bArr[i7]) & 255) << i3));
                i3 += 8;
            }
        }
        if (i > i3) {
            int i8 = i - i3;
            i2 |= ((255 >>> (8 - i8)) & this.f8678a[this.f8680c]) << i3;
            this.f8681d += i8;
        }
        return i2;
    }

    /* renamed from: a */
    public boolean mo9056a() {
        return mo9055a(1) == 1;
    }

    /* renamed from: b */
    public int mo9057b() {
        return (this.f8680c * 8) + this.f8681d;
    }

    /* renamed from: b */
    public void mo9058b(int i) {
        C2488a.m11668b(mo9057b() + i <= this.f8679b);
        this.f8680c += i / 8;
        this.f8681d += i % 8;
        if (this.f8681d > 7) {
            this.f8680c++;
            this.f8681d -= 8;
        }
    }
}

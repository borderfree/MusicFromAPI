package com.google.android.exoplayer2.extractor.p103a;

import com.google.android.exoplayer2.extractor.C2650g;

/* renamed from: com.google.android.exoplayer2.extractor.a.f */
final class C2535f {

    /* renamed from: a */
    private static final long[] f8264a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f8265b = new byte[8];

    /* renamed from: c */
    private int f8266c;

    /* renamed from: d */
    private int f8267d;

    /* renamed from: a */
    public static int m11936a(int i) {
        for (int i2 = 0; i2 < f8264a.length; i2++) {
            if ((f8264a[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m11937a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f8264a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public long mo8960a(C2650g gVar, boolean z, boolean z2, int i) {
        if (this.f8266c == 0) {
            if (!gVar.mo8967a(this.f8265b, 0, 1, z)) {
                return -1;
            }
            this.f8267d = m11936a(this.f8265b[0] & 255);
            if (this.f8267d != -1) {
                this.f8266c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if (this.f8267d > i) {
            this.f8266c = 0;
            return -2;
        }
        if (this.f8267d != 1) {
            gVar.mo8970b(this.f8265b, 1, this.f8267d - 1);
        }
        this.f8266c = 0;
        return m11937a(this.f8265b, this.f8267d, z2);
    }

    /* renamed from: a */
    public void mo8961a() {
        this.f8266c = 0;
        this.f8267d = 0;
    }

    /* renamed from: b */
    public int mo8962b() {
        return this.f8267d;
    }
}

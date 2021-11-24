package com.google.android.exoplayer2.extractor.p105c;

import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.c.d */
final class C2555d {

    /* renamed from: com.google.android.exoplayer2.extractor.c.d$a */
    public static final class C2557a {

        /* renamed from: a */
        public final long[] f8444a;

        /* renamed from: b */
        public final int[] f8445b;

        /* renamed from: c */
        public final int f8446c;

        /* renamed from: d */
        public final long[] f8447d;

        /* renamed from: e */
        public final int[] f8448e;

        private C2557a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
            this.f8444a = jArr;
            this.f8445b = iArr;
            this.f8446c = i;
            this.f8447d = jArr2;
            this.f8448e = iArr2;
        }
    }

    /* renamed from: a */
    public static C2557a m12033a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        int i4 = 0;
        for (int a : iArr2) {
            i4 += C2511s.m11797a(a, i2);
        }
        long[] jArr2 = new long[i4];
        int[] iArr3 = new int[i4];
        long[] jArr3 = new long[i4];
        int[] iArr4 = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < iArr2.length) {
            int i8 = iArr2[i3];
            long j2 = jArr[i3];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i7 = Math.max(i7, iArr3[i5]);
                jArr3[i5] = ((long) i6) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i6 += min;
                i8 -= min;
                i5++;
                int[] iArr5 = iArr;
            }
            i3++;
            iArr2 = iArr;
        }
        C2557a aVar = new C2557a(jArr2, iArr3, i7, jArr3, iArr4);
        return aVar;
    }
}

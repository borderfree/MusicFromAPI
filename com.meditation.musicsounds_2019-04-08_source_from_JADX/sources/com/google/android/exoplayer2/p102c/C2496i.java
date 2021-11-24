package com.google.android.exoplayer2.p102c;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.c.i */
public final class C2496i {

    /* renamed from: a */
    public static final byte[] f8073a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f8074b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f8075c = new Object();

    /* renamed from: d */
    private static int[] f8076d = new int[10];

    /* renamed from: com.google.android.exoplayer2.c.i$a */
    public static final class C2497a {

        /* renamed from: a */
        public final int f8077a;

        /* renamed from: b */
        public final int f8078b;

        /* renamed from: c */
        public final boolean f8079c;

        public C2497a(int i, int i2, boolean z) {
            this.f8077a = i;
            this.f8078b = i2;
            this.f8079c = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.c.i$b */
    public static final class C2498b {

        /* renamed from: a */
        public final int f8080a;

        /* renamed from: b */
        public final int f8081b;

        /* renamed from: c */
        public final int f8082c;

        /* renamed from: d */
        public final float f8083d;

        /* renamed from: e */
        public final boolean f8084e;

        /* renamed from: f */
        public final boolean f8085f;

        /* renamed from: g */
        public final int f8086g;

        /* renamed from: h */
        public final int f8087h;

        /* renamed from: i */
        public final int f8088i;

        /* renamed from: j */
        public final boolean f8089j;

        public C2498b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f8080a = i;
            this.f8081b = i2;
            this.f8082c = i3;
            this.f8083d = f;
            this.f8084e = z;
            this.f8085f = z2;
            this.f8086g = i4;
            this.f8087h = i5;
            this.f8088i = i6;
            this.f8089j = z3;
        }
    }

    /* renamed from: a */
    public static int m11697a(byte[] bArr, int i) {
        int i2;
        synchronized (f8075c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m11707c(bArr, i3, i);
                    if (i3 < i) {
                        if (f8076d.length <= i4) {
                            f8076d = Arrays.copyOf(f8076d, f8076d.length * 2);
                        }
                        int i5 = i4 + 1;
                        f8076d[i4] = i3;
                        i3 += 3;
                        i4 = i5;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = f8076d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m11698a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m11702a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m11702a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            m11702a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            m11702a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bd
            if (r0 <= r3) goto L_0x007f
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007d
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007d
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007d
        L_0x007b:
            r8 = 1
            goto L_0x0099
        L_0x007d:
            r8 = 0
            goto L_0x0099
        L_0x007f:
            if (r0 != r3) goto L_0x0090
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007d
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007d
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007d
            goto L_0x007b
        L_0x0090:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007d
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007d
            goto L_0x007b
        L_0x0099:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00ab
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00a9
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00a9
        L_0x00a7:
            r8 = 1
            goto L_0x00b4
        L_0x00a9:
            r8 = 0
            goto L_0x00b4
        L_0x00ab:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00a9
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00a9
            goto L_0x00a7
        L_0x00b4:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00bb
            r1 = 1
        L_0x00bb:
            r10[r3] = r1
        L_0x00bd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p102c.C2496i.m11698a(byte[], int, int, boolean[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0143  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.p102c.C2496i.C2498b m11699a(byte[] r19, int r20, int r21) {
        /*
            com.google.android.exoplayer2.c.l r0 = new com.google.android.exoplayer2.c.l
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo8854a(r1)
            int r2 = r0.mo8860c(r1)
            r3 = 16
            r0.mo8854a(r3)
            int r5 = r0.mo8859c()
            r4 = 3
            r6 = 0
            r7 = 1
            r8 = 100
            if (r2 == r8) goto L_0x004c
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 122(0x7a, float:1.71E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 244(0xf4, float:3.42E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 44
            if (r2 == r8) goto L_0x004c
            r8 = 83
            if (r2 == r8) goto L_0x004c
            r8 = 86
            if (r2 == r8) goto L_0x004c
            r8 = 118(0x76, float:1.65E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 128(0x80, float:1.794E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 138(0x8a, float:1.93E-43)
            if (r2 != r8) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x0086
        L_0x004c:
            int r2 = r0.mo8859c()
            if (r2 != r4) goto L_0x0057
            boolean r8 = r0.mo8856a()
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            r0.mo8859c()
            r0.mo8859c()
            r0.mo8854a(r7)
            boolean r9 = r0.mo8856a()
            if (r9 == 0) goto L_0x0085
            if (r2 == r4) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x0085
            boolean r11 = r0.mo8856a()
            if (r11 == 0) goto L_0x0082
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            m11700a(r0, r11)
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x0085:
            r9 = r8
        L_0x0086:
            int r8 = r0.mo8859c()
            int r11 = r8 + 4
            int r12 = r0.mo8859c()
            if (r12 != 0) goto L_0x009c
            int r8 = r0.mo8859c()
            int r8 = r8 + 4
            r15 = r5
            r13 = r8
        L_0x009a:
            r14 = 0
            goto L_0x00c0
        L_0x009c:
            if (r12 != r7) goto L_0x00bd
            boolean r8 = r0.mo8856a()
            r0.mo8861d()
            r0.mo8861d()
            int r10 = r0.mo8859c()
            long r13 = (long) r10
            r15 = r5
            r10 = 0
        L_0x00af:
            long r4 = (long) r10
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x00ba
            r0.mo8859c()
            int r10 = r10 + 1
            goto L_0x00af
        L_0x00ba:
            r14 = r8
            r13 = 0
            goto L_0x00c0
        L_0x00bd:
            r15 = r5
            r13 = 0
            goto L_0x009a
        L_0x00c0:
            r0.mo8859c()
            r0.mo8854a(r7)
            int r4 = r0.mo8859c()
            int r4 = r4 + r7
            int r5 = r0.mo8859c()
            int r5 = r5 + r7
            boolean r10 = r0.mo8856a()
            r6 = 2
            int r8 = 2 - r10
            int r8 = r8 * r5
            if (r10 != 0) goto L_0x00de
            r0.mo8854a(r7)
        L_0x00de:
            r0.mo8854a(r7)
            int r4 = r4 * 16
            int r8 = r8 * 16
            boolean r5 = r0.mo8856a()
            if (r5 == 0) goto L_0x0117
            int r5 = r0.mo8859c()
            int r16 = r0.mo8859c()
            int r17 = r0.mo8859c()
            int r18 = r0.mo8859c()
            if (r2 != 0) goto L_0x0100
            int r6 = r6 - r10
            r3 = 1
            goto L_0x010c
        L_0x0100:
            r3 = 3
            if (r2 != r3) goto L_0x0105
            r3 = 1
            goto L_0x0106
        L_0x0105:
            r3 = 2
        L_0x0106:
            if (r2 != r7) goto L_0x0109
            r7 = 2
        L_0x0109:
            int r6 = r6 - r10
            int r6 = r6 * r7
        L_0x010c:
            int r5 = r5 + r16
            int r5 = r5 * r3
            int r4 = r4 - r5
            int r17 = r17 + r18
            int r17 = r17 * r6
            int r8 = r8 - r17
        L_0x0117:
            r6 = r4
            r7 = r8
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.mo8856a()
            if (r3 == 0) goto L_0x0164
            boolean r3 = r0.mo8856a()
            if (r3 == 0) goto L_0x0164
            int r1 = r0.mo8860c(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0143
            r3 = 16
            int r1 = r0.mo8860c(r3)
            int r0 = r0.mo8860c(r3)
            if (r1 == 0) goto L_0x0141
            if (r0 == 0) goto L_0x0141
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x0141:
            r8 = r2
            goto L_0x0166
        L_0x0143:
            float[] r0 = f8074b
            int r0 = r0.length
            if (r1 >= r0) goto L_0x014e
            float[] r0 = f8074b
            r0 = r0[r1]
            r8 = r0
            goto L_0x0166
        L_0x014e:
            java.lang.String r0 = "NalUnitUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected aspect_ratio_idc value: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r0, r1)
        L_0x0164:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0166:
            com.google.android.exoplayer2.c.i$b r0 = new com.google.android.exoplayer2.c.i$b
            r4 = r0
            r5 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p102c.C2496i.m11699a(byte[], int, int):com.google.android.exoplayer2.c.i$b");
    }

    /* renamed from: a */
    private static void m11700a(C2501l lVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((lVar.mo8861d() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: a */
    public static void m11701a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m11702a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: a */
    public static boolean m11703a(String str, byte b) {
        if (!"video/avc".equals(str) || (b & 31) != 6) {
            return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
        }
        return true;
    }

    /* renamed from: b */
    public static int m11704b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: b */
    public static C2497a m11705b(byte[] bArr, int i, int i2) {
        C2501l lVar = new C2501l(bArr, i, i2);
        lVar.mo8854a(8);
        int c = lVar.mo8859c();
        int c2 = lVar.mo8859c();
        lVar.mo8854a(1);
        return new C2497a(c, c2, lVar.mo8856a());
    }

    /* renamed from: c */
    public static int m11706c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: c */
    private static int m11707c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }
}

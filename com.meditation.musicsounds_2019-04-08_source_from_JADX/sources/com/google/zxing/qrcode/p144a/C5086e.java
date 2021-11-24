package com.google.zxing.qrcode.p144a;

import com.google.zxing.WriterException;
import com.google.zxing.common.C5035a;
import com.google.zxing.qrcode.decoder.C5088a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* renamed from: com.google.zxing.qrcode.a.e */
final class C5086e {

    /* renamed from: a */
    private static final int[][] f18067a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f18068b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f18069c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f18070d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static int m25182a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    static int m25183a(int i, int i2) {
        if (i2 != 0) {
            int a = m25182a(i2);
            int i3 = i << (a - 1);
            while (m25182a(i3) >= a) {
                i3 ^= i2 << (m25182a(i3) - a);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: a */
    private static void m25184a(int i, int i2, C5082b bVar) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m25195b((int) bVar.mo16494a(i4, i2))) {
                bVar.mo16497a(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: a */
    static void m25185a(C5035a aVar, int i, C5082b bVar) {
        boolean z;
        int b = bVar.mo16499b() - 1;
        int a = bVar.mo16495a() - 1;
        int i2 = 0;
        int i3 = -1;
        while (b > 0) {
            if (b == 6) {
                b--;
            }
            while (a >= 0 && a < bVar.mo16495a()) {
                int i4 = i2;
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = b - i5;
                    if (m25195b((int) bVar.mo16494a(i6, a))) {
                        if (i4 < aVar.mo16395a()) {
                            z = aVar.mo16400a(i4);
                            i4++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C5085d.m25176a(i, i6, a)) {
                            z = !z;
                        }
                        bVar.mo16498a(i6, a, z);
                    }
                }
                a += i3;
                i2 = i4;
            }
            i3 = -i3;
            a += i3;
            b -= 2;
        }
        if (i2 != aVar.mo16395a()) {
            StringBuilder sb = new StringBuilder("Not all bits consumed: ");
            sb.append(i2);
            sb.append('/');
            sb.append(aVar.mo16395a());
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: a */
    static void m25186a(C5035a aVar, ErrorCorrectionLevel errorCorrectionLevel, C5088a aVar2, int i, C5082b bVar) {
        m25187a(bVar);
        m25191a(aVar2, bVar);
        m25189a(errorCorrectionLevel, i, bVar);
        m25194b(aVar2, bVar);
        m25185a(aVar, i, bVar);
    }

    /* renamed from: a */
    static void m25187a(C5082b bVar) {
        bVar.mo16496a(-1);
    }

    /* renamed from: a */
    static void m25188a(ErrorCorrectionLevel errorCorrectionLevel, int i, C5035a aVar) {
        if (C5087f.m25201b(i)) {
            int bits = (errorCorrectionLevel.getBits() << 3) | i;
            aVar.mo16396a(bits, 5);
            aVar.mo16396a(m25183a(bits, 1335), 10);
            C5035a aVar2 = new C5035a();
            aVar2.mo16396a(21522, 15);
            aVar.mo16402b(aVar2);
            if (aVar.mo16395a() != 15) {
                StringBuilder sb = new StringBuilder("should not happen but we got: ");
                sb.append(aVar.mo16395a());
                throw new WriterException(sb.toString());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: a */
    static void m25189a(ErrorCorrectionLevel errorCorrectionLevel, int i, C5082b bVar) {
        C5035a aVar = new C5035a();
        m25188a(errorCorrectionLevel, i, aVar);
        for (int i2 = 0; i2 < aVar.mo16395a(); i2++) {
            boolean a = aVar.mo16400a((aVar.mo16395a() - 1) - i2);
            bVar.mo16498a(f18070d[i2][0], f18070d[i2][1], a);
            if (i2 < 8) {
                bVar.mo16498a((bVar.mo16499b() - i2) - 1, 8, a);
            } else {
                bVar.mo16498a(8, (bVar.mo16495a() - 7) + (i2 - 8), a);
            }
        }
    }

    /* renamed from: a */
    static void m25190a(C5088a aVar, C5035a aVar2) {
        aVar2.mo16396a(aVar.mo16512a(), 6);
        aVar2.mo16396a(m25183a(aVar.mo16512a(), 7973), 12);
        if (aVar2.mo16395a() != 18) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(aVar2.mo16395a());
            throw new WriterException(sb.toString());
        }
    }

    /* renamed from: a */
    static void m25191a(C5088a aVar, C5082b bVar) {
        m25200d(bVar);
        m25197c(bVar);
        m25198c(aVar, bVar);
        m25193b(bVar);
    }

    /* renamed from: b */
    private static void m25192b(int i, int i2, C5082b bVar) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m25195b((int) bVar.mo16494a(i, i4))) {
                bVar.mo16497a(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: b */
    private static void m25193b(C5082b bVar) {
        int i = 8;
        while (i < bVar.mo16499b() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m25195b((int) bVar.mo16494a(i, 6))) {
                bVar.mo16497a(i, 6, i3);
            }
            if (m25195b((int) bVar.mo16494a(6, i))) {
                bVar.mo16497a(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: b */
    static void m25194b(C5088a aVar, C5082b bVar) {
        if (aVar.mo16512a() >= 7) {
            C5035a aVar2 = new C5035a();
            m25190a(aVar, aVar2);
            int i = 0;
            int i2 = 17;
            while (i < 6) {
                int i3 = i2;
                for (int i4 = 0; i4 < 3; i4++) {
                    boolean a = aVar2.mo16400a(i3);
                    i3--;
                    bVar.mo16498a(i, (bVar.mo16495a() - 11) + i4, a);
                    bVar.mo16498a((bVar.mo16495a() - 11) + i4, i, a);
                }
                i++;
                i2 = i3;
            }
        }
    }

    /* renamed from: b */
    private static boolean m25195b(int i) {
        return i == -1;
    }

    /* renamed from: c */
    private static void m25196c(int i, int i2, C5082b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo16497a(i + i4, i2 + i3, f18068b[i3][i4]);
            }
        }
    }

    /* renamed from: c */
    private static void m25197c(C5082b bVar) {
        if (bVar.mo16494a(8, bVar.mo16495a() - 8) != 0) {
            bVar.mo16497a(8, bVar.mo16495a() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: c */
    private static void m25198c(C5088a aVar, C5082b bVar) {
        if (aVar.mo16512a() >= 2) {
            int a = aVar.mo16512a() - 1;
            int[] iArr = f18069c[a];
            int length = f18069c[a].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    if (!(i4 == -1 || i3 == -1 || !m25195b((int) bVar.mo16494a(i4, i3)))) {
                        m25196c(i4 - 2, i3 - 2, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m25199d(int i, int i2, C5082b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo16497a(i + i4, i2 + i3, f18067a[i3][i4]);
            }
        }
    }

    /* renamed from: d */
    private static void m25200d(C5082b bVar) {
        int length = f18067a[0].length;
        m25199d(0, 0, bVar);
        m25199d(bVar.mo16499b() - length, 0, bVar);
        m25199d(0, bVar.mo16499b() - length, bVar);
        m25184a(0, 7, bVar);
        m25184a(bVar.mo16499b() - 8, 7, bVar);
        m25184a(0, bVar.mo16499b() - 8, bVar);
        m25192b(7, 0, bVar);
        m25192b((bVar.mo16495a() - 7) - 1, 0, bVar);
        m25192b(7, bVar.mo16495a() - 7, bVar);
    }
}

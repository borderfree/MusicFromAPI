package com.google.zxing.p141a.p142a;

import com.google.zxing.common.C5035a;
import com.google.zxing.common.C5039b;
import com.google.zxing.common.p143a.C5036a;
import com.google.zxing.common.p143a.C5038c;

/* renamed from: com.google.zxing.a.a.c */
public final class C5026c {

    /* renamed from: a */
    private static final int[] f17931a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int m24910a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: a */
    public static C5024a m24911a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        C5035a aVar;
        int i5;
        int i6;
        C5035a a = new C5027d(bArr).mo16377a();
        int i7 = 11;
        int a2 = ((a.mo16395a() * i) / 100) + 11;
        int a3 = a.mo16395a() + a2;
        int i8 = 32;
        int i9 = 0;
        if (i2 != 0) {
            z = i2 < 0;
            i3 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i3 <= i8) {
                i5 = m24910a(i3, z);
                i4 = f17931a[i3];
                int i10 = i5 - (i5 % i4);
                aVar = m24913a(a, i4);
                if (aVar.mo16395a() + a2 > i10) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.mo16395a() > (i4 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C5035a aVar2 = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= 32) {
                boolean z2 = i11 <= 3;
                int i13 = z2 ? i11 + 1 : i11;
                int a4 = m24910a(i13, z2);
                if (a3 <= a4) {
                    if (i12 != f17931a[i13]) {
                        i12 = f17931a[i13];
                        aVar2 = m24913a(a, i12);
                    }
                    int i14 = a4 - (a4 % i12);
                    if ((!z2 || aVar2.mo16395a() <= (i12 << 6)) && aVar2.mo16395a() + a2 <= i14) {
                        i4 = i12;
                        aVar = aVar2;
                        z = z2;
                        i3 = i13;
                        i5 = a4;
                    }
                }
                i11++;
                i9 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C5035a a5 = m24914a(aVar, i5, i4);
        int a6 = aVar.mo16395a() / i4;
        C5035a a7 = m24915a(z, i3, a6);
        if (!z) {
            i7 = 14;
        }
        int i15 = i7 + (i3 << 2);
        int[] iArr = new int[i15];
        int i16 = 2;
        if (z) {
            for (int i17 = 0; i17 < iArr.length; i17++) {
                iArr[i17] = i17;
            }
            i6 = i15;
        } else {
            int i18 = i15 / 2;
            i6 = i15 + 1 + (((i18 - 1) / 15) * 2);
            int i19 = i6 / 2;
            for (int i20 = 0; i20 < i18; i20++) {
                int i21 = (i20 / 15) + i20;
                iArr[(i18 - i20) - 1] = (i19 - i21) - 1;
                iArr[i18 + i20] = i21 + i19 + 1;
            }
        }
        C5039b bVar = new C5039b(i6);
        int i22 = 0;
        int i23 = 0;
        while (i22 < i3) {
            int i24 = ((i3 - i22) << i16) + (z ? 9 : 12);
            int i25 = 0;
            while (i25 < i24) {
                int i26 = i25 << 1;
                while (i9 < i16) {
                    if (a5.mo16400a(i23 + i26 + i9)) {
                        int i27 = i22 << 1;
                        bVar.mo16431b(iArr[i27 + i9], iArr[i27 + i25]);
                    }
                    if (a5.mo16400a((i24 << 1) + i23 + i26 + i9)) {
                        int i28 = i22 << 1;
                        bVar.mo16431b(iArr[i28 + i25], iArr[((i15 - 1) - i28) - i9]);
                    }
                    if (a5.mo16400a((i24 << 2) + i23 + i26 + i9)) {
                        int i29 = (i15 - 1) - (i22 << 1);
                        bVar.mo16431b(iArr[i29 - i9], iArr[i29 - i25]);
                    }
                    if (a5.mo16400a((i24 * 6) + i23 + i26 + i9)) {
                        int i30 = i22 << 1;
                        bVar.mo16431b(iArr[((i15 - 1) - i30) - i25], iArr[i30 + i9]);
                    }
                    i9++;
                    i16 = 2;
                }
                i25++;
                i9 = 0;
                i16 = 2;
            }
            i23 += i24 << 3;
            i22++;
            i9 = 0;
            i16 = 2;
        }
        m24917a(bVar, z, i6, a7);
        if (z) {
            m24916a(bVar, i6 / 2, 5);
        } else {
            int i31 = i6 / 2;
            m24916a(bVar, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i32 < (i15 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i6; i34 += 2) {
                    int i35 = i31 - i33;
                    bVar.mo16431b(i35, i34);
                    int i36 = i31 + i33;
                    bVar.mo16431b(i36, i34);
                    bVar.mo16431b(i34, i35);
                    bVar.mo16431b(i34, i36);
                }
                i32 += 15;
                i33 += 16;
            }
        }
        C5024a aVar3 = new C5024a();
        aVar3.mo16372a(z);
        aVar3.mo16370a(i6);
        aVar3.mo16373b(i3);
        aVar3.mo16374c(a6);
        aVar3.mo16371a(bVar);
        return aVar3;
    }

    /* renamed from: a */
    private static C5036a m24912a(int i) {
        if (i == 4) {
            return C5036a.f17956d;
        }
        if (i == 6) {
            return C5036a.f17955c;
        }
        if (i == 8) {
            return C5036a.f17959g;
        }
        if (i == 10) {
            return C5036a.f17954b;
        }
        if (i == 12) {
            return C5036a.f17953a;
        }
        StringBuilder sb = new StringBuilder("Unsupported word size ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static C5035a m24913a(C5035a aVar, int i) {
        C5035a aVar2 = new C5035a();
        int a = aVar.mo16395a();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < a) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= a || aVar.mo16400a(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 != i2) {
                if (i7 == 0) {
                    i7 = i4 | 1;
                } else {
                    aVar2.mo16396a(i4, i);
                    i3 += i;
                }
            }
            aVar2.mo16396a(i7, i);
            i3--;
            i3 += i;
        }
        return aVar2;
    }

    /* renamed from: a */
    private static C5035a m24914a(C5035a aVar, int i, int i2) {
        int a = aVar.mo16395a() / i2;
        C5038c cVar = new C5038c(m24912a(i2));
        int i3 = i / i2;
        int[] b = m24918b(aVar, i2, i3);
        cVar.mo16425a(b, i3 - a);
        int i4 = i % i2;
        C5035a aVar2 = new C5035a();
        aVar2.mo16396a(0, i4);
        for (int a2 : b) {
            aVar2.mo16396a(a2, i2);
        }
        return aVar2;
    }

    /* renamed from: a */
    static C5035a m24915a(boolean z, int i, int i2) {
        int i3;
        C5035a aVar = new C5035a();
        if (z) {
            aVar.mo16396a(i - 1, 2);
            aVar.mo16396a(i2 - 1, 6);
            i3 = 28;
        } else {
            aVar.mo16396a(i - 1, 5);
            aVar.mo16396a(i2 - 1, 11);
            i3 = 40;
        }
        return m24914a(aVar, i3, 4);
    }

    /* renamed from: a */
    private static void m24916a(C5039b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo16431b(i5, i4);
                bVar.mo16431b(i5, i6);
                bVar.mo16431b(i4, i5);
                bVar.mo16431b(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo16431b(i7, i7);
        int i8 = i7 + 1;
        bVar.mo16431b(i8, i7);
        bVar.mo16431b(i7, i8);
        int i9 = i + i2;
        bVar.mo16431b(i9, i7);
        bVar.mo16431b(i9, i8);
        bVar.mo16431b(i9, i9 - 1);
    }

    /* renamed from: a */
    private static void m24917a(C5039b bVar, boolean z, int i, C5035a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo16400a(i3)) {
                    bVar.mo16431b(i4, i2 - 5);
                }
                if (aVar.mo16400a(i3 + 7)) {
                    bVar.mo16431b(i2 + 5, i4);
                }
                if (aVar.mo16400a(20 - i3)) {
                    bVar.mo16431b(i4, i2 + 5);
                }
                if (aVar.mo16400a(27 - i3)) {
                    bVar.mo16431b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo16400a(i3)) {
                bVar.mo16431b(i5, i2 - 7);
            }
            if (aVar.mo16400a(i3 + 10)) {
                bVar.mo16431b(i2 + 7, i5);
            }
            if (aVar.mo16400a(29 - i3)) {
                bVar.mo16431b(i5, i2 + 7);
            }
            if (aVar.mo16400a(39 - i3)) {
                bVar.mo16431b(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: b */
    private static int[] m24918b(C5035a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int a = aVar.mo16395a() / i;
        for (int i3 = 0; i3 < a; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.mo16400a((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }
}

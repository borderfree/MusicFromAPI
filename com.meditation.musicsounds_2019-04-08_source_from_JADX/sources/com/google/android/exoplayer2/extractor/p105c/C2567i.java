package com.google.android.exoplayer2.extractor.p105c;

import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.c.i */
final class C2567i {

    /* renamed from: a */
    private static final int[] f8542a = {C2511s.m11819e("isom"), C2511s.m11819e("iso2"), C2511s.m11819e("iso3"), C2511s.m11819e("iso4"), C2511s.m11819e("iso5"), C2511s.m11819e("iso6"), C2511s.m11819e("avc1"), C2511s.m11819e("hvc1"), C2511s.m11819e("hev1"), C2511s.m11819e("mp41"), C2511s.m11819e("mp42"), C2511s.m11819e("3g2a"), C2511s.m11819e("3g2b"), C2511s.m11819e("3gr6"), C2511s.m11819e("3gs6"), C2511s.m11819e("3ge6"), C2511s.m11819e("3gg6"), C2511s.m11819e("M4V "), C2511s.m11819e("M4A "), C2511s.m11819e("f4v "), C2511s.m11819e("kddi"), C2511s.m11819e("M4VP"), C2511s.m11819e("qt  "), C2511s.m11819e("MSNV")};

    /* renamed from: a */
    private static boolean m12106a(int i) {
        if ((i >>> 8) == C2511s.m11819e("3gp")) {
            return true;
        }
        for (int i2 : f8542a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12107a(C2650g gVar) {
        return m12108a(gVar, true);
    }

    /* renamed from: a */
    private static boolean m12108a(C2650g gVar, boolean z) {
        boolean z2;
        C2650g gVar2 = gVar;
        long d = gVar.mo8976d();
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i = (int) d;
        C2500k kVar = new C2500k(64);
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            kVar.mo8820a(8);
            gVar2.mo8975c(kVar.f8094a, 0, 8);
            long l = kVar.mo8839l();
            int n = kVar.mo8841n();
            int i3 = 16;
            if (l == 1) {
                gVar2.mo8975c(kVar.f8094a, 8, 8);
                kVar.mo8825b(16);
                l = kVar.mo8849v();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (l < j) {
                return false;
            }
            i2 += i3;
            if (n != C2544a.f8311B) {
                if (n == C2544a.f8320K || n == C2544a.f8322M) {
                    z2 = true;
                } else if ((((long) i2) + l) - j >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (l - j);
                    i2 += i4;
                    if (n == C2544a.f8336a) {
                        if (i4 < 8) {
                            return false;
                        }
                        kVar.mo8820a(i4);
                        gVar2.mo8975c(kVar.f8094a, 0, i4);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                kVar.mo8829d(4);
                            } else if (m12106a(kVar.mo8841n())) {
                                z4 = true;
                                break;
                            }
                            i6++;
                        }
                        if (!z4) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        gVar2.mo8974c(i4);
                    }
                }
            }
        }
        z2 = false;
        if (z4 && z == z2) {
            z3 = true;
        }
        return z3;
    }

    /* renamed from: b */
    public static boolean m12109b(C2650g gVar) {
        return m12108a(gVar, false);
    }
}

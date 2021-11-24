package com.google.android.exoplayer2.extractor.p106d;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.d.k */
final class C2595k {

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$a */
    public static final class C2596a {

        /* renamed from: a */
        public final int f8692a;

        /* renamed from: b */
        public final int f8693b;

        /* renamed from: c */
        public final long[] f8694c;

        /* renamed from: d */
        public final int f8695d;

        /* renamed from: e */
        public final boolean f8696e;

        public C2596a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f8692a = i;
            this.f8693b = i2;
            this.f8694c = jArr;
            this.f8695d = i3;
            this.f8696e = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$b */
    public static final class C2597b {

        /* renamed from: a */
        public final String f8697a;

        /* renamed from: b */
        public final String[] f8698b;

        /* renamed from: c */
        public final int f8699c;

        public C2597b(String str, String[] strArr, int i) {
            this.f8697a = str;
            this.f8698b = strArr;
            this.f8699c = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$c */
    public static final class C2598c {

        /* renamed from: a */
        public final boolean f8700a;

        /* renamed from: b */
        public final int f8701b;

        /* renamed from: c */
        public final int f8702c;

        /* renamed from: d */
        public final int f8703d;

        public C2598c(boolean z, int i, int i2, int i3) {
            this.f8700a = z;
            this.f8701b = i;
            this.f8702c = i2;
            this.f8703d = i3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.k$d */
    public static final class C2599d {

        /* renamed from: a */
        public final long f8704a;

        /* renamed from: b */
        public final int f8705b;

        /* renamed from: c */
        public final long f8706c;

        /* renamed from: d */
        public final int f8707d;

        /* renamed from: e */
        public final int f8708e;

        /* renamed from: f */
        public final int f8709f;

        /* renamed from: g */
        public final int f8710g;

        /* renamed from: h */
        public final int f8711h;

        /* renamed from: i */
        public final boolean f8712i;

        /* renamed from: j */
        public final byte[] f8713j;

        public C2599d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f8704a = j;
            this.f8705b = i;
            this.f8706c = j2;
            this.f8707d = i2;
            this.f8708e = i3;
            this.f8709f = i4;
            this.f8710g = i5;
            this.f8711h = i6;
            this.f8712i = z;
            this.f8713j = bArr;
        }
    }

    /* renamed from: a */
    public static int m12240a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m12241a(long j, long j2) {
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow(d, 1.0d / d2));
    }

    /* renamed from: a */
    public static C2599d m12242a(C2500k kVar) {
        C2500k kVar2 = kVar;
        m12244a(1, kVar2, false);
        long m = kVar.mo8840m();
        int g = kVar.mo8834g();
        long m2 = kVar.mo8840m();
        int o = kVar.mo8842o();
        int o2 = kVar.mo8842o();
        int o3 = kVar.mo8842o();
        int g2 = kVar.mo8834g();
        C2599d dVar = new C2599d(m, g, m2, o, o2, o3, (int) Math.pow(2.0d, (double) (g2 & 15)), (int) Math.pow(2.0d, (double) ((g2 & 240) >> 4)), (kVar.mo8834g() & 1) > 0, Arrays.copyOf(kVar2.f8094a, kVar.mo8826c()));
        return dVar;
    }

    /* renamed from: a */
    private static void m12243a(int i, C2592i iVar) {
        int a = iVar.mo9055a(6) + 1;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = iVar.mo9055a(16);
            if (a2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(a2);
                Log.e("VorbisUtil", sb.toString());
            } else {
                int a3 = iVar.mo9056a() ? iVar.mo9055a(4) + 1 : 1;
                if (iVar.mo9056a()) {
                    int a4 = iVar.mo9055a(8) + 1;
                    for (int i3 = 0; i3 < a4; i3++) {
                        int i4 = i - 1;
                        iVar.mo9058b(m12240a(i4));
                        iVar.mo9058b(m12240a(i4));
                    }
                }
                if (iVar.mo9055a(2) == 0) {
                    if (a3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            iVar.mo9058b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a3; i6++) {
                        iVar.mo9058b(8);
                        iVar.mo9058b(8);
                        iVar.mo9058b(8);
                    }
                } else {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m12244a(int i, C2500k kVar, boolean z) {
        if (kVar.mo8824b() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("too short header: ");
            sb.append(kVar.mo8824b());
            throw new ParserException(sb.toString());
        } else if (kVar.mo8834g() != i) {
            if (z) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw new ParserException(sb2.toString());
        } else if (kVar.mo8834g() == 118 && kVar.mo8834g() == 111 && kVar.mo8834g() == 114 && kVar.mo8834g() == 98 && kVar.mo8834g() == 105 && kVar.mo8834g() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }

    /* renamed from: a */
    public static C2598c[] m12245a(C2500k kVar, int i) {
        int i2 = 0;
        m12244a(5, kVar, false);
        int g = kVar.mo8834g() + 1;
        C2592i iVar = new C2592i(kVar.f8094a);
        iVar.mo9058b(kVar.mo8828d() * 8);
        for (int i3 = 0; i3 < g; i3++) {
            m12250d(iVar);
        }
        int a = iVar.mo9055a(6) + 1;
        while (i2 < a) {
            if (iVar.mo9055a(16) == 0) {
                i2++;
            } else {
                throw new ParserException("placeholder of time domain transforms not zeroed out");
            }
        }
        m12249c(iVar);
        m12248b(iVar);
        m12243a(i, iVar);
        C2598c[] a2 = m12246a(iVar);
        if (iVar.mo9056a()) {
            return a2;
        }
        throw new ParserException("framing bit after modes not set as expected");
    }

    /* renamed from: a */
    private static C2598c[] m12246a(C2592i iVar) {
        int a = iVar.mo9055a(6) + 1;
        C2598c[] cVarArr = new C2598c[a];
        for (int i = 0; i < a; i++) {
            cVarArr[i] = new C2598c(iVar.mo9056a(), iVar.mo9055a(16), iVar.mo9055a(16), iVar.mo9055a(8));
        }
        return cVarArr;
    }

    /* renamed from: b */
    public static C2597b m12247b(C2500k kVar) {
        m12244a(3, kVar, false);
        String e = kVar.mo8831e((int) kVar.mo8840m());
        int length = 11 + e.length();
        long m = kVar.mo8840m();
        String[] strArr = new String[((int) m)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < m; i2++) {
            int i3 = i + 4;
            strArr[i2] = kVar.mo8831e((int) kVar.mo8840m());
            i = i3 + strArr[i2].length();
        }
        if ((kVar.mo8834g() & 1) != 0) {
            return new C2597b(e, strArr, i + 1);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: b */
    private static void m12248b(C2592i iVar) {
        int a = iVar.mo9055a(6) + 1;
        int i = 0;
        while (i < a) {
            if (iVar.mo9055a(16) <= 2) {
                iVar.mo9058b(24);
                iVar.mo9058b(24);
                iVar.mo9058b(24);
                int a2 = iVar.mo9055a(6) + 1;
                iVar.mo9058b(8);
                int[] iArr = new int[a2];
                for (int i2 = 0; i2 < a2; i2++) {
                    iArr[i2] = ((iVar.mo9056a() ? iVar.mo9055a(5) : 0) * 8) + iVar.mo9055a(3);
                }
                for (int i3 = 0; i3 < a2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            iVar.mo9058b(8);
                        }
                    }
                }
                i++;
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: c */
    private static void m12249c(C2592i iVar) {
        int a = iVar.mo9055a(6) + 1;
        for (int i = 0; i < a; i++) {
            int a2 = iVar.mo9055a(16);
            switch (a2) {
                case 0:
                    iVar.mo9058b(8);
                    iVar.mo9058b(16);
                    iVar.mo9058b(16);
                    iVar.mo9058b(6);
                    iVar.mo9058b(8);
                    int a3 = iVar.mo9055a(4) + 1;
                    for (int i2 = 0; i2 < a3; i2++) {
                        iVar.mo9058b(8);
                    }
                    break;
                case 1:
                    int a4 = iVar.mo9055a(5);
                    int[] iArr = new int[a4];
                    int i3 = -1;
                    for (int i4 = 0; i4 < a4; i4++) {
                        iArr[i4] = iVar.mo9055a(4);
                        if (iArr[i4] > i3) {
                            i3 = iArr[i4];
                        }
                    }
                    int[] iArr2 = new int[(i3 + 1)];
                    for (int i5 = 0; i5 < iArr2.length; i5++) {
                        iArr2[i5] = iVar.mo9055a(3) + 1;
                        int a5 = iVar.mo9055a(2);
                        if (a5 > 0) {
                            iVar.mo9058b(8);
                        }
                        for (int i6 = 0; i6 < (1 << a5); i6++) {
                            iVar.mo9058b(8);
                        }
                    }
                    iVar.mo9058b(2);
                    int a6 = iVar.mo9055a(4);
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < a4; i9++) {
                        i7 += iArr2[iArr[i9]];
                        while (i8 < i7) {
                            iVar.mo9058b(a6);
                            i8++;
                        }
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("floor type greater than 1 not decodable: ");
                    sb.append(a2);
                    throw new ParserException(sb.toString());
            }
        }
    }

    /* renamed from: d */
    private static C2596a m12250d(C2592i iVar) {
        if (iVar.mo9055a(24) == 5653314) {
            int a = iVar.mo9055a(16);
            int a2 = iVar.mo9055a(24);
            long[] jArr = new long[a2];
            boolean a3 = iVar.mo9056a();
            long j = 0;
            if (!a3) {
                boolean a4 = iVar.mo9056a();
                for (int i = 0; i < jArr.length; i++) {
                    if (!a4) {
                        jArr[i] = (long) (iVar.mo9055a(5) + 1);
                    } else if (iVar.mo9056a()) {
                        jArr[i] = (long) (iVar.mo9055a(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int a5 = iVar.mo9055a(5) + 1;
                int i2 = 0;
                while (i2 < jArr.length) {
                    int a6 = iVar.mo9055a(m12240a(a2 - i2));
                    int i3 = i2;
                    for (int i4 = 0; i4 < a6 && i3 < jArr.length; i4++) {
                        jArr[i3] = (long) a5;
                        i3++;
                    }
                    a5++;
                    i2 = i3;
                }
            }
            int a7 = iVar.mo9055a(4);
            if (a7 <= 2) {
                if (a7 == 1 || a7 == 2) {
                    iVar.mo9058b(32);
                    iVar.mo9058b(32);
                    int a8 = iVar.mo9055a(4) + 1;
                    iVar.mo9058b(1);
                    if (a7 != 1) {
                        j = (long) (a2 * a);
                    } else if (a != 0) {
                        j = m12241a((long) a2, (long) a);
                    }
                    iVar.mo9058b((int) (j * ((long) a8)));
                }
                C2596a aVar = new C2596a(a, a2, jArr, a7, a3);
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lookup type greater than 2 not decodable: ");
            sb.append(a7);
            throw new ParserException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb2.append(iVar.mo9057b());
        throw new ParserException(sb2.toString());
    }
}

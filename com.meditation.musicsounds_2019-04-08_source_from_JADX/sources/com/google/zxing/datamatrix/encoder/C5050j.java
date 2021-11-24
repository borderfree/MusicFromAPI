package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* renamed from: com.google.zxing.datamatrix.encoder.j */
public final class C5050j {
    /* renamed from: a */
    private static char m25036a(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    /* renamed from: a */
    public static int m25037a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m25042a(charAt) || i >= length) {
                        break loop0;
                        break loop0;
                    }
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    static int m25038a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            float[] fArr2 = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr2[i2] = 0.0f;
            fArr = fArr2;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = m25040a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int a2 = m25039a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (a2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (a2 != 1 || bArr[2] <= 0) {
                    return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (m25042a(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m25043b(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m25045d(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m25043b(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m25046e(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m25043b(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m25047f(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m25043b(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m25049h(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m25043b(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m25050i(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m25040a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int a3 = m25039a(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] >= iArr2[0] && bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] != 0) {
                    if (a3 == 1 && bArr2[4] > 0) {
                        return 4;
                    }
                    if (a3 == 1 && bArr2[2] > 0) {
                        return 2;
                    }
                    if (a3 == 1 && bArr2[3] > 0) {
                        return 3;
                    }
                    if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                        if (iArr2[1] < iArr2[3]) {
                            return 1;
                        }
                        if (iArr2[1] == iArr2[3]) {
                            int i6 = i3 + i4 + 1;
                            while (i6 < charSequence.length()) {
                                char charAt2 = charSequence2.charAt(i6);
                                if (!m25048g(charAt2)) {
                                    if (!m25047f(charAt2)) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    return 3;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
        }
        return 5;
    }

    /* renamed from: a */
    private static int m25039a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: a */
    private static int m25040a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, 0);
        int i2 = i;
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil((double) fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8 A[LOOP:1: B:24:0x00b2->B:26:0x00b8, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m25041a(java.lang.String r6, com.google.zxing.datamatrix.encoder.SymbolShapeHint r7, com.google.zxing.C5022a r8, com.google.zxing.C5022a r9) {
        /*
            r0 = 6
            com.google.zxing.datamatrix.encoder.g[] r0 = new com.google.zxing.datamatrix.encoder.C5047g[r0]
            com.google.zxing.datamatrix.encoder.a r1 = new com.google.zxing.datamatrix.encoder.a
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            com.google.zxing.datamatrix.encoder.c r1 = new com.google.zxing.datamatrix.encoder.c
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            com.google.zxing.datamatrix.encoder.l r1 = new com.google.zxing.datamatrix.encoder.l
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            com.google.zxing.datamatrix.encoder.m r1 = new com.google.zxing.datamatrix.encoder.m
            r1.<init>()
            r5 = 3
            r0[r5] = r1
            com.google.zxing.datamatrix.encoder.f r1 = new com.google.zxing.datamatrix.encoder.f
            r1.<init>()
            r5 = 4
            r0[r5] = r1
            com.google.zxing.datamatrix.encoder.b r1 = new com.google.zxing.datamatrix.encoder.b
            r1.<init>()
            r5 = 5
            r0[r5] = r1
            com.google.zxing.datamatrix.encoder.h r1 = new com.google.zxing.datamatrix.encoder.h
            r1.<init>(r6)
            r1.mo16453a(r7)
            r1.mo16452a(r8, r9)
            java.lang.String r7 = "[)>\u001e05\u001d"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x005d
            java.lang.String r7 = "\u001e\u0004"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x005d
            r6 = 236(0xec, float:3.31E-43)
        L_0x0050:
            r1.mo16450a(r6)
            r1.mo16451a(r4)
            int r6 = r1.f17981a
            int r6 = r6 + 7
            r1.f17981a = r6
            goto L_0x0070
        L_0x005d:
            java.lang.String r7 = "[)>\u001e06\u001d"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = "\u001e\u0004"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x0070
            r6 = 237(0xed, float:3.32E-43)
            goto L_0x0050
        L_0x0070:
            boolean r6 = r1.mo16462g()
            if (r6 == 0) goto L_0x0089
            r6 = r0[r2]
            r6.mo16439a(r1)
            int r6 = r1.mo16460e()
            if (r6 < 0) goto L_0x0070
            int r2 = r1.mo16460e()
            r1.mo16461f()
            goto L_0x0070
        L_0x0089:
            int r6 = r1.mo16459d()
            r1.mo16465j()
            com.google.zxing.datamatrix.encoder.k r7 = r1.mo16464i()
            int r7 = r7.mo16472f()
            if (r6 >= r7) goto L_0x00a3
            if (r2 == 0) goto L_0x00a3
            if (r2 == r5) goto L_0x00a3
            r6 = 254(0xfe, float:3.56E-43)
            r1.mo16450a(r6)
        L_0x00a3:
            java.lang.StringBuilder r6 = r1.mo16457c()
            int r8 = r6.length()
            r9 = 129(0x81, float:1.81E-43)
            if (r8 >= r7) goto L_0x00b2
            r6.append(r9)
        L_0x00b2:
            int r8 = r6.length()
            if (r8 >= r7) goto L_0x00c5
            int r8 = r6.length()
            int r8 = r8 + r3
            char r8 = m25036a(r9, r8)
            r6.append(r8)
            goto L_0x00b2
        L_0x00c5:
            java.lang.StringBuilder r6 = r1.mo16457c()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.encoder.C5050j.m25041a(java.lang.String, com.google.zxing.datamatrix.encoder.SymbolShapeHint, com.google.zxing.a, com.google.zxing.a):java.lang.String");
    }

    /* renamed from: a */
    static boolean m25042a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    static boolean m25043b(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: c */
    static void m25044c(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Illegal character: ");
        sb3.append(c);
        sb3.append(" (0x");
        sb3.append(sb2);
        sb3.append(')');
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: d */
    private static boolean m25045d(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: e */
    private static boolean m25046e(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: f */
    private static boolean m25047f(char c) {
        return m25048g(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: g */
    private static boolean m25048g(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: h */
    private static boolean m25049h(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: i */
    private static boolean m25050i(char c) {
        return false;
    }
}

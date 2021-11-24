package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* renamed from: com.google.zxing.pdf417.encoder.f */
final class C5079f {

    /* renamed from: a */
    private static final byte[] f18055a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f18056b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    private static final byte[] f18057c = new byte[128];

    /* renamed from: d */
    private static final byte[] f18058d = new byte[128];

    /* renamed from: e */
    private static final Charset f18059e = Charset.forName("ISO-8859-1");

    static {
        Arrays.fill(f18057c, -1);
        for (int i = 0; i < f18055a.length; i++) {
            byte b = f18055a[i];
            if (b > 0) {
                f18057c[b] = (byte) i;
            }
        }
        Arrays.fill(f18058d, -1);
        for (int i2 = 0; i2 < f18056b.length; i2++) {
            byte b2 = f18056b[i2];
            if (b2 > 0) {
                f18058d[b2] = (byte) i2;
            }
        }
    }

    /* renamed from: a */
    private static int m25127a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m25134a(charAt) || i >= length) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r11 == ' ') goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        r3.append(26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r11 = r11 - 'A';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        r10 = (char) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        r3.append(27);
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r3.append(28);
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r8 < r1) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r0 = r3.length();
        r1 = 0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        if (r1 >= r0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if ((r1 % 2) == 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        if (r8 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        r7 = (char) ((r7 * 30) + r3.charAt(r1));
        r2.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r7 = r3.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e8, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        if ((r0 % 2) == 0) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ee, code lost:
        r2.append((char) ((r7 * 30) + 29));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f5, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r10 = (char) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r3.append(r10);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m25128a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r6 = 0
            r9 = r20
            r8 = 0
        L_0x0010:
            int r10 = r17 + r8
            char r11 = r0.charAt(r10)
            r12 = 26
            r13 = 32
            r14 = 28
            r15 = 27
            r5 = 29
            switch(r9) {
                case 0: goto L_0x0092;
                case 1: goto L_0x006d;
                case 2: goto L_0x0033;
                default: goto L_0x0023;
            }
        L_0x0023:
            boolean r10 = m25139e(r11)
            if (r10 == 0) goto L_0x00f6
            byte[] r10 = f18058d
            byte r10 = r10[r11]
        L_0x002d:
            char r10 = (char) r10
        L_0x002e:
            r3.append(r10)
            goto L_0x00c3
        L_0x0033:
            boolean r12 = m25138d(r11)
            if (r12 == 0) goto L_0x003e
            byte[] r10 = f18057c
            byte r10 = r10[r11]
            goto L_0x002d
        L_0x003e:
            boolean r12 = m25136b(r11)
            if (r12 == 0) goto L_0x0049
            r3.append(r14)
            goto L_0x00f9
        L_0x0049:
            boolean r12 = m25137c(r11)
            if (r12 == 0) goto L_0x0050
            goto L_0x00a8
        L_0x0050:
            int r10 = r10 + 1
            if (r10 >= r1) goto L_0x0065
            char r10 = r0.charAt(r10)
            boolean r10 = m25139e(r10)
            if (r10 == 0) goto L_0x0065
            r9 = 3
            r5 = 25
            r3.append(r5)
            goto L_0x0010
        L_0x0065:
            r3.append(r5)
            byte[] r10 = f18058d
            byte r10 = r10[r11]
            goto L_0x002d
        L_0x006d:
            boolean r10 = m25137c(r11)
            if (r10 == 0) goto L_0x0079
            if (r11 != r13) goto L_0x0076
            goto L_0x009a
        L_0x0076:
            int r11 = r11 + -97
            goto L_0x00a0
        L_0x0079:
            boolean r10 = m25136b(r11)
            if (r10 == 0) goto L_0x0083
            r3.append(r15)
            goto L_0x009e
        L_0x0083:
            boolean r10 = m25138d(r11)
            if (r10 == 0) goto L_0x008a
            goto L_0x00b4
        L_0x008a:
            r3.append(r5)
            byte[] r10 = f18058d
            byte r10 = r10[r11]
            goto L_0x002d
        L_0x0092:
            boolean r10 = m25136b(r11)
            if (r10 == 0) goto L_0x00a2
            if (r11 != r13) goto L_0x009e
        L_0x009a:
            r3.append(r12)
            goto L_0x00c3
        L_0x009e:
            int r11 = r11 + -65
        L_0x00a0:
            char r10 = (char) r11
            goto L_0x002e
        L_0x00a2:
            boolean r10 = m25137c(r11)
            if (r10 == 0) goto L_0x00ae
        L_0x00a8:
            r3.append(r15)
            r9 = 1
            goto L_0x0010
        L_0x00ae:
            boolean r10 = m25138d(r11)
            if (r10 == 0) goto L_0x00ba
        L_0x00b4:
            r3.append(r14)
            r9 = 2
            goto L_0x0010
        L_0x00ba:
            r3.append(r5)
            byte[] r10 = f18058d
            byte r10 = r10[r11]
            goto L_0x002d
        L_0x00c3:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0010
            int r0 = r3.length()
            r1 = 0
            r7 = 0
        L_0x00cd:
            if (r1 >= r0) goto L_0x00eb
            int r8 = r1 % 2
            if (r8 == 0) goto L_0x00d5
            r8 = 1
            goto L_0x00d6
        L_0x00d5:
            r8 = 0
        L_0x00d6:
            if (r8 == 0) goto L_0x00e4
            int r7 = r7 * 30
            char r8 = r3.charAt(r1)
            int r7 = r7 + r8
            char r7 = (char) r7
            r2.append(r7)
            goto L_0x00e8
        L_0x00e4:
            char r7 = r3.charAt(r1)
        L_0x00e8:
            int r1 = r1 + 1
            goto L_0x00cd
        L_0x00eb:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x00f5
            int r7 = r7 * 30
            int r7 = r7 + r5
            char r0 = (char) r7
            r2.append(r0)
        L_0x00f5:
            return r9
        L_0x00f6:
            r3.append(r5)
        L_0x00f9:
            r9 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.C5079f.m25128a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: a */
    private static int m25129a(String str, int i, Charset charset) {
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m25134a(charAt)) {
                i3++;
                int i4 = i2 + i3;
                if (i4 >= length) {
                    break;
                }
                charAt = str.charAt(i4);
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            char charAt2 = str.charAt(i2);
            if (newEncoder.canEncode(charAt2)) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("Non-encodable character detected: ");
                sb.append(charAt2);
                sb.append(" (Unicode: ");
                sb.append(charAt2);
                sb.append(')');
                throw new WriterException(sb.toString());
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    static String m25130a(String str, Compaction compaction, Charset charset) {
        int i;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f18059e;
        } else if (!f18059e.equals(charset)) {
            CharacterSetECI characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name());
            if (characterSetECIByName != null) {
                m25131a(characterSetECIByName.getValue(), sb);
            }
        }
        int length = str.length();
        if (compaction != Compaction.TEXT) {
            if (compaction != Compaction.BYTE) {
                if (compaction != Compaction.NUMERIC) {
                    int i2 = 0;
                    int i3 = 0;
                    loop0:
                    while (true) {
                        int i4 = 0;
                        while (i < length) {
                            int a = m25127a((CharSequence) str, i);
                            if (a >= 13) {
                                sb.append(902);
                                i3 = 2;
                                m25132a(str, i, a, sb);
                                i2 = i + a;
                            } else {
                                int b = m25135b(str, i);
                                if (b >= 5 || a == length) {
                                    if (i3 != 0) {
                                        sb.append(900);
                                        i3 = 0;
                                        i4 = 0;
                                    }
                                    i4 = m25128a((CharSequence) str, i, b, sb, i4);
                                    i += b;
                                } else {
                                    int a2 = m25129a(str, i, charset);
                                    if (a2 == 0) {
                                        a2 = 1;
                                    }
                                    int i5 = a2 + i;
                                    byte[] bytes = str.substring(i, i5).getBytes(charset);
                                    if (bytes.length == 1 && i3 == 0) {
                                        m25133a(bytes, 0, 1, 0, sb);
                                    } else {
                                        m25133a(bytes, 0, bytes.length, i3, sb);
                                        i3 = 1;
                                        i4 = 0;
                                    }
                                    i = i5;
                                }
                            }
                        }
                        break loop0;
                    }
                } else {
                    sb.append(902);
                    m25132a(str, 0, length, sb);
                }
            } else {
                byte[] bytes2 = str.getBytes(charset);
                m25133a(bytes2, 0, bytes2.length, 1, sb);
            }
        } else {
            m25128a((CharSequence) str, 0, length, sb, 0);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m25131a(int i, StringBuilder sb) {
        char c;
        if (i >= 0 && i < 900) {
            sb.append(927);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / 900) - 1));
            i %= 900;
        } else if (i < 811800) {
            sb.append(925);
            c = (char) (810900 - i);
            sb.append(c);
        } else {
            StringBuilder sb2 = new StringBuilder("ECI number not in valid range from 0..811799, but was ");
            sb2.append(i);
            throw new WriterException(sb2.toString());
        }
        c = (char) i;
        sb.append(c);
    }

    /* renamed from: a */
    private static void m25132a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* renamed from: a */
    private static void m25133a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        char c = (i2 == 1 && i3 == 0) ? 913 : i2 % 6 == 0 ? (char) 924 : 901;
        sb.append(c);
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: a */
    private static boolean m25134a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    private static int m25135b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m25134a(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m25140f(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: b */
    private static boolean m25136b(char c) {
        return c == ' ' || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: c */
    private static boolean m25137c(char c) {
        return c == ' ' || (c >= 'a' && c <= 'z');
    }

    /* renamed from: d */
    private static boolean m25138d(char c) {
        return f18057c[c] != -1;
    }

    /* renamed from: e */
    private static boolean m25139e(char c) {
        return f18058d[c] != -1;
    }

    /* renamed from: f */
    private static boolean m25140f(char c) {
        return c == 9 || c == 10 || c == 13 || (c >= ' ' && c <= '~');
    }
}

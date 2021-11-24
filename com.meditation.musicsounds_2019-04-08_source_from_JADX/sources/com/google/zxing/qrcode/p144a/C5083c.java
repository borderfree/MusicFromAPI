package com.google.zxing.qrcode.p144a;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5035a;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.p143a.C5036a;
import com.google.zxing.common.p143a.C5038c;
import com.google.zxing.qrcode.decoder.C5088a;
import com.google.zxing.qrcode.decoder.C5088a.C5090b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.a.c */
public final class C5083c {

    /* renamed from: a */
    private static final int[] f18065a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: a */
    static int m25152a(int i) {
        if (i < f18065a.length) {
            return f18065a[i];
        }
        return -1;
    }

    /* renamed from: a */
    private static int m25153a(C5035a aVar, ErrorCorrectionLevel errorCorrectionLevel, C5088a aVar2, C5082b bVar) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C5086e.m25186a(aVar, errorCorrectionLevel, aVar2, i3, bVar);
            int a = m25154a(bVar);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m25154a(C5082b bVar) {
        return C5085d.m25174a(bVar) + C5085d.m25179b(bVar) + C5085d.m25180c(bVar) + C5085d.m25181d(bVar);
    }

    /* renamed from: a */
    private static int m25155a(Mode mode, C5035a aVar, C5035a aVar2, C5088a aVar3) {
        return aVar.mo16395a() + mode.getCharacterCountBits(aVar3) + aVar2.mo16395a();
    }

    /* renamed from: a */
    static C5035a m25156a(C5035a aVar, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo16401b() == i5) {
            ArrayList<C5081a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr2;
                m25161a(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo16397a(i7 << 3, bArr, 0, i11);
                byte[] a = m25172a(bArr, iArr3[0]);
                arrayList.add(new C5081a(bArr, a));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, a.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C5035a aVar2 = new C5035a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C5081a a2 : arrayList) {
                        byte[] a3 = a2.mo16492a();
                        if (i12 < a3.length) {
                            aVar2.mo16396a(a3[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C5081a b : arrayList) {
                        byte[] b2 = b.mo16493b();
                        if (i13 < b2.length) {
                            aVar2.mo16396a(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo16401b()) {
                    return aVar2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i4);
                sb.append(" and ");
                sb.append(aVar2.mo16401b());
                sb.append(" differ.");
                throw new WriterException(sb.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: a */
    public static C5087f m25157a(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) {
        C5088a aVar;
        String str2 = "ISO-8859-1";
        if (map != null && map.containsKey(EncodeHintType.CHARACTER_SET)) {
            str2 = map.get(EncodeHintType.CHARACTER_SET).toString();
        }
        Mode a = m25158a(str, str2);
        C5035a aVar2 = new C5035a();
        if (a == Mode.BYTE && !"ISO-8859-1".equals(str2)) {
            CharacterSetECI characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(str2);
            if (characterSetECIByName != null) {
                m25164a(characterSetECIByName, aVar2);
            }
        }
        m25165a(a, aVar2);
        C5035a aVar3 = new C5035a();
        m25169a(str, a, aVar3, str2);
        if (map == null || !map.containsKey(EncodeHintType.QR_VERSION)) {
            aVar = m25160a(errorCorrectionLevel, a, aVar2, aVar3);
        } else {
            aVar = C5088a.m25208a(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!m25170a(m25155a(a, aVar2, aVar3, aVar), aVar, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        C5035a aVar4 = new C5035a();
        aVar4.mo16398a(aVar2);
        m25163a(a == Mode.BYTE ? aVar3.mo16401b() : str.length(), aVar, a, aVar4);
        aVar4.mo16398a(aVar3);
        C5090b a2 = aVar.mo16513a(errorCorrectionLevel);
        int b = aVar.mo16514b() - a2.mo16521c();
        m25162a(b, aVar4);
        C5035a a3 = m25156a(aVar4, aVar.mo16514b(), b, a2.mo16520b());
        C5087f fVar = new C5087f();
        fVar.mo16505a(errorCorrectionLevel);
        fVar.mo16506a(a);
        fVar.mo16507a(aVar);
        int c = aVar.mo16515c();
        C5082b bVar = new C5082b(c, c);
        int a4 = m25153a(a3, errorCorrectionLevel, aVar, bVar);
        fVar.mo16503a(a4);
        C5086e.m25186a(a3, errorCorrectionLevel, aVar, a4, bVar);
        fVar.mo16504a(bVar);
        return fVar;
    }

    /* renamed from: a */
    private static Mode m25158a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m25171a(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m25152a((int) charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        return z ? Mode.ALPHANUMERIC : z2 ? Mode.NUMERIC : Mode.BYTE;
    }

    /* renamed from: a */
    private static C5088a m25159a(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C5088a a = C5088a.m25208a(i2);
            if (m25170a(i, a, errorCorrectionLevel)) {
                return a;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: a */
    private static C5088a m25160a(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, C5035a aVar, C5035a aVar2) {
        return m25159a(m25155a(mode, aVar, aVar2, m25159a(m25155a(mode, aVar, aVar2, C5088a.m25208a(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* renamed from: a */
    static void m25161a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: a */
    static void m25162a(int i, C5035a aVar) {
        int i2 = i << 3;
        if (aVar.mo16395a() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo16395a() < i2; i3++) {
                aVar.mo16399a(false);
            }
            int a = aVar.mo16395a() & 7;
            if (a > 0) {
                while (a < 8) {
                    aVar.mo16399a(false);
                    a++;
                }
            }
            int b = i - aVar.mo16401b();
            for (int i4 = 0; i4 < b; i4++) {
                aVar.mo16396a((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo16395a() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(aVar.mo16395a());
        sb.append(" > ");
        sb.append(i2);
        throw new WriterException(sb.toString());
    }

    /* renamed from: a */
    static void m25163a(int i, C5088a aVar, Mode mode, C5035a aVar2) {
        int characterCountBits = mode.getCharacterCountBits(aVar);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            aVar2.mo16396a(i, characterCountBits);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new WriterException(sb.toString());
    }

    /* renamed from: a */
    private static void m25164a(CharacterSetECI characterSetECI, C5035a aVar) {
        aVar.mo16396a(Mode.ECI.getBits(), 4);
        aVar.mo16396a(characterSetECI.getValue(), 8);
    }

    /* renamed from: a */
    static void m25165a(Mode mode, C5035a aVar) {
        aVar.mo16396a(mode.getBits(), 4);
    }

    /* renamed from: a */
    static void m25166a(CharSequence charSequence, C5035a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo16396a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo16396a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo16396a(charAt, 4);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m25167a(java.lang.String r6, com.google.zxing.common.C5035a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo16396a(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.p144a.C5083c.m25167a(java.lang.String, com.google.zxing.common.a):void");
    }

    /* renamed from: a */
    static void m25168a(String str, C5035a aVar, String str2) {
        try {
            for (byte a : str.getBytes(str2)) {
                aVar.mo16396a(a, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* renamed from: a */
    static void m25169a(String str, Mode mode, C5035a aVar, String str2) {
        switch (mode) {
            case NUMERIC:
                m25166a((CharSequence) str, aVar);
                return;
            case ALPHANUMERIC:
                m25173b(str, aVar);
                return;
            case BYTE:
                m25168a(str, aVar, str2);
                return;
            case KANJI:
                m25167a(str, aVar);
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode: ");
                sb.append(mode);
                throw new WriterException(sb.toString());
        }
    }

    /* renamed from: a */
    private static boolean m25170a(int i, C5088a aVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return aVar.mo16514b() - aVar.mo16513a(errorCorrectionLevel).mo16521c() >= (i + 7) / 8;
    }

    /* renamed from: a */
    private static boolean m25171a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static byte[] m25172a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C5038c(C5036a.f17957e).mo16425a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: b */
    static void m25173b(CharSequence charSequence, C5035a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a = m25152a((int) charSequence.charAt(i));
            if (a != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int a2 = m25152a((int) charSequence.charAt(i2));
                    if (a2 != -1) {
                        aVar.mo16396a((a * 45) + a2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo16396a(a, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }
}

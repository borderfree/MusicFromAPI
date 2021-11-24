package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5034c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import com.google.zxing.pdf417.encoder.C5076c;
import com.google.zxing.pdf417.encoder.C5077d;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.pdf417.a */
public final class C5073a implements C5034c {
    /* renamed from: a */
    private static C5039b m25100a(C5077d dVar, String str, int i, int i2, int i3, int i4) {
        boolean z;
        dVar.mo16489a(str, i);
        byte[][] a = dVar.mo16486a().mo16478a(1, 4);
        if ((i3 > i2) ^ (a[0].length < a.length)) {
            a = m25102a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / a[0].length;
        int length2 = i3 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m25101a(a, i4);
        }
        byte[][] a2 = dVar.mo16486a().mo16478a(length, length << 2);
        if (z) {
            a2 = m25102a(a2);
        }
        return m25101a(a2, i4);
    }

    /* renamed from: a */
    private static C5039b m25101a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C5039b bVar = new C5039b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo16427a();
        int c = (bVar.mo16432c() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr[i3][i4] == 1) {
                    bVar.mo16431b(i4 + i, c);
                }
            }
            i3++;
            c--;
        }
        return bVar;
    }

    /* renamed from: a */
    private static byte[][] m25102a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        int i3;
        int i4;
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            C5077d dVar = new C5077d();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(EncodeHintType.PDF417_COMPACT)) {
                    dVar.mo16491a(Boolean.valueOf(map.get(EncodeHintType.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                    dVar.mo16488a(Compaction.valueOf(map.get(EncodeHintType.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                    C5076c cVar = (C5076c) map.get(EncodeHintType.PDF417_DIMENSIONS);
                    dVar.mo16487a(cVar.mo16483b(), cVar.mo16482a(), cVar.mo16485d(), cVar.mo16484c());
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i5 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                    dVar.mo16490a(Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return m25100a(dVar, str, i4, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder("Can only encode PDF_417, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }
}

package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5034c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.p144a.C5082b;
import com.google.zxing.qrcode.p144a.C5083c;
import com.google.zxing.qrcode.p144a.C5087f;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.a */
public final class C5080a implements C5034c {
    /* renamed from: a */
    private static C5039b m25141a(C5087f fVar, int i, int i2, int i3) {
        C5082b a = fVar.mo16502a();
        if (a != null) {
            int b = a.mo16499b();
            int a2 = a.mo16495a();
            int i4 = i3 << 1;
            int i5 = b + i4;
            int i6 = i4 + a2;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (b * min)) / 2;
            int i8 = (max2 - (a2 * min)) / 2;
            C5039b bVar = new C5039b(max, max2);
            int i9 = 0;
            while (i9 < a2) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < b) {
                    if (a.mo16494a(i11, i9) == 1) {
                        bVar.mo16428a(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            StringBuilder sb = new StringBuilder("Can only encode QR_CODE, but got ");
            sb.append(barcodeFormat);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
            }
            return m25141a(C5083c.m25157a(str, errorCorrectionLevel, map), i, i2, i3);
        }
    }
}

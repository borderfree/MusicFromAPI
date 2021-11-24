package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.i */
public final class C5062i extends C5070q {
    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_13, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        if (str.length() == 13) {
            try {
                if (C5069p.m25096a(str)) {
                    int i = C5061h.f18018a[Integer.parseInt(str.substring(0, 1))];
                    boolean[] zArr = new boolean[95];
                    int b = m25090b(zArr, 0, C5069p.f18026b, true) + 0;
                    int i2 = 1;
                    while (i2 <= 6) {
                        int i3 = i2 + 1;
                        int parseInt = Integer.parseInt(str.substring(i2, i3));
                        if (((i >> (6 - i2)) & 1) == 1) {
                            parseInt += 10;
                        }
                        b += m25090b(zArr, b, C5069p.f18030f[parseInt], false);
                        i2 = i3;
                    }
                    int b2 = b + m25090b(zArr, b, C5069p.f18027c, false);
                    int i4 = 7;
                    while (i4 <= 12) {
                        int i5 = i4 + 1;
                        b2 += m25090b(zArr, b2, C5069p.f18029e[Integer.parseInt(str.substring(i4, i5))], true);
                        i4 = i5;
                    }
                    m25090b(zArr, b2, C5069p.f18026b, true);
                    return zArr;
                }
                throw new IllegalArgumentException("Contents do not pass checksum");
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be 13 digits long, but got ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}

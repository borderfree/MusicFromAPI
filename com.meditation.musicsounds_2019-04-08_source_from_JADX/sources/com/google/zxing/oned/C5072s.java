package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.s */
public final class C5072s extends C5070q {
    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC_E, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        if (str.length() == 8) {
            int i = C5071r.f18031a[Integer.parseInt(str.substring(7, 8))];
            boolean[] zArr = new boolean[51];
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
            m25090b(zArr, b, C5069p.f18028d, false);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}

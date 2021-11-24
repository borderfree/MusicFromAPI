package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.j */
public final class C5063j extends C5070q {
    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_8, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        if (str.length() == 8) {
            boolean[] zArr = new boolean[67];
            int b = m25090b(zArr, 0, C5069p.f18026b, true) + 0;
            int i = 0;
            while (i <= 3) {
                int i2 = i + 1;
                b += m25090b(zArr, b, C5069p.f18029e[Integer.parseInt(str.substring(i, i2))], false);
                i = i2;
            }
            int b2 = b + m25090b(zArr, b, C5069p.f18027c, false);
            int i3 = 4;
            while (i3 <= 7) {
                int i4 = i3 + 1;
                b2 += m25090b(zArr, b2, C5069p.f18029e[Integer.parseInt(str.substring(i3, i4))], true);
                i3 = i4;
            }
            m25090b(zArr, b2, C5069p.f18026b, true);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5034c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.o */
public final class C5068o implements C5034c {

    /* renamed from: a */
    private final C5062i f18025a = new C5062i();

    /* renamed from: a */
    private static String m25094a(String str) {
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                i += (str.charAt(i2) - '0') * (i2 % 2 == 0 ? 3 : 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((1000 - i) % 10);
            str = sb.toString();
        } else if (length != 12) {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 11 or 12 digits long, but got ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("0");
        sb3.append(str);
        return sb3.toString();
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f18025a.mo16368a(m25094a(str), BarcodeFormat.EAN_13, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC-A, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }
}

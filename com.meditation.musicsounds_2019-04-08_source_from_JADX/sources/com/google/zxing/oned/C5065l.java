package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.l */
public final class C5065l extends C5067n {

    /* renamed from: a */
    private static final int[] f18023a = {1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f18024b = {3, 1, 1};

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode ITF, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b = m25090b(zArr, 0, f18023a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[18];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    iArr[i3] = C5064k.f18019a[digit][i2];
                    iArr[i3 + 1] = C5064k.f18019a[digit2][i2];
                }
                b += m25090b(zArr, b, iArr, true);
            }
            m25090b(zArr, b, f18024b, true);
            return zArr;
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.e */
public final class C5058e extends C5067n {
    /* renamed from: a */
    private static void m25075a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_39, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i = length + 25;
            int i2 = 0;
            while (i2 < length) {
                int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i2));
                if (indexOf >= 0) {
                    m25075a(C5057d.f18013a[indexOf], iArr);
                    int i3 = i;
                    for (int i4 = 0; i4 < 9; i4++) {
                        i3 += iArr[i4];
                    }
                    i2++;
                    i = i3;
                } else {
                    StringBuilder sb = new StringBuilder("Bad contents: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            boolean[] zArr = new boolean[i];
            m25075a(C5057d.f18014b, iArr);
            int b = m25090b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b2 = b + m25090b(zArr, b, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                m25075a(C5057d.f18013a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i5))], iArr);
                int b3 = b2 + m25090b(zArr, b2, iArr, true);
                b2 = b3 + m25090b(zArr, b3, iArr2, false);
            }
            m25075a(C5057d.f18014b, iArr);
            m25090b(zArr, b2, iArr, true);
            return zArr;
        }
        StringBuilder sb2 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }
}

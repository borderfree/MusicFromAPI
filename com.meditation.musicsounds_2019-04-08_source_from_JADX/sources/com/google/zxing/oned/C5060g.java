package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.g */
public class C5060g extends C5067n {
    /* renamed from: a */
    private static int m25078a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: a */
    protected static int m25079a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    /* renamed from: a */
    private static void m25080a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_93, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            m25080a(C5059f.f18015a[47], iArr);
            int a = m25079a(zArr, 0, iArr, true);
            for (int i = 0; i < length; i++) {
                m25080a(C5059f.f18015a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
                a += m25079a(zArr, a, iArr, true);
            }
            int a2 = m25078a(str, 20);
            m25080a(C5059f.f18015a[a2], iArr);
            int a3 = a + m25079a(zArr, a, iArr, true);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(a2));
            m25080a(C5059f.f18015a[m25078a(sb.toString(), 15)], iArr);
            int a4 = a3 + m25079a(zArr, a3, iArr, true);
            m25080a(C5059f.f18015a[47], iArr);
            zArr[a4 + m25079a(zArr, a4, iArr, true)] = true;
            return zArr;
        }
        StringBuilder sb2 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }
}

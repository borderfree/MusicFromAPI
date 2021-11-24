package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5034c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.n */
public abstract class C5067n implements C5034c {
    /* renamed from: a */
    private static C5039b m25089a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C5039b bVar = new C5039b(max, max2);
        int i7 = i6;
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                bVar.mo16428a(i7, 0, i5, max2);
            }
            i8++;
            i7 += i5;
        }
        return bVar;
    }

    /* renamed from: b */
    protected static int m25090b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i2;
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i6 + 1;
                zArr[i6] = z2;
                i7++;
                i6 = i8;
            }
            i4 += i5;
            z2 = !z2;
            i3++;
            i2 = i6;
        }
        return i4;
    }

    /* renamed from: a */
    public int mo16476a() {
        return 10;
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int a = mo16476a();
            if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
                a = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
            }
            return m25089a(mo16475a(str), i, i2, a);
        }
    }

    /* renamed from: a */
    public abstract boolean[] mo16475a(String str);
}

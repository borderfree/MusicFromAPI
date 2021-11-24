package com.google.zxing.oned;

import com.google.zxing.FormatException;

/* renamed from: com.google.zxing.oned.p */
public abstract class C5069p extends C5066m {

    /* renamed from: b */
    static final int[] f18026b = {1, 1, 1};

    /* renamed from: c */
    static final int[] f18027c = {1, 1, 1, 1, 1};

    /* renamed from: d */
    static final int[] f18028d = {1, 1, 1, 1, 1, 1};

    /* renamed from: e */
    static final int[][] f18029e = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};

    /* renamed from: f */
    static final int[][] f18030f = new int[20][];

    static {
        System.arraycopy(f18029e, 0, f18030f, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr = f18029e[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            f18030f[i] = iArr2;
        }
    }

    /* renamed from: a */
    static boolean m25096a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }
}

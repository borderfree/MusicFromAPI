package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import java.util.ArrayList;
import java.util.Map;

public final class Code128Writer extends C5067n {

    private enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: a */
    private static int m25069a(CharSequence charSequence, int i, int i2) {
        CType a;
        CType a2 = m25070a(charSequence, i);
        if (!(a2 == CType.UNCODABLE || a2 == CType.ONE_DIGIT)) {
            if (i2 == 99) {
                return i2;
            }
            if (i2 != 100) {
                if (a2 == CType.FNC_1) {
                    a2 = m25070a(charSequence, i + 1);
                }
                if (a2 == CType.TWO_DIGITS) {
                    return 99;
                }
            } else if (a2 == CType.FNC_1) {
                return i2;
            } else {
                CType a3 = m25070a(charSequence, i + 2);
                if (a3 == CType.UNCODABLE || a3 == CType.ONE_DIGIT) {
                    return i2;
                }
                if (a3 == CType.FNC_1) {
                    return m25070a(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    a = m25070a(charSequence, i3);
                    if (a != CType.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return a == CType.ONE_DIGIT ? 100 : 99;
            }
        }
        return 100;
    }

    /* renamed from: a */
    private static CType m25070a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo16368a(str, barcodeFormat, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_128, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo16475a(String str) {
        int i;
        int length = str.length();
        if (length <= 0 || length > 80) {
            StringBuilder sb = new StringBuilder("Contents length should be between 1 and 80 characters, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("Bad character in input: ");
                        sb2.append(charAt);
                        throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < length) {
            int a = m25069a(str, i4, i5);
            int i8 = 100;
            if (a == i5) {
                switch (str.charAt(i4)) {
                    case 241:
                        i8 = 102;
                        break;
                    case 242:
                        i8 = 97;
                        break;
                    case 243:
                        i8 = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i5 != 100) {
                            i8 = Integer.parseInt(str.substring(i4, i4 + 2));
                            i4++;
                            break;
                        } else {
                            i8 = str.charAt(i4) - ' ';
                            break;
                        }
                }
                i4++;
            } else {
                i = i5 == 0 ? a == 100 ? 104 : 105 : a;
                i5 = a;
            }
            arrayList.add(C5056c.f18012a[i]);
            i6 += i * i7;
            if (i4 != 0) {
                i7++;
            }
        }
        arrayList.add(C5056c.f18012a[i6 % 103]);
        arrayList.add(C5056c.f18012a[106]);
        int i9 = 0;
        for (int[] iArr : arrayList) {
            int i10 = i9;
            for (int i11 : (int[]) r12.next()) {
                i10 += i11;
            }
            i9 = i10;
        }
        boolean[] zArr = new boolean[i9];
        for (int[] b : arrayList) {
            i2 += m25090b(zArr, i2, b, true);
        }
        return zArr;
    }
}

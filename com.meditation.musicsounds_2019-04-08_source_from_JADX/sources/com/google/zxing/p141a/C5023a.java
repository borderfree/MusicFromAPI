package com.google.zxing.p141a;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5034c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import com.google.zxing.p141a.p142a.C5024a;
import com.google.zxing.p141a.p142a.C5026c;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.a.a */
public final class C5023a implements C5034c {

    /* renamed from: a */
    private static final Charset f17923a = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    private static C5039b m24900a(C5024a aVar, int i, int i2) {
        C5039b a = aVar.mo16369a();
        if (a != null) {
            int b = a.mo16430b();
            int c = a.mo16432c();
            int max = Math.max(i, b);
            int max2 = Math.max(i2, c);
            int min = Math.min(max / b, max2 / c);
            int i3 = (max - (b * min)) / 2;
            int i4 = (max2 - (c * min)) / 2;
            C5039b bVar = new C5039b(max, max2);
            int i5 = 0;
            while (i5 < c) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < b) {
                    if (a.mo16429a(i7, i5)) {
                        bVar.mo16428a(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static C5039b m24901a(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return m24900a(C5026c.m24911a(str.getBytes(charset), i3, i4), i, i2);
        }
        StringBuilder sb = new StringBuilder("Can only encode AZTEC, but got ");
        sb.append(barcodeFormat);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = f17923a;
        int i5 = 33;
        if (map != null) {
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            }
            if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(EncodeHintType.AZTEC_LAYERS)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(EncodeHintType.AZTEC_LAYERS).toString());
                return m24901a(str, barcodeFormat, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return m24901a(str, barcodeFormat, i, i2, charset, i4, i3);
    }
}

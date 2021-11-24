package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5022a;
import com.google.zxing.C5034c;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C5039b;
import com.google.zxing.datamatrix.encoder.C5045e;
import com.google.zxing.datamatrix.encoder.C5049i;
import com.google.zxing.datamatrix.encoder.C5050j;
import com.google.zxing.datamatrix.encoder.C5051k;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.p144a.C5082b;
import java.util.Map;

/* renamed from: com.google.zxing.datamatrix.a */
public final class C5040a implements C5034c {
    /* renamed from: a */
    private static C5039b m24980a(C5045e eVar, C5051k kVar) {
        int b = kVar.mo16467b();
        int c = kVar.mo16469c();
        C5082b bVar = new C5082b(kVar.mo16470d(), kVar.mo16471e());
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (i2 % kVar.f17997c == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < kVar.mo16470d(); i4++) {
                    bVar.mo16498a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < b; i6++) {
                if (i6 % kVar.f17996b == 0) {
                    bVar.mo16498a(i5, i, true);
                    i5++;
                }
                bVar.mo16498a(i5, i, eVar.mo16447a(i6, i2));
                i5++;
                if (i6 % kVar.f17996b == kVar.f17996b - 1) {
                    bVar.mo16498a(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            if (i2 % kVar.f17997c == kVar.f17997c - 1) {
                int i7 = 0;
                for (int i8 = 0; i8 < kVar.mo16470d(); i8++) {
                    bVar.mo16498a(i7, i, true);
                    i7++;
                }
                i++;
            }
        }
        return m24981a(bVar);
    }

    /* renamed from: a */
    private static C5039b m24981a(C5082b bVar) {
        int b = bVar.mo16499b();
        int a = bVar.mo16495a();
        C5039b bVar2 = new C5039b(b, a);
        bVar2.mo16427a();
        for (int i = 0; i < b; i++) {
            for (int i2 = 0; i2 < a; i2++) {
                if (bVar.mo16494a(i, i2) == 1) {
                    bVar2.mo16431b(i, i2);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        C5022a aVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            StringBuilder sb = new StringBuilder("Can only encode DATA_MATRIX, but got ");
            sb.append(barcodeFormat);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
            C5022a aVar2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                aVar = (C5022a) map.get(EncodeHintType.MIN_SIZE);
                if (aVar == null) {
                    aVar = null;
                }
                C5022a aVar3 = (C5022a) map.get(EncodeHintType.MAX_SIZE);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                }
            } else {
                aVar = null;
            }
            String a = C5050j.m25041a(str, symbolShapeHint, aVar, aVar2);
            C5051k a2 = C5051k.m25051a(a.length(), symbolShapeHint, aVar, aVar2, true);
            C5045e eVar = new C5045e(C5049i.m25035a(a, a2), a2.mo16467b(), a2.mo16469c());
            eVar.mo16446a();
            return m24980a(eVar, a2);
        }
    }
}

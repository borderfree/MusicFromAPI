package com.google.zxing;

import com.google.zxing.common.C5039b;
import com.google.zxing.datamatrix.C5040a;
import com.google.zxing.oned.C5055b;
import com.google.zxing.oned.C5058e;
import com.google.zxing.oned.C5060g;
import com.google.zxing.oned.C5062i;
import com.google.zxing.oned.C5063j;
import com.google.zxing.oned.C5065l;
import com.google.zxing.oned.C5068o;
import com.google.zxing.oned.C5072s;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.p141a.C5023a;
import com.google.zxing.pdf417.C5073a;
import com.google.zxing.qrcode.C5080a;
import java.util.Map;

/* renamed from: com.google.zxing.b */
public final class C5032b implements C5034c {
    /* renamed from: a */
    public C5039b mo16368a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        C5034c cVar;
        switch (barcodeFormat) {
            case EAN_8:
                cVar = new C5063j();
                break;
            case UPC_E:
                cVar = new C5072s();
                break;
            case EAN_13:
                cVar = new C5062i();
                break;
            case UPC_A:
                cVar = new C5068o();
                break;
            case QR_CODE:
                cVar = new C5080a();
                break;
            case CODE_39:
                cVar = new C5058e();
                break;
            case CODE_93:
                cVar = new C5060g();
                break;
            case CODE_128:
                cVar = new Code128Writer();
                break;
            case ITF:
                cVar = new C5065l();
                break;
            case PDF_417:
                cVar = new C5073a();
                break;
            case CODABAR:
                cVar = new C5055b();
                break;
            case DATA_MATRIX:
                cVar = new C5040a();
                break;
            case AZTEC:
                cVar = new C5023a();
                break;
            default:
                StringBuilder sb = new StringBuilder("No encoder available for format ");
                sb.append(barcodeFormat);
                throw new IllegalArgumentException(sb.toString());
        }
        return cVar.mo16368a(str, barcodeFormat, i, i2, map);
    }
}

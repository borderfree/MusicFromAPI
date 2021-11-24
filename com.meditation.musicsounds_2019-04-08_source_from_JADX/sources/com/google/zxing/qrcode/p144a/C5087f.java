package com.google.zxing.qrcode.p144a;

import com.google.zxing.qrcode.decoder.C5088a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* renamed from: com.google.zxing.qrcode.a.f */
public final class C5087f {

    /* renamed from: a */
    private Mode f18071a;

    /* renamed from: b */
    private ErrorCorrectionLevel f18072b;

    /* renamed from: c */
    private C5088a f18073c;

    /* renamed from: d */
    private int f18074d = -1;

    /* renamed from: e */
    private C5082b f18075e;

    /* renamed from: b */
    public static boolean m25201b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C5082b mo16502a() {
        return this.f18075e;
    }

    /* renamed from: a */
    public void mo16503a(int i) {
        this.f18074d = i;
    }

    /* renamed from: a */
    public void mo16504a(C5082b bVar) {
        this.f18075e = bVar;
    }

    /* renamed from: a */
    public void mo16505a(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f18072b = errorCorrectionLevel;
    }

    /* renamed from: a */
    public void mo16506a(Mode mode) {
        this.f18071a = mode;
    }

    /* renamed from: a */
    public void mo16507a(C5088a aVar) {
        this.f18073c = aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f18071a);
        sb.append("\n ecLevel: ");
        sb.append(this.f18072b);
        sb.append("\n version: ");
        sb.append(this.f18073c);
        sb.append("\n maskPattern: ");
        sb.append(this.f18074d);
        if (this.f18075e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f18075e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}

package com.google.zxing.p141a.p142a;

import com.google.zxing.common.C5035a;

/* renamed from: com.google.zxing.a.a.e */
final class C5029e extends C5031g {

    /* renamed from: b */
    private final short f17938b;

    /* renamed from: c */
    private final short f17939c;

    C5029e(C5031g gVar, int i, int i2) {
        super(gVar);
        this.f17938b = (short) i;
        this.f17939c = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16375a(C5035a aVar, byte[] bArr) {
        aVar.mo16396a(this.f17938b, this.f17939c);
    }

    public String toString() {
        short s = (this.f17938b & ((1 << this.f17939c) - 1)) | (1 << this.f17939c);
        StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString(s | (1 << this.f17939c)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}

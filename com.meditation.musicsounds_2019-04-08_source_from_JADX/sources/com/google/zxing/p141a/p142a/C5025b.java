package com.google.zxing.p141a.p142a;

import com.google.zxing.common.C5035a;

/* renamed from: com.google.zxing.a.a.b */
final class C5025b extends C5031g {

    /* renamed from: b */
    private final short f17929b;

    /* renamed from: c */
    private final short f17930c;

    C5025b(C5031g gVar, int i, int i2) {
        super(gVar);
        this.f17929b = (short) i;
        this.f17930c = (short) i2;
    }

    /* renamed from: a */
    public void mo16375a(C5035a aVar, byte[] bArr) {
        int i = 0;
        while (i < this.f17930c) {
            if (i == 0 || (i == 31 && this.f17930c <= 62)) {
                aVar.mo16396a(31, 5);
                if (this.f17930c > 62) {
                    aVar.mo16396a(this.f17930c - 31, 16);
                } else {
                    aVar.mo16396a(i == 0 ? Math.min(this.f17930c, 31) : this.f17930c - 31, 5);
                }
            }
            aVar.mo16396a(bArr[this.f17929b + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f17929b);
        sb.append("::");
        sb.append((this.f17929b + this.f17930c) - 1);
        sb.append('>');
        return sb.toString();
    }
}

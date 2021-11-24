package com.google.zxing.pdf417.encoder;

/* renamed from: com.google.zxing.pdf417.encoder.b */
final class C5075b {

    /* renamed from: a */
    private final byte[] f18039a;

    /* renamed from: b */
    private int f18040b = 0;

    C5075b(int i) {
        this.f18039a = new byte[i];
    }

    /* renamed from: a */
    private void m25107a(int i, boolean z) {
        this.f18039a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16480a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f18040b;
            this.f18040b = i3 + 1;
            m25107a(i3, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo16481a(int i) {
        byte[] bArr = new byte[(this.f18039a.length * i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = this.f18039a[i2 / i];
        }
        return bArr;
    }
}

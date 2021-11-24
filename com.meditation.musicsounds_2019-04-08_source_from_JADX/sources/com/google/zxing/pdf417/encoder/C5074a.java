package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.pdf417.encoder.a */
public final class C5074a {

    /* renamed from: a */
    private final C5075b[] f18035a;

    /* renamed from: b */
    private int f18036b;

    /* renamed from: c */
    private final int f18037c;

    /* renamed from: d */
    private final int f18038d;

    C5074a(int i, int i2) {
        this.f18035a = new C5075b[i];
        int length = this.f18035a.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f18035a[i3] = new C5075b(((i2 + 4) * 17) + 1);
        }
        this.f18038d = i2 * 17;
        this.f18037c = i;
        this.f18036b = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16477a() {
        this.f18036b++;
    }

    /* renamed from: a */
    public byte[][] mo16478a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{this.f18037c * i2, this.f18038d * i});
        int i3 = this.f18037c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f18035a[i4 / i2].mo16481a(i);
        }
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C5075b mo16479b() {
        return this.f18035a[this.f18036b];
    }
}

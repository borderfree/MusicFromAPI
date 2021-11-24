package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yv */
public final class C4106yv {

    /* renamed from: a */
    private final byte[] f15089a = new byte[256];

    /* renamed from: b */
    private int f15090b;

    /* renamed from: c */
    private int f15091c;

    public C4106yv(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f15089a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.f15089a[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.f15089a[i2];
            this.f15089a[i2] = this.f15089a[b];
            this.f15089a[b] = b2;
        }
        this.f15090b = 0;
        this.f15091c = 0;
    }

    /* renamed from: a */
    public final void mo13831a(byte[] bArr) {
        int i = this.f15090b;
        int i2 = this.f15091c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f15089a[i]) & 255;
            byte b = this.f15089a[i];
            this.f15089a[i] = this.f15089a[i2];
            this.f15089a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f15089a[(this.f15089a[i] + this.f15089a[i2]) & 255]);
        }
        this.f15090b = i;
        this.f15091c = i2;
    }
}

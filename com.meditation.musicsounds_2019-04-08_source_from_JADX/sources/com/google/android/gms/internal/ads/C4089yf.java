package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yf */
public final class C4089yf {

    /* renamed from: a */
    private final byte[] f15068a;

    private C4089yf(byte[] bArr, int i, int i2) {
        this.f15068a = new byte[i2];
        System.arraycopy(bArr, 0, this.f15068a, 0, i2);
    }

    /* renamed from: a */
    public static C4089yf m20356a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new C4089yf(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo13824a() {
        byte[] bArr = new byte[this.f15068a.length];
        System.arraycopy(this.f15068a, 0, bArr, 0, this.f15068a.length);
        return bArr;
    }
}

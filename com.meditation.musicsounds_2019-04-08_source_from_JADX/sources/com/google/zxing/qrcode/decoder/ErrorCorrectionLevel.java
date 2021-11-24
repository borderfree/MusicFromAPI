package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: a */
    private static final ErrorCorrectionLevel[] f18080a = null;
    private final int bits;

    static {
        f18080a = new ErrorCorrectionLevel[]{M, L, H, Q};
    }

    private ErrorCorrectionLevel(int i) {
        this.bits = i;
    }

    public static ErrorCorrectionLevel forBits(int i) {
        if (i >= 0 && i < f18080a.length) {
            return f18080a[i];
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}

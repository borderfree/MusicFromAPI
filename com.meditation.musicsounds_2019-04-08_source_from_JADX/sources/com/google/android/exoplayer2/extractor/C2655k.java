package com.google.android.exoplayer2.extractor;

/* renamed from: com.google.android.exoplayer2.extractor.k */
public final class C2655k {

    /* renamed from: h */
    private static final String[] f9011h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    private static final int[] f9012i = {44100, 48000, 32000};

    /* renamed from: j */
    private static final int[] f9013j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    private static final int[] f9014k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    private static final int[] f9015l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    private static final int[] f9016m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    private static final int[] f9017n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f9018a;

    /* renamed from: b */
    public String f9019b;

    /* renamed from: c */
    public int f9020c;

    /* renamed from: d */
    public int f9021d;

    /* renamed from: e */
    public int f9022e;

    /* renamed from: f */
    public int f9023f;

    /* renamed from: g */
    public int f9024g;

    /* renamed from: a */
    public static int m12521a(int i) {
        if ((i & -2097152) != -2097152) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 == 0 || i4 == 15) {
            return -1;
        }
        int i5 = (i >>> 10) & 3;
        if (i5 == 3) {
            return -1;
        }
        int i6 = f9012i[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f9013j[i4 - 1] : f9014k[i4 - 1]) * 12000) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f9015l[i4 - 1] : f9016m[i4 - 1] : f9017n[i4 - 1];
        int i9 = 144000;
        if (i2 == 3) {
            return ((i8 * 144000) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72000;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* renamed from: a */
    private void m12522a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f9018a = i;
        this.f9019b = str;
        this.f9020c = i2;
        this.f9021d = i3;
        this.f9022e = i4;
        this.f9023f = i5;
        this.f9024g = i6;
    }

    /* renamed from: a */
    public static boolean m12523a(int i, C2655k kVar) {
        int i2;
        int i3;
        int i4;
        if ((i & -2097152) != -2097152) {
            return false;
        }
        int i5 = (i >>> 19) & 3;
        if (i5 == 1) {
            return false;
        }
        int i6 = (i >>> 17) & 3;
        if (i6 == 0) {
            return false;
        }
        int i7 = (i >>> 12) & 15;
        if (i7 == 0 || i7 == 15) {
            return false;
        }
        int i8 = (i >>> 10) & 3;
        if (i8 == 3) {
            return false;
        }
        int i9 = f9012i[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i >>> 9) & 1;
        int i12 = 1152;
        if (i6 == 3) {
            i4 = i5 == 3 ? f9013j[i7 - 1] : f9014k[i7 - 1];
            i3 = (((i4 * 12000) / i10) + i11) * 4;
            i2 = 384;
        } else {
            int i13 = 144000;
            if (i5 == 3) {
                i4 = i6 == 2 ? f9015l[i7 - 1] : f9016m[i7 - 1];
                i3 = ((144000 * i4) / i10) + i11;
                i2 = 1152;
            } else {
                i4 = f9017n[i7 - 1];
                if (i6 == 1) {
                    i12 = 576;
                }
                if (i6 == 1) {
                    i13 = 72000;
                }
                i3 = ((i13 * i4) / i10) + i11;
                i2 = i12;
            }
        }
        kVar.m12522a(i5, f9011h[3 - i6], i3, i10, ((i >> 6) & 3) == 3 ? 1 : 2, i4 * 1000, i2);
        return true;
    }
}

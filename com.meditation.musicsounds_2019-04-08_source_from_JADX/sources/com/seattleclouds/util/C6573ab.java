package com.seattleclouds.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: com.seattleclouds.util.ab */
public final class C6573ab extends C6641v {

    /* renamed from: a */
    private final byte[] f23254a;

    /* renamed from: b */
    private final int f23255b;

    /* renamed from: c */
    private final int f23256c;

    /* renamed from: d */
    private final int f23257d;

    /* renamed from: e */
    private final int f23258e;

    public C6573ab(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f23254a = bArr;
        this.f23255b = i;
        this.f23256c = i2;
        this.f23257d = i3;
        this.f23258e = i4;
        if (z) {
            m31813a(i5, i6);
        }
    }

    /* renamed from: a */
    private void m31813a(int i, int i2) {
        byte[] bArr = this.f23254a;
        int i3 = (this.f23258e * this.f23255b) + this.f23257d;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f23255b;
        }
    }

    /* renamed from: c */
    public Bitmap mo20544c() {
        int a = mo20628a();
        int b = mo20629b();
        int[] iArr = new int[(a * b)];
        byte[] bArr = this.f23254a;
        int i = (this.f23258e * this.f23255b) + this.f23257d;
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * a;
            for (int i4 = 0; i4 < a; i4++) {
                iArr[i3 + i4] = ((bArr[i + i4] & 255) * 65793) | -16777216;
            }
            i += this.f23255b;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a, b, Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, a, 0, 0, a, b);
        return createBitmap;
    }
}

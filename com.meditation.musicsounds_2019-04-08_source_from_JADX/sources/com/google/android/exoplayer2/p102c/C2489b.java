package com.google.android.exoplayer2.p102c;

import android.util.Pair;

/* renamed from: com.google.android.exoplayer2.c.b */
public final class C2489b {

    /* renamed from: a */
    private static final byte[] f8055a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f8056b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f8057c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    private static int m11670a(C2499j jVar) {
        int c = jVar.mo8814c(5);
        return c == 31 ? jVar.mo8814c(6) + 32 : c;
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m11671a(byte[] bArr) {
        C2499j jVar = new C2499j(bArr);
        int a = m11670a(jVar);
        int b = m11674b(jVar);
        int c = jVar.mo8814c(4);
        if (a == 5 || a == 29) {
            b = m11674b(jVar);
            if (m11670a(jVar) == 22) {
                c = jVar.mo8814c(4);
            }
        }
        int i = f8057c[c];
        C2488a.m11666a(i != -1);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static byte[] m11672a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: a */
    public static byte[] m11673a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(f8055a.length + i2)];
        System.arraycopy(f8055a, 0, bArr2, 0, f8055a.length);
        System.arraycopy(bArr, i, bArr2, f8055a.length, i2);
        return bArr2;
    }

    /* renamed from: b */
    private static int m11674b(C2499j jVar) {
        int c = jVar.mo8814c(4);
        if (c == 15) {
            return jVar.mo8814c(24);
        }
        C2488a.m11666a(c < 13);
        return f8056b[c];
    }
}

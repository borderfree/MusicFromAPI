package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.a */
public final class C2448a {

    /* renamed from: a */
    private static final int[] f7887a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f7888b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f7889c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f7890d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f7891e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f */
    private static final int[] f7892f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.google.android.exoplayer2.audio.a$a */
    public static final class C2450a {

        /* renamed from: a */
        public final String f7893a;

        /* renamed from: b */
        public final int f7894b;

        /* renamed from: c */
        public final int f7895c;

        /* renamed from: d */
        public final int f7896d;

        /* renamed from: e */
        public final int f7897e;

        private C2450a(String str, int i, int i2, int i3, int i4) {
            this.f7893a = str;
            this.f7895c = i;
            this.f7894b = i2;
            this.f7896d = i3;
            this.f7897e = i4;
        }
    }

    /* renamed from: a */
    public static int m11486a() {
        return 1536;
    }

    /* renamed from: a */
    private static int m11487a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= f7888b.length || i2 < 0 || i3 >= f7892f.length) {
            return -1;
        }
        int i4 = f7888b[i];
        if (i4 == 44100) {
            return (f7892f[i3] + (i2 % 2)) * 2;
        }
        int i5 = f7891e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: a */
    public static int m11488a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f7887a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: a */
    public static int m11489a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return m11487a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: a */
    public static Format m11490a(C2500k kVar, String str, String str2, DrmInitData drmInitData) {
        int i = f7888b[(kVar.mo8834g() & 192) >> 6];
        int g = kVar.mo8834g();
        int i2 = f7890d[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return Format.m11316a(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static C2450a m11491a(C2499j jVar) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int b = jVar.mo8811b();
        jVar.mo8812b(40);
        boolean z = jVar.mo8814c(5) == 16;
        jVar.mo8808a(b);
        int i6 = 6;
        if (z) {
            String str2 = "audio/eac3";
            jVar.mo8812b(21);
            int c = (jVar.mo8814c(11) + 1) * 2;
            int c2 = jVar.mo8814c(2);
            if (c2 == 3) {
                i5 = f7889c[jVar.mo8814c(2)];
            } else {
                i6 = f7887a[jVar.mo8814c(2)];
                i5 = f7888b[c2];
            }
            int i7 = i6 * 256;
            i4 = jVar.mo8814c(3);
            i = i7;
            i3 = i5;
            i2 = c;
            str = str2;
        } else {
            String str3 = "audio/ac3";
            jVar.mo8812b(32);
            int c3 = jVar.mo8814c(2);
            int a = m11487a(c3, jVar.mo8814c(6));
            jVar.mo8812b(8);
            i4 = jVar.mo8814c(3);
            if (!((i4 & 1) == 0 || i4 == 1)) {
                jVar.mo8812b(2);
            }
            if ((i4 & 4) != 0) {
                jVar.mo8812b(2);
            }
            if (i4 == 2) {
                jVar.mo8812b(2);
            }
            int i8 = f7888b[c3];
            i2 = a;
            str = str3;
            i3 = i8;
            i = 1536;
        }
        C2450a aVar = new C2450a(str, f7890d[i4] + (jVar.mo8816d() ? 1 : 0), i3, i2, i);
        return aVar;
    }

    /* renamed from: b */
    public static Format m11492b(C2500k kVar, String str, String str2, DrmInitData drmInitData) {
        C2500k kVar2 = kVar;
        kVar.mo8829d(2);
        int i = f7888b[(kVar.mo8834g() & 192) >> 6];
        int g = kVar.mo8834g();
        int i2 = f7890d[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return Format.m11316a(str, "audio/eac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }
}

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.e */
public final class C2461e {

    /* renamed from: a */
    private static final int[] f7927a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f7928b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f7929c = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static int m11520a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        return ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
    }

    /* renamed from: a */
    public static int m11521a(byte[] bArr) {
        return ((((bArr[5] & 252) >> 2) | ((bArr[4] & 1) << 6)) + 1) * 32;
    }

    /* renamed from: a */
    public static Format m11522a(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        byte[] bArr2 = bArr;
        C2499j jVar = new C2499j(bArr);
        jVar.mo8812b(60);
        int i = f7927a[jVar.mo8814c(6)];
        int i2 = f7928b[jVar.mo8814c(4)];
        int c = jVar.mo8814c(5);
        int i3 = c >= f7929c.length ? -1 : (f7929c[c] * 1000) / 2;
        jVar.mo8812b(10);
        return Format.m11316a(str, "audio/vnd.dts", null, i3, -1, i + (jVar.mo8814c(2) > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }

    /* renamed from: b */
    public static int m11523b(byte[] bArr) {
        return (((bArr[7] & 240) >> 4) | ((bArr[5] & 2) << 12) | ((bArr[6] & 255) << 4)) + 1;
    }
}
